package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 系统自动生成
 *
 * @author auto create
 * @since 1.0, null
 */
public class CheckYaoPiats extends TaobaoObject {

    private static final long serialVersionUID = 8622322793386652344L;

    /**
     * 子订单号
     */
    @ApiField("biz_order_id")
    private Long bizOrderId;

    /**
     * 错误编码
     */
    @ApiField("error_code")
    private String errorCode;

    /**
     * 错误信息
     */
    @ApiField("error_msg")
    private String errorMsg;

    /**
     * 药监码
     */
    @ApiField("piats_code")
    private String piatsCode;

    /**
     * 校验是否成功
     */
    @ApiField("success")
    private Boolean success;

    public Long getBizOrderId() {
        return this.bizOrderId;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public String getPiatsCode() {
        return this.piatsCode;
    }

    public Boolean getSuccess() {
        return this.success;
    }

    public void setBizOrderId(Long bizOrderId) {
        this.bizOrderId = bizOrderId;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public void setPiatsCode(String piatsCode) {
        this.piatsCode = piatsCode;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

}
