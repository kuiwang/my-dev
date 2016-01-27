package com.scott.dev.taobao.api.item.domain;

import java.util.Date;

import com.scott.dev.taobao.api.Price;
import com.taobao.api.domain.DeliveryTime;
import com.taobao.api.domain.DescModuleInfo;
import com.taobao.api.domain.LocalityLife;
import com.taobao.api.domain.MpicVideo;
import com.taobao.api.domain.PaimaiInfo;

/*
 * Item(商品)结构
 */
public class Item {

    /*
     * 售后服务ID,该字段仅在taobao.item.get接口中返回
     */
    private Number afterSaleId;

    /*
     * 商品上传后的状态。onsale出售中，instock库中
     */
    private String approveStatus;

    /*
     * 天猫订单抽佣比例，为5的倍数，最低0.5%。跟淘客佣金没有关系。
     */
    private Number auctionPoint;

    /*
     * 代充商品类型。在代充商品的类目下，不传表示不标记商品类型（交易搜索中就不能通过标记搜到相关的交易了）。
     * 可选类型： no_mark(不做类型标记) time_card(点卡软件代充) fee_card(话费软件代充)
     */
    private String autoFill;

    /*
     * 商品级别的条形码
     */
    private String barcode;

    /*
     * 基础色数据
     */
    private String changeProp;

    /*
     * 商品所属的叶子类目 id
     */
    private Number cid;

    /*
     * 货到付款运费模板ID
     */
    private Number codPostageId;

    /*
     * Item的发布时间，目前仅供taobao.item.add和taobao.item.get可用
     */
    private Date created;

    /*
     * 定制工具Id
     */
    private String customMadeTypeId;

    /*
     * 下架时间（格式：yyyy-MM-dd HH:mm:ss）
     */
    private Date delistTime;

    /*
     * 发货时间信息
     */
    private DeliveryTime deliveryTime;

    /*
     * 商品描述, 字数要大于5个字符，小于25000个字符
     */
    private String desc;

    /*
     *  宝贝描述规范化模块锚点信息
     */
    private DescModuleInfo descModuleInfo;

    /*
     * 商品描述模块化，模块列表，由List转化成jsonArray存入，
     * 后端逻辑验证通过，拼装成模块内容+锚点导航后存入desc中。
     * 数据结构具体参见Item_Desc_Module
     */
    private String descModules;

    /*
     * 商品url
     */
    private String detailUrl;

    /*
     * ems费用,格式：5.00；单位：元；精确到：分
     */
    private Price ems_fee;

    /*
     * 快递费用,格式：5.00；单位：元；精确到：分
     */
    private Price expressFee;

    /*
     * 宝贝特征值， 只有在Top支持的特征值才能保存到宝贝上
     */
    private String features;

    /*
     * 食品安全信息，包括：生产许可证编号、产品标准号、厂名、厂址等
     */
    private FoodSecurity foodSecurity;

    /*
     * 运费承担方式,seller（卖家承担），buyer(买家承担）
     */
    private String freightPayer;

    /*
     * 全球购商品采购地信息（地区/国家），代表全球购商品的产地信息。
     */
    private String globalStockCountry;

    /*
     * 全球购商品采购地信息（库存类型），有两种库存类型：现货和代购; 参数值为1时代表现货，值为2时代表代购
     */
    private String globalStockType;

    /*
     * 支持会员打折,true/false
     */
    private Boolean hasDiscount;

    /*
     * 是否有发票,true/false
     */
    private Boolean hasInvoice;

    /*
     * 橱窗推荐,true/false
     */
    private Boolean hasShowcase;

    /*
     * 是否有保修,true/false
     */
    private Boolean hasWarranty;

    /*
     * 加价幅度。如果为0，代表系统代理幅度。 
     * 在竞拍中，为了超越上一个出价，会员需要在当前出价上增加金额，这个金额就是加价幅度。
     * 卖家在发布宝贝的时候可以自定义加价幅度，也可以让系统自动代理加价。系统自动代理加价的加价幅度随着当前出价金额的增加而增加，
     * 我们建议会员使用系统自动代理加价，并请买家在出价前看清楚加价幅度的具体金额。另外需要注意是，此功能只适用于拍卖的商品。
     *  以下是系统自动代理加价幅度表： 当前价（加价幅度 ） 1-40（ 1 ）、41-100（ 2 ）、101-200（5 ）、201-500 （10）、
     *  501-1001（15）、001-2000（25）、2001-5000（50）、5001-10000（100） 10001以上 200
     */
    private String increment;

