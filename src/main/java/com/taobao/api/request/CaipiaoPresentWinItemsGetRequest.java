package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CaipiaoPresentWinItemsGetResponse;

/**
 * TOP API: taobao.caipiao.present.win.items.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:33
 */
public class CaipiaoPresentWinItemsGetRequest implements
        TaobaoRequest<CaipiaoPresentWinItemsGetResponse> {

    /**
     * 查询日期，格式请严格遵守yyyy-MM-dd
     */
    private String date;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 查询个数，最大值为500.如果为空、0和负数，则取默认值500
     */
    private Long num;

    /**
     * 查询页码，空，零，负的情况默认为1（注意每页数据量为50）
     */
    private Long pageNo;

    /**
     * 0：查询中奖订单，1：查询所有订单，默认为0，注意按列表数量查询只会查询中奖订单。
     */
    private Long searchType;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
    }

    @Override
    public String getApiMethodName() {
        return "taobao.caipiao.present.win.items.get";
    }

    public String getDate() {
        return this.date;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getNum() {
        return this.num;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    @Override
    public Class<CaipiaoPresentWinItemsGetResponse> getResponseClass() {
        return CaipiaoPresentWinItemsGetResponse.class;
    }

    public Long getSearchType() {
        return this.searchType;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("date", this.date);
        txtParams.put("num", this.num);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("search_type", this.searchType);
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

    public void setDate(String date) {
        this.date = date;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public void setSearchType(Long searchType) {
        this.searchType = searchType;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
