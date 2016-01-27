package com.scott.dev.taobao.api.fenxiao.domain;

import java.util.Date;

//合作申请
public class Requisition {

    //好评率
    private Number distAppraise;

    //主营类目
    private Number distCategory;

    //主营类目名称
    private String distCategoryName;

    //是否消保(0-不是、1-是)
    private Number distIsXiaobao;

    //店铺星级
    private Number distLevel;

    //分销申请加盟时，给供应商的留言
    private String distMessage;

    //开店时间
    private Date distOpenDate;

    //分销商id
    private Number distributorId;

    //分销商nick
    private String distributorNick;

    //店铺地址
    private String distShopAddress;

    //申请时间
    private Date gmtCreate;

    //合作申请ID
    private Number requisitionId;

    //申请状态（1-申请中、2-成功、3-被退回、4-已撤消、5-过期）
    private Number status;

    public Number getDistAppraise() {
        return distAppraise;
    }

    public Number getDistCategory() {
        return distCategory;
    }

    public String getDistCategoryName() {
        return distCategoryName;
    }

    public Number getDistIsXiaobao() {
        return distIsXiaobao;
    }

    public Number getDistLevel() {
        return distLevel;
    }

    public String getDistMessage() {
        return distMessage;
    }

    public Date getDistOpenDate() {
        return distOpenDate;
    }

    public Number getDistributorId() {
        return distributorId;
    }

    public String getDistributorNick() {
        return distributorNick;
    }

    public String getDistShopAddress() {
        return distShopAddress;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public Number getRequisitionId() {
        return requisitionId;
    }

    public Number getStatus() {
        return status;
    }

    public void setDistAppraise(Number distAppraise) {
        this.distAppraise = distAppraise;
    }

    public void setDistCategory(Number distCategory) {
        this.distCategory = distCategory;
    }

    public void setDistCategoryName(String distCategoryName) {
        this.distCategoryName = distCategoryName;
    }

    public void setDistIsXiaobao(Number distIsXiaobao) {
        this.distIsXiaobao = distIsXiaobao;
    }

    public void setDistLevel(Number distLevel) {
        this.distLevel = distLevel;
    }

    public void setDistMessage(String distMessage) {
        this.distMessage = distMessage;
    }

    public void setDistOpenDate(Date distOpenDate) {
        this.distOpenDate = distOpenDate;
    }

    public void setDistributorId(Number distributorId) {
        this.distributorId = distributorId;
    }

    public void setDistributorNick(String distributorNick) {
        this.distributorNick = distributorNick;
    }

    public void setDistShopAddress(String distShopAddress) {
        this.distShopAddress = distShopAddress;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public void setRequisitionId(Number requisitionId) {
        this.requisitionId = requisitionId;
    }

    public void setStatus(Number status) {
        this.status = status;
    }

}
