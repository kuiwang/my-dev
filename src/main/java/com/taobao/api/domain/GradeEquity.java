package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * tmall权益
 *
 * @author auto create
 * @since 1.0, null
 */
public class GradeEquity extends TaobaoObject {

    private static final long serialVersionUID = 3686185996738152239L;

    /**
     * 买家会员级别 0:店铺客户 1：普通会员 2：高级会员 3：VIP会员 4：至尊VIP
     */
    @ApiField("cur_grade")
    private String curGrade;

    /**
     * 店铺客户、普通会员 、高级会员、VIP会员、至尊VIP
     */
    @ApiField("cur_grade_name")
    private String curGradeName;

    /**
     * 在包邮的前提下的不免邮区域
     */
    @ApiField("exclude_area")
    private String excludeArea;

    /**
     * 返回几倍tmall积分
     */
    @ApiField("point")
    private Long point;

    /**
     * 是否该等级开启包邮
     */
    @ApiField("postage")
    private Boolean postage;

    public String getCurGrade() {
        return this.curGrade;
    }

    public String getCurGradeName() {
        return this.curGradeName;
    }

    public String getExcludeArea() {
        return this.excludeArea;
    }

    public Long getPoint() {
        return this.point;
    }

    public Boolean getPostage() {
        return this.postage;
    }

    public void setCurGrade(String curGrade) {
        this.curGrade = curGrade;
    }

    public void setCurGradeName(String curGradeName) {
        this.curGradeName = curGradeName;
    }

    public void setExcludeArea(String excludeArea) {
        this.excludeArea = excludeArea;
    }

    public void setPoint(Long point) {
        this.point = point;
    }

    public void setPostage(Boolean postage) {
        this.postage = postage;
    }

}