    /*
     * 用户内店宝贝装修模板id
     */
    private Number innerShopAuctionTemplateId;

    /*
     * 用户自行输入的类目属性ID串。结构："pid1,pid2,pid3"，如："20000"（表示品牌） 注：通常一个类目下用户可输入的关键属性不超过1个
     */
    private String inputPids;

    /*
     * 用户自行输入的子属性名和属性值，结构:"父属性值;一级子属性名;一级子属性值;二级子属性名;自定义输入值,....",
     * 如：“耐克;耐克系列;科比系列;科比系列;2K5”，
     * input_str需要与input_pids一一对应，注：通常一个类目下用户可输入的关键属性不超过1个。
     * 所有属性别名加起来不能超过 3999字节
     */
    private String inputStr;

    /*
     * 是否是3D淘宝的商品
     */
    private Boolean is3D;

    /*
     * 是否为达尔文挂接成功了的商品
     */
    private Boolean isCspu;

    /*
     * 是否在外部网店显示
     */
    private Boolean isEx;

    /*
     * 非分销商品：0，代销：1，经销：2
     */
    private Number isFenxiao;

    /*
     * 是否24小时闪电发货
     */
    private Boolean isLightningConsignment;

    /*
     * 是否是线下商品。 1：线上商品（默认值）； 2：线上或线下商品； 3：线下商品。
     */
    private String isOffline;

    /*
     * 商品是否为先行赔付 taobao.items.search和taobao.items.vip.search专用
     */
    private Boolean isPrepay;

    /*
     * 是否在淘宝显示
     */
    private Boolean isTaobao;

    /*
     * 是否定时上架商品
     */
    private Boolean isTiming;

    /*
     * 虚拟商品的状态字段
     */
    private Boolean isVirtual;

    /*
     * 标示商品是否为新品。 值含义：true-是，false-否。
     */
    private Boolean isXinpin;

    /*
     * 商品图片列表(包括主图)。fields中只设置item_img可以返回ItemImg结构体中所有字段，
     * 如果设置为item_img.id、item_img.url、item_img.position等形式就只会返回相应的字段
     */
    private ItemImg[] itemImgs;

    /*
     * 表示商品的体积，用于按体积计费的运费模板。该值的单位为立方米（m3）。 
     * 该值支持两种格式的设置：格式1：bulk:3,单位为立方米(m3),表示直接设置为商品的体积。
     * 格式2：weight:10;breadth:10;height:10，单位为米（m）
     */
    private String itemSize;

    /*
     * 商品的重量，用于按重量计费的运费模板。注意：单位为kg
     */
    private String itemWeight;

    /*
     * 上架时间（格式：yyyy-MM-dd HH:mm:ss）
     */
    private Date listTime;

    /*
     * 本地生活电子交易凭证业务，目前此字段只涉及到的信息为有效期: 如果有效期为起止日期类型，此值为2012-08-06,2012-08-16 
     * 如果有效期为【购买成功日 至】类型则格式为2012-08-16 如果有效期为天数类型则格式为3
     */
    private LocalityLife localityLife;

    /*
     * 商品所在地
     */
    private Location location;

    /*
     * 商品修改时间（格式：yyyy-MM-dd HH:mm:ss）
     */
    private Date modified;

    /*
     * 宝贝主图视频的数据信息，包括：视频ID，视频缩略图URL，视频时长，视频状态等信息。
     */
    private MpicVideo mpicVideo;

    /*
     * 是否为新消保法中的7天无理由退货
     */
    private String newprepay;

    /*
     * 卖家昵称
     */
    private String nick;

    /*
     * 商品数量
     */
    private Number num;

    /*
     * 商品数字id
     */
    private Number numIid;

    /*
     * 是否淘1站商品
     */
    private Boolean oneStation;

    //open_iid
    private String openIid;

    /*
     * 商家外部编码(可与商家外部系统对接)。需要授权才能获取。
     */
    private String outerId;

    /*
     * 用户外店装修模板id
     */
    private Number outerShopAuctionTemplateId;

    /*
     * 用于保存拍卖有关的信息
     */
    private PaimaiInfo paimaiInfo;

    /*
     * 商品主图片地址
     */
    private String picUrl;

    /*
     * 宝贝所属的运费模板ID，如果没有返回则说明没有使用运费模板
     */
    private Number postageId;

