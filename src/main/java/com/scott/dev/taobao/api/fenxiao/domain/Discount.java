package com.scott.dev.taobao.api.fenxiao.domain;

import java.util.Date;

//折扣信息
public class Discount {

    //创建时间
    private Date created;

    //折扣详情
    private DiscountDetail[] details;

    //折扣ID
    private Number discount_id;

    //修改时间
    private Date modified;

    //折扣名称
    private String name;

    public Date getCreated() {
        return created;
    }

    public DiscountDetail[] getDetails() {
        return details;
    }

    public Number getDiscount_id() {
        return discount_id;
    }

    public Date getModified() {
        return modified;
    }

    public String getName() {
        return name;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setDetails(DiscountDetail[] details) {
        this.details = details;
    }

    public void setDiscount_id(Number discount_id) {
        this.discount_id = discount_id;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public void setName(String name) {
        this.name = name;
    }
}
