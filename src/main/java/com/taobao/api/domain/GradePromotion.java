package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 卖家设置的等级优惠信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class GradePromotion extends TaobaoObject {

    private static final long serialVersionUID = 2559635326989611185L;

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
     * 会员级别折扣率没有小数，990代表9.9折
     */
    @ApiField("discount")
    private Long discount;

    /**
     * 普通会员、高级会员、VIP会员、至尊VIP。空的时候代表后续等级未启用或没有下一等级
     */
    @ApiField("next_grade")
    private String nextGrade;

    /**
     * 该等级对应的下一等级1:普通会员 2：高级会员 3：VIP会员 4：至尊VIP 0：后续等级都未启用或没有下一等级
     */
    @ApiField("next_grade_name")
    private String nextGradeName;

    /**
     * 升级到下一个级别的需要的交易额，单位：分
     */
    @ApiField("next_upgrade_amount")
    private Long nextUpgradeAmount;

    /**
     * 升级到下一个级别的需要的交易量
     */
    @ApiField("next_upgrade_count")
    private Long nextUpgradeCount;

    public String getCurGrade() {
        return this.curGrade;
    }

    public void setCurGrade(String curGrade) {
        this.curGrade = curGrade;
    }

    public String getCurGradeName() {
        return this.curGradeName;
    }

    public void setCurGradeName(String curGradeName) {
        this.curGradeName = curGradeName;
    }

    public Long getDiscount() {
        return this.discount;
    }

    public void setDiscount(Long discount) {
        this.discount = discount;
    }

    public String getNextGrade() {
        return this.nextGrade;
    }

    public void setNextGrade(String nextGrade) {
        this.nextGrade = nextGrade;
    }

    public String getNextGradeName() {
        return this.nextGradeName;
    }

    public void setNextGradeName(String nextGradeName) {
        this.nextGradeName = nextGradeName;
    }

    public Long getNextUpgradeAmount() {
        return this.nextUpgradeAmount;
    }

    public void setNextUpgradeAmount(Long nextUpgradeAmount) {
        this.nextUpgradeAmount = nextUpgradeAmount;
    }

    public Long getNextUpgradeCount() {
        return this.nextUpgradeCount;
    }

    public void setNextUpgradeCount(Long nextUpgradeCount) {
        this.nextUpgradeCount = nextUpgradeCount;
    }

}
