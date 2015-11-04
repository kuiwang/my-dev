package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.sp.item.extra.info.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SpItemExtraInfoGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2852318491958142867L;

    /**
     * 返回Json格式的商品附加信息:itemId:商品ID ;tk:是否是淘客,0：非淘客；5：淘客; finalPrice:优惠后的价格,
     * 如果没有优惠则为一口价; biz30day: 30天内总销售笔数; promotedService: 消保类型 1-先行赔付服务,
     * 2-假一赔三服务, 4-七天无理由退货服务, 8-闪电发货服务, 16-数 码与家电30天维修服务; sellerId: 卖家数字ID
     */
    @ApiField("value")
    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
