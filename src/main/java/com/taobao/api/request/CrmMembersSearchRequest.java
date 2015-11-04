package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CrmMembersSearchResponse;

/**
 * TOP API: taobao.crm.members.search request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:27
 */
public class CrmMembersSearchRequest implements TaobaoRequest<CrmMembersSearchResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 买家昵称<br />
     * 支持最大长度为：1000<br />
     * 支持的最大列表长度为：1000
     */
    private String buyerNick;

    /**
     * 城市. 请注意:该字段从2014-4-23之后不再支持作为搜索条件检索.
     */
    private String city;

    /**
     * 显示第几页的会员，如果输入的页码大于总共的页码数，例如总共10页，但是current_page的值为11，则返回空白页，最小页数为1.
     * 最大1000页<br />
     * 支持最大值为：1000<br />
     * 支持最小值为：1
     */
    private Long currentPage;

    /**
     * 会员等级，0：店铺客户，1：普通客户，2：高级会员，3：VIP会员, 4：至尊VIP会员<br />
     * 支持最大值为：4<br />
     * 支持最小值为：-1<br />
     * 支持的最大列表长度为：32
     */
    private Long grade;

    /**
     * 分组id<br />
     * 支持的最大列表长度为：19
     */
    private Long groupId;

    /**
     * 最大平均客单价，单位为元. 请注意:该字段从2014-4-23之后不再支持作为搜索条件检索.
     */
    private String maxAvgPrice;

    /**
     * 最大交易关闭笔数. 请注意:该字段从2014-4-23之后不再支持作为搜索条件检索.<br />
     * 支持最小值为：0
     */
    private Long maxCloseTradeNum;

    /**
     * 最大交易宝贝件数<br />
     * 支持最小值为：0
     */
    private Long maxItemNum;

    /**
     * 最迟上次交易时间
     */
    private Date maxLastTradeTime;

    /**
     * 最大交易额，单位为元
     */
    private String maxTradeAmount;

    /**
     * 最大交易量<br />
     * 支持最小值为：0
     */
    private Long maxTradeCount;

    /**
     * 最少平均客单价，单位为元. 请注意:该字段从2014-4-23之后不再支持作为搜索条件检索.
     */
    private String minAvgPrice;

    /**
     * 最小交易关闭的笔数. 请注意:该字段从2014-4-23之后不再支持作为搜索条件检索.<br />
     * 支持最小值为：0
     */
    private Long minCloseTradeNum;

    /**
     * 最小交易宝贝件数<br />
     * 支持最小值为：0
     */
    private Long minItemNum;

    /**
     * 最早上次交易时间
     */
    private Date minLastTradeTime;

    /**
     * 最小交易额，单位为元
     */
    private String minTradeAmount;

    /**
     * 最小交易量<br />
     * 支持最小值为：0
     */
    private Long minTradeCount;

    /**
     * 每页显示的会员数量，page_size的最大值不能超过100，最小值不能小于1<br />
     * 支持最大值为：100<br />
     * 支持最小值为：1
     */
    private Long pageSize;

    /**
     * 北京=1,天津=2,河北省=3,山西省=4,内蒙古自治区=5,辽宁省=6,吉林省=7,黑龙江省=8,上海=9,江苏省=10,浙江省=11
     * ,安徽省=12,福建省=13,江西省=14,山东省=15,河南省=16,湖北省=17,湖南省=18,
     * 广东省=19,广西壮族自治区=20,
     * 海南省=21,重庆=22,四川省=23,贵州省=24,云南省=25,西藏自治区26,陕西省=27,甘肃省
     * =28,青海省=29,宁夏回族自治区
     * =30,新疆维吾尔自治区=31,台湾省=32,香港特别行政区=33,澳门特别行政区=34,海外=35.
     * 注:请注意:从2014.4.23之后,省市将采用地区标准码,请通过物流API
     * taobao.areas.get接口获取,参考:http:/
     * /api.taobao.com/apidoc/api.htm?spm=0.0.0
     * .0.nOOF9g&path=cid:7-apiId:59.API对于老的省市代码兼容会逐步下线.<br />
     * 支持最大值为：1000000<br />
     * 支持最小值为：1
     */
    private Long province;

    /**
     * 关系来源，1交易成功，2未成交，3卖家手动吸纳<br />
     * 支持最大值为：3<br />
     * 支持最小值为：1<br />
     * 支持的最大列表长度为：32
     */
    private Long relationSource;

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

    public void setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
    }

    public Long getCurrentPage() {
        return this.currentPage;
    }

    public void setGrade(Long grade) {
        this.grade = grade;
    }

    public Long getGrade() {
        return this.grade;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public void setMaxAvgPrice(String maxAvgPrice) {
        this.maxAvgPrice = maxAvgPrice;
    }

    public String getMaxAvgPrice() {
        return this.maxAvgPrice;
    }

    public void setMaxCloseTradeNum(Long maxCloseTradeNum) {
        this.maxCloseTradeNum = maxCloseTradeNum;
    }

    public Long getMaxCloseTradeNum() {
        return this.maxCloseTradeNum;
    }

    public void setMaxItemNum(Long maxItemNum) {
        this.maxItemNum = maxItemNum;
    }

    public Long getMaxItemNum() {
        return this.maxItemNum;
    }

    public void setMaxLastTradeTime(Date maxLastTradeTime) {
        this.maxLastTradeTime = maxLastTradeTime;
    }

    public Date getMaxLastTradeTime() {
        return this.maxLastTradeTime;
    }

    public void setMaxTradeAmount(String maxTradeAmount) {
        this.maxTradeAmount = maxTradeAmount;
    }

    public String getMaxTradeAmount() {
        return this.maxTradeAmount;
    }

    public void setMaxTradeCount(Long maxTradeCount) {
        this.maxTradeCount = maxTradeCount;
    }

    public Long getMaxTradeCount() {
        return this.maxTradeCount;
    }

    public void setMinAvgPrice(String minAvgPrice) {
        this.minAvgPrice = minAvgPrice;
    }

    public String getMinAvgPrice() {
        return this.minAvgPrice;
    }

    public void setMinCloseTradeNum(Long minCloseTradeNum) {
        this.minCloseTradeNum = minCloseTradeNum;
    }

    public Long getMinCloseTradeNum() {
        return this.minCloseTradeNum;
    }

    public void setMinItemNum(Long minItemNum) {
        this.minItemNum = minItemNum;
    }

    public Long getMinItemNum() {
        return this.minItemNum;
    }

    public void setMinLastTradeTime(Date minLastTradeTime) {
        this.minLastTradeTime = minLastTradeTime;
    }

    public Date getMinLastTradeTime() {
        return this.minLastTradeTime;
    }

    public void setMinTradeAmount(String minTradeAmount) {
        this.minTradeAmount = minTradeAmount;
    }

    public String getMinTradeAmount() {
        return this.minTradeAmount;
    }

    public void setMinTradeCount(Long minTradeCount) {
        this.minTradeCount = minTradeCount;
    }

    public Long getMinTradeCount() {
        return this.minTradeCount;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setProvince(Long province) {
        this.province = province;
    }

    public Long getProvince() {
        return this.province;
    }

    public void setRelationSource(Long relationSource) {
        this.relationSource = relationSource;
    }

    public Long getRelationSource() {
        return this.relationSource;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.crm.members.search";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("buyer_nick", this.buyerNick);
        txtParams.put("city", this.city);
        txtParams.put("current_page", this.currentPage);
        txtParams.put("grade", this.grade);
        txtParams.put("group_id", this.groupId);
        txtParams.put("max_avg_price", this.maxAvgPrice);
        txtParams.put("max_close_trade_num", this.maxCloseTradeNum);
        txtParams.put("max_item_num", this.maxItemNum);
        txtParams.put("max_last_trade_time", this.maxLastTradeTime);
        txtParams.put("max_trade_amount", this.maxTradeAmount);
        txtParams.put("max_trade_count", this.maxTradeCount);
        txtParams.put("min_avg_price", this.minAvgPrice);
        txtParams.put("min_close_trade_num", this.minCloseTradeNum);
        txtParams.put("min_item_num", this.minItemNum);
        txtParams.put("min_last_trade_time", this.minLastTradeTime);
        txtParams.put("min_trade_amount", this.minTradeAmount);
        txtParams.put("min_trade_count", this.minTradeCount);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("province", this.province);
        txtParams.put("relation_source", this.relationSource);
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

    public Class<CrmMembersSearchResponse> getResponseClass() {
        return CrmMembersSearchResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxLength(buyerNick, 1000, "buyerNick");
        RequestCheckUtils.checkNotEmpty(currentPage, "currentPage");
        RequestCheckUtils.checkMaxValue(currentPage, 1000L, "currentPage");
        RequestCheckUtils.checkMinValue(currentPage, 1L, "currentPage");
        RequestCheckUtils.checkMaxValue(grade, 4L, "grade");
        RequestCheckUtils.checkMinValue(grade, -1L, "grade");
        RequestCheckUtils.checkMinValue(maxCloseTradeNum, 0L, "maxCloseTradeNum");
        RequestCheckUtils.checkMinValue(maxItemNum, 0L, "maxItemNum");
        RequestCheckUtils.checkMinValue(maxTradeCount, 0L, "maxTradeCount");
        RequestCheckUtils.checkMinValue(minCloseTradeNum, 0L, "minCloseTradeNum");
        RequestCheckUtils.checkMinValue(minItemNum, 0L, "minItemNum");
        RequestCheckUtils.checkMinValue(minTradeCount, 0L, "minTradeCount");
        RequestCheckUtils.checkMaxValue(pageSize, 100L, "pageSize");
        RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
        RequestCheckUtils.checkMaxValue(province, 1000000L, "province");
        RequestCheckUtils.checkMinValue(province, 1L, "province");
        RequestCheckUtils.checkMaxValue(relationSource, 3L, "relationSource");
        RequestCheckUtils.checkMinValue(relationSource, 1L, "relationSource");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
