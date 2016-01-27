package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.EbookYunpanToken;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.ebook.yunpan.token.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class EbookYunpanTokenGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7293248215823324813L;

    /**
     * 访问云盘的token信息
     */
    @ApiField("ebook_yunpan_token")
    private EbookYunpanToken ebookYunpanToken;

    public EbookYunpanToken getEbookYunpanToken() {
        return this.ebookYunpanToken;
    }

    public void setEbookYunpanToken(EbookYunpanToken ebookYunpanToken) {
        this.ebookYunpanToken = ebookYunpanToken;
    }

}
