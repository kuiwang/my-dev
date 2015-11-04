package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoDealerRequisitionorderRemarkUpdateResponse;

/**
 * TOP API: taobao.fenxiao.dealer.requisitionorder.remark.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class FenxiaoDealerRequisitionorderRemarkUpdateRequest implements
        TaobaoRequest<FenxiaoDealerRequisitionorderRemarkUpdateResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 经销采购单ID
     */
    private Long dealerOrderId;

    /**
     * 备注留言，可为空
     */
    private String supplierMemo;

    /**
     * 旗子的标记，必选。 1-5之间的数字。 非1-5之间，都采用1作为默认。 1:红色 2:黄色 3:绿色 4:蓝色 5:粉红色<br />
     * 支持最大值为：5<br />
     * 支持最小值为：1
     */
    private Long supplierMemoFlag;

    public void setDealerOrderId(Long dealerOrderId) {
        this.dealerOrderId = dealerOrderId;
    }

    public Long getDealerOrderId() {
        return this.dealerOrderId;
    }

    public void setSupplierMemo(String supplierMemo) {
        this.supplierMemo = supplierMemo;
    }

    public String getSupplierMemo() {
        return this.supplierMemo;
    }

    public void setSupplierMemoFlag(Long supplierMemoFlag) {
        this.supplierMemoFlag = supplierMemoFlag;
    }

    public Long getSupplierMemoFlag() {
        return this.supplierMemoFlag;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.dealer.requisitionorder.remark.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("dealer_order_id", this.dealerOrderId);
        txtParams.put("supplier_memo", this.supplierMemo);
        txtParams.put("supplier_memo_flag", this.supplierMemoFlag);
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

    public Class<FenxiaoDealerRequisitionorderRemarkUpdateResponse> getResponseClass() {
        return FenxiaoDealerRequisitionorderRemarkUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(dealerOrderId, "dealerOrderId");
        RequestCheckUtils.checkNotEmpty(supplierMemoFlag, "supplierMemoFlag");
        RequestCheckUtils.checkMaxValue(supplierMemoFlag, 5L, "supplierMemoFlag");
        RequestCheckUtils.checkMinValue(supplierMemoFlag, 1L, "supplierMemoFlag");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
