package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AthenaItemSolutionUpdateResponse;

/**
 * TOP API: taobao.athena.item.solution.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:51
 */
public class AthenaItemSolutionUpdateRequest
        implements TaobaoRequest<AthenaItemSolutionUpdateResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 自定义的问题
     */
    private String question;

    /**
     * 解决方案<br />
     * 支持最大长度为：1024<br />
     * 支持的最大列表长度为：1024
     */
    private String solution;

    /**
     * 发送状态 1半自动 2全自动
     */
    private Long solutionLevel;

    /**
     * stf 旺旺富文本格式的解决方案<br />
     * 支持最大长度为：1024<br />
     * 支持的最大列表长度为：1024
     */
    private String solutionStf;

    private Long timestamp;

    /**
     * 关联 athena_item_knowledge_type 表的 type_key字段<br />
     * 支持最大长度为：64<br />
     * 支持的最大列表长度为：64
     */
    private String typeKey;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(id, "id");
        RequestCheckUtils.checkMaxLength(solution, 1024, "solution");
        RequestCheckUtils.checkMaxLength(solutionStf, 1024, "solutionStf");
        RequestCheckUtils.checkMaxLength(typeKey, 64, "typeKey");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.athena.item.solution.update";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getId() {
        return this.id;
    }

    public String getQuestion() {
        return this.question;
    }

    @Override
    public Class<AthenaItemSolutionUpdateResponse> getResponseClass() {
        return AthenaItemSolutionUpdateResponse.class;
    }

    public String getSolution() {
        return this.solution;
    }

    public Long getSolutionLevel() {
        return this.solutionLevel;
    }

    public String getSolutionStf() {
        return this.solutionStf;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("id", this.id);
        txtParams.put("question", this.question);
        txtParams.put("solution", this.solution);
        txtParams.put("solution_level", this.solutionLevel);
        txtParams.put("solution_stf", this.solutionStf);
        txtParams.put("type_key", this.typeKey);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getTypeKey() {
        return this.typeKey;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public void setSolutionLevel(Long solutionLevel) {
        this.solutionLevel = solutionLevel;
    }

    public void setSolutionStf(String solutionStf) {
        this.solutionStf = solutionStf;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setTypeKey(String typeKey) {
        this.typeKey = typeKey;
    }
}
