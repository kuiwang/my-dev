package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Demographic;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.simba.nonsearch.alldemographics.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaNonsearchAlldemographicsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4513658674662925342L;

    /**
     * 定向投放人群维度列表
     */
    @ApiListField("demographic_list")
    @ApiField("demographic")
    private List<Demographic> demographicList;

    public List<Demographic> getDemographicList() {
        return this.demographicList;
    }

    public void setDemographicList(List<Demographic> demographicList) {
        this.demographicList = demographicList;
    }

}
