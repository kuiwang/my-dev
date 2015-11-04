package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallLatoGameRechargeResponse;

/**
 * TOP API: tmall.lato.game.recharge request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:51
 */
public class TmallLatoGameRechargeRequest implements TaobaoRequest<TmallLatoGameRechargeResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 交易号
     */
    private String bizNo;

    /**
     * 充值积分数值
     */
    private Long point;

    /**
     * 购买内容
     */
    private String target;

    /**
     * 用户id
     */
    private Long uid;

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo;
    }

    public String getBizNo() {
        return this.bizNo;
    }

    public void setPoint(Long point) {
        this.point = point;
    }

    public Long getPoint() {
        return this.point;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getTarget() {
        return this.target;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getUid() {
        return this.uid;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "tmall.lato.game.recharge";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("biz_no", this.bizNo);
        txtParams.put("point", this.point);
        txtParams.put("target", this.target);
        txtParams.put("uid", this.uid);
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

    public Class<TmallLatoGameRechargeResponse> getResponseClass() {
        return TmallLatoGameRechargeResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(bizNo, "bizNo");
        RequestCheckUtils.checkNotEmpty(point, "point");
        RequestCheckUtils.checkNotEmpty(uid, "uid");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
