package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 旅游商品结构。
 *
 * @author auto create
 * @since 1.0, null
 */
public class TravelItems extends TaobaoObject {

    private static final long serialVersionUID = 5294152526121947323L;

    /**
     * 商品发布后的状态。onsale出售中，instock仓库中。
     */
    @ApiField("approve_status")
    private String approveStatus;

    /**
     * 商城返点比例，为5的倍数，最低0.5%。[0,500]
     */
    @ApiField("auction_point")
    private Long auctionPoint;

    /**
     * 商品所属叶子类目ID。
     */
    @ApiField("cid")
    private Long cid;

    /**
     * 商品发布时间。
     */
    @ApiField("created")
    private Date created;

    /**
     * 下架时间，未使用（格式：yyyy-MM-dd HH:mm:ss）。
     */
    @ApiField("delist_time")
    private Date delistTime;

    /**
     * 商品描述，字数要大于5个字符，小于50000个字符。
     */
    @ApiField("desc")
    private String desc;

    /**
     * 商品详情url。
     */
    @ApiField("detail_url")
    private String detailUrl;

    /**
     * 最晚成团提前天数，最小0天，最大为300天，不填默认为0天。
     */
    @ApiField("duration")
    private Long duration;

    /**
     * 费用包含，不超过1500个字符。
     */
    @ApiField("fee_include")
    private String feeInclude;

    /**
     * 费用不包，不超过1500个字符。
     */
    @ApiField("fee_not_include")
    private String feeNotInclude;

    /**
     * 机票信息，不超过1500字
     */
    @ApiField("flight_info")
    private String flightInfo;

    /**
     * 运费承担方式,seller（卖家承担），buyer（买家承担）。
     */
    @ApiField("freight_payer")
    private String freightPayer;

    /**
     * 集合地，不超过30个字符。
     */
    @ApiField("gathering_place")
    private String gatheringPlace;

    /**
     * 会员打折 true/false。
     */
    @ApiField("has_discount")
    private Boolean hasDiscount;

    /**
     * 是否有发票,true/false。
     */
    @ApiField("has_invoice")
    private Boolean hasInvoice;

    /**
     * 是否有橱窗true/false。
     */
    @ApiField("has_showcase")
    private Boolean hasShowcase;

    /**
     * 酒店信息，不超过1500字符
     */
    @ApiField("hotel_info")
    private String hotelInfo;

    /**
     * 用户自行输入的类目属性ID串。结构："pid1,pid2,pid3"，如："2000"（表示品牌）
     * 注：通常一个类目下用户可输入的关键属性不超过1个。在度假线路类目中，该属性ID为“自由行包含元素”或“一日游包含元素”属性ID。
     */
    @ApiField("input_pids")
    private String inputPids;

    /**
     * 用户自行输入的子属性名和属性值，如“自定义自由行包含元素”。
     */
    @ApiField("input_str")
    private String inputStr;

    /**
     * 是否“铁定出游”商品。
     */
    @ApiField("is_tdcy")
    private Boolean isTdcy;

    /**
     * 是否定时上架商品。
     */
    @ApiField("is_timing")
    private Boolean isTiming;

    /**
     * 商品数字ID。
     */
    @ApiField("item_id")
    private Long itemId;

    /**
     * 商品图片列表(包括主图)。
     */
    @ApiListField("item_imgs")
    @ApiField("travel_items_img")
    private List<TravelItemsImg> itemImgs;

    /**
     * 上架时间,未使用（格式：yyyy-MM-dd HH:mm:ss）。
     */
    @ApiField("list_time")
    private Date listTime;

    /**
     * 电子凭证信息。
     */
    @ApiField("locality_life")
    private TravelItemsLocalityLife localityLife;

    /**
     * 宝贝所在地，格式为(省份:城市)。
     */
    @ApiField("location")
    private String location;

    /**
     * 最多橱窗数。
     */
    @ApiField("max_showcase")
    private Long maxShowcase;

    /**
     * 商品修改时间（格式：yyyy-MM-dd HH:mm:ss）。
     */
    @ApiField("modified")
    private Date modified;

    /**
     * 卖家昵称。
     */
    @ApiField("nick")
    private String nick;

    /**
     * 商品数量。
     */
    @ApiField("num")
    private Long num;

    /**
     * 预定须知，不超过1500个字符。
     */
    @ApiField("order_info")
    private String orderInfo;

    /**
     * 商家编码。
     */
    @ApiField("outer_id")
    private String outerId;

    /**
     * 自费项目，不超过1500个字符。
     */
    @ApiField("own_expense")
    private String ownExpense;

