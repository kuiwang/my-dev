package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 用户订购信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class AlipayContract extends TaobaoObject {

    private static final long serialVersionUID = 4219373989569496182L;

    /**
     * 支付宝用户ID
     */
    @ApiField("alipay_user_id")
    private String alipayUserId;

    /**
     * 订购的应用名称，有效时间。
     */
    @ApiField("contract_content")
    private String contractContent;

    /**
     * 订购的失效时间
     */
    @ApiField("end_time")
    private Date endTime;

    /**
     * 订购URL。在sign返回false时返回应用的订购地址，可以引导用户订购。
     */
    @ApiField("page_url")
    private String pageUrl;

    /**
     * 订购的生效时间
     */
    @ApiField("start_time")
    private Date startTime;

    /**
     * 是否订购的标识。true：代表已订购。
     */
    @ApiField("subscribe")
    private Boolean subscribe;

    public String getAlipayUserId() {
        return this.alipayUserId;
    }

    public String getContractContent() {
        return this.contractContent;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public String getPageUrl() {
        return this.pageUrl;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public Boolean getSubscribe() {
        return this.subscribe;
    }

    public void setAlipayUserId(String alipayUserId) {
        this.alipayUserId = alipayUserId;
    }

    public void setContractContent(String contractContent) {
        this.contractContent = contractContent;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setSubscribe(Boolean subscribe) {
        this.subscribe = subscribe;
    }

}
