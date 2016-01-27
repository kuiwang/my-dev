package com.scott.dev.taobao.api.delivery.domain;

/*
 * 物流跟踪信息的一条
 */
public class TransitStepInfo {

    /*
     * 节点说明 ，指明当前节点揽收、派送，签收。
     */
    private String action;

    /*
     * 描述
     */
    private String desc;

    /*
     * 地址地一
     */
    private String nodeDescription;

    /*
     * 状态描述
     */
    private String statusDesc;

    /*
     * 状态发生的时间
     */
    private String statusTime;

    /*
     * 时间
     */
    private String time;

    public String getAction() {
        return action;
    }

    public String getDesc() {
        return desc;
    }

    public String getNodeDescription() {
        return nodeDescription;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public String getStatusTime() {
        return statusTime;
    }

    public String getTime() {
        return time;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setNodeDescription(String nodeDescription) {
        this.nodeDescription = nodeDescription;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    public void setStatusTime(String statusTime) {
        this.statusTime = statusTime;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
