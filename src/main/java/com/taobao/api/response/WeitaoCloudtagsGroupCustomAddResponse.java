package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.weitao.cloudtags.group.custom.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WeitaoCloudtagsGroupCustomAddResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5436498981247932689L;

    /**
     * 操作是否成功
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    /**
     * 新创建的自定义分组id，未生效。
     */
    @ApiField("result")
    private String result;

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return this.result;
    }

}
