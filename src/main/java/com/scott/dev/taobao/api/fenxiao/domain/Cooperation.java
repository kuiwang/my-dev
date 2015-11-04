package com.scott.dev.taobao.api.fenxiao.domain;

import java.util.Date;
import java.util.List;

/**
 * 合作分销关系
 */
public class Cooperation {

    /**
     * 供应商授权的支付方式：ALIPAY(支付宝)、OFFPREPAY(预付款)、OFFTRANSFER(转帐)、OFFSETTLEMENT(
     * 后期结算)
     */
    private List<String> authPayway;

    /**
     * 合作关系ID
     */
    private Long cooperateId;

    /**
     * 分销商ID
     */
    private Long distributorId;

    /**
     * 分销商nick
     */
    private String distributorNick;

    /**
     * 合作终止时间
     */
    private Date endDate;

    /**
     * 等级ID
     */
    private Long gradeId;

    /**
     * 授权产品线
     */
    private String productLine;

    /**
     * 授权产品线名称，和product_line中的值按序对应
     */
    private List<String> productLineName;

    /**
     * 合作起始时间
     */
    private Date startDate;

    /**
     * 合作状态： NORMAL(合作中)、 ENDING(终止中) 、END (终止)
     */
    private String status;

    /**
     * 供应商ID
     */
    private Long supplierId;

    /**
     * 供应商NICK
     */
    private String supplierNick;

    /**
     * 分销方式： AGENT(代销) 、DEALER(经销)
     */
    private String tradeType;

    public List<String> getAuthPayway() {
        return this.authPayway;
    }

    public void setAuthPayway(List<String> authPayway) {
        this.authPayway = authPayway;
    }

    public Long getCooperateId() {
        return this.cooperateId;
    }

    public void setCooperateId(Long cooperateId) {
        this.cooperateId = cooperateId;
    }

    public Long getDistributorId() {
        return this.distributorId;
    }

    public void setDistributorId(Long distributorId) {
        this.distributorId = distributorId;
    }

    public String getDistributorNick() {
        return this.distributorNick;
    }

    public void setDistributorNick(String distributorNick) {
        this.distributorNick = distributorNick;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Long getGradeId() {
        return this.gradeId;
    }

    public void setGradeId(Long gradeId) {
        this.gradeId = gradeId;
    }

    public String getProductLine() {
        return this.productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public List<String> getProductLineName() {
        return this.productLineName;
    }

    public void setProductLineName(List<String> productLineName) {
        this.productLineName = productLineName;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getSupplierId() {
        return this.supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierNick() {
        return this.supplierNick;
    }

    public void setSupplierNick(String supplierNick) {
        this.supplierNick = supplierNick;
    }

    public String getTradeType() {
        return this.tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

}
