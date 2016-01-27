package com.scott.dev.taobao.api.item.domain;

/*
 * 商品资质信息校验结果
 */
public class RemoteResult {

    /*
     * 校验结果信息
     */
    private String message;

    /*
     * 校验结果，true/false
     */
    private Boolean result;

    public String getMessage() {
        return message;
    }

    public Boolean getResult() {
        return result;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }
}
