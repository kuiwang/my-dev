package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CrmMembersGetResponse;

/**
 * TOP API: taobao.crm.members.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:27
 */
public class CrmMembersGetRequest implements TaobaoRequest<CrmMembersGetResponse> {

    /**
     * 买家的昵称<br />
     * 支持最大长度为：1000<br />
     * 支持的最大列表长度为：1000
     */
    private String buyerNick;

    /**
     * 显示第几页的会员，如果输入的页码大于总共的页码数，例如总共10页，但是current_page的值为11，则返回空白页，最小页数为1，
     * 最大页数为1000<br />
     * 支持最大值为：1000<br />
     * 支持最小值为：1
     */
    private Long currentPage;

    /**
     * 会员等级，0：店铺客户，1：普通会员，2：高级会员，3：VIP会员， 4：至尊VIP会员。如果不传入值则默认为全部等级。<br />
     * 支持最大值为：4<br />
     * 支持最小值为：-1<br />
     * 支持的最大列表长度为：32
     */
    private Long grade;

    private Map<String, String> headerMap = new TaobaoHashMap();

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
     * 最早上次交易时间
     */
    private Date minLastTradeTime;

    /**
     * 最小交易额,单位为元
     */
    private String minTradeAmount;

    /**
     * 最小交易量<br />
     * 支持最小值为：0
     */
    private Long minTradeCount;

    /**
     * 表示每页显示的会员数量,page_size的最大值不能超过100条,最小值不能低于1，<br />
     * 支持最大值为：100<br />
     * 支持最小值为：1
     */
    private Long pageSize;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxLength(buyerNick, 1000, "buyerNick");
        RequestCheckUtils.checkNotEmpty(currentPage, "currentPage");
        RequestCheckUtils.checkMaxValue(currentPage, 1000L, "currentPage");
        RequestCheckUtils.checkMinValue(currentPage, 1L, "currentPage");
        RequestCheckUtils.checkMaxValue(grade, 4L, "grade");
        RequestCheckUtils.checkMinValue(grade, -1L, "grade");
        RequestCheckUtils.checkMinValue(maxTradeCount, 0L, "maxTradeCount");
        RequestCheckUtils.checkMinValue(minTradeCount, 0L, "minTradeCount");
        RequestCheckUtils.checkMaxValue(pageSize, 100L, "pageSize");
        RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.crm.members.get";
    }

    public String getBuyerNick() {
        return this.buyerNick;
    }

    public Long getCurrentPage() {
        return this.currentPage;
    }

    public Long getGrade() {
        return this.grade;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Date getMaxLastTradeTime() {
        return this.maxLastTradeTime;
    }

    public String getMaxTradeAmount() {
        return this.maxTradeAmount;
    }

    public Long getMaxTradeCount() {
        return this.maxTradeCount;
    }

    public Date getMinLastTradeTime() {
        return this.minLastTradeTime;
    }

    public String getMinTradeAmount() {
        return this.minTradeAmount;
    }

    public Long getMinTradeCount() {
        return this.minTradeCount;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    @Override
    public Class<CrmMembersGetResponse> getResponseClass() {
        return CrmMembersGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("buyer_nick", this.buyerNick);
        txtParams.put("current_page", this.currentPage);
        txtParams.put("grade", this.grade);
        txtParams.put("max_last_trade_time", this.maxLastTradeTime);
        txtParams.put("max_trade_amount", this.maxTradeAmount);
        txtParams.put("max_trade_count", this.maxTradeCount);
        txtParams.put("min_last_trade_time", this.minLastTradeTime);
        txtParams.put("min_trade_amount", this.minTradeAmount);
        txtParams.put("min_trade_count", this.minTradeCount);
        txtParams.put("page_size", this.pageSize);
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

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public void setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
    }

    public void setGrade(Long grade) {
        this.grade = grade;
    }

    public void setMaxLastTradeTime(Date maxLastTradeTime) {
        this.maxLastTradeTime = maxLastTradeTime;
    }

    public void setMaxTradeAmount(String maxTradeAmount) {
        this.maxTradeAmount = maxTradeAmount;
    }

    public void setMaxTradeCount(Long maxTradeCount) {
        this.maxTradeCount = maxTradeCount;
    }

    public void setMinLastTradeTime(Date minLastTradeTime) {
        this.minLastTradeTime = minLastTradeTime;
    }

    public void setMinTradeAmount(String minTradeAmount) {
        this.minTradeAmount = minTradeAmount;
    }

    public void setMinTradeCount(Long minTradeCount) {
        this.minTradeCount = minTradeCount;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
