package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.brandservice.fanscount.query response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class BrandserviceFanscountQueryResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4134278899238178121L;

    /**
     * 返回粉丝个数
     */
    @ApiField("value")
    private Long value;

    public void setValue(Long value) {
        this.value = value;
    }

    public Long getValue() {
        return this.value;
    }

}
