package com.taobao.api.request;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TravelItemsAddResponse;

/**
 * TOP API: taobao.travel.items.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:32
 */
public class TravelItemsAddRequest implements TaobaoUploadRequest<TravelItemsAddResponse> {

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 商品上传后的状态。可选值:onsale(出售中),instock(仓库中);默认值:onsale。
     */
    private String approveStatus;

    /**
     * 商品的积分返点比例。如:5,表示:返点比例0.5%.
     * 注意：返点比例必须是>0的整数.B商家在发布非虚拟商品时，这个字段必须设置，返点必须是
     * 5的倍数，即0.5%的倍数。注意该字段值最高值不超过500，即50%。
     */
    private Long auctionPoint;

    /**
     * 发布电子凭证宝贝时候表示是否使用邮寄 0: 代表不使用邮寄； 1：代表使用邮寄；如果不设置这个值，代表不使用邮寄。
     */
    private String chooseLogis;

    /**
     * 商品所属叶子类目ID。
     */
    private Long cid;

    /**
     * 宝贝所在地市。
     */
    private String city;

    /**
     * Json串：{"combos":[{"combo_name":"套餐一","price_calendar":[{"child_num":
     * 100
     * ,"child_price":100,"date":"2012-06-08","diff_price":1000,"man_num"
     * :100,"man_price":1000},{"child_num":100,"child_price":100,"date":
     * "2012-06-09","diff_price":1000,"man_num":100,"man_price":1000}]}]}
     */
    private String comboPriceCalendar;

    /**
     * 商品描述，不超过50000个字符。
     */
    private String desc;

    /**
     * 最晚成团提前天数，最小0天，最大为300天。
     */
    private Long duration;

    /**
     * 电子交易凭证有效期，目前此字段只涉及到的信息为有效期; 如果有效期为起止日期类型，此值为2012-08-06,2012-08-16
     * 如果有效期为【购买成功日 至】类型则格式为2012-08-16 如果有效期为天数类型则格式为15。
     */
    private String expirydate;

    /**
     * 费用包含，不超过1500个字符。
     */
    private String feeInclude;

    /**
     * 费用不包，不超过1500个字符。
     */
    private String feeNotInclude;

    /**
     * 机票信息，不超过1500字符
     */
    private String flightInfo;

    /**
     * 集合地，不超过30个字符。
     */
    private String gatheringPlace;

    /**
     * 支持会员打折。可选值:true,false;默认值:false(不打折)。
     */
    private Boolean hasDiscount;

    /**
     * 是否有发票。可选值:true,false (商城卖家此字段必须为true);默认值:false(无发票)。
     */
    private Boolean hasInvoice;

    /**
     * 橱窗推荐。可选值:true,false;默认值:false(不推荐)，B商家不用设置该字段，均为true。
     */
    private Boolean hasShowcase;

    /**
     * 酒店信息，不超过1500字符
     */
    private String hotelInfo;

    /**
     * 商品主图。类型:JPG,GIF;最大长度:500k，支持的文件类型：gif,jpg,jpeg,png。
     */
    private FileItem image;

    /**
     * 用户自行输入的类目属性ID串。结构："pid1,pid2,pid3"，如："2000"（表示品牌）
     * 注：通常一个类目下用户可输入的关键属性不超过1个。在度假线路类目中，该属性ID为“自由行包含元素”或“一日游包含元素”属性ID。
     */
    private String inputPids;

    /**
     * 用户自行输入的子属性名和属性值，如“自定义自由行包含元素”。
     */
    private String inputStr;

    /**
     * 是否为铁定出游商品的参数设置为true，那么该商品为铁定出游商品；设置为false，那么该商品为非铁定出游商品。默认为false
     */
    private Boolean isTdcy;

    /**
     * 定时上架时间。(时间格式：yyyy-MM-dd HH:mm:ss)
     */
    private Date listTime;

    /**
     * 码商信息，格式为 码商id:nick。
     */
    private String merchant;

    /**
     * 网点ID。
     */
    private String networkId;

    /**
     * 商品库存。如果发布旅游度假线路宝贝，该字段可以忽略。
     */
    private Long num;

    /**
     * 电子凭证售中自动退款比例，百分比%前的数字，介于1-100之间的整数。(暂未使用)
     */
    private Long onsaleAutoRefundRatio;

