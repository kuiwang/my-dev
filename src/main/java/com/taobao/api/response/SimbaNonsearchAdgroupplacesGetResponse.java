package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ADGroupPlace;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.simba.nonsearch.adgroupplaces.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaNonsearchAdgroupplacesGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5525211672284746759L;

    /**
     * 推广组定向推广位置关系列表
     */
    @ApiListField("adgroup_place_list")
    @ApiField("a_d_group_place")
    private List<ADGroupPlace> adgroupPlaceList;

    public void setAdgroupPlaceList(List<ADGroupPlace> adgroupPlaceList) {
        this.adgroupPlaceList = adgroupPlaceList;
    }

    public List<ADGroupPlace> getAdgroupPlaceList() {
        return this.adgroupPlaceList;
    }

}
