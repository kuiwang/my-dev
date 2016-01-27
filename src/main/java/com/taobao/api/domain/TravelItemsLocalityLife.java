package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 旅游度假线路电子凭证（本地生活）结构。
 *
 * @author auto create
 * @since 1.0, null
 */
public class TravelItemsLocalityLife extends TaobaoObject {

    private static final long serialVersionUID = 7222574573818962821L;

    /**
     * 表示是否使用邮寄 0: 代表不使用邮寄； 1：代表使用邮寄；如果不设置这个值，代表不使用邮寄。
     */
    @ApiField("choose_logis")
    private Long chooseLogis;

    /**
     * 电子交易凭证有效期，有三种格式：如果有效期为起止日期类型，此值为2012-08-06,2012-08-16
     * 如果有效期为【购买成功日至】类型则格式为2012-08-16 ；如果有效期为天数类型则格式为15
     */
    @ApiField("expirydate")
    private String expirydate;

    /**
     * 格式为 码商id:nick
     */
    @ApiField("merchant")
    private String merchant;

    /**
     * 网点ID,在参数empty_fields里设置locality_life.network_id可删除网点ID。
     */
    @ApiField("network_id")
    private String networkId;

    /**
     * 电子凭证售中自动退款比例。
     */
    @ApiField("onsale_auto_refund_ratio")
    private Long onsaleAutoRefundRatio;

    /**
     * 退款比例，百分比%前的数字，1-100的正整数值；
     * 在参数empty_fields里设置travel_items_locality_life.refund_ratio可删除退款比例。
     */
    @ApiField("refund_ratio")
    private Long refundRatio;

    /**
     * 核销打款:1代表核销打款,0代表非核销打款;
     * 在参数empty_fields里设置travel_items_locality_life.verification可删除核销打款。
     */
    @ApiField("verification")
    private String verification;

    public Long getChooseLogis() {
        return this.chooseLogis;
    }

    public String getExpirydate() {
        return this.expirydate;
    }

    public String getMerchant() {
        return this.merchant;
    }

    public String getNetworkId() {
        return this.networkId;
    }

    public Long getOnsaleAutoRefundRatio() {
        return this.onsaleAutoRefundRatio;
    }

    public Long getRefundRatio() {
        return this.refundRatio;
    }

    public String getVerification() {
        return this.verification;
    }

    public void setChooseLogis(Long chooseLogis) {
        this.chooseLogis = chooseLogis;
    }

    public void setExpirydate(String expirydate) {
        this.expirydate = expirydate;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    public void setOnsaleAutoRefundRatio(Long onsaleAutoRefundRatio) {
        this.onsaleAutoRefundRatio = onsaleAutoRefundRatio;
    }

    public void setRefundRatio(Long refundRatio) {
        this.refundRatio = refundRatio;
    }

    public void setVerification(String verification) {
        this.verification = verification;
    }

}
