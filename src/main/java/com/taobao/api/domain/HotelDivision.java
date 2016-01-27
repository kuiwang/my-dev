package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 酒店区域
 *
 * @author auto create
 * @since 1.0, null
 */
public class HotelDivision extends TaobaoObject {

    private static final long serialVersionUID = 8598679811626813966L;

    /**
     * 城市编码
     */
    @ApiField("code")
    private Long code;

    /**
     * 层级，1：国家，2：州省，3：城市，4：区县
     */
    @ApiField("level")
    private Long level;

    /**
     * 城市名称
     */
    @ApiField("name")
    private String name;

    /**
     * 父行政区编码，例如杭州市(330100)的父行政区为浙江省(330000)。注意：如果parent_code的值为0，
     * 表示该行政区为最高级别的行政区，没有父行政区。
     */
    @ApiField("parent_code")
    private Long parentCode;

    /**
     * 0：国内；1：国外
     */
    @ApiField("region")
    private Long region;

    /**
     * code是否可用来搜索酒店，true：code可直接用于搜索酒店，false: code不可直接用于搜索酒店。
     */
    @ApiField("searchable")
    private Boolean searchable;

    /**
     * 类型，0：普通，1：景点,cityTag，如千岛湖
     */
    @ApiField("type")
    private Long type;

    public Long getCode() {
        return this.code;
    }

    public Long getLevel() {
        return this.level;
    }

    public String getName() {
        return this.name;
    }

    public Long getParentCode() {
        return this.parentCode;
    }

    public Long getRegion() {
        return this.region;
    }

    public Boolean getSearchable() {
        return this.searchable;
    }

    public Long getType() {
        return this.type;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParentCode(Long parentCode) {
        this.parentCode = parentCode;
    }

    public void setRegion(Long region) {
        this.region = region;
    }

    public void setSearchable(Boolean searchable) {
        this.searchable = searchable;
    }

    public void setType(Long type) {
        this.type = type;
    }

}
