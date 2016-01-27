package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SpContentDOForDetail;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.sp.content.detail.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SpContentDetailGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6183476189171682964L;

    /**
     * 内容详情
     */
    @ApiField("content")
    private SpContentDOForDetail content;

    public SpContentDOForDetail getContent() {
        return this.content;
    }

    public void setContent(SpContentDOForDetail content) {
        this.content = content;
    }

}
