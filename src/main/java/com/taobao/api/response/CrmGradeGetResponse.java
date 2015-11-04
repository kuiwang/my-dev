package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.GradePromotion;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.crm.grade.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CrmGradeGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7478718998439216349L;

    /**
     * 等级信息集合
     */
    @ApiListField("grade_promotions")
    @ApiField("grade_promotion")
    private List<GradePromotion> gradePromotions;

    public void setGradePromotions(List<GradePromotion> gradePromotions) {
        this.gradePromotions = gradePromotions;
    }

    public List<GradePromotion> getGradePromotions() {
        return this.gradePromotions;
    }

}
