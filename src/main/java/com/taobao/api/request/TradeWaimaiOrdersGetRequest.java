package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TradeWaimaiOrdersGetResponse;

/**
 * TOP API: taobao.trade.waimai.orders.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:27
 */
public class TradeWaimaiOrdersGetRequest implements TaobaoRequest<TradeWaimaiOrdersGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * true 仅有支付宝订单,false 包括所有类型订单(货到付款,支付券等)
     */
    private Boolean isAllOrder;

    /**
     * true-查询仅按商家维度 false-查询按商家下所属店铺维度
     */
    private Boolean isAllShop;

    /**
     * 买家昵称/订单ID 搜索
     */
    private String keyword;

    /**
     * 订单状态 待确认订单2 , 退款中订单4 , 已发货12 关闭20 交易成功21
     */
    private Long orderStatus;

    /**
     * 页码<br />
     * 支持的最大列表长度为：100
     */
    private Long pageNo;

    /**
     * 返回记录数，超过20按20条返回数据<br />
     * 支持最大值为：20<br />
     * 支持最小值为：1
     */
    private Long pageSize;

    /**
     * 外卖分店ID
     */
    private Long shopId;

    public void setIsAllOrder(Boolean isAllOrder) {
        this.isAllOrder = isAllOrder;
    }

    public Boolean getIsAllOrder() {
        return this.isAllOrder;
    }

    public void setIsAllShop(Boolean isAllShop) {
        this.isAllShop = isAllShop;
    }

    public Boolean getIsAllShop() {
        return this.isAllShop;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public void setOrderStatus(Long orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Long getOrderStatus() {
        return this.orderStatus;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Long getShopId() {
        return this.shopId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.trade.waimai.orders.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("is_all_order", this.isAllOrder);
        txtParams.put("is_all_shop", this.isAllShop);
        txtParams.put("keyword", this.keyword);
        txtParams.put("order_status", this.orderStatus);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("shop_id", this.shopId);
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

    public Class<TradeWaimaiOrdersGetResponse> getResponseClass() {
        return TradeWaimaiOrdersGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(isAllShop, "isAllShop");
        RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
        RequestCheckUtils.checkMaxValue(pageSize, 20L, "pageSize");
        RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
        RequestCheckUtils.checkNotEmpty(shopId, "shopId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
