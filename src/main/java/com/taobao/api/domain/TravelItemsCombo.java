package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 旅游度假线路套餐价格日历结构。
 *
 * @author auto create
 * @since 1.0, null
 */
public class TravelItemsCombo extends TaobaoObject {

    private static final long serialVersionUID = 7747567936896764838L;

    /**
     * 销售属性套餐属性值结构。
     */
    @ApiField("combo")
    private TravelItemsPropValue combo;

    /**
     * 套餐下的价格日历集合。
     */
    @ApiListField("combo_price_calendars")
    @ApiField("travel_items_price_calendar")
    private List<TravelItemsPriceCalendar> comboPriceCalendars;

    public TravelItemsPropValue getCombo() {
        return this.combo;
    }

    public void setCombo(TravelItemsPropValue combo) {
        this.combo = combo;
    }

    public List<TravelItemsPriceCalendar> getComboPriceCalendars() {
        return this.comboPriceCalendars;
    }

    public void setComboPriceCalendars(List<TravelItemsPriceCalendar> comboPriceCalendars) {
        this.comboPriceCalendars = comboPriceCalendars;
    }

}
