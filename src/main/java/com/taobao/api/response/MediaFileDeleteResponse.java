package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.media.file.delete response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class MediaFileDeleteResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7875988573446343963L;

    /**
     * 全部删除成功返回“”，部分删除成功返回没有删除成功的id
     */
    @ApiField("result")
    private String result;

    public void setResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return this.result;
    }

}
