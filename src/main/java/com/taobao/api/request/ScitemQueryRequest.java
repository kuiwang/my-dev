package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ScitemQueryResponse;

/**
 * TOP API: taobao.scitem.query request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class ScitemQueryRequest implements TaobaoRequest<ScitemQueryResponse> {

    /**
     * 条形码
     */
    private String barCode;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 商品名称
     */
    private String itemName;

    /**
     * ITEM类型(只允许输入以下英文或空) NORMAL 0:普通商品; COMBINE 1:是否是组合商品 DISTRIBUTION
     */
    private Long itemType;

    /**
     * 商家给商品的一个编码
     */
    private String outerCode;

    /**
     * 当前页码数
     */
    private Long pageIndex;

    /**
     * 分页记录个数，如果用户输入的记录数大于50，则一页显示50条记录
     */
    private Long pageSize;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    /**
     * 仓库编码
     */
    private String wmsCode;

    @Override
    public void check() throws ApiRuleException {
    }

    @Override
    public String getApiMethodName() {
        return "taobao.scitem.query";
    }

    public String getBarCode() {
        return this.barCode;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getItemName() {
        return this.itemName;
    }

    public Long getItemType() {
        return this.itemType;
    }

    public String getOuterCode() {
        return this.outerCode;
    }

    public Long getPageIndex() {
        return this.pageIndex;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    @Override
    public Class<ScitemQueryResponse> getResponseClass() {
        return ScitemQueryResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("bar_code", this.barCode);
        txtParams.put("item_name", this.itemName);
        txtParams.put("item_type", this.itemType);
        txtParams.put("outer_code", this.outerCode);
        txtParams.put("page_index", this.pageIndex);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("wms_code", this.wmsCode);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getWmsCode() {
        return this.wmsCode;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemType(Long itemType) {
        this.itemType = itemType;
    }

    public void setOuterCode(String outerCode) {
        this.outerCode = outerCode;
    }

    public void setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setWmsCode(String wmsCode) {
        this.wmsCode = wmsCode;
    }
}
