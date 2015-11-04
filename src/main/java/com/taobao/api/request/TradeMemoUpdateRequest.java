package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TradeMemoUpdateResponse;

/**
 * TOP API: taobao.trade.memo.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class TradeMemoUpdateRequest implements TaobaoRequest<TradeMemoUpdateResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 卖家交易备注旗帜，可选值为：0(灰色), 1(红色), 2(黄色), 3(绿色), 4(蓝色), 5(粉红色)，默认值为0<br />
     * 支持最大值为：5<br />
     * 支持最小值为：0
     */
    private Long flag;

    /**
     * 卖家交易备注。最大长度: 1000个字节
     */
    private String memo;

    /**
     * 是否对memo的值置空 若为true，则不管传入的memo字段的值是否为空，都将会对已有的memo值清空，慎用；
     * 若用false，则会根据memo是否为空来修改memo的值
     * ：若memo为空则忽略对已有memo字段的修改，若memo非空，则使用新传入的memo覆盖已有的memo的值
     */
    private Boolean reset;

    /**
     * 交易编号
     */
    private Long tid;

    public void setFlag(Long flag) {
        this.flag = flag;
    }

    public Long getFlag() {
        return this.flag;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setReset(Boolean reset) {
        this.reset = reset;
    }

    public Boolean getReset() {
        return this.reset;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Long getTid() {
        return this.tid;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.trade.memo.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("flag", this.flag);
        txtParams.put("memo", this.memo);
        txtParams.put("reset", this.reset);
        txtParams.put("tid", this.tid);
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

    public Class<TradeMemoUpdateResponse> getResponseClass() {
        return TradeMemoUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxValue(flag, 5L, "flag");
        RequestCheckUtils.checkMinValue(flag, 0L, "flag");
        RequestCheckUtils.checkNotEmpty(tid, "tid");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
