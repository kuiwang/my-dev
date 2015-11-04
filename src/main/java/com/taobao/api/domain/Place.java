package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 定向推广位置
 *
 * @author auto create
 * @since 1.0, null
 */
public class Place extends TaobaoObject {

    private static final long serialVersionUID = 3716811336994136693L;

    /**
     * 创建时间
     */
    @ApiField("create_time")
    private Date createTime;

    /**
     * 最后修改时间
     */
    @ApiField("last_update_time")
    private Date lastUpdateTime;

    /**
     * 位置名称
     */
    @ApiField("name")
    private String name;

    /**
     * 位置标识
     */
    @ApiField("place_id")
    private Long placeId;

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPlaceId() {
        return this.placeId;
    }

    public void setPlaceId(Long placeId) {
        this.placeId = placeId;
    }

}
