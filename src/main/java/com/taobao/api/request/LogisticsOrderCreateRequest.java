package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsOrderCreateResponse;

/**
 * TOP API: taobao.logistics.order.create request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class LogisticsOrderCreateRequest implements TaobaoRequest<LogisticsOrderCreateResponse> {

    /**
     * 运送的货物名称列表，用|号隔开
     */
    private String goodsNames;

    /**
     * 运送货物的数量列表，用|号隔开
     */
    private String goodsQuantities;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 创建订单同时是否进行发货，默认发货。
     */
    private Boolean isConsign;

    /**
     * 运送货物的单价列表(注意：单位为分），用|号隔开
     */
    private String itemValues;

    /**
     * 发货的物流公司代码，如申通=STO，圆通=YTO。is_consign=true时，此项必填。
     */
    private String logisCompanyCode;

    /**
     * 发货方式,默认为自己联系发货。可选值:ONLINE(在线下单)、OFFLINE(自己联系)。
     */
    private String logisType;

    /**
     * 发货的物流公司运单号。在logis_type=OFFLINE且is_consign=true时，此项必填。
     */
    private String mailNo;

    /**
     * 收货人详细地址，比如”浙江省^^^杭州市^^^下城区^^^文二路“，中间用“^^^”分隔
     */
    private String receiverAddress;

    /**
     * 收货人手机号码（若此处为空，则电话必填）
     */
    private String receiverMobilePhone;

    /**
     * 收货人姓名
     */
    private String receiverName;

    /**
     * 收货人电话号码（若此处为空，则手机号码必填）
     */
    private String receiverTelephone;

    /**
     * 收货人邮编
     */
    private String receiverZipCode;

    /**
     * 卖家旺旺号
     */
    private String sellerWangwangId;

    /**
     * 发货人详细地址，比如”浙江省^^^杭州市^^^下城区^^^文二路“，中间用“^^^”分隔
     */
    private String senderAddress;

    /**
     * 发货人手机号码（若此处为空，则电话必填）
     */
    private String senderMobilePhone;

    /**
     * 发货人姓名
     */
    private String senderName;

    /**
     * 发货人电话号码（如此处为空，则手机号码必填）
     */
    private String senderTelephone;

    /**
     * 发货人邮编
     */
    private String senderZipCode;

    /**
     * 运费承担方式。1为买家承担运费，2为卖家承担运费，其他值为错误参数。
     */
    private Long shipping;

    private Long timestamp;

    /**
     * 订单的交易号码
     */
    private Long tradeId;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(goodsNames, "goodsNames");
        RequestCheckUtils.checkNotEmpty(goodsQuantities, "goodsQuantities");
        RequestCheckUtils.checkNotEmpty(itemValues, "itemValues");
        RequestCheckUtils.checkNotEmpty(receiverAddress, "receiverAddress");
        RequestCheckUtils.checkNotEmpty(receiverName, "receiverName");
        RequestCheckUtils.checkNotEmpty(receiverZipCode, "receiverZipCode");
        RequestCheckUtils.checkNotEmpty(sellerWangwangId, "sellerWangwangId");
        RequestCheckUtils.checkNotEmpty(senderAddress, "senderAddress");
        RequestCheckUtils.checkNotEmpty(senderName, "senderName");
        RequestCheckUtils.checkNotEmpty(senderZipCode, "senderZipCode");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.logistics.order.create";
    }

    public String getGoodsNames() {
        return this.goodsNames;
    }

    public String getGoodsQuantities() {
        return this.goodsQuantities;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Boolean getIsConsign() {
        return this.isConsign;
    }

    public String getItemValues() {
        return this.itemValues;
    }

    public String getLogisCompanyCode() {
        return this.logisCompanyCode;
    }

    public String getLogisType() {
        return this.logisType;
    }

    public String getMailNo() {
        return this.mailNo;
    }

    public String getReceiverAddress() {
        return this.receiverAddress;
    }

    public String getReceiverMobilePhone() {
        return this.receiverMobilePhone;
    }

    public String getReceiverName() {
        return this.receiverName;
    }

    public String getReceiverTelephone() {
        return this.receiverTelephone;
    }

    public String getReceiverZipCode() {
        return this.receiverZipCode;
    }

    @Override
    public Class<LogisticsOrderCreateResponse> getResponseClass() {
        return LogisticsOrderCreateResponse.class;
    }

    public String getSellerWangwangId() {
        return this.sellerWangwangId;
    }

    public String getSenderAddress() {
        return this.senderAddress;
    }

    public String getSenderMobilePhone() {
        return this.senderMobilePhone;
    }

    public String getSenderName() {
        return this.senderName;
    }

    public String getSenderTelephone() {
        return this.senderTelephone;
    }

    public String getSenderZipCode() {
        return this.senderZipCode;
    }

    public Long getShipping() {
        return this.shipping;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("goods_names", this.goodsNames);
        txtParams.put("goods_quantities", this.goodsQuantities);
        txtParams.put("is_consign", this.isConsign);
        txtParams.put("item_values", this.itemValues);
        txtParams.put("logis_company_code", this.logisCompanyCode);
        txtParams.put("logis_type", this.logisType);
        txtParams.put("mail_no", this.mailNo);
        txtParams.put("receiver_address", this.receiverAddress);
        txtParams.put("receiver_mobile_phone", this.receiverMobilePhone);
        txtParams.put("receiver_name", this.receiverName);
        txtParams.put("receiver_telephone", this.receiverTelephone);
        txtParams.put("receiver_zip_code", this.receiverZipCode);
        txtParams.put("seller_wangwang_id", this.sellerWangwangId);
        txtParams.put("sender_address", this.senderAddress);
        txtParams.put("sender_mobile_phone", this.senderMobilePhone);
        txtParams.put("sender_name", this.senderName);
        txtParams.put("sender_telephone", this.senderTelephone);
        txtParams.put("sender_zip_code", this.senderZipCode);
        txtParams.put("shipping", this.shipping);
        txtParams.put("trade_id", this.tradeId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public Long getTradeId() {
        return this.tradeId;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setGoodsNames(String goodsNames) {
        this.goodsNames = goodsNames;
    }

    public void setGoodsQuantities(String goodsQuantities) {
        this.goodsQuantities = goodsQuantities;
    }

    public void setIsConsign(Boolean isConsign) {
        this.isConsign = isConsign;
    }

    public void setItemValues(String itemValues) {
        this.itemValues = itemValues;
    }

    public void setLogisCompanyCode(String logisCompanyCode) {
        this.logisCompanyCode = logisCompanyCode;
    }

    public void setLogisType(String logisType) {
        this.logisType = logisType;
    }

    public void setMailNo(String mailNo) {
        this.mailNo = mailNo;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public void setReceiverMobilePhone(String receiverMobilePhone) {
        this.receiverMobilePhone = receiverMobilePhone;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public void setReceiverTelephone(String receiverTelephone) {
        this.receiverTelephone = receiverTelephone;
    }

    public void setReceiverZipCode(String receiverZipCode) {
        this.receiverZipCode = receiverZipCode;
    }

    public void setSellerWangwangId(String sellerWangwangId) {
        this.sellerWangwangId = sellerWangwangId;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public void setSenderMobilePhone(String senderMobilePhone) {
        this.senderMobilePhone = senderMobilePhone;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public void setSenderTelephone(String senderTelephone) {
        this.senderTelephone = senderTelephone;
    }

    public void setSenderZipCode(String senderZipCode) {
        this.senderZipCode = senderZipCode;
    }

    public void setShipping(Long shipping) {
        this.shipping = shipping;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }
}
