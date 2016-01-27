package com.scott.dev.taobao.api.item.domain;

/*
 * 门票商品电子凭证信息
 */
public class TicketEtc {

    /*
     *  商品电子凭证是否关联本地商户-在门票商品为电子凭证时必选
     */
    private Boolean associationStatus;

    /*
     * 商品电子凭证的自动退款比例-在门票商品为电子凭证时必选
     */
    private Number autoRefund;

    /*
     * 商品电子凭证的码商-在门票商品为电子凭证时必选
     */
    private String merchantId;

    /*
     * 商品电子凭证的码商名-在门票商品为电子凭证时必选
     */
    private String merchantNick;

    /*
     * 商品电子凭证的码商-在门票商品为电子凭证时必选
     */
    private String networkId;

    /*
     * 商品电子凭证的过期退款比例-在门票商品为电子凭证时必选
     */
    private Number overduePay;

    /*
     * 商品电子凭证是否核销打款-在门票商品为电子凭证时必选
     */
    private Boolean verificationPay;

    public Boolean getAssociationStatus() {
        return associationStatus;
    }

    public Number getAutoRefund() {
        return autoRefund;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public String getMerchantNick() {
        return merchantNick;
    }

    public String getNetworkId() {
        return networkId;
    }

    public Number getOverduePay() {
        return overduePay;
    }

    public Boolean getVerificationPay() {
        return verificationPay;
    }

    public void setAssociationStatus(Boolean associationStatus) {
        this.associationStatus = associationStatus;
    }

    public void setAutoRefund(Number autoRefund) {
        this.autoRefund = autoRefund;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public void setMerchantNick(String merchantNick) {
        this.merchantNick = merchantNick;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    public void setOverduePay(Number overduePay) {
        this.overduePay = overduePay;
    }

    public void setVerificationPay(Boolean verificationPay) {
        this.verificationPay = verificationPay;
    }

}
