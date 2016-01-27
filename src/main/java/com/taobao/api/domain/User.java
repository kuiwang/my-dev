package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 用户
 *
 * @author auto create
 * @since 1.0, null
 */
public class User extends TaobaoObject {

    private static final long serialVersionUID = 2134331666378636978L;

    /**
     * 有无绑定。可选值:bind(绑定),notbind(未绑定)
     */
    @ApiField("alipay_bind")
    private String alipayBind;

    /**
     * 是否受限制。可选值:limited(受限制),unlimited(不受限)
     */
    @ApiField("auto_repost")
    private String autoRepost;

    /**
     * 用户头像地址
     */
    @ApiField("avatar")
    private String avatar;

    /**
     * 生日
     */
    @ApiField("birthday")
    private Date birthday;

    /**
     * 买家信用
     */
    @ApiField("buyer_credit")
    private UserCredit buyerCredit;

    /**
     * 是否参加消保
     */
    @ApiField("consumer_protection")
    private Boolean consumerProtection;

    /**
     * 用户注册时间。格式:yyyy-MM-dd HH:mm:ss
     */
    @ApiField("created")
    private Date created;

    /**
     * 联系人email
     */
    @ApiField("email")
    private String email;

    /**
     * 是否购买多图服务。可选值:true(是),false(否)
     */
    @ApiField("has_more_pic")
    private Boolean hasMorePic;

    /**
     * 用户作为卖家是否开过店
     */
    @ApiField("has_shop")
    private Boolean hasShop;

    /**
     * 表示用户是否具备修改商品减库存逻辑的权限（一共有拍下减库存和付款减库存两种逻辑） 值含义： 1）true：是 2）false：否。
     */
    @ApiField("has_sub_stock")
    private Boolean hasSubStock;

    /**
     * 用户是否是金牌卖家
     */
    @ApiField("is_golden_seller")
    private Boolean isGoldenSeller;

    /**
     * 是否24小时闪电发货(实物类)
     */
    @ApiField("is_lightning_consignment")
    private Boolean isLightningConsignment;

    /**
     * 可上传商品图片数量
     */
    @ApiField("item_img_num")
    private Long itemImgNum;

    /**
     * 单张商品图片最大容量(商品主图大小)。单位:k
     */
    @ApiField("item_img_size")
    private Long itemImgSize;

    /**
     * 最近登陆时间。格式:yyyy-MM-dd HH:mm:ss
     */
    @ApiField("last_visit")
    private Date lastVisit;

    /**
     * 是否是无名良品用户，true or false
     */
    @ApiField("liangpin")
    private Boolean liangpin;

    /**
     * 用户当前居住地公开信息。如：location.city获取其中的city数据
     */
    @ApiField("location")
    private Location location;

    /**
     * 是否订阅了淘宝天下杂志
     */
    @ApiField("magazine_subscribe")
    private Boolean magazineSubscribe;

    /**
     * 用户昵称
     */
    @ApiField("nick")
    private String nick;

    /**
     * 用户是否为网游用户，属于隐私信息，需要登陆才能查看自己的。 目前仅供taobao.user.get使用
     */
    @ApiField("online_gaming")
    private Boolean onlineGaming;

    /**
     * 有无实名认证。可选值:authentication(实名认证),not authentication(没有认证)
     */
    @ApiField("promoted_type")
    private String promotedType;

    /**
     * 可上传属性图片数量
     */
    @ApiField("prop_img_num")
    private Long propImgNum;

    /**
     * 单张销售属性图片最大容量（非主图的商品图片和商品属性图片）。单位:k
     */
    @ApiField("prop_img_size")
    private Long propImgSize;

    /**
     * 卖家信用
     */
    @ApiField("seller_credit")
    private UserCredit sellerCredit;

    /**
     * 性别。可选值:m(男),f(女)
     */
    @ApiField("sex")
    private String sex;

    /**
     * 卖家是否签署食品卖家承诺协议
     */
    @ApiField("sign_food_seller_promise")
    private Boolean signFoodSellerPromise;

    /**
     * 状态。可选值:normal(正常),inactive(未激活),delete(删除),reeze(冻结),supervise(监管)
     */
    @ApiField("status")
    private String status;

    /**
     * 用户类型。可选值:B(B商家),C(C商家)
     */
    @ApiField("type")
    private String type;

    /**
     * 用户字符串ID
     */
    @ApiField("uid")
    private String uid;

    /**
     * 用户数字ID
     */
    @ApiField("user_id")
    private Long userId;

    /**
     * 用户参与垂直市场类型。shoes表示鞋城垂直市场用户，3C表示3C垂直市场用户。多个类型之间用","分隔。如：
     * 一个用户既是3C用户又是鞋城用户，那么这个字段返回就是"3C,shoes"。如果用户不是垂直市场用户，此字段返回为""。
     */
    @ApiField("vertical_market")
    private String verticalMarket;