    /**
     * 商品主图片地址。
     */
    @ApiField("pic_url")
    private String picUrl;

    /**
     * 商品价格，格式：500；单位：分；精确到：分。
     */
    @ApiField("price")
    private Long price;

    /**
     * 商品属性列表。格式为：pid:vid;pid:vid。例如度假线路商品，那么这里就需要填写：出发地属性id:城市id;目的地市属性id:
     * 目的地市id;……
     */
    @ApiField("props")
    private String props;

    /**
     * 商品属性名称。标识着props内容里面的pid和vid所对应的名称。格式为：pid1:vid1:pid_name1:vid_name1;
     * pid2:vid2:pid_name2:vid_name2……
     */
    @ApiField("props_name")
    private String propsName;

    /**
     * 退改规定，不超过1500个字符。
     */
    @ApiField("refund_regulation")
    private String refundRegulation;

    /**
     * 秒杀商品类型。
     */
    @ApiField("second_kill")
    private String secondKill;

    /**
     * 商品所属的店铺内卖家自定义类目列表，多个以“,”分割。
     */
    @ApiField("seller_cids")
    private String sellerCids;

    /**
     * 购物店信息，不超过1500个字符。
     */
    @ApiField("shoping_info")
    private String shopingInfo;

    /**
     * 商品Sku列表。
     */
    @ApiListField("skus")
    @ApiField("travel_items_sku")
    private List<TravelItemsSku> skus;

    /**
     * 商品开始出售时间。
     */
    @ApiField("start")
    private Date start;

    /**
     * 商品是否支持拍下减库存:1支持;2取消支持(付款减库存)。
     */
    @ApiField("sub_stock")
    private Long subStock;

    /**
     * 门票信息，不超过1500字
     */
    @ApiField("ticket_info")
    private String ticketInfo;

    /**
     * 商品标题，能超过60字符，一个汉字占2个字符。
     */
    @ApiField("title")
    private String title;

    /**
     * 套餐价格日历信息。
     */
    @ApiListField("travel_items_combos")
    @ApiField("travel_items_combo")
    private List<TravelItemsCombo> travelItemsCombos;

    /**
     * 商品类型(fixed:一口价;auction:拍卖)注：取消团购。
     */
    @ApiField("type")
    private String type;

    /**
     * 已被使用的橱窗数。
     */
    @ApiField("used_showcase")
    private Long usedShowcase;

    /**
     * 商品是否违规，违规：true , 不违规：false。
     */
    @ApiField("violation")
    private Boolean violation;

    /**
     * 不带html标签的desc文本信息，该字段只在taobao.item.get接口中返回。
     */
    @ApiField("wap_desc")
    private String wapDesc;

    /**
     * 适合wap应用的商品详情url。
     */
    @ApiField("wap_detail_url")
    private String wapDetailUrl;

    public String getApproveStatus() {
        return this.approveStatus;
    }

    public void setApproveStatus(String approveStatus) {
        this.approveStatus = approveStatus;
    }

    public Long getAuctionPoint() {
        return this.auctionPoint;
    }

    public void setAuctionPoint(Long auctionPoint) {
        this.auctionPoint = auctionPoint;
    }

