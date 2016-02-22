package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoOrderRemarkUpdateResponse;

/**
 * TOP API: taobao.fenxiao.order.remark.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class FenxiaoOrderRemarkUpdateRequest
        implements TaobaoRequest<FenxiaoOrderRemarkUpdateResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 采购单编号
     */
    private Long purchaseOrderId;

    /**
     * 备注内容(供应商操作)
     */
    private String supplierMemo;

    /**
     * 旗子的标记，1-5之间的数字。非1-5之间，都采用1作为默认。 1:红色 2:黄色 3:绿色 4:蓝色 5:粉红色<br />
     * 支持最大值为：5<br />
     * 支持最小值为：1
     */
    private Long supplierMemoFlag;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(purchaseOrderId, "purchaseOrderId");
        RequestCheckUtils.checkNotEmpty(supplierMemo, "supplierMemo");
        RequestCheckUtils.checkMaxValue(supplierMemoFlag, 5L, "supplierMemoFlag");
        RequestCheckUtils.checkMinValue(supplierMemoFlag, 1L, "supplierMemoFlag");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.fenxiao.order.remark.update";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getPurchaseOrderId() {
        return this.purchaseOrderId;
    }

    @Override
    public Class<FenxiaoOrderRemarkUpdateResponse> getResponseClass() {
        return FenxiaoOrderRemarkUpdateResponse.class;
    }

    public String getSupplierMemo() {
        return this.supplierMemo;
    }

    public Long getSupplierMemoFlag() {
        return this.supplierMemoFlag;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("purchase_order_id", this.purchaseOrderId);
        txtParams.put("supplier_memo", this.supplierMemo);
        txtParams.put("supplier_memo_flag", this.supplierMemoFlag);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setPurchaseOrderId(Long purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public void setSupplierMemo(String supplierMemo) {
        this.supplierMemo = supplierMemo;
    }

    public void setSupplierMemoFlag(Long supplierMemoFlag) {
        this.supplierMemoFlag = supplierMemoFlag;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