    /*
     * 平邮费用,格式：5.00；单位：元；精确到：分
     */
    private Price postFee;

    /*
     * 商品价格，格式：5.00；单位：元；精确到：分
     */
    private Price price;

    /*
     * 宝贝所属产品的id(可能为空). 该字段可以通过taobao.products.search 得到
     */
    private Number productId;

    /*
     * 消保类型，多个类型以,分割。可取以下值： 2：假一赔三；4：7天无理由退换货；taobao.items.search和taobao.items.vip.search专用
     */
    private String promotedService;

    /*
     * 属性值别名,比如颜色的自定义名称
     */
    private String propertyAlias;

    /*
     * 商品属性图片列表。fields中只设置prop_img可以返回PropImg结构体中所有字段，
     * 如果设置为prop_img.id、prop_img.url、prop_img.properties、prop_img.position等形式就只会返回相应的字段
     */
    private PropImg[] propImgs;

    /*
     * 商品属性 格式：pid:vid;pid:vid
     */
    private String props;

    /*
     * 商品属性名称。标识着props内容里面的pid和vid所对应的名称。
     * 格式为：pid1:vid1:pid_name1:vid_name1;pid2:vid2:pid_name2:vid_name2……
     * (注：属性名称中的冒号":"被转换为："#cln#"; 分号";"被转换为："#scln#" )
     */
    private String propsName;

    /*
     * 商品资质的信息，用URLEncoder做过转换，使用时，需要URLDecoder转换回来，默认字符集为：UTF-8
     */
    private String qualification;

    /*
     * 商品所属卖家的信用等级数，1表示1心，2表示2心……，只有调用商品搜索:taobao.items.get和taobao.items.search的时候才能返回
     */
    private Number score;

    /*
     * 秒杀商品类型。打上秒杀标记的商品，用户只能下架并不能再上架，其他任何编辑或删除操作都不能进行。
     * 如果用户想取消秒杀标记，需要联系小二进行操作。如果秒杀结束需要自由编辑请联系活动负责人（小二）去掉秒杀标记。
     * 可选类型 web_only(只能通过web网络秒杀) wap_only(只能通过wap网络秒杀) web_and_wap(既能通过web秒杀也能通过wap秒杀)
     */
    private String secondKill;

    /*
     * 达尔文数据挂接，第二步保存结果
     */
    private Boolean secondResult;

    /*
     * 商品所属的店铺内卖家自定义类目列表
     */
    private String seller_cids;

    /*
     * 商品卖点信息，天猫商家使用字段，最长150个字符
     */
    private String sellPoint;

    /*
     * 是否承诺退换货服务!
     */
    private Boolean sellPromise;

    /*
     * 店铺类型，B：天猫店铺，C：淘宝店铺
     */
    private String shopType;

    /*
     * Sku列表。fields中只设置sku可以返回Sku结构体中所有字段，如果设置为sku.sku_id、sku.properties、sku.quantity等形式就只会返回相应的字段
     */
    private Sku[] skus;

    /*
     *  商品销量
     */
    private Number soldQuantity;

    /*
     * 商品新旧程度(全新:new，闲置:unused，二手：second)
     */
    private String stuffStatus;

    /*
     * 商品是否支持拍下减库存:1支持;2取消支持(付款减库存);0(默认)不更改 集市卖家默认拍下减库存; 商城卖家默认付款减库存
     */
    private Number subStock;

    /*
     * 商品的子标题，给商品增加卖点等描述
     */
    private String subTitle;

    /*
     * 页面模板id
     */
    private String templateId;

    /*
     *  商品标题,不能超过60字节
     */
    private String title;

    /*
     * 商品类型(fixed:一口价;auction:拍卖)注：取消团购
     */
    private String type;

    /*
     * 有效期,7或者14（默认是7天）
     */
    private Number validThru;

    /*
     * 该字段废弃，请勿使用。
     */
    private Boolean videoId;

    /*
     * 商品视频列表(目前只支持单个视频关联)。
     * fields中只设置video可以返回Video结构体中所有字段，
     * 如果设置为video.id、video.video_id、 video.url等形式就只会返回相应的字段
     */
    private Video[] videos;

    /*
     * 商品是否违规，违规：true , 不违规：false
     */
    private Boolean violation;

    /*
     * 不带html标签的desc文本信息，该字段只在taobao.item.get接口中返回
     */
    private String wapDesc;

