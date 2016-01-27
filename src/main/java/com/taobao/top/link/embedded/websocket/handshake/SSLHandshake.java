/*
 * The MIT License
 * 
 * Copyright (c) 2011 Takahiro Hashimoto
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.taobao.top.link.embedded.websocket.handshake;

import static com.taobao.top.link.embedded.websocket.exception.ErrorCode.E3810;
import static com.taobao.top.link.embedded.websocket.exception.ErrorCode.E3812;
import static com.taobao.top.link.embedded.websocket.exception.ErrorCode.E3815;
import static com.taobao.top.link.embedded.websocket.exception.ErrorCode.E3816;
import static com.taobao.top.link.embedded.websocket.exception.ErrorCode.E3817;
import static com.taobao.top.link.embedded.websocket.exception.ErrorCode.E3818;
import static com.taobao.top.link.embedded.websocket.exception.ErrorCode.E3820;
import static com.taobao.top.link.embedded.websocket.exception.ErrorCode.E3821;
import static java.nio.channels.SelectionKey.OP_READ;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLEngineResult.HandshakeStatus;
import javax.net.ssl.SSLEngineResult.Status;
import javax.net.ssl.SSLException;
import javax.net.ssl.TrustManager;

import com.taobao.top.link.embedded.websocket.WebSocket;
import com.taobao.top.link.embedded.websocket.exception.WebSocketException;
import com.taobao.top.link.embedded.websocket.util.PacketDumpUtil;

/**
 * The Class SSLHandshake.
 *
 * @author Takahiro Hashimoto
 */
public class SSLHandshake {

    private class HandshakeBuffer {

        ByteBuffer localBuffer;

        ByteBuffer netBuffer;

        HandshakeBuffer() {
            this.netBuffer = ByteBuffer.allocate(currentBufferSize);
            this.localBuffer = ByteBuffer.allocate(currentBufferSize);
        }

        @Override
        public String toString() {
            return "netBuffer: " + netBuffer + ", localBuffer: " + localBuffer;
        }
    }

    protected interface HandshakeCallback {

        public SSLEngineResult execute(HandshakeBuffer buffer) throws SSLException;
    }

    private static final int BUFFER_UNDERFLOW_MAX_RETRY_COUNT = 5;

    /**
     * The log.
     */
    private static Logger log = Logger.getLogger(SSLHandshake.class.getName());

    /**
     * The ctx.
     */
    private SSLContext ctx;

    private int currentBufferSize;

    /**
     * The delegated task executor.
     */
    private ExecutorService delegatedTaskExecutor;

    /**
     * The engine.
     */
    private SSLEngine engine;

    private int increaseBufferCount = 1;

    /**
     * The selector.
     */
    private Selector selector;

    /**
     * The socket.
     */
    private SocketChannel socket;

    private WebSocket webSocket;

    /**
     * Instantiates a new sSL handshake.
     *
     * @param endpoint the endpoint
     * @throws WebSocketException the web socket exception
     */
    public SSLHandshake(InetSocketAddress endpoint, WebSocket webSocket) throws WebSocketException {
        try {
            this.ctx = SSLContext.getInstance("TLS");
            this.ctx.init(null, new TrustManager[] { new X509AlwaysTrustManager() }, null);

            // Create SSLEngine
            this.engine = this.ctx.createSSLEngine(endpoint.getHostName(), endpoint.getPort());
            this.engine.setUseClientMode(true);
            this.currentBufferSize = this.engine.getSession().getPacketBufferSize();
            this.webSocket = webSocket;
        } catch (NoSuchAlgorithmException e) {
            throw new WebSocketException(E3810, e);
        } catch (KeyManagementException e) {
            throw new WebSocketException(E3812, e);
        }
        delegatedTaskExecutor = Executors.newCachedThreadPool(new ThreadFactory() {

            @Override
            public Thread newThread(Runnable r) {
                Thread t = new Thread(r, "SSL DelegateTask");
                t.setDaemon(true);
                return t;
            }
        });
    }

    protected SSLEngineResult doCallbackIncreaseBufferProcess(HandshakeCallback callback,
            HandshakeBuffer hb) throws SSLException, WebSocketException {
        SSLEngineResult res = null;
        do {
            res = callback.execute(hb);
            if (log.isLoggable(Level.FINER)) {
                log.finer("res: \n" + res);
                log.finer("buffer: " + hb);
            }
            if (res.getStatus() == Status.BUFFER_OVERFLOW) {
                increaseBuffer(hb, hb.localBuffer);
            } else if (res.getStatus() == Status.BUFFER_UNDERFLOW) {
                increaseBuffer(hb, hb.netBuffer);
            }

            if (res.getStatus() != Status.BUFFER_OVERFLOW) {
                break;
            }
        } while (true);
        return res;
    }

