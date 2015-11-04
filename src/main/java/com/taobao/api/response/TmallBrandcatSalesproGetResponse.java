package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.CatBrandSaleProp;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: tmall.brandcat.salespro.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TmallBrandcatSalesproGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2343632264832541758L;

    /**
     * 获取被管控品牌和类目下的销售属性，注意，一个管控品牌和类目下可能有多个销售属性。
     */
    @ApiListField("cat_brand_sale_props")
    @ApiField("cat_brand_sale_prop")
    private List<CatBrandSaleProp> catBrandSaleProps;

    public void setCatBrandSaleProps(List<CatBrandSaleProp> catBrandSaleProps) {
        this.catBrandSaleProps = catBrandSaleProps;
    }

    public List<CatBrandSaleProp> getCatBrandSaleProps() {
        return this.catBrandSaleProps;
    }

}
