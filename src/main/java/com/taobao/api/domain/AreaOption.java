package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 直通车可推广的地域
 *
 * @author auto create
 * @since 1.0, null
 */
public class AreaOption extends TaobaoObject {

    private static final long serialVersionUID = 8889836377337579683L;

    /**
     * 地域id
     */
    @ApiField("area_id")
    private Long areaId;

    /**
     * 地域级别，目前自治区、省、直辖市是1，其他城市、地区是2
     */
    @ApiField("level")
    private Long level;

    /**
     * 地域名称
     */
    @ApiField("name")
    private String name;

    /**
     * 父地域id，若该字段为0表示该行政区为顶层，例如像北京，国外等。
     */
    @ApiField("parent_id")
    private Long parentId;

    public Long getAreaId() {
        return this.areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public Long getLevel() {
        return this.level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentId() {
        return this.parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

}
