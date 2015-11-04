package com.scott.dev.taobao.api.fenxiao.domain;

import java.util.Date;

//合作申请
public class Requisition {

    //合作申请ID
    private Number requisitionId;

    //分销商id
    private Number distributorId;

    //分销商nick
    private String distributorNick;

    //申请状态（1-申请中、2-成功、3-被退回、4-已撤消、5-过期）
    private Number status;

    //是否消保(0-不是、1-是)
    private Number distIsXiaobao;

    //店铺地址
    private String distShopAddress;

    //店铺星级
    private Number distLevel;

    //好评率
    private Number distAppraise;

    //开店时间
    private Date distOpenDate;

    //主营类目
    private Number distCategory;

    //申请时间
    private Date gmtCreate;

    //分销申请加盟时，给供应商的留言
    private String distMessage;

    //主营类目名称
    private String distCategoryName;

    public Number getRequisitionId() {
        return requisitionId;
    }

    public void setRequisitionId(Number requisitionId) {
        this.requisitionId = requisitionId;
    }

    public Number getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(Number distributorId) {
        this.distributorId = distributorId;
    }

    public String getDistributorNick() {
        return distributorNick;
    }

    public void setDistributorNick(String distributorNick) {
        this.distributorNick = distributorNick;
    }

    public Number getStatus() {
        return status;
    }

    public void setStatus(Number status) {
        this.status = status;
    }

    public Number getDistIsXiaobao() {
        return distIsXiaobao;
    }

    public void setDistIsXiaobao(Number distIsXiaobao) {
        this.distIsXiaobao = distIsXiaobao;
    }

    public String getDistShopAddress() {
        return distShopAddress;
    }

    public void setDistShopAddress(String distShopAddress) {
        this.distShopAddress = distShopAddress;
    }

    public Number getDistLevel() {
        return distLevel;
    }

    public void setDistLevel(Number distLevel) {
        this.distLevel = distLevel;
    }

    public Number getDistAppraise() {
        return distAppraise;
    }

    public void setDistAppraise(Number distAppraise) {
        this.distAppraise = distAppraise;
    }

    public Date getDistOpenDate() {
        return distOpenDate;
    }

    public void setDistOpenDate(Date distOpenDate) {
        this.distOpenDate = distOpenDate;
    }

    public Number getDistCategory() {
        return distCategory;
    }

    public void setDistCategory(Number distCategory) {
        this.distCategory = distCategory;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getDistMessage() {
        return distMessage;
    }

    public void setDistMessage(String distMessage) {
        this.distMessage = distMessage;
    }

    public String getDistCategoryName() {
        return distCategoryName;
    }

    public void setDistCategoryName(String distCategoryName) {
        this.distCategoryName = distCategoryName;
    }

}
