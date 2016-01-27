package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TbkShopsConvertResponse;

/**
 * TOP API: taobao.tbk.shops.convert request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:12
 */
public class TbkShopsConvertRequest implements TaobaoRequest<TbkShopsConvertResponse> {

    /**
     * 需返回的字段列表.可选值:click_url.
     */
    private String fields;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 推广者的淘宝会员昵称.注：这里指的是淘宝的登录会员名
     */
    private String nick;

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
     * 卖家昵称串.最大输入10个.格式如:"value1,value2,value3" 用" , "号分隔。
     * 注意：sids和seller_nicks两个参数任意必须输入一个，如果同时输入，则以seller_nicks为准
     */
    private String sellerNicks;

    /**
     * 店铺id串.最大输入10个.格式如:"value1,value2,value3" 用" , "号分隔店铺id.
     * 注意：sids和seller_nicks两个参数任意必须输入一个，如果同时输入，则以seller_nicks为准
     */
    private String sids;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(fields, "fields");
        RequestCheckUtils.checkMaxListSize(sellerNicks, 10, "sellerNicks");
        RequestCheckUtils.checkMaxListSize(sids, 10, "sids");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.tbk.shops.convert";
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

    public String getOuterCode() {
        return this.outerCode;
    }

    public Long getPid() {
        return this.pid;
    }

    @Override
    public Class<TbkShopsConvertResponse> getResponseClass() {
        return TbkShopsConvertResponse.class;
    }

    public String getSellerNicks() {
        return this.sellerNicks;
    }

    public String getSids() {
        return this.sids;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("fields", this.fields);
        txtParams.put("nick", this.nick);
        txtParams.put("outer_code", this.outerCode);
        txtParams.put("pid", this.pid);
        txtParams.put("seller_nicks", this.sellerNicks);
        txtParams.put("sids", this.sids);
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

    public void setFields(String fields) {
        this.fields = fields;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setOuterCode(String outerCode) {
        this.outerCode = outerCode;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public void setSellerNicks(String sellerNicks) {
        this.sellerNicks = sellerNicks;
    }

    public void setSids(String sids) {
        this.sids = sids;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
