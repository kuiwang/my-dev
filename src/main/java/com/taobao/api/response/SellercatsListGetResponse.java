package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SellerCat;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.sellercats.list.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SellercatsListGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5516746723841229166L;

    /**
     * 卖家自定义类目
     */
    @ApiListField("seller_cats")
    @ApiField("seller_cat")
    private List<SellerCat> sellerCats;

    public List<SellerCat> getSellerCats() {
        return this.sellerCats;
    }

    public void setSellerCats(List<SellerCat> sellerCats) {
        this.sellerCats = sellerCats;
    }

}
