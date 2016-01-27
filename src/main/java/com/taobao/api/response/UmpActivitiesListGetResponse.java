package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.ump.activities.list.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class UmpActivitiesListGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1219984173883676481L;

    /**
     * 营销活动列表！
     */
    @ApiListField("activities")
    @ApiField("string")
    private List<String> activities;

    public List<String> getActivities() {
        return this.activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

}
