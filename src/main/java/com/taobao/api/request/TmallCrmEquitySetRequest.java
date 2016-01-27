package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallCrmEquitySetResponse;

/**
 * TOP API: tmall.crm.equity.set request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:27
 */
public class TmallCrmEquitySetRequest implements TaobaoRequest<TmallCrmEquitySetResponse> {

    /**
     * 不免邮区域，只在包邮条件设置的时候生效。要和等级一一对应。包邮条件为false的时候不起作用。
     */
    private String excludeArea;

    /**
     * 会员等级，用逗号分隔。买家会员级别0：店铺客户 1：普通会员 2 ：高级会员 3：VIP会员 4：至尊VIP<br />
     * 支持最大值为：4<br />
     * 支持最小值为：1
     */
    private String grade;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 返几倍天猫积分，可以不设置。如果设置则要和等级一一对应。不设置代表清空。
     */
    private String point;

    /**
     * 是否包邮，可以不设置，如果设置则要和等级一一对应。不设置代表清空
     */
    private String postage;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxListSize(excludeArea, 4, "excludeArea");
        RequestCheckUtils.checkNotEmpty(grade, "grade");
        RequestCheckUtils.checkMaxListSize(grade, 4, "grade");
        RequestCheckUtils.checkMaxListSize(point, 4, "point");
        RequestCheckUtils.checkMaxListSize(postage, 4, "postage");
    }

    @Override
    public String getApiMethodName() {
        return "tmall.crm.equity.set";
    }

    public String getExcludeArea() {
        return this.excludeArea;
    }

    public String getGrade() {
        return this.grade;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getPoint() {
        return this.point;
    }

    public String getPostage() {
        return this.postage;
    }

    @Override
    public Class<TmallCrmEquitySetResponse> getResponseClass() {
        return TmallCrmEquitySetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("exclude_area", this.excludeArea);
        txtParams.put("grade", this.grade);
        txtParams.put("point", this.point);
        txtParams.put("postage", this.postage);
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

    public void setExcludeArea(String excludeArea) {
        this.excludeArea = excludeArea;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public void setPostage(String postage) {
        this.postage = postage;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
