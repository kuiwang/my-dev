package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SellerAuthorize;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.itemcats.authorize.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ItemcatsAuthorizeGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2283125683116577984L;

    /**
     * 里面有3个数组： Brand[]品牌列表, ItemCat[] 类目列表 XinpinItemCat[] 针对于C卖家新品类目列表
     */
    @ApiField("seller_authorize")
    private SellerAuthorize sellerAuthorize;

    public SellerAuthorize getSellerAuthorize() {
        return this.sellerAuthorize;
    }

    public void setSellerAuthorize(SellerAuthorize sellerAuthorize) {
        this.sellerAuthorize = sellerAuthorize;
    }

}
