package com.scott.dev.taobao.api.user.domain;

import java.util.Date;

/*
 * 用户
 */
public class User {

    /*
     * 用户数字ID
     */
    private Long userId;

    /*
     * 用户字符串ID
     */
    private String uid;

    /*
     * 用户昵称
     */
    private String nick;

    /*
     * 性别。可选值:m(男),f(女)
     */
    private String sex;

    /*
     * 买家信用
     */
    private UserCredit buyerCredit;

    /*
     * 卖家信用
     */
    private UserCredit sellerCredit;

    /*
     * 用户当前居住地公开信息。如：location.city获取其中的city数据
     */
    private Location location;

    /*
     * 用户注册时间。格式:yyyy-MM-dd HH:mm:ss
     */
    private Date created;

    /*
     * 最近登陆时间。格式:yyyy-MM-dd HH:mm:ss
     */
    private Date lastVisit;

    /*
     * 生日
     */
    private Date birthday;

    /*
     * 用户类型。可选值:B(B商家),C(C商家)
     */
    private String type;

    /*
     * 是否购买多图服务。可选值:true(是),false(否)
     */
    private Boolean hasMorePic;

    /*
     * 可上传商品图片数量
     */
    private Long itemImgNum;

    /*
     * 单张商品图片最大容量(商品主图大小)。单位:k
     */
    private Long itemImgSize;

    /*
     * 可上传属性图片数量
     */
    private Long propImgNum;

    /*
     * 单张销售属性图片最大容量（非主图的商品图片和商品属性图片）。单位:k
     */
    private Long propImgSize;

    /*
     * 是否受限制。可选值:limited(受限制),unlimited(不受限)
     */
    private String autoRepost;

    /*
     * 有无实名认证。可选值:authentication(实名认证),not authentication(没有认证)
     */
    private String promotedType;

    /*
     * 状态。可选值:normal(正常),inactive(未激活),delete(删除),reeze(冻结),supervise(监管)
     */
    private String status;

    /*
     * 有无绑定。可选值:bind(绑定),notbind(未绑定)
     */
    private String alipayBind;

    /*
     * 是否参加消保
     */
    private Boolean consumerProtection;

    /*
     * 用户头像地址
     */
    private String avatar;

    /*
     * 是否是无名良品用户，true or false
     */
    private Boolean liangpin;

    /*
     * 卖家是否签署食品卖家承诺协议
     */
    private Boolean signFoodSellerPromise;

    /*
     * 用户作为卖家是否开过店
     */
    private Boolean hasShop;

    /*
     * 是否24小时闪电发货(实物类)
     */
    private Boolean isLightningConsignment;

    /*
     * 表示用户是否具备修改商品减库存逻辑的权限（一共有拍下减库存和付款减库存两种逻辑） 值含义： 1）true：是 2）false：否。
     */
    private Boolean hasSubStock;

    /*
     * 用户是否是金牌卖家
     */
    private Boolean isGoldenSeller;

    /*
     * 联系人email
     */
    private String email;

    /*
     * 是否订阅了淘宝天下杂志
     */
    private Boolean magazineSubscribe;

    /*
     * 用户参与垂直市场类型。shoes表示鞋城垂直市场用户，3C表示3C垂直市场用户。多个类型之间用","分隔。
     * 如：一个用户既是3C用户又是鞋城用户，那么这个字段返回就是"3C,shoes"。
     * 如果用户不是垂直市场用户，此字段返回为""。
     */
    private String verticalMarket;

    /*
     * 用户是否为网游用户，属于隐私信息，需要登陆才能查看自己的。 目前仅供taobao.user.get使用
     */
    private Boolean onlineGaming;

    /*
     * 用户的全站vip信息，可取值如下：c(普通会员),asso_vip(荣誉会员)，
     * vip1,vip2,vip3,vip4,vip5,vip6(六个等级的正式vip会员)，共8种取值，
     * 其中asso_vip是由vip会员衰退而成，与主站上的vip0对应。
     */
    private String vipInfo;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public UserCredit getBuyerCredit() {
        return buyerCredit;
    }

