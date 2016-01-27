package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 分销API返回数据结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class Distributor extends TaobaoObject {

    private static final long serialVersionUID = 1251687962865932616L;

    /**
     * 分销商的支付宝帐户
     */
    @ApiField("alipay_account")
    private String alipayAccount;

    /**
     * 分销商的淘宝卖家评价
     */
    @ApiField("appraise")
    private Long appraise;

    /**
     * 分销商店铺主营类目
     */
    @ApiField("category_id")
    private Long categoryId;

    /**
     * 联系人
     */
    @ApiField("contact_person")
    private String contactPerson;

    /**
     * 分销商创建时间 时间格式：yyyy-MM-dd HH:mm:ss
     */
    @ApiField("created")
    private Date created;

    /**
     * 分销商Id
     */
    @ApiField("distributor_id")
    private Long distributorId;

    /**
     * 分销商姓名
     */
    @ApiField("distributor_name")
    private String distributorName;

    /**
     * 分销商的email
     */
    @ApiField("email")
    private String email;

    /**
     * 分销商的真实姓名，认证姓名
     */
    @ApiField("full_name")
    private String fullName;

    /**
     * 店铺等级
     */
    @ApiField("level")
    private Long level;

    /**
     * 分销商的手机号
     */
    @ApiField("mobile_phone")
    private String mobilePhone;

    /**
     * 分销商的电话
     */
    @ApiField("phone")
    private String phone;

    /**
     * 分销商的网店链接
     */
    @ApiField("shop_web_link")
    private String shopWebLink;

    /**
     * 分销商卖家的开店时间
     */
    @ApiField("starts")
    private Date starts;

    /**
     * 分销商ID
     */
    @ApiField("user_id")
    private Long userId;

    public String getAlipayAccount() {
        return this.alipayAccount;
    }

    public Long getAppraise() {
        return this.appraise;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public String getContactPerson() {
        return this.contactPerson;
    }

    public Date getCreated() {
        return this.created;
    }

    public Long getDistributorId() {
        return this.distributorId;
    }

    public String getDistributorName() {
        return this.distributorName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getFullName() {
        return this.fullName;
    }

    public Long getLevel() {
        return this.level;
    }

    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getShopWebLink() {
        return this.shopWebLink;
    }

    public Date getStarts() {
        return this.starts;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setAlipayAccount(String alipayAccount) {
        this.alipayAccount = alipayAccount;
    }

    public void setAppraise(Long appraise) {
        this.appraise = appraise;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setDistributorId(Long distributorId) {
        this.distributorId = distributorId;
    }

    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setShopWebLink(String shopWebLink) {
        this.shopWebLink = shopWebLink;
    }

    public void setStarts(Date starts) {
        this.starts = starts;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}
