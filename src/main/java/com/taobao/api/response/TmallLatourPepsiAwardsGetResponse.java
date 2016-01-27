package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.LatourDrawAward;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: tmall.latour.pepsi.awards.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TmallLatourPepsiAwardsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1133947288467466831L;

    /**
     * 奖品列表
     */
    @ApiListField("awards")
    @ApiField("latour_draw_award")
    private List<LatourDrawAward> awards;

    public List<LatourDrawAward> getAwards() {
        return this.awards;
    }

    public void setAwards(List<LatourDrawAward> awards) {
        this.awards = awards;
    }

}
