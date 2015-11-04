package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 旅游商品类目属性结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class TravelItemsProp extends TaobaoObject {

    private static final long serialVersionUID = 4769471662698614115L;

    /**
     * 商品所属叶子类目ID，旅游度假8个叶子类目
     */
    @ApiField("cid")
    private Long cid;

    /**
     * 是否可枚举。可选值:true(是),false(否)。
     */
    @ApiField("is_enums")
    private Boolean isEnums;

    /**
     * 是否可输入。可选值:true(是),false(否)。
     */
    @ApiField("is_input")
    private Boolean isInput;

    /**
     * 是否销售属性。可选值:true(是),false(否)。
     */
    @ApiField("is_sale_prop")
    private Boolean isSaleProp;

    /**
     * 发布商品时是否可以多选。可选值: true (是) , false(否)。
     */
    @ApiField("multi")
    private Boolean multi;

    /**
     * 发布商品时是否必选。可选值: true (是) , false(否)
     */
    @ApiField("must")
    private Boolean must;

    /**
     * 属性名称
     */
    @ApiField("name")
    private String name;

    /**
     * 旅游商品类目属性ID
     */
    @ApiField("pid")
    private Long pid;

    /**
     * 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
     */
    @ApiField("sort_order")
    private Long sortOrder;

    /**
     * 商品类目属性值集合。
     */
    @ApiListField("travel_items_prop_values")
    @ApiField("travel_items_prop_value")
    private List<TravelItemsPropValue> travelItemsPropValues;

    public Long getCid() {
        return this.cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Boolean getIsEnums() {
        return this.isEnums;
    }

    public void setIsEnums(Boolean isEnums) {
        this.isEnums = isEnums;
    }

    public Boolean getIsInput() {
        return this.isInput;
    }

    public void setIsInput(Boolean isInput) {
        this.isInput = isInput;
    }

    public Boolean getIsSaleProp() {
        return this.isSaleProp;
    }

    public void setIsSaleProp(Boolean isSaleProp) {
        this.isSaleProp = isSaleProp;
    }

    public Boolean getMulti() {
        return this.multi;
    }

    public void setMulti(Boolean multi) {
        this.multi = multi;
    }

    public Boolean getMust() {
        return this.must;
    }

    public void setMust(Boolean must) {
        this.must = must;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPid() {
        return this.pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Long getSortOrder() {
        return this.sortOrder;
    }

    public void setSortOrder(Long sortOrder) {
        this.sortOrder = sortOrder;
    }

    public List<TravelItemsPropValue> getTravelItemsPropValues() {
        return this.travelItemsPropValues;
    }

    public void setTravelItemsPropValues(List<TravelItemsPropValue> travelItemsPropValues) {
        this.travelItemsPropValues = travelItemsPropValues;
    }

}
