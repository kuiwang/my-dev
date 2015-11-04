package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 商品批量操作返回结果
 *
 * @author auto create
 * @since 1.0, null
 */
public class BatchOperateResult extends TaobaoObject {

    private static final long serialVersionUID = 7879821282387969243L;

    /**
     * 商品操作错误代码
     */
    @ApiField("error_code")
    private String errorCode;

    /**
     * 操作提示
     */
    @ApiField("error_msg")
    private String errorMsg;

    /**
     * 批量操作失败的宝贝列表
     */
    @ApiListField("failed_item_list")
    @ApiField("number")
    private List<Long> failedItemList;

    /**
     * 操作是否成功，只要有一家宝贝发布成功则返回true
     */
    @ApiField("success")
    private Boolean success;

    /**
     * 操作成功的宝贝id列表
     */
    @ApiListField("success_item_list")
    @ApiField("number")
    private List<Long> successItemList;

    public String getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public List<Long> getFailedItemList() {
        return this.failedItemList;
    }

    public void setFailedItemList(List<Long> failedItemList) {
        this.failedItemList = failedItemList;
    }

    public Boolean getSuccess() {
        return this.success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<Long> getSuccessItemList() {
        return this.successItemList;
    }

    public void setSuccessItemList(List<Long> successItemList) {
        this.successItemList = successItemList;
    }

}
