package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Meal;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.promotion.meal.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PromotionMealGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4437937373259293283L;

    /**
     * 搭配套餐列表。
     */
    @ApiListField("meal_list")
    @ApiField("meal")
    private List<Meal> mealList;

    public void setMealList(List<Meal> mealList) {
        this.mealList = mealList;
    }

    public List<Meal> getMealList() {
        return this.mealList;
    }

}
