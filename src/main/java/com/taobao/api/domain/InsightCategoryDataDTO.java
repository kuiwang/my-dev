package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 类目大盘数据结果对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class InsightCategoryDataDTO extends TaobaoObject {

    private static final long serialVersionUID = 8625476346841884729L;

    /**
     * 类目id
     */
    @ApiField("cat_id")
    private Long catId;

    /**
     * 类目名称
     */
    @ApiField("cat_name")
    private String catName;

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

    public Long getCatId() {
        return this.catId;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return this.catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
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
