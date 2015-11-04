package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoCooperationProductcatAddResponse;

/**
 * TOP API: taobao.fenxiao.cooperation.productcat.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class FenxiaoCooperationProductcatAddRequest implements
        TaobaoRequest<FenxiaoCooperationProductcatAddResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 合作关系id
     */
    private Long cooperateId;

    /**
     * 等级ID（为空则不修改）
     */
    private Long gradeId;

    /**
     * 产品线id列表，若有多个，以逗号分隔
     */
    private String productLineList;

    public void setCooperateId(Long cooperateId) {
        this.cooperateId = cooperateId;
    }

    public Long getCooperateId() {
        return this.cooperateId;
    }

    public void setGradeId(Long gradeId) {
        this.gradeId = gradeId;
    }

    public Long getGradeId() {
        return this.gradeId;
    }

    public void setProductLineList(String productLineList) {
        this.productLineList = productLineList;
    }

    public String getProductLineList() {
        return this.productLineList;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.cooperation.productcat.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("cooperate_id", this.cooperateId);
        txtParams.put("grade_id", this.gradeId);
        txtParams.put("product_line_list", this.productLineList);
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

    public Class<FenxiaoCooperationProductcatAddResponse> getResponseClass() {
        return FenxiaoCooperationProductcatAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(cooperateId, "cooperateId");
        RequestCheckUtils.checkNotEmpty(productLineList, "productLineList");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
