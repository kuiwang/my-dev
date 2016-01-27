package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ErrorLog
 *
 * @author auto create
 * @since 1.0, null
 */
public class ErrorLog extends TaobaoObject {

    private static final long serialVersionUID = 7346576378132349559L;

    /**
     * 生成时间 格式：YYYY-MM-DD’T’HH:mm:ssZ，如2011-05-30 T12:11:4Z
     */
    @ApiField("CreateTime")
    private String createTime;

    /**
     * 错误日志信息
     */
    @ApiField("ErrorInfo")
    private String errorInfo;

    public String getCreateTime() {
        return this.createTime;
    }

    public String getErrorInfo() {
        return this.errorInfo;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

}
