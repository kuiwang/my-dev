package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TraderateListAddResponse;

/**
 * TOP API: taobao.traderate.list.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class TraderateListAddRequest implements TaobaoRequest<TraderateListAddResponse> {

    /**
     * 是否匿名，卖家评不能匿名。可选值:true(匿名),false(非匿名)。 注意：如果买家匿名购买，那么买家的评价默认匿名
     */
    private Boolean anony;

    /**
     * 评价内容,最大长度: 500个汉字
     * .注意：当评价结果为good时就不用输入评价内容.评价内容为neutral/bad的时候需要输入评价内容
     */
    private String content;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 评价结果。可选值:good(好评),neutral(中评),bad(差评)
     */
    private String result;

    /**
     * 评价者角色。可选值:seller(卖家),buyer(买家)
     */
    private String role;

    /**
     * 交易ID
     */
    private Long tid;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(result, "result");
        RequestCheckUtils.checkNotEmpty(role, "role");
        RequestCheckUtils.checkNotEmpty(tid, "tid");
    }

    public Boolean getAnony() {
        return this.anony;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.traderate.list.add";
    }

    public String getContent() {
        return this.content;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<TraderateListAddResponse> getResponseClass() {
        return TraderateListAddResponse.class;
    }

    public String getResult() {
        return this.result;
    }

    public String getRole() {
        return this.role;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("anony", this.anony);
        txtParams.put("content", this.content);
        txtParams.put("result", this.result);
        txtParams.put("role", this.role);
        txtParams.put("tid", this.tid);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Long getTid() {
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

    public void setAnony(Boolean anony) {
        this.anony = anony;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
