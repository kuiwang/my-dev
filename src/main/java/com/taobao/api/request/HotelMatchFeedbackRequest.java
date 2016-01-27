package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelMatchFeedbackResponse;

/**
 * TOP API: taobao.hotel.match.feedback request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:25
 */
public class HotelMatchFeedbackRequest implements TaobaoRequest<HotelMatchFeedbackResponse> {

    /**
     * 需进行匹配的酒店id<br />
     * 支持最小值为：1
     */
    private Long haid;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 匹配命中的酒店id<br />
     * 支持最小值为：0
     */
    private Long hid;

    /**
     * 匹配结果 0:未匹配，1:匹配<br />
     * 支持最大值为：1<br />
     * 支持最小值为：0
     */
    private Long matchResult;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(haid, "haid");
        RequestCheckUtils.checkMinValue(haid, 1L, "haid");
        RequestCheckUtils.checkMinValue(hid, 0L, "hid");
        RequestCheckUtils.checkNotEmpty(matchResult, "matchResult");
        RequestCheckUtils.checkMaxValue(matchResult, 1L, "matchResult");
        RequestCheckUtils.checkMinValue(matchResult, 0L, "matchResult");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.hotel.match.feedback";
    }

    public Long getHaid() {
        return this.haid;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getHid() {
        return this.hid;
    }

    public Long getMatchResult() {
        return this.matchResult;
    }

    @Override
    public Class<HotelMatchFeedbackResponse> getResponseClass() {
        return HotelMatchFeedbackResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("haid", this.haid);
        txtParams.put("hid", this.hid);
        txtParams.put("match_result", this.matchResult);
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

    public void setHaid(Long haid) {
        this.haid = haid;
    }

    public void setHid(Long hid) {
        this.hid = hid;
    }

    public void setMatchResult(Long matchResult) {
        this.matchResult = matchResult;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
