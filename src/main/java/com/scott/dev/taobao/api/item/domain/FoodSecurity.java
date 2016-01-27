package com.scott.dev.taobao.api.item.domain;

/*
 * 食品安全信息，包括： 生产许可证号、产品标准号、厂名、厂址等
 */
public class FoodSecurity {

    /*
     * 厂家联系方式
     */
    private String contact;

    /*
     * 产品标准号
     */
    private String designCode;

    /*
     * 厂名
     */
    private String factory;

    /*
     * 厂址
     */
    private String factorySite;

    /*
     * 食品添加剂
     */
    private String foodAdditive;

    /*
     * 健字号，保健品/膳食营养补充剂 这个类目下特有的信息，此类目下无需填写生产许可证编号（QS），
     * 如果填写了生产许可证编号（QS）将被忽略不保存；保存宝贝时，
     * 标题前会自动加上健字号产品名称一起作为宝贝标题
     */
    private String healthProductNo;

    /*
     * 配料表
     */
    private String mix;

    /*
     * 保质期
     */
    private String period;

    /*
     * 储藏方法
     */
    private String planStorage;

    /*
     * 生产许可证号
     */
    private String prdLicenseNo;

    /*
     * 生产结束日期
     */
    private String productDateEnd;

    /*
     * 生产开始日期
     */
    private String productDateStart;

    /*
     * 进货结束日期，要在生产日期之后
     */
    private String stockDateEnd;

    /*
     * 进货开始日期，要在生产日期之后
     */
    private String stockDateStart;

    /*
     * 供货商
     */
    private String supplier;

    public String getContact() {
        return contact;
    }

    public String getDesignCode() {
        return designCode;
    }

    public String getFactory() {
        return factory;
    }

    public String getFactorySite() {
        return factorySite;
    }

    public String getFoodAdditive() {
        return foodAdditive;
    }

    public String getHealthProductNo() {
        return healthProductNo;
    }

    public String getMix() {
        return mix;
    }

    public String getPeriod() {
        return period;
    }

    public String getPlanStorage() {
        return planStorage;
    }

    public String getPrdLicenseNo() {
        return prdLicenseNo;
    }

    public String getProductDateEnd() {
        return productDateEnd;
    }

    public String getProductDateStart() {
        return productDateStart;
    }

    public String getStockDateEnd() {
        return stockDateEnd;
    }

    public String getStockDateStart() {
        return stockDateStart;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setDesignCode(String designCode) {
        this.designCode = designCode;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public void setFactorySite(String factorySite) {
        this.factorySite = factorySite;
    }

    public void setFoodAdditive(String foodAdditive) {
        this.foodAdditive = foodAdditive;
    }

    public void setHealthProductNo(String healthProductNo) {
        this.healthProductNo = healthProductNo;
    }

    public void setMix(String mix) {
        this.mix = mix;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public void setPlanStorage(String planStorage) {
        this.planStorage = planStorage;
    }

    public void setPrdLicenseNo(String prdLicenseNo) {
        this.prdLicenseNo = prdLicenseNo;
    }

    public void setProductDateEnd(String productDateEnd) {
        this.productDateEnd = productDateEnd;
    }

    public void setProductDateStart(String productDateStart) {
        this.productDateStart = productDateStart;
    }

    public void setStockDateEnd(String stockDateEnd) {
        this.stockDateEnd = stockDateEnd;
    }

    public void setStockDateStart(String stockDateStart) {
        this.stockDateStart = stockDateStart;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
}
