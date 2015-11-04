package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 订购关系对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class ServiceSubscribe extends TaobaoObject {

    private static final long serialVersionUID = 6555635752344999125L;

    /**
     * 订购总数
     */
    @ApiField("all_num")
    private Long allNum;

    /**
     * 将要被使用的那条质检订单的价格
     */
    @ApiField("future_price")
    private String futurePrice;

    /**
     * 将要被消耗的质检订单ID
     */
    @ApiField("future_sub_id")
    private Long futureSubId;

    /**
     * 过期时间
     */
    @ApiField("gmt_expiry")
    private Date gmtExpiry;

    /**
     * 订购者昵称
     */
    @ApiField("nick")
    private String nick;

    /**
     * 服务收费项code
     */
    @ApiField("service_item_code")
    private String serviceItemCode;

    /**
     * 该用户该收费项目下面的所有的订购记录详情
     */
    @ApiListField("usage_detail_list")
    @ApiField("quality_usage_detail")
    private List<QualityUsageDetail> usageDetailList;

    /**
     * 已经使用的数量
     */
    @ApiField("used_num")
    private Long usedNum;

    public Long getAllNum() {
        return this.allNum;
    }

    public void setAllNum(Long allNum) {
        this.allNum = allNum;
    }

    public String getFuturePrice() {
        return this.futurePrice;
    }

    public void setFuturePrice(String futurePrice) {
        this.futurePrice = futurePrice;
    }

    public Long getFutureSubId() {
        return this.futureSubId;
    }

    public void setFutureSubId(Long futureSubId) {
        this.futureSubId = futureSubId;
    }

    public Date getGmtExpiry() {
        return this.gmtExpiry;
    }

    public void setGmtExpiry(Date gmtExpiry) {
        this.gmtExpiry = gmtExpiry;
    }

    public String getNick() {
        return this.nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getServiceItemCode() {
        return this.serviceItemCode;
    }

    public void setServiceItemCode(String serviceItemCode) {
        this.serviceItemCode = serviceItemCode;
    }

    public List<QualityUsageDetail> getUsageDetailList() {
        return this.usageDetailList;
    }

    public void setUsageDetailList(List<QualityUsageDetail> usageDetailList) {
        this.usageDetailList = usageDetailList;
    }

    public Long getUsedNum() {
        return this.usedNum;
    }

    public void setUsedNum(Long usedNum) {
        this.usedNum = usedNum;
    }

}
