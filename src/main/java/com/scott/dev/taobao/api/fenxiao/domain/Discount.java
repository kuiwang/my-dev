package com.scott.dev.taobao.api.fenxiao.domain;

import java.util.Date;

//折扣信息
public class Discount {

    //折扣ID
    private Number discount_id;

    //折扣名称
    private String name;

    //折扣详情
    private DiscountDetail[] details;

    //创建时间
    private Date created;

    //修改时间
    private Date modified;

    public Number getDiscount_id() {
        return discount_id;
    }

    public void setDiscount_id(Number discount_id) {
        this.discount_id = discount_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DiscountDetail[] getDetails() {
        return details;
    }

    public void setDetails(DiscountDetail[] details) {
        this.details = details;
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
