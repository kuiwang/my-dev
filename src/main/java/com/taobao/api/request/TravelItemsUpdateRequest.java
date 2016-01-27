package com.taobao.api.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TravelItemsUpdateResponse;

/**
 * TOP API: taobao.travel.items.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:32
 */
public class TravelItemsUpdateRequest implements TaobaoUploadRequest<TravelItemsUpdateResponse> {

    /**
     * 套餐价格日历增量更新字段，添加若干新套餐。（说明：如果使用增量更新字段，则全量更新字段combo_price_calendar不用设置，
     * 如果设置了则会优先使用全量更新
     * ），套餐价格日历json格式。如：{"combos":[{"combo_name":"套餐一","price_calendar"
     * :[{"child_num"
     * :100,"child_price":100,"date":"2012-06-08","diff_price"
     * :1000,"man_num"
     * :100,"man_price":1000},{"child_num":100,"child_price":
     * 100,"date":"2012-06-09"
     * ,"diff_price":1000,"man_num":100,"man_price":1000}]}]}
     */
    private String addComboPriceCalendar;

    /**
     * 商品上传后的状态。可选值:onsale(出售中),instock(仓库中);默认值:onsale。
     */
    private String approveStatus;

    /**
     * 商品的积分返点比例。如:5,表示:返点比例0.5%. 注意：返点比例必须是>0的整数.
     */
    private Long auctionPoint;

    /**
     * 发布电子凭证宝贝时候表示是否使用邮寄 0: 代表不使用邮寄； 1：代表使用邮寄；如果不设置这个值，代表不使用邮寄。
     */
    private String chooseLogis;

    /**
     * 商品所属类目ID。发布旅游线路商品有两个值：1(国内线路类目ID)，2(国际线路类目ID)。
     */
    private Long cid;

    /**
     * 宝贝所在地市。如果发布旅游度假线路的宝贝，该字段可以忽略。
     */
    private String city;

    /**
     * Json串，全量更新套餐价格日历信息（针对旅游度假线路的销售属性），定义了两个套餐日历价格，套餐明分别为：套餐一和套餐二。如：{
     * "combos":[{"combo_name":"套餐一","price_calendar":[{"child_num":100,
     * "child_price"
     * :100,"date":"2012-06-08","diff_price":1000,"man_num":100
     * ,"man_price":
     * 1000},{"child_num":100,"child_price":100,"date":"2012-06-09"
     * ,"diff_price":1000,"man_num":100,"man_price":1000}]}]}
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
     * 支持宝贝信息的删除，各个参数的名称之间用【,】分割, 如果对应的参数有设置过值，即使在这个列表中，也不会被删除;
     * 目前支持此功能的宝贝信息如下
     * ：locality_life表示删除电子凭证，merchant表示删除码商信息，refund_ratio表示删除电子凭证退款比例
     * ，network_id表示删除电子凭证网点信息
     * ,seller_cids表示删除关联店铺类目，outer_id表示删除商家外部编码，second_kill表示删除秒杀信息
     * ，input_pids表示删除用户自定义属性
     */
    private String emptyFields;

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

    private Map<String, String> headerMap = new TaobaoHashMap();

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
     * 是否是铁定出游商品
     */
    private Boolean isTdcy;

    /**
     * 商品数字ID。
     */
    private Long itemId;

    /**
     * 码商信息，格式为 码商id:nick。
     */
    private String merchant;

    /**
     * 网点ID。
     */
    private String networkId;

    /**
     * 商品库存。如果发布旅游度假线路宝贝，该字段可以忽略，参考后面：add_combo_price_calendar,
     * update_combo_price_calendar,remove_combo_price_calendar
     * 这些字段去使用商品销售属性
     */
    private Long num;

    /**
     * 电子凭证售中自动退款比例，百分比%前的数字，介于1-100之间的整数。
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
     * 商品一口价。如果发布旅游度假线路宝贝，该字段可以忽略，参考后面：add_combo_price_calendar,
     * update_combo_price_calendar,remove_combo_price_calendar
     * 这些字段去使用商品销售属性
     */
    private Long price;

    /**
     * 商品属性列表。格式为：pid:vid;pid:vid。例如发布旅游度假线路商品，那么这里就需要填写：出发地属性id:城市id;
     * 目的地市属性id:目的地市id;……等等。
     */
    private String props;

