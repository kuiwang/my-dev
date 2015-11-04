package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 关键词地域细分数据
 *
 * @author auto create
 * @since 1.0, null
 */
public class InsightWordsAreaDistributeDataDTO extends TaobaoObject {

    private static final long serialVersionUID = 2718853514538283186L;

    /**
     * 关键词
     */
    @ApiField("bidword")
    private String bidword;

    /**
     * 市名称
     */
    @ApiField("cityname")
    private String cityname;

    /**
     * 点击量
     */
    @ApiField("click")
    private Long click;

    /**
     * 竞争度
     */
    @ApiField("competition")
    private Long competition;

    /**
     * 花费，单位（分）
     */
    @ApiField("cost")
    private Long cost;

    /**
     * 点击转化率
     */
    @ApiField("coverage")
    private String coverage;

    /**
     * 平均点击花费
     */
    @ApiField("cpc")
    private String cpc;

    /**
     * 点击率
     */
    @ApiField("ctr")
    private String ctr;

    /**
     * 直接成交金额
     */
    @ApiField("directtransaction")
    private Long directtransaction;

    /**
     * 直接成交笔数
     */
    @ApiField("directtransactionshipping")
    private Long directtransactionshipping;

    /**
     * 宝贝搜藏数
     */
    @ApiField("favitemtotal")
    private Long favitemtotal;

    /**
     * 店铺搜藏数
     */
    @ApiField("favshoptotal")
    private Long favshoptotal;

    /**
     * 总的收藏数，包括宝贝收藏和店铺收藏
     */
    @ApiField("favtotal")
    private Long favtotal;

    /**
     * 展现量
     */
    @ApiField("impression")
    private Long impression;

    /**
     * 间接成交金额
     */
    @ApiField("indirecttransaction")
    private Long indirecttransaction;

    /**
     * 间接成交笔数
     */
    @ApiField("indirecttransactionshipping")
    private Long indirecttransactionshipping;

    /**
     * 省名称
     */
    @ApiField("provincename")
    private String provincename;

    /**
     * 投入产出比
     */
    @ApiField("roi")
    private String roi;

    /**
     * 总的成交笔数
     */
    @ApiField("transactionshippingtotal")
    private Long transactionshippingtotal;

    /**
     * 成交总金额
     */
    @ApiField("transactiontotal")
    private Long transactiontotal;

    public String getBidword() {
        return this.bidword;
    }

    public void setBidword(String bidword) {
        this.bidword = bidword;
    }

    public String getCityname() {
        return this.cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public Long getClick() {
        return this.click;
    }

    public void setClick(Long click) {
        this.click = click;
    }

    public Long getCompetition() {
        return this.competition;
    }

    public void setCompetition(Long competition) {
        this.competition = competition;
    }

    public Long getCost() {
        return this.cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public String getCoverage() {
        return this.coverage;
    }

    public void setCoverage(String coverage) {
        this.coverage = coverage;
    }

    public String getCpc() {
        return this.cpc;
    }

    public void setCpc(String cpc) {
        this.cpc = cpc;
    }

    public String getCtr() {
        return this.ctr;
    }

    public void setCtr(String ctr) {
        this.ctr = ctr;
    }

    public Long getDirecttransaction() {
        return this.directtransaction;
    }

    public void setDirecttransaction(Long directtransaction) {
        this.directtransaction = directtransaction;
    }

    public Long getDirecttransactionshipping() {
        return this.directtransactionshipping;
    }

    public void setDirecttransactionshipping(Long directtransactionshipping) {
        this.directtransactionshipping = directtransactionshipping;
    }

    public Long getFavitemtotal() {
        return this.favitemtotal;
    }

    public void setFavitemtotal(Long favitemtotal) {
        this.favitemtotal = favitemtotal;
    }

    public Long getFavshoptotal() {
        return this.favshoptotal;
    }

    public void setFavshoptotal(Long favshoptotal) {
        this.favshoptotal = favshoptotal;
    }

    public Long getFavtotal() {
        return this.favtotal;
    }

    public void setFavtotal(Long favtotal) {
        this.favtotal = favtotal;
    }

    public Long getImpression() {
        return this.impression;
    }

    public void setImpression(Long impression) {
        this.impression = impression;
    }

    public Long getIndirecttransaction() {
        return this.indirecttransaction;
    }

    public void setIndirecttransaction(Long indirecttransaction) {
        this.indirecttransaction = indirecttransaction;
    }

    public Long getIndirecttransactionshipping() {
        return this.indirecttransactionshipping;
    }

    public void setIndirecttransactionshipping(Long indirecttransactionshipping) {
        this.indirecttransactionshipping = indirecttransactionshipping;
    }

    public String getProvincename() {
        return this.provincename;
    }

    public void setProvincename(String provincename) {
        this.provincename = provincename;
    }

    public String getRoi() {
        return this.roi;
    }

    public void setRoi(String roi) {
        this.roi = roi;
    }

    public Long getTransactionshippingtotal() {
        return this.transactionshippingtotal;
    }

    public void setTransactionshippingtotal(Long transactionshippingtotal) {
        this.transactionshippingtotal = transactionshippingtotal;
    }

    public Long getTransactiontotal() {
        return this.transactiontotal;
    }

    public void setTransactiontotal(Long transactiontotal) {
        this.transactiontotal = transactiontotal;
    }

}
