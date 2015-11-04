package com.scott.dev.taobao.api.memmanage.domain;

//卖家设置的等级优惠信息
public class GradePromotion {

    //买家会员级别 0:店铺客户 1：普通会员 2：高级会员 3：VIP会员 4：至尊VIP
    private String curGrade;

    //店铺客户、普通会员 、高级会员、VIP会员、至尊VIP
    private String curGradeName;

    //会员级别折扣率没有小数，990代表9.9折
    private Number discount;

    //升级到下一个级别的需要的交易额，单位：分
    private Number nextUpgradeAmount;

    //升级到下一个级别的需要的交易量
    private Number nextUpgradeCount;

    /*
     *该等级对应的下一等级1:普通会员 2：高级会员 3：VIP会员 4：至尊VIP 0：后续等级都未启用或没有下一等级 
     */
    private String nextGradeName;

    /*
     * 普通会员、高级会员、VIP会员、至尊VIP。空的时候代表后续等级未启用或没有下一等级
     */
    private String nextGrade;

    public String getCurGrade() {
        return curGrade;
    }

    public void setCurGrade(String curGrade) {
        this.curGrade = curGrade;
    }

    public String getCurGradeName() {
        return curGradeName;
    }

    public void setCurGradeName(String curGradeName) {
        this.curGradeName = curGradeName;
    }

    public Number getDiscount() {
        return discount;
    }

    public void setDiscount(Number discount) {
        this.discount = discount;
    }

    public Number getNextUpgradeAmount() {
        return nextUpgradeAmount;
    }

    public void setNextUpgradeAmount(Number nextUpgradeAmount) {
        this.nextUpgradeAmount = nextUpgradeAmount;
    }

    public Number getNextUpgradeCount() {
        return nextUpgradeCount;
    }

    public void setNextUpgradeCount(Number nextUpgradeCount) {
        this.nextUpgradeCount = nextUpgradeCount;
    }

    public String getNextGradeName() {
        return nextGradeName;
    }

    public void setNextGradeName(String nextGradeName) {
        this.nextGradeName = nextGradeName;
    }

    public String getNextGrade() {
        return nextGrade;
    }

    public void setNextGrade(String nextGrade) {
        this.nextGrade = nextGrade;
    }

}