    /**
     * 预定须知，不超过1500个字符。
     */
    private String orderInfo;

    /**
     * 商家的外部编码，最大为512字节。
     */
    private String outerId;

    /**
     * 自费项目，不超过1500个字符。
     */
    private String ownExpense;

    /**
     * 商品主图需要关联的图片空间的相对url。这个url所对应的图片必须要属于当前用户。pic_path和image只需要传入一个,
     * 如果两个都传，默认选择pic_path。
     */
    private String picPath;

    /**
     * 商品一口价。如果发布旅游度假线路的宝贝，该字段可以忽略。
     */
    private Long price;

    /**
     * 商品属性列表。格式为：pid:vid;pid:vid。例如发布度假线路商品，那么这里就需要填写：出发地属性id:城市id;
     * 目的地市属性id:目的地市id;……等等。
     */
    private String props;

    /**
     * 宝贝所在地省份。
     */
    private String prov;

    /**
     * 退款比例，百分比%前的数字,1-100的正整数值。
     */
    private Long refundRatio;

    /**
     * 退改规定，不超过1500个字符。
     */
    private String refundRegulation;

    /**
     * 商品秒杀三个值：可选类型web_only(只能通过web网络秒杀)，wap_only(只能通过wap网络秒杀)，web_and_wap(
     * 既能通过web秒杀也能通过wap秒杀)。
     */
    private String secondKill;

    /**
     * 关联商品与店铺类目，结构:",cid1,cid2,...,"，如果店铺类目存在二级类目，必须传入子类目cids。<br />
     * 支持最大长度为：256<br />
     * 支持的最大列表长度为：256
     */
    private String sellerCids;

    /**
     * 购物店信息，不超过1500个字符。
     */
    private String shopingInfo;

    /**
     * sku销售属性串对应的价格，精确到分，每一个属性串都会对应一个价格，单位为分。
     * sku_prices的数组大小应该和sku_properties的数组大小一致。如果发布线路的商品，该字段可以忽略。
     */
    private String skuPrices;

    /**
     * Sku销售属性串，调用taobao.travel.itemsprops.get接口获取商品销售属性code，然后拼接成pid:vid;
     * pid:vid格式。如果发布线路的商品，该字段可以忽略。
     */
    private String skuProperties;

    /**
     * Sku销售属性串对应的库存，每一个属性串都会对应一个库存，
     * 显然sku_quantities的数组大小应该和sku_properties的数组大小一致。如果发布线路的商品，该字段可以忽略。
     */
    private String skuQuantities;

    /**
     * 商品是否支持拍下减库存:1支持;2取消支持(付款减库存);0(默认)不更改，集市卖家默认拍下减库存;商城卖家默认付款减库存。
     */
    private Long subStock;

    /**
     * 门票信息，不超过1500字符
     */
    private String ticketInfo;

    /**
     * 商品标题。
     */
    private String title;

    /**
     * 核销打款 1代表核销打款 0代表非核销打款。
     */
    private String verification;

    public void setApproveStatus(String approveStatus) {
        this.approveStatus = approveStatus;
    }

    public String getApproveStatus() {
        return this.approveStatus;
    }

    public void setAuctionPoint(Long auctionPoint) {
        this.auctionPoint = auctionPoint;
    }

    public Long getAuctionPoint() {
        return this.auctionPoint;
    }

    public void setChooseLogis(String chooseLogis) {
        this.chooseLogis = chooseLogis;
    }

