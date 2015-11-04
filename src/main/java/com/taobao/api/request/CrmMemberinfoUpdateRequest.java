package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CrmMemberinfoUpdateResponse;

/**
 * TOP API: taobao.crm.memberinfo.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:27
 */
public class CrmMemberinfoUpdateRequest implements TaobaoRequest<CrmMemberinfoUpdateResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 买家昵称<br />
     * 支持最大长度为：32<br />
     * 支持的最大列表长度为：32
     */
    private String buyerNick;

    /**
     * 城市. 请注意:从2014.4.15之后,省市将采用地区标准码,请通过物流API
     * taobao.areas.get接口获取,参考:http
     * ://api.taobao.com/apidoc/api.htm?spm=0.0.0
     * .0.nOOF9g&path=cid:7-apiId:59.API对于老的省市代码兼容会逐步下线
     */
    private String city;

    /**
     * 交易关闭金额，单位：分
     */
    private Long closeTradeAmount;

    /**
     * 交易关闭次数
     */
    private Long closeTradeCount;

    /**
     * 会员等级，1：普通客户，2：高级会员，3：高级会员 ，4：至尊vip
     * 
     * 只有正常会员才给予升级，对于status blacklist的会员升级无效<br />
     * 支持最大值为：4<br />
     * 支持最小值为：1<br />
     * 支持的最大列表长度为：32
     */
    private Long grade;

    /**
     * 分组的id集合字符串
     */
    private String groupIds;

    /**
     * 宝贝件数
     */
    private Long itemNum;

    /**
     * 北京=1,天津=2,河北省=3,山西省=4,内蒙古自治区=5,辽宁省=6,吉林省=7,黑龙江省=8,上海=9,江苏省=10,浙江省=11
     * ,安徽省=12,福建省=13,江西省=14,山东省=15,河南省=16,湖北省=17,湖南省=18,
     * 广东省=19,广西壮族自治区=20,
     * 海南省=21,重庆=22,四川省=23,贵州省=24,云南省=25,西藏自治区=26,陕西省=27,甘肃省
     * =28,青海省=29,宁夏回族自治区
     * =30,新疆维吾尔自治区=31,台湾省=32,香港特别行政区=33,澳门特别行政区=34,海外=35，
     * 约定36为清除Province设置. 请注意:从2014.4.15之后,省市将采用地区标准码,请通过物流API
     * taobao.areas.
     * get接口获取,参考:http://api.taobao.com/apidoc/api.htm?spm=0.0.0
     * .0.nOOF9g&path=cid:7-apiId:59.API对于老的省市代码兼容会逐步下线.
     */
    private String province;

    /**
     * 用于描述会员的状态，normal表示正常，blacklist表示黑名单(不享受会员折扣).<br />
     * 支持最大长度为：32<br />
     * 支持的最大列表长度为：32
     */
    private String status;

    /**
     * 交易金额，单位：分
     */
    private Long tradeAmount;

    /**
     * 交易笔数
     */
    private Long tradeCount;

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public String getBuyerNick() {
        return this.buyerNick;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    public void setCloseTradeAmount(Long closeTradeAmount) {
        this.closeTradeAmount = closeTradeAmount;
    }

    public Long getCloseTradeAmount() {
        return this.closeTradeAmount;
    }

    public void setCloseTradeCount(Long closeTradeCount) {
        this.closeTradeCount = closeTradeCount;
    }

    public Long getCloseTradeCount() {
        return this.closeTradeCount;
    }

    public void setGrade(Long grade) {
        this.grade = grade;
    }

    public Long getGrade() {
        return this.grade;
    }

    public void setGroupIds(String groupIds) {
        this.groupIds = groupIds;
    }

    public String getGroupIds() {
        return this.groupIds;
    }

    public void setItemNum(Long itemNum) {
        this.itemNum = itemNum;
    }

    public Long getItemNum() {
        return this.itemNum;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvince() {
        return this.province;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setTradeAmount(Long tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public Long getTradeAmount() {
        return this.tradeAmount;
    }

    public void setTradeCount(Long tradeCount) {
        this.tradeCount = tradeCount;
    }

    public Long getTradeCount() {
        return this.tradeCount;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.crm.memberinfo.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("buyer_nick", this.buyerNick);
        txtParams.put("city", this.city);
        txtParams.put("close_trade_amount", this.closeTradeAmount);
        txtParams.put("close_trade_count", this.closeTradeCount);
        txtParams.put("grade", this.grade);
        txtParams.put("group_ids", this.groupIds);
        txtParams.put("item_num", this.itemNum);
        txtParams.put("province", this.province);
        txtParams.put("status", this.status);
        txtParams.put("trade_amount", this.tradeAmount);
        txtParams.put("trade_count", this.tradeCount);
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

    public Class<CrmMemberinfoUpdateResponse> getResponseClass() {
        return CrmMemberinfoUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(buyerNick, "buyerNick");
        RequestCheckUtils.checkMaxLength(buyerNick, 32, "buyerNick");
        RequestCheckUtils.checkMaxValue(grade, 4L, "grade");
        RequestCheckUtils.checkMinValue(grade, 1L, "grade");
        RequestCheckUtils.checkNotEmpty(status, "status");
        RequestCheckUtils.checkMaxLength(status, 32, "status");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