    public void setBuyerCredit(UserCredit buyerCredit) {
        this.buyerCredit = buyerCredit;
    }

    public UserCredit getSellerCredit() {
        return sellerCredit;
    }

    public void setSellerCredit(UserCredit sellerCredit) {
        this.sellerCredit = sellerCredit;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getLastVisit() {
        return lastVisit;
    }

    public void setLastVisit(Date lastVisit) {
        this.lastVisit = lastVisit;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getHasMorePic() {
        return hasMorePic;
    }

    public void setHasMorePic(Boolean hasMorePic) {
        this.hasMorePic = hasMorePic;
    }

    public Long getItemImgNum() {
        return itemImgNum;
    }

    public void setItemImgNum(Long itemImgNum) {
        this.itemImgNum = itemImgNum;
    }

    public Long getItemImgSize() {
        return itemImgSize;
    }

    public void setItemImgSize(Long itemImgSize) {
        this.itemImgSize = itemImgSize;
    }

    public Long getPropImgNum() {
        return propImgNum;
    }

    public void setPropImgNum(Long propImgNum) {
        this.propImgNum = propImgNum;
    }

    public Long getPropImgSize() {
        return propImgSize;
    }

    public void setPropImgSize(Long propImgSize) {
        this.propImgSize = propImgSize;
    }

    public String getAutoRepost() {
        return autoRepost;
    }

    public void setAutoRepost(String autoRepost) {
        this.autoRepost = autoRepost;
    }

    public String getPromotedType() {
        return promotedType;
    }

    public void setPromotedType(String promotedType) {
        this.promotedType = promotedType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAlipayBind() {
        return alipayBind;
    }

    public void setAlipayBind(String alipayBind) {
        this.alipayBind = alipayBind;
    }

    public Boolean getConsumerProtection() {
        return consumerProtection;
    }

    public void setConsumerProtection(Boolean consumerProtection) {
        this.consumerProtection = consumerProtection;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Boolean getLiangpin() {
        return liangpin;
    }

    public void setLiangpin(Boolean liangpin) {
        this.liangpin = liangpin;
    }

    public Boolean getSignFoodSellerPromise() {
        return signFoodSellerPromise;
    }

    public void setSignFoodSellerPromise(Boolean signFoodSellerPromise) {
        this.signFoodSellerPromise = signFoodSellerPromise;
    }

    public Boolean getHasShop() {
        return hasShop;
    }

    public void setHasShop(Boolean hasShop) {
        this.hasShop = hasShop;
    }

    public Boolean getIsLightningConsignment() {
        return isLightningConsignment;
    }

    public void setIsLightningConsignment(Boolean isLightningConsignment) {
        this.isLightningConsignment = isLightningConsignment;
    }

    public Boolean getHasSubStock() {
        return hasSubStock;
    }

    public void setHasSubStock(Boolean hasSubStock) {
        this.hasSubStock = hasSubStock;
    }

    public Boolean getIsGoldenSeller() {
        return isGoldenSeller;
    }

    public void setIsGoldenSeller(Boolean isGoldenSeller) {
        this.isGoldenSeller = isGoldenSeller;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getMagazineSubscribe() {
        return magazineSubscribe;
    }

    public void setMagazineSubscribe(Boolean magazineSubscribe) {
        this.magazineSubscribe = magazineSubscribe;
    }

    public String getVerticalMarket() {
        return verticalMarket;
    }

    public void setVerticalMarket(String verticalMarket) {
        this.verticalMarket = verticalMarket;
    }

    public Boolean getOnlineGaming() {
        return onlineGaming;
    }

    public void setOnlineGaming(Boolean onlineGaming) {
        this.onlineGaming = onlineGaming;
    }

    public String getVipInfo() {
        return vipInfo;
    }

    public void setVipInfo(String vipInfo) {
        this.vipInfo = vipInfo;
    }

}
