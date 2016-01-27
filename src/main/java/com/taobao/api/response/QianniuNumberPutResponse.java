package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.qianniu.number.put response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class QianniuNumberPutResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7637671494526839978L;

    /**
     * 是否上传成功。返回的是个json串，分别表示每条记录是否成功。
     */
    @ApiField("result")
    private String result;

    public String getResult() {
        return this.result;
    }

    public void setResult(String result) {
        this.result = result;
    }

}
