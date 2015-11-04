package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.JipiaoPoliciesstatusUpdateResponse;

/**
 * TOP API: taobao.jipiao.policiesstatus.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:22
 */
public class JipiaoPoliciesstatusUpdateRequest implements
        TaobaoRequest<JipiaoPoliciesstatusUpdateResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 航空公司二字码<br />
     * 支持最大长度为：5<br />
     * 支持的最大列表长度为：5
     */
    private String airline;

    /**
     * 到达机场三字码,此项必需与出发机场同时为空或不为空<br />
     * 支持最大长度为：3<br />
     * 支持的最大列表长度为：3
     */
    private String arrAirport;

    /**
     * 出发机场三字码,此项必需与到达机场同时为空或不为空<br />
     * 支持最大长度为：3<br />
     * 支持的最大列表长度为：3
     */
    private String depAirport;

    /**
     * 外部产品id集,最多支持1000个,后续调大,其中的out_product_id含有空格将不会处理
     */
    private String outProductIds;

    /**
     * 产品id集,最多支持1000个，后续调大，其中单个的policy_id含有留空格或不是数字将会忽略不处理
     */
    private String policyIds;

    /**
     * 发布日期
     */
    private String publishDate;

    /**
     * 发布来源, 通过接口taobao.jipiao.policy.process添加的政策会自动加上source为TOP,
     * 代理商后台页面录入的source为PC
     * ,excel上传的source为UPLOAD,通过接口taobao.jipiao.policies.
     * fulladd,taobao.jipiao.policies.add的自定义source也可以<br />
     * 支持最大长度为：20<br />
     * 支持的最大列表长度为：20
     */
    private String source;

    /**
     * 0：按policy_ids更新；1：按out_product_ids更新；2:按其它条件更新
     */
    private Long type;

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getAirline() {
        return this.airline;
    }

    public void setArrAirport(String arrAirport) {
        this.arrAirport = arrAirport;
    }

    public String getArrAirport() {
        return this.arrAirport;
    }

    public void setDepAirport(String depAirport) {
        this.depAirport = depAirport;
    }

    public String getDepAirport() {
        return this.depAirport;
    }

    public void setOutProductIds(String outProductIds) {
        this.outProductIds = outProductIds;
    }

    public String getOutProductIds() {
        return this.outProductIds;
    }

    public void setPolicyIds(String policyIds) {
        this.policyIds = policyIds;
    }

    public String getPolicyIds() {
        return this.policyIds;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getPublishDate() {
        return this.publishDate;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return this.source;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getType() {
        return this.type;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.jipiao.policiesstatus.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("airline", this.airline);
        txtParams.put("arr_airport", this.arrAirport);
        txtParams.put("dep_airport", this.depAirport);
        txtParams.put("out_product_ids", this.outProductIds);
        txtParams.put("policy_ids", this.policyIds);
        txtParams.put("publish_date", this.publishDate);
        txtParams.put("source", this.source);
        txtParams.put("type", this.type);
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

    public Class<JipiaoPoliciesstatusUpdateResponse> getResponseClass() {
        return JipiaoPoliciesstatusUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxLength(airline, 5, "airline");
        RequestCheckUtils.checkMaxLength(arrAirport, 3, "arrAirport");
        RequestCheckUtils.checkMaxLength(depAirport, 3, "depAirport");
        RequestCheckUtils.checkMaxLength(source, 20, "source");
        RequestCheckUtils.checkNotEmpty(type, "type");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
