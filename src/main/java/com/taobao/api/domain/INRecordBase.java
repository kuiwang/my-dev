package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 词基础数据对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class INRecordBase extends TaobaoObject {

    private static final long serialVersionUID = 2788396514921689116L;

    /**
     * 词在类目下平均点击价格
     */
    @ApiField("avg_price")
    private Long avgPrice;

    /**
     * 词在类目下点击量
     */
    @ApiField("click")
    private Long click;

    /**
     * 词在类目下竞争宝贝数(包括未展现客户)
     */
    @ApiField("competition")
    private Long competition;

    /**
     * 点击率
     */
    @ApiField("ctr")
    private String ctr;

    /**
     * 时间点
     */
    @ApiField("date")
    private Date date;

    /**
     * 词在类目下展现量
     */
    @ApiField("pv")
    private Long pv;

    public Long getAvgPrice() {
        return this.avgPrice;
    }

    public void setAvgPrice(Long avgPrice) {
        this.avgPrice = avgPrice;
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

    public String getCtr() {
        return this.ctr;
    }

    public void setCtr(String ctr) {
        this.ctr = ctr;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getPv() {
        return this.pv;
    }

    public void setPv(Long pv) {
        this.pv = pv;
    }

}
