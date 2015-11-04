package com.scott.dev.taobao.api.subuser.domain;

/**
 * 子账号基本信息
 */
public class SubUserInfo {

    /**
     * 子账号姓名
     */
    private String fullName;

    /**
     * 是否参与分流 1不参与 2参与
     */
    private Long isOnline;

    /**
     * 子账号用户名
     */
    private String nick;

    /**
     * 子账号所属的主账号的唯一标识
     */
    private Long sellerId;

    /**
     * 主账号昵称
     */
    private String sellerNick;

    /**
     * 子账号当前状态 1正常 -1删除 2冻结
     */
    private Long status;

    /**
     * 子账号Id
     */
    private Long subId;

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Long getIsOnline() {
        return this.isOnline;
    }

    public void setIsOnline(Long isOnline) {
        this.isOnline = isOnline;
    }

    public String getNick() {
        return this.nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Long getSellerId() {
        return this.sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerNick() {
        return this.sellerNick;
    }

    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getSubId() {
        return this.subId;
    }

    public void setSubId(Long subId) {
        this.subId = subId;
    }

}
