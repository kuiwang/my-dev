package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * resultdata返回结果usefulmsg提示信息code返回错误码
 *
 * @author auto create
 * @since 1.0, null
 */
public class CreateResult extends TaobaoObject {

    private static final long serialVersionUID = 4788552911139492121L;

    /**
     * 宝贝id
     */
    @ApiField("result_data")
    private String resultData;

    /**
     * 业务提示信息
     */
    @ApiField("useful_msg")
    private String usefulMsg;

    public String getResultData() {
        return this.resultData;
    }

    public String getUsefulMsg() {
        return this.usefulMsg;
    }

    public void setResultData(String resultData) {
        this.resultData = resultData;
    }

    public void setUsefulMsg(String usefulMsg) {
        this.usefulMsg = usefulMsg;
    }

}
