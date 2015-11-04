package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbOutInventoryChangeNotifyResponse;

/**
 * TOP API: taobao.wlb.out.inventory.change.notify request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:14
 */
public class WlbOutInventoryChangeNotifyRequest implements
        TaobaoRequest<WlbOutInventoryChangeNotifyResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 库存变化数量
     */
    private Long changeCount;

    /**
     * 物流宝商品id或前台宝贝id（由type类型决定）
     */
    private Long itemId;

    /**
     * OUT--出库 IN--入库
     */
    private String opType;

    /**
     * 订单号，如果source为TAOBAO_TRADE,order_source_code必须为淘宝交易号
     */
    private String orderSourceCode;

    /**
     * 库存变化唯一标识，用于去重，一个外部唯一编码唯一标识一次库存变化。
     */
    private String outBizCode;

    /**
     * 本次库存变化后库存余额
     */
    private Long resultCount;

    /**
     * （1）OTHER： 其他 （2）TAOBAO_TRADE： 淘宝交易 （3）OTHER_TRADE：其他交易 （4）ALLCOATE：
     * 调拨 （5）CHECK:盘点 （6）PURCHASE:采购
     */
    private String source;

    /**
     * 目前非必须，系统会选择默认值
     */
    private String storeCode;

    /**
     * WLB_ITEM--物流宝商品 IC_ITEM--淘宝商品 IC_SKU--淘宝sku
     */
    private String type;

    public void setChangeCount(Long changeCount) {
        this.changeCount = changeCount;
    }

    public Long getChangeCount() {
        return this.changeCount;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setOpType(String opType) {
        this.opType = opType;
    }

    public String getOpType() {
        return this.opType;
    }

    public void setOrderSourceCode(String orderSourceCode) {
        this.orderSourceCode = orderSourceCode;
    }

    public String getOrderSourceCode() {
        return this.orderSourceCode;
    }

    public void setOutBizCode(String outBizCode) {
        this.outBizCode = outBizCode;
    }

    public String getOutBizCode() {
        return this.outBizCode;
    }

    public void setResultCount(Long resultCount) {
        this.resultCount = resultCount;
    }

    public Long getResultCount() {
        return this.resultCount;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return this.source;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.wlb.out.inventory.change.notify";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("change_count", this.changeCount);
        txtParams.put("item_id", this.itemId);
        txtParams.put("op_type", this.opType);
        txtParams.put("order_source_code", this.orderSourceCode);
        txtParams.put("out_biz_code", this.outBizCode);
        txtParams.put("result_count", this.resultCount);
        txtParams.put("source", this.source);
        txtParams.put("store_code", this.storeCode);
        txtParams.put("type", this.type);
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

    public Class<WlbOutInventoryChangeNotifyResponse> getResponseClass() {
        return WlbOutInventoryChangeNotifyResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(changeCount, "changeCount");
        RequestCheckUtils.checkNotEmpty(itemId, "itemId");
        RequestCheckUtils.checkNotEmpty(opType, "opType");
        RequestCheckUtils.checkNotEmpty(outBizCode, "outBizCode");
        RequestCheckUtils.checkNotEmpty(resultCount, "resultCount");
        RequestCheckUtils.checkNotEmpty(source, "source");
        RequestCheckUtils.checkNotEmpty(type, "type");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
