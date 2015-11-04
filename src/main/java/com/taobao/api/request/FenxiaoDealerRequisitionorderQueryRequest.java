package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoDealerRequisitionorderQueryResponse;

/**
 * TOP API: taobao.fenxiao.dealer.requisitionorder.query request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class FenxiaoDealerRequisitionorderQueryRequest implements
        TaobaoRequest<FenxiaoDealerRequisitionorderQueryResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 经销采购单编号。 多个编号用英文符号的逗号隔开。最多支持50个经销采购单编号的查询。
     */
    private String dealerOrderIds;

    /**
     * 多个字段用","分隔。 fields 如果为空：返回所有经销采购单对象(dealer_orders)字段。
     * 如果不为空：返回指定采购单对象(dealer_orders)字段。 例1：
     * dealer_order_details.product_id 表示只返回product_id 例2：
     * dealer_order_details 表示只返回明细列表
     */
    private String fields;

    public void setDealerOrderIds(String dealerOrderIds) {
        this.dealerOrderIds = dealerOrderIds;
    }

    public String getDealerOrderIds() {
        return this.dealerOrderIds;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.dealer.requisitionorder.query";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("dealer_order_ids", this.dealerOrderIds);
        txtParams.put("fields", this.fields);
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

    public Class<FenxiaoDealerRequisitionorderQueryResponse> getResponseClass() {
        return FenxiaoDealerRequisitionorderQueryResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(dealerOrderIds, "dealerOrderIds");
        RequestCheckUtils.checkMaxListSize(dealerOrderIds, 50, "dealerOrderIds");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
