package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.GradeEquity;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: tmall.crm.equity.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TmallCrmEquityGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8617397817878398284L;

    /**
     * 天猫卖家设置的等级权益
     */
    @ApiListField("grade_equitys")
    @ApiField("grade_equity")
    private List<GradeEquity> gradeEquitys;

    public void setGradeEquitys(List<GradeEquity> gradeEquitys) {
        this.gradeEquitys = gradeEquitys;
    }

    public List<GradeEquity> getGradeEquitys() {
        return this.gradeEquitys;
    }

}
