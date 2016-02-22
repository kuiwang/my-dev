package remoting.protocol.http;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map.Entry;

import remoting.protocol.ProtocolStreamHandle;

public class HttpProtocolHandle extends ProtocolStreamHandle {

    private static byte[] END_OF_LINE = new byte[] { (byte) '\r', (byte) '\n' };

    private static byte[] HEADER_SEPARATOE = new byte[] { (byte) ':', (byte) ' ' };

    private static byte[] HTTP_VERSION = "HTTP/1.1".getBytes();

    private static byte[] SPACE = " ".getBytes();

    public HttpProtocolHandle(ByteBuffer source) {
        super(source);
    }

    // / <summary>eg: POST /remote.rem HTTP/1.1
    // / </summary>
    // / <returns></returns>
    public String ReadFirstLine() {
        return this.ReadToEndOfLine();
    }

    // / <summary>read all http headers
    // / </summary>
    // / <returns></returns>
    public HashMap<String, Object> ReadHeaders() {
        HashMap<String, Object> dict = new HashMap<String, Object>();
        while (true) {
            String header = this.ReadToEndOfLine();

            if (header.length() == 0) {
                break;
            }

            int sep = header.indexOf(":");
            String headerName = header.substring(0, sep);
            // skip semi-colon and space?
            String headerValue = header.substring(sep + 1 + 1);
            dict.put(headerName, headerValue);

            if (headerName.equalsIgnoreCase(HttpHeader.ContentLength)) {
                this._contentLength = Integer.parseInt(headerValue);
            }
        }
        return dict;
    }

    private byte[] ReadToByte(byte b) {
        // TODO:should read more than want, design internal readed buffer
        // _source should not be networkstream while sync socket
        byte[] readBytes = new byte[0];
        boolean find = false;
        while (!find) {
            byte read = (byte) this.ReadByte();
            find = read == b;

            if (!find) {
                byte[] ret = new byte[readBytes.length + 1];
                System.arraycopy(readBytes, 0, ret, 0, readBytes.length);
                ret[ret.length - 1] = read;
                readBytes = ret;
            }
        }

        return readBytes;
    }

    private String ReadToChar(char value) {
        byte[] strBytes = this.ReadToByte((byte) value);
        if (strBytes == null) {
            return null;
        }
        if (strBytes.length == 0) {
            return "";
        }
        return new String(strBytes, Charset.forName("ASCII"));
    }

    private String ReadToEndOfLine() {
        String str = this.ReadToChar('\r');
        if (this.ReadByte() == '\n') {
            return str;
        } else {
            return null;
        }
    }

    private void WriteHeader(String name, String value) {
        this.WriteBytes(name.getBytes());
        this.WriteBytes(HEADER_SEPARATOE);
        this.WriteBytes(value.getBytes());
        this.WriteBytes(END_OF_LINE);
    }

    // / <summary>write http headers
    // / </summary>
    // / <param name="headers"></param>
    public void WriteHeaders(HashMap<String, Object> headers) {
        if (headers != null) {
            for (Entry<String, Object> h : headers.entrySet()) {
                if (h.getKey().equalsIgnoreCase(HttpHeader.ContentLength)) {
                    this._contentLength = Integer.parseInt(h.getValue().toString());
                }
                this.WriteHeader(h.getKey(), h.getValue().toString());
            }
        }
        this.WriteBytes(END_OF_LINE);
    }

    // / <summary>http request first line, eg: POST /remote.rem HTTP/1.1
    // / </summary>
    // / <param name="requestVerb">GET/POST</param>
    // / <param name="url"></param>
    public void WriteRequestFirstLine(String requestVerb, String url) {
        this.WriteBytes(requestVerb.getBytes());
        this.WriteByte((byte) ' ');
        this.WriteBytes(url.getBytes());
        this.WriteByte((byte) ' ');
        this.WriteBytes(HTTP_VERSION);
        this.WriteBytes(END_OF_LINE);
    }

    // / <summary>http response first line, eg: HTTP/1.1 200 ok
    // / </summary>
    // / <param name="httpStatusCode"></param>
    // / <param name="reasonPhrase"></param>
    public void WriteResponseFirstLine(String httpStatusCode, String reasonPhrase) {
        this.WriteBytes(HTTP_VERSION);
        this.WriteBytes(SPACE);
        this.WriteBytes(httpStatusCode.getBytes());
        this.WriteByte((byte) ' ');
        this.WriteBytes(reasonPhrase.getBytes());
        this.WriteBytes(END_OF_LINE);
    }

}