    /**
     * Do handshake.
     *
     * @param socket the socket
     * @throws WebSocketException the web socket exception
     */
    public void doHandshake(SocketChannel socket) throws WebSocketException {
        this.socket = socket;

        try {
            // create selector for SSL handshake
            selector = Selector.open();
            this.socket.register(selector, OP_READ);

            engine.beginHandshake();

            HandshakeBuffer hb = new HandshakeBuffer();
            while (true) {
                // handling Handshake Status
                /*
                     * normal handshake status transition
                     * - beginHandshake()
                     *   next state -> NEED_WRAP
                     * - wrap(dummy)
                     *   next state -> NEED_TASK
                     * - runDelegatedTask()
                     *   next state -> NEED_UNWRAP
                     * - unwrap(server response)
                     *   next state -> NEED_TASK
                     *   ...
                     *   FINISH or NOT_HANDSHAKING is end of handshake
                     */
                HandshakeStatus haStatus = engine.getHandshakeStatus();
                if (log.isLoggable(Level.FINER)) {
                    log.finer("SSL HandshakeStatus: " + haStatus);
                }
                switch (haStatus) {
                    case NEED_WRAP:
                        hb.netBuffer.clear();
                        doCallbackIncreaseBufferProcess(new HandshakeCallback() {

                            @Override
                            public SSLEngineResult execute(HandshakeBuffer hb) throws SSLException {
                                return engine.wrap(hb.localBuffer, hb.netBuffer);
                            }
                        }, hb);
                        hb.netBuffer.flip();
                        if (hb.netBuffer.hasRemaining()) {
                            if (PacketDumpUtil.isDump(this.webSocket, PacketDumpUtil.HS_UP)) {
                                PacketDumpUtil.printPacketDump("SSL_HS_UP", hb.netBuffer);
                            }
                            socket.write(hb.netBuffer);
                            hb.netBuffer.clear();
                        }
                        break;
                    case NEED_UNWRAP:
                        selector.select();
                        socket.read(hb.netBuffer);
                        hb.netBuffer.flip();
                        if (PacketDumpUtil.isDump(this.webSocket, PacketDumpUtil.HS_DOWN)) {
                            PacketDumpUtil.printPacketDump("SSL_HS_DOWN", hb.netBuffer);
                        }
                        SSLEngineResult res = null;
                        do {
                            res = doCallbackIncreaseBufferProcess(new HandshakeCallback() {

                                @Override
                                public SSLEngineResult execute(HandshakeBuffer hb)
                                        throws SSLException {
                                    return engine.unwrap(hb.netBuffer, hb.localBuffer);
                                }
                            }, hb);
                            if (this.increaseBufferCount > BUFFER_UNDERFLOW_MAX_RETRY_COUNT) {
                                throw new WebSocketException(E3820);
                            }
                        } while ((res.getStatus() == Status.OK)
                                && (res.getHandshakeStatus() == HandshakeStatus.NEED_UNWRAP));

                        break;
                    case NEED_TASK:
                        runDelegatedTasks();
                        break;
                    case NOT_HANDSHAKING:
                    case FINISHED:
                        return;
                }
            }
        } catch (SSLException e) {
            throw new WebSocketException(E3815, e);
        } catch (IOException ioe) {
            throw new WebSocketException(E3816, ioe);
        } finally {
            try {
                selector.close();
                delegatedTaskExecutor.shutdown();
                delegatedTaskExecutor = null;
            } catch (IOException ioe) {
                ;
            }
        }
    }

    private void increaseBuffer(HandshakeBuffer hb, ByteBuffer buffer) throws WebSocketException {
        if (buffer.limit() == buffer.capacity()) {
            reallocateBuffer(hb);
        } else {
            if (buffer.position() == buffer.limit()) {
                buffer.clear();
            } else {
                buffer.position(buffer.limit()).limit(buffer.capacity());
            }
        }
    }

    /**
     * re-allocate bytebuffer if buffer capacity is lower than SSLEngine
     * required buffer size
     * 
     * @param hb
     * @throws WebSocketException
     */
    private void reallocateBuffer(HandshakeBuffer hb) throws WebSocketException {
        if (this.increaseBufferCount > BUFFER_UNDERFLOW_MAX_RETRY_COUNT) {
            throw new WebSocketException(E3821);
        }

        this.currentBufferSize = this.engine.getSession().getPacketBufferSize()
                * this.increaseBufferCount++;
        log.finer("Caught BUFFER_UNDERFLOW or BUFFER_OVERFLOW. reallocate internal buffer "
                + hb.netBuffer.capacity() + " -> " + this.currentBufferSize);
        hb.netBuffer.flip();
        ByteBuffer tmpNetBuffer = ByteBuffer.allocate(this.currentBufferSize);
        tmpNetBuffer.put(hb.netBuffer);
        hb.netBuffer = tmpNetBuffer;
        hb.localBuffer = ByteBuffer.allocate(this.currentBufferSize);
    }

    /**
     * Run delegated tasks.
     */
    private void runDelegatedTasks() {
        Runnable task = null;
        while ((task = engine.getDelegatedTask()) != null) {
            delegatedTaskExecutor.execute(task);
        }
    }

    /**
     * Unwrap.
     *
     * @param netBuffer the net buffer
     * @param localBuffer the local buffer
     * @throws WebSocketException the web socket exception
     */
    public void unwrap(ByteBuffer netBuffer, ByteBuffer localBuffer) throws WebSocketException {
        try {
            localBuffer.clear();
            SSLEngineResult result = engine.unwrap(netBuffer, localBuffer);
            if (log.isLoggable(Level.FINEST)) {
                log.finest("SSLEngineResult\n" + result);
            }
            localBuffer.flip();
        } catch (SSLException se) {
            throw new WebSocketException(E3818, se);
        }
    }

    /**
     * Wrap.
     *
     * @param localBuffer the local buffer
     * @param netBuffer the net buffer
     * @throws WebSocketException the web socket exception
     */
    public void wrap(ByteBuffer localBuffer, ByteBuffer netBuffer) throws WebSocketException {
        try {
            netBuffer.clear();
            SSLEngineResult result = engine.wrap(localBuffer, netBuffer);
            if (log.isLoggable(Level.FINEST)) {
                log.finest("SSLEngineResult\n" + result);
            }
            netBuffer.flip();
        } catch (SSLException e) {
            throw new WebSocketException(E3817, e);
        }
    }

}
