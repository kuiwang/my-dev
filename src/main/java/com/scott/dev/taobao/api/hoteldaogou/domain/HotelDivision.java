package com.scott.dev.taobao.api.hoteldaogou.domain;

/**
 * 酒店区域
 */
public class HotelDivision {

    /**
     * 城市编码
     */
    private Long code;

    /**
     * 层级，1：国家，2：州省，3：城市，4：区县
     */
    private Long level;

    /**
     * 城市名称
     */
    private String name;

    /**
     * 父行政区编码，例如杭州市(330100)的父行政区为浙江省(330000)。注意：如果parent_code的值为0，
     * 表示该行政区为最高级别的行政区，没有父行政区。
     */
    private Long parentCode;

    /**
     * 0：国内；1：国外
     */
    private Long region;

    /**
     * code是否可用来搜索酒店，true：code可直接用于搜索酒店，false: code不可直接用于搜索酒店。
     */
    private Boolean searchable;

    /**
     * 类型，0：普通，1：景点,cityTag，如千岛湖
     */
    private Long type;

    public Long getCode() {
        return this.code;
    }

    public void setCode(Long code) {
        this.code = code;
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

    public Long getParentCode() {
        return this.parentCode;
    }

    public void setParentCode(Long parentCode) {
        this.parentCode = parentCode;
    }

    public Long getRegion() {
        return this.region;
    }

    public void setRegion(Long region) {
        this.region = region;
    }

    public Boolean getSearchable() {
        return this.searchable;
    }

    public void setSearchable(Boolean searchable) {
        this.searchable = searchable;
    }

    public Long getType() {
        return this.type;
    }

    public void setType(Long type) {
        this.type = type;
    }

}
