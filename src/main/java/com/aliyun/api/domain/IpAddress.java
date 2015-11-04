package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * aliyunIp地址
 *
 * @author auto create
 * @since 1.0, null
 */
public class IpAddress extends TaobaoObject {

    private static final long serialVersionUID = 4714125263519533264L;

    /**
     * Ip地址
     */
    @ApiField("IpAddress")
    private String ipAddress;

    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

}
