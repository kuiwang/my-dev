package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 需求订购信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class SubscInfo extends TaobaoObject {

    private static final long serialVersionUID = 5135889755385797266L;

    /**
     * 订单id
     */
    @ApiField("id")
    private Long id;

    /**
     * 订单状态
     */
    @ApiField("process_status")
    private Long processStatus;

    /**
     * 销售提成
     */
    @ApiField("sale_bonus")
    private String saleBonus;

    /**
     * 商家名称
     */
    @ApiField("seller_name")
    private String sellerName;

    /**
     * 服务开结束时间
     */
    @ApiField("service_end_time")
    private Date serviceEndTime;

    /**
     * 服务开始时间
     */
    @ApiField("service_start_time")
    private Date serviceStartTime;

    /**
     * 服务商名称
     */
    @ApiField("sp_name")
    private String spName;

    /**
     * 子账号名称列表
     */
    @ApiField("sub_account_list")
    private String subAccountList;

    /**
     * 订单创建时间
     */
    @ApiField("subsc_created_time")
    private Date subscCreatedTime;

    /**
     * 订单修改时间
     */
    @ApiField("subsc_modified_time")
    private Date subscModifiedTime;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProcessStatus() {
        return this.processStatus;
    }

    public void setProcessStatus(Long processStatus) {
        this.processStatus = processStatus;
    }

    public String getSaleBonus() {
        return this.saleBonus;
    }

    public void setSaleBonus(String saleBonus) {
        this.saleBonus = saleBonus;
    }

    public String getSellerName() {
        return this.sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Date getServiceEndTime() {
        return this.serviceEndTime;
    }

    public void setServiceEndTime(Date serviceEndTime) {
        this.serviceEndTime = serviceEndTime;
    }

    public Date getServiceStartTime() {
        return this.serviceStartTime;
    }

    public void setServiceStartTime(Date serviceStartTime) {
        this.serviceStartTime = serviceStartTime;
    }

    public String getSpName() {
        return this.spName;
    }

    public void setSpName(String spName) {
        this.spName = spName;
    }

    public String getSubAccountList() {
        return this.subAccountList;
    }

    public void setSubAccountList(String subAccountList) {
        this.subAccountList = subAccountList;
    }

    public Date getSubscCreatedTime() {
        return this.subscCreatedTime;
    }

    public void setSubscCreatedTime(Date subscCreatedTime) {
        this.subscCreatedTime = subscCreatedTime;
    }

    public Date getSubscModifiedTime() {
        return this.subscModifiedTime;
    }

    public void setSubscModifiedTime(Date subscModifiedTime) {
        this.subscModifiedTime = subscModifiedTime;
    }

}
