package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.mbc.promotion.use response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class MbcPromotionUseResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3849668727389124784L;

    /**
     * 淘宝这边生成的唯一ID
     */
    @ApiField("id")
    private Long id;

    /**
     * 0：失败；1：成功
     */
    @ApiField("ret_code")
    private Long retCode;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setRetCode(Long retCode) {
        this.retCode = retCode;
    }

    public Long getRetCode() {
        return this.retCode;
    }

}