    public Long getCid() {
        return this.cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getDelistTime() {
        return this.delistTime;
    }

    public void setDelistTime(Date delistTime) {
        this.delistTime = delistTime;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDetailUrl() {
        return this.detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public Long getDuration() {
        return this.duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public String getFeeInclude() {
        return this.feeInclude;
    }

    public void setFeeInclude(String feeInclude) {
        this.feeInclude = feeInclude;
    }

    public String getFeeNotInclude() {
        return this.feeNotInclude;
    }

    public void setFeeNotInclude(String feeNotInclude) {
        this.feeNotInclude = feeNotInclude;
    }

    public String getFlightInfo() {
        return this.flightInfo;
    }

    public void setFlightInfo(String flightInfo) {
        this.flightInfo = flightInfo;
    }

    public String getFreightPayer() {
        return this.freightPayer;
    }

    public void setFreightPayer(String freightPayer) {
        this.freightPayer = freightPayer;
    }

    public String getGatheringPlace() {
        return this.gatheringPlace;
    }

    public void setGatheringPlace(String gatheringPlace) {
        this.gatheringPlace = gatheringPlace;
    }

    public Boolean getHasDiscount() {
        return this.hasDiscount;
    }

    public void setHasDiscount(Boolean hasDiscount) {
        this.hasDiscount = hasDiscount;
    }

    public Boolean getHasInvoice() {
        return this.hasInvoice;
    }

    public void setHasInvoice(Boolean hasInvoice) {
        this.hasInvoice = hasInvoice;
    }

    public Boolean getHasShowcase() {
        return this.hasShowcase;
    }

    public void setHasShowcase(Boolean hasShowcase) {
        this.hasShowcase = hasShowcase;
    }

    public String getHotelInfo() {
        return this.hotelInfo;
    }

    public void setHotelInfo(String hotelInfo) {
        this.hotelInfo = hotelInfo;
    }

    public String getInputPids() {
        return this.inputPids;
    }

    public void setInputPids(String inputPids) {
        this.inputPids = inputPids;
    }

    public String getInputStr() {
        return this.inputStr;
    }

    public void setInputStr(String inputStr) {
        this.inputStr = inputStr;
    }

    public Boolean getIsTdcy() {
        return this.isTdcy;
    }

    public void setIsTdcy(Boolean isTdcy) {
        this.isTdcy = isTdcy;
    }

    public Boolean getIsTiming() {
        return this.isTiming;
    }

    public void setIsTiming(Boolean isTiming) {
        this.isTiming = isTiming;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public List<TravelItemsImg> getItemImgs() {
        return this.itemImgs;
    }

    public void setItemImgs(List<TravelItemsImg> itemImgs) {
        this.itemImgs = itemImgs;
    }

    public Date getListTime() {
        return this.listTime;
    }

    public void setListTime(Date listTime) {
        this.listTime = listTime;
    }

    public TravelItemsLocalityLife getLocalityLife() {
        return this.localityLife;
    }

    public void setLocalityLife(TravelItemsLocalityLife localityLife) {
        this.localityLife = localityLife;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getMaxShowcase() {
        return this.maxShowcase;
    }

    public void setMaxShowcase(Long maxShowcase) {
        this.maxShowcase = maxShowcase;
    }

    public Date getModified() {
        return this.modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getNick() {
        return this.nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Long getNum() {
        return this.num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public String getOrderInfo() {
        return this.orderInfo;
    }

    public void setOrderInfo(String orderInfo) {
        this.orderInfo = orderInfo;
    }

    public String getOuterId() {
        return this.outerId;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public String getOwnExpense() {
        return this.ownExpense;
    }

    public void setOwnExpense(String ownExpense) {
        this.ownExpense = ownExpense;
    }

    public String getPicUrl() {
        return this.picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public Long getPrice() {
        return this.price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getProps() {
        return this.props;
    }

    public void setProps(String props) {
        this.props = props;
    }

    public String getPropsName() {
        return this.propsName;
    }

    public void setPropsName(String propsName) {
        this.propsName = propsName;
    }

    public String getRefundRegulation() {
        return this.refundRegulation;
    }

    public void setRefundRegulation(String refundRegulation) {
        this.refundRegulation = refundRegulation;
    }

    public String getSecondKill() {
        return this.secondKill;
    }

    public void setSecondKill(String secondKill) {
        this.secondKill = secondKill;
    }

    public String getSellerCids() {
        return this.sellerCids;
    }

    public void setSellerCids(String sellerCids) {
        this.sellerCids = sellerCids;
    }

    public String getShopingInfo() {
        return this.shopingInfo;
    }

    public void setShopingInfo(String shopingInfo) {
        this.shopingInfo = shopingInfo;
    }

    public List<TravelItemsSku> getSkus() {
        return this.skus;
    }

    public void setSkus(List<TravelItemsSku> skus) {
        this.skus = skus;
    }

    public Date getStart() {
        return this.start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Long getSubStock() {
        return this.subStock;
    }

    public void setSubStock(Long subStock) {
        this.subStock = subStock;
    }

    public String getTicketInfo() {
        return this.ticketInfo;
    }

    public void setTicketInfo(String ticketInfo) {
        this.ticketInfo = ticketInfo;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<TravelItemsCombo> getTravelItemsCombos() {
        return this.travelItemsCombos;
    }

    public void setTravelItemsCombos(List<TravelItemsCombo> travelItemsCombos) {
        this.travelItemsCombos = travelItemsCombos;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getUsedShowcase() {
        return this.usedShowcase;
    }

    public void setUsedShowcase(Long usedShowcase) {
        this.usedShowcase = usedShowcase;
    }

    public Boolean getViolation() {
        return this.violation;
    }

    public void setViolation(Boolean violation) {
        this.violation = violation;
    }

    public String getWapDesc() {
        return this.wapDesc;
    }

    public void setWapDesc(String wapDesc) {
        this.wapDesc = wapDesc;
    }

    public String getWapDetailUrl() {
        return this.wapDetailUrl;
    }

    public void setWapDetailUrl(String wapDetailUrl) {
        this.wapDetailUrl = wapDetailUrl;
    }

}
