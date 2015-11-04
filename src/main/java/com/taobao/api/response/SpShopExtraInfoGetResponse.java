package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.sp.shop.extra.info.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SpShopExtraInfoGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1696674597739457864L;

    /**
     * 返回Json格式的店铺附加信息:tmall: 1:B商家，0：非B; sellerCredit:
     * 卖家信用等级,如果是天猫店铺则返回空值; auctionCount: 店铺宝贝数 srt:(本店)近30天平均退款速度;
     * art:(行业)近30天行业平均退款速度; srtp:(本店)近30天平均退款率 = 近30天退款笔数/近30天支付宝成交笔数;
     * arr:近30天行业平均退款率; ccp:(本店)近30天投诉率=近30天投诉总数/近30天支付宝成交笔数;
     * acr:(行业)近30天行业平均投诉率; punc:(本店)近30天被处罚总数; apts:(行业)近30天行业平均处罚次数;
     * gerd:(本店)店铺好评率，即店铺累计好评数/店铺评价总数; iasgr:(行业)好评率（行业平均）,加载周期：周
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
