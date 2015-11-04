package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 旅游度假线路价格日历结构。
 *
 * @author auto create
 * @since 1.0, null
 */
public class TravelItemsPriceCalendar extends TaobaoObject {

    private static final long serialVersionUID = 3454925761757569147L;

    /**
     * 儿童库存
     */
    @ApiField("child_num")
    private Long childNum;

    /**
     * 儿童价格（以“分”为单位）。
     */
    @ApiField("child_price")
    private Long childPrice;

    /**
     * 日期。
     */
    @ApiField("date")
    private String date;

    /**
     * 单人房差（以“分”为单位）
     */
    @ApiField("diff_price")
    private Long diffPrice;

    /**
     * 成人库存
     */
    @ApiField("man_num")
    private Long manNum;

    /**
     * 成人价格（以“分”为单位）
     */
    @ApiField("man_price")
    private Long manPrice;

    public Long getChildNum() {
        return this.childNum;
    }

    public void setChildNum(Long childNum) {
        this.childNum = childNum;
    }

    public Long getChildPrice() {
        return this.childPrice;
    }

    public void setChildPrice(Long childPrice) {
        this.childPrice = childPrice;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getDiffPrice() {
        return this.diffPrice;
    }

    public void setDiffPrice(Long diffPrice) {
        this.diffPrice = diffPrice;
    }

    public Long getManNum() {
        return this.manNum;
    }

    public void setManNum(Long manNum) {
        this.manNum = manNum;
    }

    public Long getManPrice() {
        return this.manPrice;
    }

    public void setManPrice(Long manPrice) {
        this.manPrice = manPrice;
    }

}
