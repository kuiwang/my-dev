package com.scott.dev.taobao.api.trade.domain;

/*
 * 物流服务标签
 */
public class LogisticServiceTag {

    /*
     * 物流服务下的标签属性,多个标签之间有";"分隔
     */
    private String serviceTag;

    /*
     * 物流服务下的标签属性,多个标签之间有";"分隔
     */
    private String serviceType;

    public String getServiceTag() {
        return serviceTag;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceTag(String serviceTag) {
        this.serviceTag = serviceTag;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
}
