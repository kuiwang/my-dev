package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WeitaoFeedsGetResponse;

/**
 * TOP API: taobao.weitao.feeds.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:49
 */
public class WeitaoFeedsGetRequest implements TaobaoRequest<WeitaoFeedsGetResponse> {

    /**
     * 翻页时当前页，如果time_stamp参数不设置，此值必需传入
     */
    private Long currentPage;

    /**
     * 向前后翻页，direction=1，向上翻;direction=0 向下翻<br />
     * 支持最大值为：1<br />
     * 支持最小值为：0<br />
     * 支持的最大列表长度为：2
     */
    private Long direction;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 翻页查询一页大小<br />
     * 支持最大值为：100<br />
     * 支持最小值为：1<br />
     * 支持的最大列表长度为：3
     */
    private Long pageSize;

    private Long timestamp;

    /**
     * 翻页时间戳，没有时间参数，则说明是跳页查询或者第一页，current_page有效，direction无效；有时间参数，则说明是上下翻页
     * ，current_page无效，direction有效<br />
     * 支持的最大列表长度为：15
     */
    private Long timeStamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxValue(direction, 1L, "direction");
        RequestCheckUtils.checkMinValue(direction, 0L, "direction");
        RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
        RequestCheckUtils.checkMaxValue(pageSize, 100L, "pageSize");
        RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.weitao.feeds.get";
    }

    public Long getCurrentPage() {
        return this.currentPage;
    }

    public Long getDirection() {
        return this.direction;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    @Override
    public Class<WeitaoFeedsGetResponse> getResponseClass() {
        return WeitaoFeedsGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("current_page", this.currentPage);
        txtParams.put("direction", this.direction);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("time_stamp", this.timeStamp);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public Long getTimeStamp() {
        return this.timeStamp;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
    }

    public void setDirection(Long direction) {
        this.direction = direction;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