    /**
     * 用户的全站vip信息，可取值如下：c(普通会员),asso_vip(荣誉会员)，vip1,vip2,vip3,vip4,vip5,
     * vip6(六个等级的正式vip会员)，共8种取值，其中asso_vip是由vip会员衰退而成，与主站上的vip0对应。
     */
    @ApiField("vip_info")
    private String vipInfo;

    public String getAlipayBind() {
        return this.alipayBind;
    }

    public String getAutoRepost() {
        return this.autoRepost;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    public UserCredit getBuyerCredit() {
        return this.buyerCredit;
    }

    public Boolean getConsumerProtection() {
        return this.consumerProtection;
    }

    public Date getCreated() {
        return this.created;
    }

    public String getEmail() {
        return this.email;
    }

    public Boolean getHasMorePic() {
        return this.hasMorePic;
    }

    public Boolean getHasShop() {
        return this.hasShop;
    }

    public Boolean getHasSubStock() {
        return this.hasSubStock;
    }

    public Boolean getIsGoldenSeller() {
        return this.isGoldenSeller;
    }

    public Boolean getIsLightningConsignment() {
        return this.isLightningConsignment;
    }

    public Long getItemImgNum() {
        return this.itemImgNum;
    }

    public Long getItemImgSize() {
        return this.itemImgSize;
    }

    public Date getLastVisit() {
        return this.lastVisit;
    }

    public Boolean getLiangpin() {
        return this.liangpin;
    }

    public Location getLocation() {
        return this.location;
    }

    public Boolean getMagazineSubscribe() {
        return this.magazineSubscribe;
    }

    public String getNick() {
        return this.nick;
    }

    public Boolean getOnlineGaming() {
        return this.onlineGaming;
    }

    public String getPromotedType() {
        return this.promotedType;
    }

    public Long getPropImgNum() {
        return this.propImgNum;
    }

    public Long getPropImgSize() {
        return this.propImgSize;
    }

    public UserCredit getSellerCredit() {
        return this.sellerCredit;
    }

    public String getSex() {
        return this.sex;
    }

    public Boolean getSignFoodSellerPromise() {
        return this.signFoodSellerPromise;
    }

    public String getStatus() {
        return this.status;
    }

    public String getType() {
        return this.type;
    }

    public String getUid() {
        return this.uid;
    }

    public Long getUserId() {
        return this.userId;
    }

    public String getVerticalMarket() {
        return this.verticalMarket;
    }

    public String getVipInfo() {
        return this.vipInfo;
    }

    public void setAlipayBind(String alipayBind) {
        this.alipayBind = alipayBind;
    }

    public void setAutoRepost(String autoRepost) {
        this.autoRepost = autoRepost;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setBuyerCredit(UserCredit buyerCredit) {
        this.buyerCredit = buyerCredit;
    }

    public void setConsumerProtection(Boolean consumerProtection) {
        this.consumerProtection = consumerProtection;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHasMorePic(Boolean hasMorePic) {
        this.hasMorePic = hasMorePic;
    }

    public void setHasShop(Boolean hasShop) {
        this.hasShop = hasShop;
    }

    public void setHasSubStock(Boolean hasSubStock) {
        this.hasSubStock = hasSubStock;
    }

    public void setIsGoldenSeller(Boolean isGoldenSeller) {
        this.isGoldenSeller = isGoldenSeller;
    }

    public void setIsLightningConsignment(Boolean isLightningConsignment) {
        this.isLightningConsignment = isLightningConsignment;
    }

    public void setItemImgNum(Long itemImgNum) {
        this.itemImgNum = itemImgNum;
    }

    public void setItemImgSize(Long itemImgSize) {
        this.itemImgSize = itemImgSize;
    }

    public void setLastVisit(Date lastVisit) {
        this.lastVisit = lastVisit;
    }

    public void setLiangpin(Boolean liangpin) {
        this.liangpin = liangpin;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setMagazineSubscribe(Boolean magazineSubscribe) {
        this.magazineSubscribe = magazineSubscribe;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setOnlineGaming(Boolean onlineGaming) {
        this.onlineGaming = onlineGaming;
    }

    public void setPromotedType(String promotedType) {
        this.promotedType = promotedType;
    }

    public void setPropImgNum(Long propImgNum) {
        this.propImgNum = propImgNum;
    }

    public void setPropImgSize(Long propImgSize) {
        this.propImgSize = propImgSize;
    }

    public void setSellerCredit(UserCredit sellerCredit) {
        this.sellerCredit = sellerCredit;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setSignFoodSellerPromise(Boolean signFoodSellerPromise) {
        this.signFoodSellerPromise = signFoodSellerPromise;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setVerticalMarket(String verticalMarket) {
        this.verticalMarket = verticalMarket;
    }

    public void setVipInfo(String vipInfo) {
        this.vipInfo = vipInfo;
    }

}
