package com.scott.dev.taobao.api.memmanage.domain;

//tmall权益
public class GradeEquity {

    //是否该等级开启包邮
    private Boolean postage;

    //返回几倍tmall积分
    private Number point;

    //在包邮的前提下的不免邮区域
    private String excludeArea;

    //买家会员级别 0:店铺客户 1：普通会员 2：高级会员 3：VIP会员 4：至尊VIP
    private String curGrade;

    //店铺客户、普通会员 、高级会员、VIP会员、至尊VIP
    private String curGradeName;

    public Boolean getPostage() {
        return postage;
    }

    public void setPostage(Boolean postage) {
        this.postage = postage;
    }

    public Number getPoint() {
        return point;
    }

    public void setPoint(Number point) {
        this.point = point;
    }

    public String getExcludeArea() {
        return excludeArea;
    }

    public void setExcludeArea(String excludeArea) {
        this.excludeArea = excludeArea;
    }

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
}
