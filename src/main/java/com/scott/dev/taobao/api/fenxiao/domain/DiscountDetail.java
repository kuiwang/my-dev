package com.scott.dev.taobao.api.fenxiao.domain;

import java.util.Date;

//折扣详情信息
public class DiscountDetail {

    //折扣详情ID
    private Number detailId;

    //折扣类型:GRADE（按会员等级优惠）、DISTRIBUTOR（按分销商优惠）
    private String targetType;

    //会员等级的id或者分销商id
    private Number targetId;

    //等级名称或者分销商名称
    private String targetName;

    //优惠方式:PERCENT（按折扣优惠）、PRICE（按减价优惠）
    private String discountType;

    //优惠比率或者优惠价格 10%或10
    private Number discountValue;

    //创建时间
    private Date created;

    //修改时间
    private Date modified;

    public Number getDetailId() {
        return detailId;
    }

    public void setDetailId(Number detailId) {
        this.detailId = detailId;
    }

    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public Number getTargetId() {
        return targetId;
    }

    public void setTargetId(Number targetId) {
        this.targetId = targetId;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public Number getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(Number discountValue) {
        this.discountValue = discountValue;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }
}
