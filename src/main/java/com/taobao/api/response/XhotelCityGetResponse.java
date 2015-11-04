package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.HotelDivision;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.xhotel.city.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class XhotelCityGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2115716387491623238L;

    /**
     * 酒店区域的数据列表
     */
    @ApiListField("divisions")
    @ApiField("hotel_division")
    private List<HotelDivision> divisions;

    /**
     * 总数
     */
    @ApiField("total_results")
    private Long totalResults;

    /**
     * 城市数据的版本。所有城市数据有一个统一的版本，与入参start和count无关。
     * ISV可通过版本判断城市数据是否有更新。判断方法如下：ISV在第一次拉取数据时请将version保存在本地
     * ；以后再调用接口时请比较本地version与接口返回的version
     * 。如果本地version小于于接口返回version，则说明城市数据有更新
     * ；如果本地version等于接口返回version，则说明城市数据无更新，不需要再继续拉取城市数据。
     */
    @ApiField("version")
    private Long version;

    public void setDivisions(List<HotelDivision> divisions) {
        this.divisions = divisions;
    }

    public List<HotelDivision> getDivisions() {
        return this.divisions;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Long getVersion() {
        return this.version;
    }

}
