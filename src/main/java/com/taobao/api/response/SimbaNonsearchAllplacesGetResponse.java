package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Place;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.simba.nonsearch.allplaces.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaNonsearchAllplacesGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1351252934571877853L;

    /**
     * 定向推广投放位置列表
     */
    @ApiListField("place_list")
    @ApiField("place")
    private List<Place> placeList;

    public List<Place> getPlaceList() {
        return this.placeList;
    }

    public void setPlaceList(List<Place> placeList) {
        this.placeList = placeList;
    }

}
