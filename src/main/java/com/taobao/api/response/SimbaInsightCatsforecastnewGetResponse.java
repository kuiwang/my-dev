package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.InsightCategoryForcastDTO;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.simba.insight.catsforecastnew.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaInsightCatsforecastnewGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2192448646857484742L;

    /**
     * 词的相关类目列表
     */
    @ApiListField("category_forecast_list")
    @ApiField("insight_category_forcast_d_t_o")
    private List<InsightCategoryForcastDTO> categoryForecastList;

    public List<InsightCategoryForcastDTO> getCategoryForecastList() {
        return this.categoryForecastList;
    }

    public void setCategoryForecastList(List<InsightCategoryForcastDTO> categoryForecastList) {
        this.categoryForecastList = categoryForecastList;
    }

}
