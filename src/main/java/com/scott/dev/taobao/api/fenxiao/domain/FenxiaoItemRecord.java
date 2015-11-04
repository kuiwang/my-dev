package com.scott.dev.taobao.api.fenxiao.domain;

import java.util.Date;

//分销商品下载记录
public class FenxiaoItemRecord {

    //分销商ID
    private Number distributorId;

    //商品ID
    private Number itemId;

    ///产品ID
    private Number productId;

    //下载时间
    private Date created;

    //更新时间（系统时间，无业务意义）
    private Date modified;

    //分销方式：AGENT（只做代销，默认值）、DEALER（只做经销）
    private String tradeType;

    public Number getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(Number distributorId) {
        this.distributorId = distributorId;
    }

    public Number getItemId() {
        return itemId;
    }

    public void setItemId(Number itemId) {
        this.itemId = itemId;
    }

    public Number getProductId() {
        return productId;
    }

    public void setProductId(Number productId) {
        this.productId = productId;
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

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }
}
