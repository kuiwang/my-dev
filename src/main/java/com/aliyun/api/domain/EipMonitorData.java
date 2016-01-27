package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * EIP相关的监控信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class EipMonitorData extends TaobaoObject {

    private static final long serialVersionUID = 8783453368142689124L;

    /**
     * EIP的带宽（单位时间内的网络流量），单位为kbytes/s。
     */
    @ApiField("EipBandwidth")
    private Long eipBandwidth;

    /**
     * 一段时间（Period）内，EIP网络流量，单位Kbytes。
     */
    @ApiField("EipFlow")
    private Long eipFlow;

    /**
     * 一段时间（Period）内，EIP接受和发送的报文总数。
     */
    @ApiField("EipPackets")
    private Long eipPackets;

    /**
     * 一段时间（Period）内，EIP接收到的数据流量，单位：kbytes。
     */
    @ApiField("EipRx")
    private Long eipRx;

    /**
     * 一段时间（Period）内，EIP接发送的数据流量，单位：kbytes。
     */
    @ApiField("EipTx")
    private Long eipTx;

    /**
     * 查询流量的时间点，格式依照ISO8601表示法
     */
    @ApiField("TimeStamp")
    private String timeStamp;

    public Long getEipBandwidth() {
        return this.eipBandwidth;
    }

    public Long getEipFlow() {
        return this.eipFlow;
    }

    public Long getEipPackets() {
        return this.eipPackets;
    }

    public Long getEipRx() {
        return this.eipRx;
    }

    public Long getEipTx() {
        return this.eipTx;
    }

    public String getTimeStamp() {
        return this.timeStamp;
    }

    public void setEipBandwidth(Long eipBandwidth) {
        this.eipBandwidth = eipBandwidth;
    }

    public void setEipFlow(Long eipFlow) {
        this.eipFlow = eipFlow;
    }

    public void setEipPackets(Long eipPackets) {
        this.eipPackets = eipPackets;
    }

    public void setEipRx(Long eipRx) {
        this.eipRx = eipRx;
    }

    public void setEipTx(Long eipTx) {
        this.eipTx = eipTx;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

}
