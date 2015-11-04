package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * GetMonitorData返回数据对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class InstanceMonitorData extends TaobaoObject {

    private static final long serialVersionUID = 6751433487547338948L;

    /**
     * 磁盘读带宽，单位：byte/s。
     */
    @ApiField("BPSRead")
    private Long bPSRead;

    /**
     * 磁盘写带宽，单位：byte/s。
     */
    @ApiField("BPSWrite")
    private Long bPSWrite;

    /**
     * CPU的使用比例，单位：百分比（%）。
     */
    @ApiField("CPU")
    private Long cPU;

    /**
     * IO读操作，单位：次/s。
     */
    @ApiField("IOPSRead")
    private Long iOPSRead;

    /**
     * IO写操作，单位：次/s。
     */
    @ApiField("IOPSWrite")
    private Long iOPSWrite;

    /**
     * 实例ID
     */
    @ApiField("InstanceId")
    private String instanceId;

    /**
     * 云服务器实例的带宽（单位时间内的网络流量），单位为kbytes/s。
     */
    @ApiField("InternetBandwidth")
    private Long internetBandwidth;

    /**
     * 云服务器实例网络流量。
     */
    @ApiField("InternetFlow")
    private Long internetFlow;

    /**
     * 云服务器实例接收到的数据流量，单位：kbytes。
     */
    @ApiField("InternetRX")
    private Long internetRX;

    /**
     * 云服务器实例接发送的数据流量，单位：kbytes。
     */
    @ApiField("InternetTX")
    private Long internetTX;

    /**
     * 云服务器实例的带宽（单位时间内的网络流量），单位为kbytes/s。
     */
    @ApiField("IntranetBandwidth")
    private Long intranetBandwidth;

    /**
     * 云服务器实例网络流量，单位：kbytes。
     */
    @ApiField("IntranetFlow")
    private Long intranetFlow;

    /**
     * 云服务器实例接收到的数据流量，单位：kbytes。
     */
    @ApiField("IntranetRX")
    private Long intranetRX;

    /**
     * 云服务器实例接发送的数据流量，单位：kbytes。
     */
    @ApiField("IntranetTX")
    private Long intranetTX;

    /**
     * 内存的大小，单位：MB。
     */
    @ApiField("Memory")
    private Long memory;

    /**
     * 查询流量的时间点，格式依照ISO8601表示法
     */
    @ApiField("TimeStamp")
    private String timeStamp;

    public Long getbPSRead() {
        return this.bPSRead;
    }

    public void setbPSRead(Long bPSRead) {
        this.bPSRead = bPSRead;
    }

    public Long getbPSWrite() {
        return this.bPSWrite;
    }

    public void setbPSWrite(Long bPSWrite) {
        this.bPSWrite = bPSWrite;
    }

    public Long getcPU() {
        return this.cPU;
    }

    public void setcPU(Long cPU) {
        this.cPU = cPU;
    }

    public Long getiOPSRead() {
        return this.iOPSRead;
    }

    public void setiOPSRead(Long iOPSRead) {
        this.iOPSRead = iOPSRead;
    }

    public Long getiOPSWrite() {
        return this.iOPSWrite;
    }

    public void setiOPSWrite(Long iOPSWrite) {
        this.iOPSWrite = iOPSWrite;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public Long getInternetBandwidth() {
        return this.internetBandwidth;
    }

    public void setInternetBandwidth(Long internetBandwidth) {
        this.internetBandwidth = internetBandwidth;
    }

    public Long getInternetFlow() {
        return this.internetFlow;
    }

    public void setInternetFlow(Long internetFlow) {
        this.internetFlow = internetFlow;
    }

    public Long getInternetRX() {
        return this.internetRX;
    }

    public void setInternetRX(Long internetRX) {
        this.internetRX = internetRX;
    }

    public Long getInternetTX() {
        return this.internetTX;
    }

    public void setInternetTX(Long internetTX) {
        this.internetTX = internetTX;
    }

    public Long getIntranetBandwidth() {
        return this.intranetBandwidth;
    }

    public void setIntranetBandwidth(Long intranetBandwidth) {
        this.intranetBandwidth = intranetBandwidth;
    }

    public Long getIntranetFlow() {
        return this.intranetFlow;
    }

    public void setIntranetFlow(Long intranetFlow) {
        this.intranetFlow = intranetFlow;
    }

    public Long getIntranetRX() {
        return this.intranetRX;
    }

    public void setIntranetRX(Long intranetRX) {
        this.intranetRX = intranetRX;
    }

    public Long getIntranetTX() {
        return this.intranetTX;
    }

    public void setIntranetTX(Long intranetTX) {
        this.intranetTX = intranetTX;
    }

    public Long getMemory() {
        return this.memory;
    }

    public void setMemory(Long memory) {
        this.memory = memory;
    }

    public String getTimeStamp() {
        return this.timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

}
