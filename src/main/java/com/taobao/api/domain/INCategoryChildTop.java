package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 类目对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class INCategoryChildTop extends TaobaoObject {

    private static final long serialVersionUID = 5432182894258233999L;

    /**
     * 类目属性描述
     */
    @ApiField("category_desc")
    private String categoryDesc;

    /**
     * 类目对象id
     */
    @ApiField("category_id")
    private Long categoryId;

    /**
     * 类目名称
     */
    @ApiField("category_name")
    private String categoryName;

    /**
     * 类目属性对象列表
     */
    @ApiListField("category_properties_list")
    @ApiField("i_n_category_properties")
    private List<INCategoryProperties> categoryPropertiesList;

    public String getCategoryDesc() {
        return this.categoryDesc;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public List<INCategoryProperties> getCategoryPropertiesList() {
        return this.categoryPropertiesList;
    }

    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setCategoryPropertiesList(List<INCategoryProperties> categoryPropertiesList) {
        this.categoryPropertiesList = categoryPropertiesList;
    }

}
