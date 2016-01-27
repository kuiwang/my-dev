package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WangwangEserviceAccountstatusGetResponse;

/**
 * TOP API: taobao.wangwang.eservice.accountstatus.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:12
 */
public class WangwangEserviceAccountstatusGetRequest implements
        TaobaoRequest<WangwangEserviceAccountstatusGetResponse> {

    /**
     * 的起始时间。</br> 格式为： YYYY-mm-dd_HH:MM:SS </br> 注：</br> 1. 查询时间必须在30天之内。
     * 2. 起始时间和结束时间间隔不超过7天。<br />
     * 支持最大长度为：19<br />
     * 支持的最大列表长度为：19
     */
    private String btime;

    /**
     * 结束时间 。 </br> 格式为：YYYY-mm-dd_HH:MM:SS </br> 注：</br> 1. 查询时间必须在30天之内。
     * 2. 起始时间和结束时间间隔不超过7天。<br />
     * 支持最大长度为：19<br />
     * 支持的最大列表长度为：19
     */
    private String etime;

    private Map<String, String> headerMap = new TaobaoHashMap();

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    /**
     * 查询账号（序列）。 需要带前缀（如cntaobao）。</br>
     * 
     * 注： </br> 1. uid中所有账号必须为授权店铺的店铺内账号。</br> 2.
     * 如果传入多个账号，账号与账号之间以","分割。最多30个账号。每个账号的最大长度是64。</br> 3.
     * 由于后端依然是顺序请求，所以该接口的响应时长是会随uid的数量线性增长，即uid数量越多，调用时间越长。请合理使用<br />
     * 支持最大长度为：1920<br />
     * 支持的最大列表长度为：1920
     */
    private String uid;

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(btime, "btime");
        RequestCheckUtils.checkMaxLength(btime, 19, "btime");
        RequestCheckUtils.checkNotEmpty(etime, "etime");
        RequestCheckUtils.checkMaxLength(etime, 19, "etime");
        RequestCheckUtils.checkNotEmpty(uid, "uid");
        RequestCheckUtils.checkMaxListSize(uid, 30, "uid");
        RequestCheckUtils.checkMaxLength(uid, 1920, "uid");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.wangwang.eservice.accountstatus.get";
    }

    public String getBtime() {
        return this.btime;
    }

    public String getEtime() {
        return this.etime;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<WangwangEserviceAccountstatusGetResponse> getResponseClass() {
        return WangwangEserviceAccountstatusGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("btime", this.btime);
        txtParams.put("etime", this.etime);
        txtParams.put("uid", this.uid);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getUid() {
        return this.uid;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setBtime(String btime) {
        this.btime = btime;
    }

    public void setEtime(String etime) {
        this.etime = etime;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
