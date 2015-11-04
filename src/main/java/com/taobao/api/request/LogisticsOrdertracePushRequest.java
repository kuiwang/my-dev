package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsOrdertracePushResponse;

/**
 * TOP API: taobao.logistics.ordertrace.push request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class LogisticsOrdertracePushRequest implements
        TaobaoRequest<LogisticsOrdertracePushResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 物流公司名称<br />
     * 支持最大长度为：20<br />
     * 支持的最大列表长度为：20
     */
    private String companyName;

    /**
     * 流转节点的当前城市<br />
     * 支持最大长度为：20<br />
     * 支持的最大列表长度为：20
     */
    private String currentCity;

    /**
     * 网点名称<br />
     * 支持最大长度为：100<br />
     * 支持的最大列表长度为：100
     */
    private String facilityName;

    /**
     * 快递单号。各个快递公司的运单号格式不同。
     */
    private String mailNo;

    /**
     * 流转节点的下一个城市<br />
     * 支持最大长度为：20<br />
     * 支持的最大列表长度为：20
     */
    private String nextCity;

    /**
     * 描述当前节点的操作，操作是“揽收”、“派送”或“签收”。<br />
     * 支持最大长度为：20<br />
     * 支持的最大列表长度为：20
     */
    private String nodeDescription;

    /**
     * 流转节点发生时间
     */
    private Date occureTime;

    /**
     * 流转节点的详细地址及操作描述<br />
     * 支持最大长度为：200<br />
     * 支持的最大列表长度为：200
     */
    private String operateDetail;

    /**
     * 快递业务员联系方式，手机号码或电话。<br />
     * 支持最大长度为：20<br />
     * 支持的最大列表长度为：20
     */
    private String operatorContact;

    /**
     * 快递业务员名称<br />
     * 支持最大长度为：20<br />
     * 支持的最大列表长度为：20
     */
    private String operatorName;

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCurrentCity(String currentCity) {
        this.currentCity = currentCity;
    }

    public String getCurrentCity() {
        return this.currentCity;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public String getFacilityName() {
        return this.facilityName;
    }

    public void setMailNo(String mailNo) {
        this.mailNo = mailNo;
    }

    public String getMailNo() {
        return this.mailNo;
    }

    public void setNextCity(String nextCity) {
        this.nextCity = nextCity;
    }

    public String getNextCity() {
        return this.nextCity;
    }

    public void setNodeDescription(String nodeDescription) {
        this.nodeDescription = nodeDescription;
    }

    public String getNodeDescription() {
        return this.nodeDescription;
    }

    public void setOccureTime(Date occureTime) {
        this.occureTime = occureTime;
    }

    public Date getOccureTime() {
        return this.occureTime;
    }

    public void setOperateDetail(String operateDetail) {
        this.operateDetail = operateDetail;
    }

    public String getOperateDetail() {
        return this.operateDetail;
    }

    public void setOperatorContact(String operatorContact) {
        this.operatorContact = operatorContact;
    }

    public String getOperatorContact() {
        return this.operatorContact;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getOperatorName() {
        return this.operatorName;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.logistics.ordertrace.push";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("company_name", this.companyName);
        txtParams.put("current_city", this.currentCity);
        txtParams.put("facility_name", this.facilityName);
        txtParams.put("mail_no", this.mailNo);
        txtParams.put("next_city", this.nextCity);
        txtParams.put("node_description", this.nodeDescription);
        txtParams.put("occure_time", this.occureTime);
        txtParams.put("operate_detail", this.operateDetail);
        txtParams.put("operator_contact", this.operatorContact);
        txtParams.put("operator_name", this.operatorName);
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

    public Class<LogisticsOrdertracePushResponse> getResponseClass() {
        return LogisticsOrdertracePushResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(companyName, "companyName");
        RequestCheckUtils.checkMaxLength(companyName, 20, "companyName");
        RequestCheckUtils.checkMaxLength(currentCity, 20, "currentCity");
        RequestCheckUtils.checkMaxLength(facilityName, 100, "facilityName");
        RequestCheckUtils.checkNotEmpty(mailNo, "mailNo");
        RequestCheckUtils.checkMaxLength(nextCity, 20, "nextCity");
        RequestCheckUtils.checkMaxLength(nodeDescription, 20, "nodeDescription");
        RequestCheckUtils.checkNotEmpty(occureTime, "occureTime");
        RequestCheckUtils.checkNotEmpty(operateDetail, "operateDetail");
        RequestCheckUtils.checkMaxLength(operateDetail, 200, "operateDetail");
        RequestCheckUtils.checkMaxLength(operatorContact, 20, "operatorContact");
        RequestCheckUtils.checkMaxLength(operatorName, 20, "operatorName");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
