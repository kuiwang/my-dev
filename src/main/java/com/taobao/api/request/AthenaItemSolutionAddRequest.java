package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AthenaItemSolutionAddResponse;

/**
 * TOP API: taobao.athena.item.solution.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:51
 */
public class AthenaItemSolutionAddRequest implements TaobaoRequest<AthenaItemSolutionAddResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 商品ID<br />
     * 支持的最大列表长度为：64
     */
    private Long itemId;

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

    /**
     * 关联 athena_item_knowledge_type 表的 type_key字段<br />
     * 支持最大长度为：64<br />
     * 支持的最大列表长度为：64
     */
    private String typeKey;

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return this.question;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getSolution() {
        return this.solution;
    }

    public void setSolutionLevel(Long solutionLevel) {
        this.solutionLevel = solutionLevel;
    }

    public Long getSolutionLevel() {
        return this.solutionLevel;
    }

    public void setSolutionStf(String solutionStf) {
        this.solutionStf = solutionStf;
    }

    public String getSolutionStf() {
        return this.solutionStf;
    }

    public void setTypeKey(String typeKey) {
        this.typeKey = typeKey;
    }

    public String getTypeKey() {
        return this.typeKey;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.athena.item.solution.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("item_id", this.itemId);
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

    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public Class<AthenaItemSolutionAddResponse> getResponseClass() {
        return AthenaItemSolutionAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(itemId, "itemId");
        RequestCheckUtils.checkNotEmpty(question, "question");
        RequestCheckUtils.checkNotEmpty(solution, "solution");
        RequestCheckUtils.checkMaxLength(solution, 1024, "solution");
        RequestCheckUtils.checkNotEmpty(solutionLevel, "solutionLevel");
        RequestCheckUtils.checkNotEmpty(solutionStf, "solutionStf");
        RequestCheckUtils.checkMaxLength(solutionStf, 1024, "solutionStf");
        RequestCheckUtils.checkNotEmpty(typeKey, "typeKey");
        RequestCheckUtils.checkMaxLength(typeKey, 64, "typeKey");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
