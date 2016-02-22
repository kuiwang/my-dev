package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoDealerRequisitionorderModifyResponse;

/**
 * TOP API: taobao.fenxiao.dealer.requisitionorder.modify request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class FenxiaoDealerRequisitionorderModifyRequest
        implements TaobaoRequest<FenxiaoDealerRequisitionorderModifyResponse> {

    /**
     * 经销采购单编号
     */
    private Long dealerOrderId;

    /**
     * 要删除的商品明细id列表，多个id使用英文符号的逗号隔开
     */
    private String deleteDetailIds;

    /**
     * 经销采购单的商品明细的新的采购价格。格式为商品明细id:价格修改值,商品明细id:价格修改值
     */
    private String detailIdPrices;

    /**
     * 修改经销采购单的商品明细的新的库存。格式为商品明细id:库存修改值,商品明细id:库存修改值
     */
    private String detailIdQuantities;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 新邮费（单位：分，示例值1005表示10.05元）。必须大于等于0。自提方式不可修改邮费。不提交该参数表示不修改邮费。
     */
    private Long newPostFee;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(dealerOrderId, "dealerOrderId");
        RequestCheckUtils.checkMaxListSize(deleteDetailIds, 50, "deleteDetailIds");
        RequestCheckUtils.checkMaxListSize(detailIdPrices, 50, "detailIdPrices");
        RequestCheckUtils.checkMaxListSize(detailIdQuantities, 50, "detailIdQuantities");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.fenxiao.dealer.requisitionorder.modify";
    }

    public Long getDealerOrderId() {
        return this.dealerOrderId;
    }

    public String getDeleteDetailIds() {
        return this.deleteDetailIds;
    }

    public String getDetailIdPrices() {
        return this.detailIdPrices;
    }

    public String getDetailIdQuantities() {
        return this.detailIdQuantities;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getNewPostFee() {
        return this.newPostFee;
    }

    @Override
    public Class<FenxiaoDealerRequisitionorderModifyResponse> getResponseClass() {
        return FenxiaoDealerRequisitionorderModifyResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("dealer_order_id", this.dealerOrderId);
        txtParams.put("delete_detail_ids", this.deleteDetailIds);
        txtParams.put("detail_id_prices", this.detailIdPrices);
        txtParams.put("detail_id_quantities", this.detailIdQuantities);
        txtParams.put("new_post_fee", this.newPostFee);
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

    public void setDealerOrderId(Long dealerOrderId) {
        this.dealerOrderId = dealerOrderId;
    }

    public void setDeleteDetailIds(String deleteDetailIds) {
        this.deleteDetailIds = deleteDetailIds;
    }

    public void setDetailIdPrices(String detailIdPrices) {
        this.detailIdPrices = detailIdPrices;
    }

    public void setDetailIdQuantities(String detailIdQuantities) {
        this.detailIdQuantities = detailIdQuantities;
    }

    public void setNewPostFee(Long newPostFee) {
        this.newPostFee = newPostFee;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
