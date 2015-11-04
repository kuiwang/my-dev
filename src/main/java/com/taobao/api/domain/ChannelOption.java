package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * Campaign投放频道
 *
 * @author auto create
 * @since 1.0, null
 */
public class ChannelOption extends TaobaoObject {

    private static final long serialVersionUID = 5739446899499739897L;

    /**
     * 频道id
     */
    @ApiField("channel_id")
    private Long channelId;

    /**
     * 是否有非搜索流量，true：是；false：否；
     */
    @ApiField("is_nonsearch")
    private Boolean isNonsearch;

    /**
     * 是否有搜索流量，true：是；false：否；
     */
    @ApiField("is_search")
    private Boolean isSearch;

    /**
     * 频道名称
     */
    @ApiField("name")
    private String name;

    /**
     * 流量名称
     */
    @ApiField("traffic_name")
    private String trafficName;

    /**
     * 流量类型，taobao：淘宝站内；other：淘宝站外
     */
    @ApiField("traffic_type")
    private String trafficType;

    public Long getChannelId() {
        return this.channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public Boolean getIsNonsearch() {
        return this.isNonsearch;
    }

    public void setIsNonsearch(Boolean isNonsearch) {
        this.isNonsearch = isNonsearch;
    }

    public Boolean getIsSearch() {
        return this.isSearch;
    }

    public void setIsSearch(Boolean isSearch) {
        this.isSearch = isSearch;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrafficName() {
        return this.trafficName;
    }

    public void setTrafficName(String trafficName) {
        this.trafficName = trafficName;
    }

    public String getTrafficType() {
        return this.trafficType;
    }

    public void setTrafficType(String trafficType) {
        this.trafficType = trafficType;
    }

}
