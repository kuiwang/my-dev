package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 获取商品资质信息的返回数据结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class Qualifications extends TaobaoObject {

    private static final long serialVersionUID = 7428121286151621873L;

    /**
     * 返回的错误信息
     */
    @ApiField("message")
    private String message;

    /**
     * 返回的商品资质信息
     */
    @ApiField("model")
    private String model;

    /**
     * 是否成功
     */
    @ApiField("result")
    private Boolean result;

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Boolean getResult() {
        return this.result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

}
