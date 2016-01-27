package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 物流服务标签
 *
 * @author auto create
 * @since 1.0, null
 */
public class LogisticServiceTag extends TaobaoObject {

    private static final long serialVersionUID = 5187616871431876257L;

    /**
     * 物流服务下的标签属性,多个标签之间有";"分隔
     */
    @ApiField("service_tag")
    private String serviceTag;

    /**
     * 服务类型=编码 平邮=POST 快递=FAST EMS=EMS 消费者选快递时为FAST
     */
    @ApiField("service_type")
    private String serviceType;

    public String getServiceTag() {
        return this.serviceTag;
    }

    public String getServiceType() {
        return this.serviceType;
    }

    public void setServiceTag(String serviceTag) {
        this.serviceTag = serviceTag;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

}
