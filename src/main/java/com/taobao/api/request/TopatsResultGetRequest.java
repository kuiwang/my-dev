package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TopatsResultGetResponse;

/**
 * TOP API: taobao.topats.result.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:12
 */
public class TopatsResultGetRequest implements TaobaoRequest<TopatsResultGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 任务id号，创建任务时返回的task_id
     */
    private Long taskId;

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getTaskId() {
        return this.taskId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.topats.result.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("task_id", this.taskId);
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

    public Class<TopatsResultGetResponse> getResponseClass() {
        return TopatsResultGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(taskId, "taskId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
