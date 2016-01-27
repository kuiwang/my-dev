package com.scott.dev.taobao.api.memmanage.domain;

//tmall权益
public class GradeEquity {

    //买家会员级别 0:店铺客户 1：普通会员 2：高级会员 3：VIP会员 4：至尊VIP
    private String curGrade;

    //店铺客户、普通会员 、高级会员、VIP会员、至尊VIP
    private String curGradeName;

    //在包邮的前提下的不免邮区域
    private String excludeArea;

    //返回几倍tmall积分
    private Number point;

    //是否该等级开启包邮
    private Boolean postage;

    public String getCurGrade() {
        return curGrade;
    }

    public String getCurGradeName() {
        return curGradeName;
    }

    public String getExcludeArea() {
        return excludeArea;
    }

    public Number getPoint() {
        return point;
    }

    public Boolean getPostage() {
        return postage;
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

    public void setPoint(Number point) {
        this.point = point;
    }

    public void setPostage(Boolean postage) {
        this.postage = postage;
    }
}