    public String getChooseLogis() {
        return this.chooseLogis;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getCid() {
        return this.cid;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    public void setComboPriceCalendar(String comboPriceCalendar) {
        this.comboPriceCalendar = comboPriceCalendar;
    }

    public String getComboPriceCalendar() {
        return this.comboPriceCalendar;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Long getDuration() {
        return this.duration;
    }

    public void setExpirydate(String expirydate) {
        this.expirydate = expirydate;
    }

    public String getExpirydate() {
        return this.expirydate;
    }

    public void setFeeInclude(String feeInclude) {
        this.feeInclude = feeInclude;
    }

    public String getFeeInclude() {
        return this.feeInclude;
    }

    public void setFeeNotInclude(String feeNotInclude) {
        this.feeNotInclude = feeNotInclude;
    }

    public String getFeeNotInclude() {
        return this.feeNotInclude;
    }

    public void setFlightInfo(String flightInfo) {
        this.flightInfo = flightInfo;
    }

    public String getFlightInfo() {
        return this.flightInfo;
    }

    public void setGatheringPlace(String gatheringPlace) {
        this.gatheringPlace = gatheringPlace;
    }

    public String getGatheringPlace() {
        return this.gatheringPlace;
    }

    public void setHasDiscount(Boolean hasDiscount) {
        this.hasDiscount = hasDiscount;
    }

    public Boolean getHasDiscount() {
        return this.hasDiscount;
    }

    public void setHasInvoice(Boolean hasInvoice) {
        this.hasInvoice = hasInvoice;
    }

    public Boolean getHasInvoice() {
        return this.hasInvoice;
    }

    public void setHasShowcase(Boolean hasShowcase) {
        this.hasShowcase = hasShowcase;
    }

    public Boolean getHasShowcase() {
        return this.hasShowcase;
    }

    public void setHotelInfo(String hotelInfo) {
        this.hotelInfo = hotelInfo;
    }

    public String getHotelInfo() {
        return this.hotelInfo;
    }

    public void setImage(FileItem image) {
        this.image = image;
    }

    public FileItem getImage() {
        return this.image;
    }

    public void setInputPids(String inputPids) {
        this.inputPids = inputPids;
    }

    public String getInputPids() {
        return this.inputPids;
    }

    public void setInputStr(String inputStr) {
        this.inputStr = inputStr;
    }

    public String getInputStr() {
        return this.inputStr;
    }

    public void setIsTdcy(Boolean isTdcy) {
        this.isTdcy = isTdcy;
    }

    public Boolean getIsTdcy() {
        return this.isTdcy;
    }

    public void setListTime(Date listTime) {
        this.listTime = listTime;
    }

    public Date getListTime() {
        return this.listTime;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public String getMerchant() {
        return this.merchant;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    public String getNetworkId() {
        return this.networkId;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public Long getNum() {
        return this.num;
    }

    public void setOnsaleAutoRefundRatio(Long onsaleAutoRefundRatio) {
        this.onsaleAutoRefundRatio = onsaleAutoRefundRatio;
    }

    public Long getOnsaleAutoRefundRatio() {
        return this.onsaleAutoRefundRatio;
    }

    public void setOrderInfo(String orderInfo) {
        this.orderInfo = orderInfo;
    }

    public String getOrderInfo() {
        return this.orderInfo;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public String getOuterId() {
        return this.outerId;
    }

    public void setOwnExpense(String ownExpense) {
        this.ownExpense = ownExpense;
    }

    public String getOwnExpense() {
        return this.ownExpense;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getPicPath() {
        return this.picPath;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getPrice() {
        return this.price;
    }

    public void setProps(String props) {
        this.props = props;
    }

    public String getProps() {
        return this.props;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public String getProv() {
        return this.prov;
    }

    public void setRefundRatio(Long refundRatio) {
        this.refundRatio = refundRatio;
    }

    public Long getRefundRatio() {
        return this.refundRatio;
    }

    public void setRefundRegulation(String refundRegulation) {
        this.refundRegulation = refundRegulation;
    }

    public String getRefundRegulation() {
        return this.refundRegulation;
    }

    public void setSecondKill(String secondKill) {
        this.secondKill = secondKill;
    }

    public String getSecondKill() {
        return this.secondKill;
    }

    public void setSellerCids(String sellerCids) {
        this.sellerCids = sellerCids;
    }

    public String getSellerCids() {
        return this.sellerCids;
    }

    public void setShopingInfo(String shopingInfo) {
        this.shopingInfo = shopingInfo;
    }

    public String getShopingInfo() {
        return this.shopingInfo;
    }

    public void setSkuPrices(String skuPrices) {
        this.skuPrices = skuPrices;
    }

    public String getSkuPrices() {
        return this.skuPrices;
    }

    public void setSkuProperties(String skuProperties) {
        this.skuProperties = skuProperties;
    }

    public String getSkuProperties() {
        return this.skuProperties;
    }

    public void setSkuQuantities(String skuQuantities) {
        this.skuQuantities = skuQuantities;
    }

    public String getSkuQuantities() {
        return this.skuQuantities;
    }

    public void setSubStock(Long subStock) {
        this.subStock = subStock;
    }

    public Long getSubStock() {
        return this.subStock;
    }

    public void setTicketInfo(String ticketInfo) {
        this.ticketInfo = ticketInfo;
    }

    public String getTicketInfo() {
        return this.ticketInfo;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setVerification(String verification) {
        this.verification = verification;
    }

    public String getVerification() {
        return this.verification;
    }

    private Map<String, String> headerMap = new TaobaoHashMap();

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.travel.items.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("approve_status", this.approveStatus);
        txtParams.put("auction_point", this.auctionPoint);
        txtParams.put("choose_logis", this.chooseLogis);
        txtParams.put("cid", this.cid);
        txtParams.put("city", this.city);
        txtParams.put("combo_price_calendar", this.comboPriceCalendar);
        txtParams.put("desc", this.desc);
        txtParams.put("duration", this.duration);
        txtParams.put("expirydate", this.expirydate);
        txtParams.put("fee_include", this.feeInclude);
        txtParams.put("fee_not_include", this.feeNotInclude);
        txtParams.put("flight_info", this.flightInfo);
        txtParams.put("gathering_place", this.gatheringPlace);
        txtParams.put("has_discount", this.hasDiscount);
        txtParams.put("has_invoice", this.hasInvoice);
        txtParams.put("has_showcase", this.hasShowcase);
        txtParams.put("hotel_info", this.hotelInfo);
        txtParams.put("input_pids", this.inputPids);
        txtParams.put("input_str", this.inputStr);
        txtParams.put("is_tdcy", this.isTdcy);
        txtParams.put("list_time", this.listTime);
        txtParams.put("merchant", this.merchant);
        txtParams.put("network_id", this.networkId);
        txtParams.put("num", this.num);
        txtParams.put("onsale_auto_refund_ratio", this.onsaleAutoRefundRatio);
        txtParams.put("order_info", this.orderInfo);
        txtParams.put("outer_id", this.outerId);
        txtParams.put("own_expense", this.ownExpense);
        txtParams.put("pic_path", this.picPath);
        txtParams.put("price", this.price);
        txtParams.put("props", this.props);
        txtParams.put("prov", this.prov);
        txtParams.put("refund_ratio", this.refundRatio);
        txtParams.put("refund_regulation", this.refundRegulation);
        txtParams.put("second_kill", this.secondKill);
        txtParams.put("seller_cids", this.sellerCids);
        txtParams.put("shoping_info", this.shopingInfo);
        txtParams.put("sku_prices", this.skuPrices);
        txtParams.put("sku_properties", this.skuProperties);
        txtParams.put("sku_quantities", this.skuQuantities);
        txtParams.put("sub_stock", this.subStock);
        txtParams.put("ticket_info", this.ticketInfo);
        txtParams.put("title", this.title);
        txtParams.put("verification", this.verification);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap<String, FileItem>();
        params.put("image", this.image);
        return params;
    }

    public Class<TravelItemsAddResponse> getResponseClass() {
        return TravelItemsAddResponse.class;
    }

    public void check() throws ApiRuleException {

        RequestCheckUtils.checkNotEmpty(cid, "cid");
        RequestCheckUtils.checkNotEmpty(city, "city");
        RequestCheckUtils.checkNotEmpty(comboPriceCalendar, "comboPriceCalendar");
        RequestCheckUtils.checkNotEmpty(desc, "desc");
        RequestCheckUtils.checkNotEmpty(duration, "duration");
        RequestCheckUtils.checkNotEmpty(props, "props");
        RequestCheckUtils.checkNotEmpty(prov, "prov");
        RequestCheckUtils.checkNotEmpty(refundRegulation, "refundRegulation");
        RequestCheckUtils.checkMaxListSize(sellerCids, 20, "sellerCids");
        RequestCheckUtils.checkMaxLength(sellerCids, 256, "sellerCids");
        RequestCheckUtils.checkMaxListSize(skuPrices, 380, "skuPrices");
        RequestCheckUtils.checkMaxListSize(skuProperties, 380, "skuProperties");
        RequestCheckUtils.checkMaxListSize(skuQuantities, 380, "skuQuantities");
        RequestCheckUtils.checkNotEmpty(title, "title");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
