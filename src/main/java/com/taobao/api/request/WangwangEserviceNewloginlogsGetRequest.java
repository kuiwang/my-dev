package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WangwangEserviceNewloginlogsGetResponse;

/**
 * TOP API: taobao.wangwang.eservice.newloginlogs.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:12
 */
public class WangwangEserviceNewloginlogsGetRequest implements
        TaobaoRequest<WangwangEserviceNewloginlogsGetResponse> {

    /**
     * 查询登录日志的开始日期，必须按示例的格式，否则会返回错误； 开始时间不能在当前时间30天前，开始时间和结束时间的间隔不能超过7天；
     * 开始时间不能超过当前系统时间
     */
    private String btime;

    /**
     * 查询登录日志的结束时间，必须按示例的格式，否则会返回错误； 结束时间不能小于开始时间，结束时间和开始时间的间隔不能超过7天
     */
    private String etime;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 需要查询登录日志的账号列表，多个id之间用逗号隔开，每次查询的id数不能超过30个
     */
    private String queryIds;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(btime, "btime");
        RequestCheckUtils.checkNotEmpty(etime, "etime");
        RequestCheckUtils.checkNotEmpty(queryIds, "queryIds");
        RequestCheckUtils.checkMaxListSize(queryIds, 30, "queryIds");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.wangwang.eservice.newloginlogs.get";
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

    public String getQueryIds() {
        return this.queryIds;
    }

    @Override
    public Class<WangwangEserviceNewloginlogsGetResponse> getResponseClass() {
        return WangwangEserviceNewloginlogsGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("btime", this.btime);
        txtParams.put("etime", this.etime);
        txtParams.put("query_ids", this.queryIds);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
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

    public void setBtime(String btime) {
        this.btime = btime;
    }

    public void setEtime(String etime) {
        this.etime = etime;
    }

    public void setQueryIds(String queryIds) {
        this.queryIds = queryIds;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
