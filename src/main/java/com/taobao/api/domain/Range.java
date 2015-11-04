package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 营销工具的范围类！
 *
 * @author auto create
 * @since 1.0, null
 */
public class Range extends TaobaoObject {

    private static final long serialVersionUID = 1467754259299839231L;

    /**
     * 营销范围参与者id。即MarketingRangeDO中的participateId。
     */
    @ApiField("participate_id")
    private Long participateId;

    /**
     * 营销范围参与者类型。MarketingRangeDO中的participateType。(1:商品;2:店铺;3:seller;4:
     * sku;5:category;6:shopCategory)
     */
    @ApiField("participate_type")
    private Long participateType;

    public Long getParticipateId() {
        return this.participateId;
    }

    public void setParticipateId(Long participateId) {
        this.participateId = participateId;
    }

    public Long getParticipateType() {
        return this.participateType;
    }

    public void setParticipateType(Long participateType) {
        this.participateType = participateType;
    }

}
