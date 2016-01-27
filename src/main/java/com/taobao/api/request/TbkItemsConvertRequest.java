package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TbkItemsConvertResponse;

/**
 * TOP API: taobao.tbk.items.convert request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:12
 */
public class TbkItemsConvertRequest implements TaobaoRequest<TbkItemsConvertResponse> {

    /**
     * 需返回的字段列表.可选值:click_url
     */
    private String fields;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 推广者的淘宝会员昵称.注：指的是淘宝的会员登录名
     */
    private String nick;

    /**
     * 淘宝客商品数字id串.最大输入40个.格式如:"value1,value2,value3" 用" , "号分隔商品数字id
     */
    private String numIids;

    /**
     * 自定义输入串.格式:英文和数字组成;长度不能大于12个字符,区分不同的推广渠道,如:bbs,表示bbs为推广渠道;blog,
     * 表示blog为推广渠道.
     */
    private String outerCode;

    /**
     * 用户的pid,必须是mm_xxxx_0_0这种格式中间的"xxxx".
     * 注意nick和pid至少需要传递一个,如果2个都传了,将以pid为准
     * ,且pid的最大长度是20。第一次调用接口的用户，推荐该入参不要填写，使用nick=（淘宝账号）的方式去获取，以免出错。
     */
    private Long pid;

    /**
     * 点击串跳转类型，1：单品，2：单品中间页（无线暂无）
     */
    private Long referType;

    private Long timestamp;

    /**
     * 商品track_iid串（带有追踪效果的商品id),最大输入40个,与num_iids必填其一
     */
    private String trackIids;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(fields, "fields");
        RequestCheckUtils.checkMaxListSize(numIids, 50, "numIids");
        RequestCheckUtils.checkMaxListSize(trackIids, 50, "trackIids");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.tbk.items.convert";
    }

    public String getFields() {
        return this.fields;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getNick() {
        return this.nick;
    }

    public String getNumIids() {
        return this.numIids;
    }

    public String getOuterCode() {
        return this.outerCode;
    }

    public Long getPid() {
        return this.pid;
    }

    public Long getReferType() {
        return this.referType;
    }

    @Override
    public Class<TbkItemsConvertResponse> getResponseClass() {
        return TbkItemsConvertResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("fields", this.fields);
        txtParams.put("nick", this.nick);
        txtParams.put("num_iids", this.numIids);
        txtParams.put("outer_code", this.outerCode);
        txtParams.put("pid", this.pid);
        txtParams.put("refer_type", this.referType);
        txtParams.put("track_iids", this.trackIids);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getTrackIids() {
        return this.trackIids;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setNumIids(String numIids) {
        this.numIids = numIids;
    }

    public void setOuterCode(String outerCode) {
        this.outerCode = outerCode;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public void setReferType(Long referType) {
        this.referType = referType;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setTrackIids(String trackIids) {
        this.trackIids = trackIids;
    }
}
