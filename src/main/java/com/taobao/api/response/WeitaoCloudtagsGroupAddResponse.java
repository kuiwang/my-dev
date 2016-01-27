package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.weitao.cloudtags.group.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WeitaoCloudtagsGroupAddResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7543783374946394798L;

    /**
     * 是否成功
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    /**
     * 是否添加成功
     */
    @ApiField("result")
    private String result;

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public String getResult() {
        return this.result;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public void setResult(String result) {
        this.result = result;
    }

}
