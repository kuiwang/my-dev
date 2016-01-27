package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TradeMemoAddResponse;

/**
 * TOP API: taobao.trade.memo.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class TradeMemoAddRequest implements TaobaoRequest<TradeMemoAddResponse> {

    /**
     * 交易备注旗帜，可选值为：0(灰色), 1(红色), 2(黄色), 3(绿色), 4(蓝色), 5(粉红色)，默认值为0<br />
     * 支持最大值为：5<br />
     * 支持最小值为：0
     */
    private Long flag;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 交易备注。最大长度: 1000个字节
     */
    private String memo;

    /**
     * 交易编号
     */
    private Long tid;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxValue(flag, 5L, "flag");
        RequestCheckUtils.checkMinValue(flag, 0L, "flag");
        RequestCheckUtils.checkNotEmpty(memo, "memo");
        RequestCheckUtils.checkNotEmpty(tid, "tid");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.trade.memo.add";
    }

    public Long getFlag() {
        return this.flag;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getMemo() {
        return this.memo;
    }

    @Override
    public Class<TradeMemoAddResponse> getResponseClass() {
        return TradeMemoAddResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("flag", this.flag);
        txtParams.put("memo", this.memo);
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

    public void setFlag(Long flag) {
        this.flag = flag;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
