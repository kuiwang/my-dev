package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsInfoGetResponse;

/**
 * TOP API: taobao.logistics.info.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class LogisticsInfoGetRequest implements TaobaoRequest<LogisticsInfoGetResponse> {

    /**
     * 平台异常码
     */
    private Long abCnCode;

    /**
     * 快递公司自有异常码，与物流宝对接的一致
     */
    private String abCpCode;

    /**
     * 快递公司平台码，顺丰(SF)、EMS(标准快递：EMS；经济快件：EYB)、宅急送(ZJS)、圆通(YTO)、中通(ZTO)、百世汇通(
     * HTKY)、申通(STO)、天天快递 (TTKDEX)
     */
    private String cpCode;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 是否为电子面单
     */
    private Boolean isWaybill;

    /**
     * 运单号
     */
    private String mailNo;

    /**
     * 订单id
     */
    private String tid;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(abCnCode, "abCnCode");
        RequestCheckUtils.checkNotEmpty(abCpCode, "abCpCode");
        RequestCheckUtils.checkNotEmpty(cpCode, "cpCode");
        RequestCheckUtils.checkNotEmpty(isWaybill, "isWaybill");
        RequestCheckUtils.checkNotEmpty(mailNo, "mailNo");
    }

    public Long getAbCnCode() {
        return this.abCnCode;
    }

    public String getAbCpCode() {
        return this.abCpCode;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.logistics.info.get";
    }

    public String getCpCode() {
        return this.cpCode;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Boolean getIsWaybill() {
        return this.isWaybill;
    }

    public String getMailNo() {
        return this.mailNo;
    }

    @Override
    public Class<LogisticsInfoGetResponse> getResponseClass() {
        return LogisticsInfoGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("ab_cn_code", this.abCnCode);
        txtParams.put("ab_cp_code", this.abCpCode);
        txtParams.put("cp_code", this.cpCode);
        txtParams.put("is_waybill", this.isWaybill);
        txtParams.put("mail_no", this.mailNo);
        txtParams.put("tid", this.tid);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public String getTid() {
        return this.tid;
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

    public void setAbCnCode(Long abCnCode) {
        this.abCnCode = abCnCode;
    }

    public void setAbCpCode(String abCpCode) {
        this.abCpCode = abCpCode;
    }

    public void setCpCode(String cpCode) {
        this.cpCode = cpCode;
    }

    public void setIsWaybill(Boolean isWaybill) {
        this.isWaybill = isWaybill;
    }

    public void setMailNo(String mailNo) {
        this.mailNo = mailNo;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