    /**
     * 宝贝所在地省份。如果发布旅游线路宝贝，该字段可以忽略。
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
     * 套餐价格日历增量更新字段，删除若干套餐。（说明：如果使用增量更新字段，则全量更新字段combo_price_calendar不用设置，
     * 如果设置了则会优先使用全量更新
     * ）。删除时，需要设置套餐属性id（pid），套餐属性值id（vid）。格式为：pid:vid1;pid:vid2;pid:vid3。
     */
    private String removeComboPriceCalendar;

    /**
     * 商品属性（不包含销售属性）增量更新字段，删除商品属性。（说明：如果使用增量更新字段，则全量更新字段props不用设置，
     * 如果设置了则会优先使用全量更新）。格式：pid1:vid1;pid2:vid2;pid3:vid3。
     */
    private String removeProps;

    /**
     * 商品秒杀三个值：可选类型web_only(只能通过web网络秒杀)，wap_only(只能通过wap网络秒杀)，web_and_wap(
     * 既能通过web秒杀也能通过wap秒杀)。
     */
    private String secondKill;

    /**
     * 关联商品与店铺类目，结构:",cid1,cid2,...,"，如果店铺类目存在二级类目，必须传入子类目cids。
     */
    private String sellerCids;

    /**
     * 购物店信息，不超过1500个字符。
     */
    private String shopingInfo;

    /**
     * Sku销售属性串对应的价格，每一个属性串都会对应一个价格，精确到两位小数，单位为元。
     * sku_prices的数组大小应该和sku_properties的数组大小一致
     * 。如果发布线路的商品，参考后面：add_combo_price_calendar
     * ,update_combo_price_calendar,remove_combo_price_calendar
     * 这些字段去使用商品销售属性
     */
    private String skuPrices;

    /**
     * Sku销售属性串，调用taobao.travel.itemsprops.get接口获取商品销售属性code，然后拼接成pid:vid;
     * pid:vid格式。如果发布线路的商品，参考后面：add_combo_price_calendar,
     * update_combo_price_calendar,remove_combo_price_calendar
     * 这些字段去使用商品销售属性
     */
    private String skuProperties;

    /**
     * Sku销售属性串对应的库存，每一个属性串都会对应一个库存，
     * 显然sku_quantities的数组大小应该和sku_properties的数组大小一致
     * 。如果发布线路的商品，参考后面：add_combo_price_calendar
     * ,update_combo_price_calendar,remove_combo_price_calendar
     * 这些字段去使用商品销售属性
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

    private Long timestamp;

    /**
     * 商品标题。注意：在商品更新时，如果不设置该属性，默认不进行更新，下同。
     */
    private String title;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    /**
     * 否 套餐价格日历增量更新字段，更新若干套餐。（说明：如果使用增量更新字段，则全量更新字段combo_price_calendar不用设置
     * ，如果设置了则会优先使用全量更新），套餐价格日历json格式。更新时，需要设置套餐属性id（pid），套餐属性值id（vid），
     * 套餐名称可以不设置
     * ，设置了也会忽略，会以传入的pid和vid为准。如：{"combos":[{"combo_name":"套餐一","pid"
     * :102020
     * ,"vid":289129,"price_calendar":[{"child_num":100,"child_price"
     * :100,"date"
     * :"2012-06-08","diff_price":1000,"man_num":100,"man_price":
     * 1000},{"child_num"
     * :100,"child_price":100,"date":"2012-06-09","diff_price"
     * :1000,"man_num":100,"man_price":1000}]}]}
     */
    private String updateComboPriceCalendar;

    /**
     * 商品属性（不包含销售属性）增量更新字段，更新或者添加商品属性。（说明：如果使用增量更新字段，则全量更新字段props不用设置，
     * 如果设置了则会优先使用全量更新
     * ）。格式：pid1:vid1;pid2:vid2;pid3:vid3。对于重复设置的同一个属性的多个值，对于单选属性
     * ，则会以最后一个为准；对于多选，则会对该属性新增属性值。
     */
    private String updateOrAddProps;

    /**
     * 核销打款 1代表核销打款 0代表非核销打款。
     */
    private String verification;

    @Override
    public void check() throws ApiRuleException {

        RequestCheckUtils.checkNotEmpty(itemId, "itemId");
        RequestCheckUtils.checkMaxListSize(sellerCids, 20, "sellerCids");
        RequestCheckUtils.checkMaxListSize(skuPrices, 20, "skuPrices");
        RequestCheckUtils.checkMaxListSize(skuProperties, 20, "skuProperties");
        RequestCheckUtils.checkMaxListSize(skuQuantities, 20, "skuQuantities");
    }

