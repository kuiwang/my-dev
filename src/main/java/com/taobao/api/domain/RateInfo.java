package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 评价信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class RateInfo extends TaobaoObject {

    private static final long serialVersionUID = 7494752753378247845L;

    /**
     * 评价信息
     */
    @ApiListField("rate_list")
    @ApiField("rate_item")
    private List<RateItem> rateList;

    public List<RateItem> getRateList() {
        return this.rateList;
    }

    public void setRateList(List<RateItem> rateList) {
        this.rateList = rateList;
    }

}
