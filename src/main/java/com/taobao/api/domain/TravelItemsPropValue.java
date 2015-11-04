package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 旅游商品类目属性值结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class TravelItemsPropValue extends TaobaoObject {

    private static final long serialVersionUID = 8644571562883981236L;

    /**
     * 商品所属叶子类目ID，旅游度假8个叶子类目。
     */
    @ApiField("cid")
    private Long cid;

    /**
     * 属性值名称。
     */
    @ApiField("name")
    private String name;

    /**
     * 属性ID。
     */
    @ApiField("pid")
    private Long pid;

    /**
     * 属性名称。
     */
    @ApiField("prop_name")
    private String propName;

    /**
     * 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数。
     */
    @ApiField("sort_order")
    private Long sortOrder;

    /**
     * 属性值ID。
     */
    @ApiField("vid")
    private Long vid;

    public Long getCid() {
        return this.cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
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

    public String getPropName() {
        return this.propName;
    }

    public void setPropName(String propName) {
        this.propName = propName;
    }

    public Long getSortOrder() {
        return this.sortOrder;
    }

    public void setSortOrder(Long sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Long getVid() {
        return this.vid;
    }

    public void setVid(Long vid) {
        this.vid = vid;
    }

}
