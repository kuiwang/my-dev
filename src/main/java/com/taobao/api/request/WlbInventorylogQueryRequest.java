package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbInventorylogQueryResponse;

/**
 * TOP API: taobao.wlb.inventorylog.query request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:13
 */
public class WlbInventorylogQueryRequest implements TaobaoRequest<WlbInventorylogQueryResponse> {

    /**
     * 结束修改时间,小于等于该时间
     */
    private Date gmtEnd;

    /**
     * 起始修改时间,大于等于该时间
     */
    private Date gmtStart;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 商品ID
     */
    private Long itemId;

    /**
     * 库存操作作类型(可以为空) CHU_KU 1-出库 RU_KU 2-入库 FREEZE 3-冻结 THAW 4-解冻
     * CHECK_FREEZE 5-冻结确认 CHANGE_KU 6-库存类型变更 若值不在范围内，则按CHU_KU处理
     */
    private String opType;

    /**
     * 可指定授权的用户来查询
     */
    private Long opUserId;

    /**
     * 单号
     */
    private String orderCode;

    /**
     * 当前页
     */
    private Long pageNo;

    /**
     * 分页记录个数
     */
    private Long pageSize;

    /**
     * 仓库编码
     */
    private String storeCode;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
    }

    @Override
    public String getApiMethodName() {
        return "taobao.wlb.inventorylog.query";
    }

    public Date getGmtEnd() {
        return this.gmtEnd;
    }

    public Date getGmtStart() {
        return this.gmtStart;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public String getOpType() {
        return this.opType;
    }

    public Long getOpUserId() {
        return this.opUserId;
    }

    public String getOrderCode() {
        return this.orderCode;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    @Override
    public Class<WlbInventorylogQueryResponse> getResponseClass() {
        return WlbInventorylogQueryResponse.class;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("gmt_end", this.gmtEnd);
        txtParams.put("gmt_start", this.gmtStart);
        txtParams.put("item_id", this.itemId);
        txtParams.put("op_type", this.opType);
        txtParams.put("op_user_id", this.opUserId);
        txtParams.put("order_code", this.orderCode);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("store_code", this.storeCode);
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

    public void setGmtEnd(Date gmtEnd) {
        this.gmtEnd = gmtEnd;
    }

    public void setGmtStart(Date gmtStart) {
        this.gmtStart = gmtStart;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public void setOpType(String opType) {
        this.opType = opType;
    }

    public void setOpUserId(Long opUserId) {
        this.opUserId = opUserId;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
