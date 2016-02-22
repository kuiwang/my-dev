package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoTrademonitorGetResponse;

/**
 * TOP API: taobao.fenxiao.trademonitor.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class FenxiaoTrademonitorGetRequest
        implements TaobaoRequest<FenxiaoTrademonitorGetResponse> {

    /**
     * 经销商的淘宝账号
     */
    private String distributorNick;

    /**
     * 结束时间 格式 yyyy-MM-dd HH:mm:ss.支持到秒的查询。若不传时分秒，默认为0时0分0秒。
     */
    private Date endCreated;

    /**
     * 多个字段用","分隔。 fields 如果为空：返回所有采购单对象(purchase_orders)字段。
     * 如果不为空：返回指定采购单对象
     * (purchase_orders)字段。例如：trade_monitors.item_title表示只返回item_title
     */
    private String fields;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 页码。（大于0的整数。小于1按1计）
     */
    private Long pageNo;

    /**
     * 每页条数。（每页条数不超过50条，超过50或小于0均按50计）
     */
    private Long pageSize;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 起始时间 格式 yyyy-MM-dd HH:mm:ss.支持到秒的查询。若不传时分秒，默认为0时0分0秒。
     */
    private Date startCreated;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
    }

    @Override
    public String getApiMethodName() {
        return "taobao.fenxiao.trademonitor.get";
    }

    public String getDistributorNick() {
        return this.distributorNick;
    }

    public Date getEndCreated() {
        return this.endCreated;
    }

    public String getFields() {
        return this.fields;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public Long getProductId() {
        return this.productId;
    }

    @Override
    public Class<FenxiaoTrademonitorGetResponse> getResponseClass() {
        return FenxiaoTrademonitorGetResponse.class;
    }

    public Date getStartCreated() {
        return this.startCreated;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("distributor_nick", this.distributorNick);
        txtParams.put("end_created", this.endCreated);
        txtParams.put("fields", this.fields);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("product_id", this.productId);
        txtParams.put("start_created", this.startCreated);
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

    public void setDistributorNick(String distributorNick) {
        this.distributorNick = distributorNick;
    }

    public void setEndCreated(Date endCreated) {
        this.endCreated = endCreated;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setStartCreated(Date startCreated) {
        this.startCreated = startCreated;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
