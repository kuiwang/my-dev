package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ADGroupCatMatchForecast;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.simba.adgroup.catmatchforecast.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaAdgroupCatmatchforecastGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1817363678855492554L;

    /**
     * 类目出价预估结果信息 预测数据皆为估算结果，以实际发生为准
     */
    @ApiField("adgroup_catmatch_forecast")
    private ADGroupCatMatchForecast adgroupCatmatchForecast;

    public ADGroupCatMatchForecast getAdgroupCatmatchForecast() {
        return this.adgroupCatmatchForecast;
    }

    public void setAdgroupCatmatchForecast(ADGroupCatMatchForecast adgroupCatmatchForecast) {
        this.adgroupCatmatchForecast = adgroupCatmatchForecast;
    }

}
