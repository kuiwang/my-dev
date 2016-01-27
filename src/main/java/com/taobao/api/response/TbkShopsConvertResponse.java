package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TbkShop;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.tbk.shops.convert response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TbkShopsConvertResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7243236812598646326L;

    /**
     * 淘宝客店铺对象列表
     */
    @ApiListField("tbk_shops")
    @ApiField("tbk_shop")
    private List<TbkShop> tbkShops;

    public List<TbkShop> getTbkShops() {
        return this.tbkShops;
    }

    public void setTbkShops(List<TbkShop> tbkShops) {
        this.tbkShops = tbkShops;
    }

}
