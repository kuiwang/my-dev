package com.scott.dev.taobao.api.item.domain;

/*
 * 食品安全信息，包括： 生产许可证号、产品标准号、厂名、厂址等
 */
public class FoodSecurity {

    /*
     * 生产许可证号
     */
    private String prdLicenseNo;

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
     * 厂家联系方式
     */
    private String contact;

    /*
     * 配料表
     */
    private String mix;

    /*
     * 储藏方法
     */
    private String planStorage;

    /*
     * 保质期
     */
    private String period;

    /*
     * 食品添加剂
     */
    private String foodAdditive;

    /*
     * 供货商
     */
    private String supplier;

    /*
     * 生产开始日期
     */
    private String productDateStart;

    /*
     * 生产结束日期
     */
    private String productDateEnd;

    /*
     * 进货开始日期，要在生产日期之后
     */
    private String stockDateStart;

    /*
     * 进货结束日期，要在生产日期之后
     */
    private String stockDateEnd;

    /*
     * 健字号，保健品/膳食营养补充剂 这个类目下特有的信息，此类目下无需填写生产许可证编号（QS），
     * 如果填写了生产许可证编号（QS）将被忽略不保存；保存宝贝时，
     * 标题前会自动加上健字号产品名称一起作为宝贝标题
     */
    private String healthProductNo;

    public String getPrdLicenseNo() {
        return prdLicenseNo;
    }

    public void setPrdLicenseNo(String prdLicenseNo) {
        this.prdLicenseNo = prdLicenseNo;
    }

    public String getDesignCode() {
        return designCode;
    }

    public void setDesignCode(String designCode) {
        this.designCode = designCode;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String getFactorySite() {
        return factorySite;
    }

    public void setFactorySite(String factorySite) {
        this.factorySite = factorySite;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getMix() {
        return mix;
    }

    public void setMix(String mix) {
        this.mix = mix;
    }

    public String getPlanStorage() {
        return planStorage;
    }

    public void setPlanStorage(String planStorage) {
        this.planStorage = planStorage;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getFoodAdditive() {
        return foodAdditive;
    }

    public void setFoodAdditive(String foodAdditive) {
        this.foodAdditive = foodAdditive;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getProductDateStart() {
        return productDateStart;
    }

    public void setProductDateStart(String productDateStart) {
        this.productDateStart = productDateStart;
    }

    public String getProductDateEnd() {
        return productDateEnd;
    }

    public void setProductDateEnd(String productDateEnd) {
        this.productDateEnd = productDateEnd;
    }

    public String getStockDateStart() {
        return stockDateStart;
    }

    public void setStockDateStart(String stockDateStart) {
        this.stockDateStart = stockDateStart;
    }

    public String getStockDateEnd() {
        return stockDateEnd;
    }

    public void setStockDateEnd(String stockDateEnd) {
        this.stockDateEnd = stockDateEnd;
    }

    public String getHealthProductNo() {
        return healthProductNo;
    }

    public void setHealthProductNo(String healthProductNo) {
        this.healthProductNo = healthProductNo;
    }
}