    public String getAddComboPriceCalendar() {
        return this.addComboPriceCalendar;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.travel.items.update";
    }

    public String getApproveStatus() {
        return this.approveStatus;
    }

    public Long getAuctionPoint() {
        return this.auctionPoint;
    }

    public String getChooseLogis() {
        return this.chooseLogis;
    }

    public Long getCid() {
        return this.cid;
    }

    public String getCity() {
        return this.city;
    }

    public String getComboPriceCalendar() {
        return this.comboPriceCalendar;
    }

    public String getDesc() {
        return this.desc;
    }

    public Long getDuration() {
        return this.duration;
    }

    public String getEmptyFields() {
        return this.emptyFields;
    }

    public String getExpirydate() {
        return this.expirydate;
    }

    public String getFeeInclude() {
        return this.feeInclude;
    }

    public String getFeeNotInclude() {
        return this.feeNotInclude;
    }

    @Override
    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap<String, FileItem>();
        params.put("image", this.image);
        return params;
    }

    public String getFlightInfo() {
        return this.flightInfo;
    }

    public String getGatheringPlace() {
        return this.gatheringPlace;
    }

    public Boolean getHasDiscount() {
        return this.hasDiscount;
    }

    public Boolean getHasInvoice() {
        return this.hasInvoice;
    }

    public Boolean getHasShowcase() {
        return this.hasShowcase;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getHotelInfo() {
        return this.hotelInfo;
    }

    public FileItem getImage() {
        return this.image;
    }

    public String getInputPids() {
        return this.inputPids;
    }

    public String getInputStr() {
        return this.inputStr;
    }

    public Boolean getIsTdcy() {
        return this.isTdcy;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public String getMerchant() {
        return this.merchant;
    }

    public String getNetworkId() {
        return this.networkId;
    }

    public Long getNum() {
        return this.num;
    }

    public Long getOnsaleAutoRefundRatio() {
        return this.onsaleAutoRefundRatio;
    }

    public String getOrderInfo() {
        return this.orderInfo;
    }

    public String getOuterId() {
        return this.outerId;
    }

    public String getOwnExpense() {
        return this.ownExpense;
    }

    public String getPicPath() {
        return this.picPath;
    }

    public Long getPrice() {
        return this.price;
    }

    public String getProps() {
        return this.props;
    }

    public String getProv() {
        return this.prov;
    }

    public Long getRefundRatio() {
        return this.refundRatio;
    }

    public String getRefundRegulation() {
        return this.refundRegulation;
    }

    public String getRemoveComboPriceCalendar() {
        return this.removeComboPriceCalendar;
    }

    public String getRemoveProps() {
        return this.removeProps;
    }

    @Override
    public Class<TravelItemsUpdateResponse> getResponseClass() {
        return TravelItemsUpdateResponse.class;
    }

    public String getSecondKill() {
        return this.secondKill;
    }

    public String getSellerCids() {
        return this.sellerCids;
    }

    public String getShopingInfo() {
        return this.shopingInfo;
    }

    public String getSkuPrices() {
        return this.skuPrices;
    }

    public String getSkuProperties() {
        return this.skuProperties;
    }

    public String getSkuQuantities() {
        return this.skuQuantities;
    }

    public Long getSubStock() {
        return this.subStock;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("add_combo_price_calendar", this.addComboPriceCalendar);
        txtParams.put("approve_status", this.approveStatus);
        txtParams.put("auction_point", this.auctionPoint);
        txtParams.put("choose_logis", this.chooseLogis);
        txtParams.put("cid", this.cid);
        txtParams.put("city", this.city);
        txtParams.put("combo_price_calendar", this.comboPriceCalendar);
        txtParams.put("desc", this.desc);
        txtParams.put("duration", this.duration);
        txtParams.put("empty_fields", this.emptyFields);
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
        txtParams.put("item_id", this.itemId);
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
        txtParams.put("remove_combo_price_calendar", this.removeComboPriceCalendar);
        txtParams.put("remove_props", this.removeProps);
        txtParams.put("second_kill", this.secondKill);
        txtParams.put("seller_cids", this.sellerCids);
        txtParams.put("shoping_info", this.shopingInfo);
        txtParams.put("sku_prices", this.skuPrices);
        txtParams.put("sku_properties", this.skuProperties);
        txtParams.put("sku_quantities", this.skuQuantities);
        txtParams.put("sub_stock", this.subStock);
        txtParams.put("ticket_info", this.ticketInfo);
        txtParams.put("title", this.title);
        txtParams.put("update_combo_price_calendar", this.updateComboPriceCalendar);
        txtParams.put("update_or_add_props", this.updateOrAddProps);
        txtParams.put("verification", this.verification);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public String getTicketInfo() {
        return this.ticketInfo;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUpdateComboPriceCalendar() {
        return this.updateComboPriceCalendar;
    }

    public String getUpdateOrAddProps() {
        return this.updateOrAddProps;
    }

    public String getVerification() {
        return this.verification;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setAddComboPriceCalendar(String addComboPriceCalendar) {
        this.addComboPriceCalendar = addComboPriceCalendar;
    }

    public void setApproveStatus(String approveStatus) {
        this.approveStatus = approveStatus;
    }

    public void setAuctionPoint(Long auctionPoint) {
        this.auctionPoint = auctionPoint;
    }

    public void setChooseLogis(String chooseLogis) {
        this.chooseLogis = chooseLogis;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setComboPriceCalendar(String comboPriceCalendar) {
        this.comboPriceCalendar = comboPriceCalendar;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public void setEmptyFields(String emptyFields) {
        this.emptyFields = emptyFields;
    }

    public void setExpirydate(String expirydate) {
        this.expirydate = expirydate;
    }

    public void setFeeInclude(String feeInclude) {
        this.feeInclude = feeInclude;
    }

    public void setFeeNotInclude(String feeNotInclude) {
        this.feeNotInclude = feeNotInclude;
    }

    public void setFlightInfo(String flightInfo) {
        this.flightInfo = flightInfo;
    }

    public void setGatheringPlace(String gatheringPlace) {
        this.gatheringPlace = gatheringPlace;
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

    public void setHotelInfo(String hotelInfo) {
        this.hotelInfo = hotelInfo;
    }

    public void setImage(FileItem image) {
        this.image = image;
    }

    public void setInputPids(String inputPids) {
        this.inputPids = inputPids;
    }

    public void setInputStr(String inputStr) {
        this.inputStr = inputStr;
    }

    public void setIsTdcy(Boolean isTdcy) {
        this.isTdcy = isTdcy;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public void setOnsaleAutoRefundRatio(Long onsaleAutoRefundRatio) {
        this.onsaleAutoRefundRatio = onsaleAutoRefundRatio;
    }

    public void setOrderInfo(String orderInfo) {
        this.orderInfo = orderInfo;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public void setOwnExpense(String ownExpense) {
        this.ownExpense = ownExpense;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public void setProps(String props) {
        this.props = props;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public void setRefundRatio(Long refundRatio) {
        this.refundRatio = refundRatio;
    }

    public void setRefundRegulation(String refundRegulation) {
        this.refundRegulation = refundRegulation;
    }

    public void setRemoveComboPriceCalendar(String removeComboPriceCalendar) {
        this.removeComboPriceCalendar = removeComboPriceCalendar;
    }

    public void setRemoveProps(String removeProps) {
        this.removeProps = removeProps;
    }

    public void setSecondKill(String secondKill) {
        this.secondKill = secondKill;
    }

    public void setSellerCids(String sellerCids) {
        this.sellerCids = sellerCids;
    }

    public void setShopingInfo(String shopingInfo) {
        this.shopingInfo = shopingInfo;
    }

    public void setSkuPrices(String skuPrices) {
        this.skuPrices = skuPrices;
    }

    public void setSkuProperties(String skuProperties) {
        this.skuProperties = skuProperties;
    }

    public void setSkuQuantities(String skuQuantities) {
        this.skuQuantities = skuQuantities;
    }

    public void setSubStock(Long subStock) {
        this.subStock = subStock;
    }

    public void setTicketInfo(String ticketInfo) {
        this.ticketInfo = ticketInfo;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUpdateComboPriceCalendar(String updateComboPriceCalendar) {
        this.updateComboPriceCalendar = updateComboPriceCalendar;
    }

    public void setUpdateOrAddProps(String updateOrAddProps) {
        this.updateOrAddProps = updateOrAddProps;
    }

    public void setVerification(String verification) {
        this.verification = verification;
    }
}