    /*
     * 适合wap应用的商品详情url ，该字段只在taobao.item.get接口中返回
     */
    private String wapDetailUrl;

    /*
     * 无线的宝贝描述
     */
    private String wirelessDesc;

    /*
     * 预扣库存，即付款减库存的商品现在有多少处于未付款状态的订单
     */
    private Number withHoldQuantity;

    /*
     * 商品所属的商家的旺旺在线状况， taobao.items.search和taobao.items.vip.search专用
     */
    private Boolean wwStatus;

    public Number getAfterSaleId() {
        return afterSaleId;
    }

    public String getApproveStatus() {
        return approveStatus;
    }

    public Number getAuctionPoint() {
        return auctionPoint;
    }

    public String getAutoFill() {
        return autoFill;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getChangeProp() {
        return changeProp;
    }

    public Number getCid() {
        return cid;
    }

    public Number getCodPostageId() {
        return codPostageId;
    }

    public Date getCreated() {
        return created;
    }

    public String getCustomMadeTypeId() {
        return customMadeTypeId;
    }

    public Date getDelistTime() {
        return delistTime;
    }

    public DeliveryTime getDeliveryTime() {
        return deliveryTime;
    }

    public String getDesc() {
        return desc;
    }

    public DescModuleInfo getDescModuleInfo() {
        return descModuleInfo;
    }

    public String getDescModules() {
        return descModules;
    }

    public String getDetailUrl() {
        return detailUrl;
    }

    public Price getEms_fee() {
        return ems_fee;
    }

    public Price getExpressFee() {
        return expressFee;
    }

    public String getFeatures() {
        return features;
    }

    public FoodSecurity getFoodSecurity() {
        return foodSecurity;
    }

    public String getFreightPayer() {
        return freightPayer;
    }

    public String getGlobalStockCountry() {
        return globalStockCountry;
    }

    public String getGlobalStockType() {
        return globalStockType;
    }

    public Boolean getHasDiscount() {
        return hasDiscount;
    }

    public Boolean getHasInvoice() {
        return hasInvoice;
    }

    public Boolean getHasShowcase() {
        return hasShowcase;
    }

    public Boolean getHasWarranty() {
        return hasWarranty;
    }

    public String getIncrement() {
        return increment;
    }

    public Number getInnerShopAuctionTemplateId() {
        return innerShopAuctionTemplateId;
    }

    public String getInputPids() {
        return inputPids;
    }

    public String getInputStr() {
        return inputStr;
    }

    public Boolean getIs3D() {
        return is3D;
    }

    public Boolean getIsCspu() {
        return isCspu;
    }

    public Boolean getIsEx() {
        return isEx;
    }

    public Number getIsFenxiao() {
        return isFenxiao;
    }

    public Boolean getIsLightningConsignment() {
        return isLightningConsignment;
    }

    public String getIsOffline() {
        return isOffline;
    }

    public Boolean getIsPrepay() {
        return isPrepay;
    }

    public Boolean getIsTaobao() {
        return isTaobao;
    }

    public Boolean getIsTiming() {
        return isTiming;
    }

    public Boolean getIsVirtual() {
        return isVirtual;
    }

    public Boolean getIsXinpin() {
        return isXinpin;
    }

    public ItemImg[] getItemImgs() {
        return itemImgs;
    }

    public String getItemSize() {
        return itemSize;
    }

    public String getItemWeight() {
        return itemWeight;
    }

    public Date getListTime() {
        return listTime;
    }

    public LocalityLife getLocalityLife() {
        return localityLife;
    }

    public Location getLocation() {
        return location;
    }

    public Date getModified() {
        return modified;
    }

    public MpicVideo getMpicVideo() {
        return mpicVideo;
    }

    public String getNewprepay() {
        return newprepay;
    }

    public String getNick() {
        return nick;
    }

    public Number getNum() {
        return num;
    }

    public Number getNumIid() {
        return numIid;
    }

    public Boolean getOneStation() {
        return oneStation;
    }

    public String getOpenIid() {
        return openIid;
    }

    public String getOuterId() {
        return outerId;
    }

    public Number getOuterShopAuctionTemplateId() {
        return outerShopAuctionTemplateId;
    }

    public PaimaiInfo getPaimaiInfo() {
        return paimaiInfo;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public Number getPostageId() {
        return postageId;
    }

    public Price getPostFee() {
        return postFee;
    }

    public Price getPrice() {
        return price;
    }

    public Number getProductId() {
        return productId;
    }

    public String getPromotedService() {
        return promotedService;
    }

    public String getPropertyAlias() {
        return propertyAlias;
    }

    public PropImg[] getPropImgs() {
        return propImgs;
    }

    public String getProps() {
        return props;
    }

    public String getPropsName() {
        return propsName;
    }

    public String getQualification() {
        return qualification;
    }

    public Number getScore() {
        return score;
    }

    public String getSecondKill() {
        return secondKill;
    }

    public Boolean getSecondResult() {
        return secondResult;
    }

    public String getSeller_cids() {
        return seller_cids;
    }

    public String getSellPoint() {
        return sellPoint;
    }

    public Boolean getSellPromise() {
        return sellPromise;
    }

    public String getShopType() {
        return shopType;
    }

    public Sku[] getSkus() {
        return skus;
    }

    public Number getSoldQuantity() {
        return soldQuantity;
    }

    public String getStuffStatus() {
        return stuffStatus;
    }

    public Number getSubStock() {
        return subStock;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public String getTemplateId() {
        return templateId;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public Number getValidThru() {
        return validThru;
    }

    public Boolean getVideoId() {
        return videoId;
    }

    public Video[] getVideos() {
        return videos;
    }

    public Boolean getViolation() {
        return violation;
    }

    public String getWapDesc() {
        return wapDesc;
    }

    public String getWapDetailUrl() {
        return wapDetailUrl;
    }

    public String getWirelessDesc() {
        return wirelessDesc;
    }

    public Number getWithHoldQuantity() {
        return withHoldQuantity;
    }

    public Boolean getWwStatus() {
        return wwStatus;
    }

    public void setAfterSaleId(Number afterSaleId) {
        this.afterSaleId = afterSaleId;
    }

    public void setApproveStatus(String approveStatus) {
        this.approveStatus = approveStatus;
    }

    public void setAuctionPoint(Number auctionPoint) {
        this.auctionPoint = auctionPoint;
    }

    public void setAutoFill(String autoFill) {
        this.autoFill = autoFill;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setChangeProp(String changeProp) {
        this.changeProp = changeProp;
    }

    public void setCid(Number cid) {
        this.cid = cid;
    }

    public void setCodPostageId(Number codPostageId) {
        this.codPostageId = codPostageId;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setCustomMadeTypeId(String customMadeTypeId) {
        this.customMadeTypeId = customMadeTypeId;
    }

    public void setDelistTime(Date delistTime) {
        this.delistTime = delistTime;
    }

    public void setDeliveryTime(DeliveryTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setDescModuleInfo(DescModuleInfo descModuleInfo) {
        this.descModuleInfo = descModuleInfo;
    }

    public void setDescModules(String descModules) {
        this.descModules = descModules;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public void setEms_fee(Price ems_fee) {
        this.ems_fee = ems_fee;
    }

    public void setExpressFee(Price expressFee) {
        this.expressFee = expressFee;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public void setFoodSecurity(FoodSecurity foodSecurity) {
        this.foodSecurity = foodSecurity;
    }

    public void setFreightPayer(String freightPayer) {
        this.freightPayer = freightPayer;
    }

    public void setGlobalStockCountry(String globalStockCountry) {
        this.globalStockCountry = globalStockCountry;
    }

    public void setGlobalStockType(String globalStockType) {
        this.globalStockType = globalStockType;
    }

    public void setHasDiscount(Boolean hasDiscount) {
        this.hasDiscount = hasDiscount;
    }

    public void setHasInvoice(Boolean hasInvoice) {
        this.hasInvoice = hasInvoice;
    }

    public void setHasShowcase(Boolean hasShowcase) {
        this.hasShowcase = hasShowcase;
    }

    public void setHasWarranty(Boolean hasWarranty) {
        this.hasWarranty = hasWarranty;
    }

    public void setIncrement(String increment) {
        this.increment = increment;
    }

    public void setInnerShopAuctionTemplateId(Number innerShopAuctionTemplateId) {
        this.innerShopAuctionTemplateId = innerShopAuctionTemplateId;
    }

    public void setInputPids(String inputPids) {
        this.inputPids = inputPids;
    }

    public void setInputStr(String inputStr) {
        this.inputStr = inputStr;
    }

    public void setIs3D(Boolean is3d) {
        is3D = is3d;
    }

    public void setIsCspu(Boolean isCspu) {
        this.isCspu = isCspu;
    }

    public void setIsEx(Boolean isEx) {
        this.isEx = isEx;
    }

    public void setIsFenxiao(Number isFenxiao) {
        this.isFenxiao = isFenxiao;
    }

    public void setIsLightningConsignment(Boolean isLightningConsignment) {
        this.isLightningConsignment = isLightningConsignment;
    }

    public void setIsOffline(String isOffline) {
        this.isOffline = isOffline;
    }

    public void setIsPrepay(Boolean isPrepay) {
        this.isPrepay = isPrepay;
    }

    public void setIsTaobao(Boolean isTaobao) {
        this.isTaobao = isTaobao;
    }

    public void setIsTiming(Boolean isTiming) {
        this.isTiming = isTiming;
    }

    public void setIsVirtual(Boolean isVirtual) {
        this.isVirtual = isVirtual;
    }

    public void setIsXinpin(Boolean isXinpin) {
        this.isXinpin = isXinpin;
    }

    public void setItemImgs(ItemImg[] itemImgs) {
        this.itemImgs = itemImgs;
    }

    public void setItemSize(String itemSize) {
        this.itemSize = itemSize;
    }

    public void setItemWeight(String itemWeight) {
        this.itemWeight = itemWeight;
    }

    public void setListTime(Date listTime) {
        this.listTime = listTime;
    }

    public void setLocalityLife(LocalityLife localityLife) {
        this.localityLife = localityLife;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public void setMpicVideo(MpicVideo mpicVideo) {
        this.mpicVideo = mpicVideo;
    }

    public void setNewprepay(String newprepay) {
        this.newprepay = newprepay;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setNum(Number num) {
        this.num = num;
    }

    public void setNumIid(Number numIid) {
        this.numIid = numIid;
    }

    public void setOneStation(Boolean oneStation) {
        this.oneStation = oneStation;
    }

    public void setOpenIid(String openIid) {
        this.openIid = openIid;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public void setOuterShopAuctionTemplateId(Number outerShopAuctionTemplateId) {
        this.outerShopAuctionTemplateId = outerShopAuctionTemplateId;
    }

    public void setPaimaiInfo(PaimaiInfo paimaiInfo) {
        this.paimaiInfo = paimaiInfo;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public void setPostageId(Number postageId) {
        this.postageId = postageId;
    }

    public void setPostFee(Price postFee) {
        this.postFee = postFee;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public void setProductId(Number productId) {
        this.productId = productId;
    }

    public void setPromotedService(String promotedService) {
        this.promotedService = promotedService;
    }

    public void setPropertyAlias(String propertyAlias) {
        this.propertyAlias = propertyAlias;
    }

    public void setPropImgs(PropImg[] propImgs) {
        this.propImgs = propImgs;
    }

    public void setProps(String props) {
        this.props = props;
    }

    public void setPropsName(String propsName) {
        this.propsName = propsName;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setScore(Number score) {
        this.score = score;
    }

    public void setSecondKill(String secondKill) {
        this.secondKill = secondKill;
    }

    public void setSecondResult(Boolean secondResult) {
        this.secondResult = secondResult;
    }

    public void setSeller_cids(String seller_cids) {
        this.seller_cids = seller_cids;
    }

    public void setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint;
    }

    public void setSellPromise(Boolean sellPromise) {
        this.sellPromise = sellPromise;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public void setSkus(Sku[] skus) {
        this.skus = skus;
    }

    public void setSoldQuantity(Number soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    public void setStuffStatus(String stuffStatus) {
        this.stuffStatus = stuffStatus;
    }

    public void setSubStock(Number subStock) {
        this.subStock = subStock;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValidThru(Number validThru) {
        this.validThru = validThru;
    }

    public void setVideoId(Boolean videoId) {
        this.videoId = videoId;
    }

    public void setVideos(Video[] videos) {
        this.videos = videos;
    }

    public void setViolation(Boolean violation) {
        this.violation = violation;
    }

    public void setWapDesc(String wapDesc) {
        this.wapDesc = wapDesc;
    }

    public void setWapDetailUrl(String wapDetailUrl) {
        this.wapDetailUrl = wapDetailUrl;
    }

    public void setWirelessDesc(String wirelessDesc) {
        this.wirelessDesc = wirelessDesc;
    }

    public void setWithHoldQuantity(Number withHoldQuantity) {
        this.withHoldQuantity = withHoldQuantity;
    }

    public void setWwStatus(Boolean wwStatus) {
        this.wwStatus = wwStatus;
    }

}
