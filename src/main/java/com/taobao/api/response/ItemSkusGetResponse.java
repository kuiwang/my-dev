package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Sku;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.item.skus.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ItemSkusGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2257785221617238599L;

    /**
     * Sku列表
     */
    @ApiListField("skus")
    @ApiField("sku")
    private List<Sku> skus;

    public List<Sku> getSkus() {
        return this.skus;
    }

    public void setSkus(List<Sku> skus) {
        this.skus = skus;
    }

}
