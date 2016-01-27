package com.scott.dev.taobao.api.item.domain;

/*
 * 卖家设置售后服务对象
 */
public class AfterSale {

    /*
     * id
     */
    private Number afterSaleId;

    /*
     * 名称
     */
    private String afterSaleName;

    /*
     *  tfs地址
     */
    private String afterSalePath;

    public Number getAfterSaleId() {
        return afterSaleId;
    }

    public String getAfterSaleName() {
        return afterSaleName;
    }

    public String getAfterSalePath() {
        return afterSalePath;
    }

    public void setAfterSaleId(Number afterSaleId) {
        this.afterSaleId = afterSaleId;
    }

    public void setAfterSaleName(String afterSaleName) {
        this.afterSaleName = afterSaleName;
    }

    public void setAfterSalePath(String afterSalePath) {
        this.afterSalePath = afterSalePath;
    }
}
