package com.scott.dev.taobao.api.delivery.domain;

/*
 * 物流跟踪信息的一条
 */
public class TransitStepInfo {

    /*
     * 状态发生的时间
     */
    private String statusTime;

    /*
     * 状态描述
     */
    private String statusDesc;

    /*
     * 节点说明 ，指明当前节点揽收、派送，签收。
     */
    private String action;

    /*
     * 地址地一
     */
    private String nodeDescription;

    /*
     * 时间
     */
    private String time;

    /*
     * 描述
     */
    private String desc;

    public String getStatusTime() {
        return statusTime;
    }

    public void setStatusTime(String statusTime) {
        this.statusTime = statusTime;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getNodeDescription() {
        return nodeDescription;
    }

    public void setNodeDescription(String nodeDescription) {
        this.nodeDescription = nodeDescription;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
