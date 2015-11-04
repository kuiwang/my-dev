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
public class INCategoryTop extends TaobaoObject {

    private static final long serialVersionUID = 4313825972581281816L;

    /**
     * 子类目列表
     */
    @ApiListField("category_child_top_list")
    @ApiField("i_n_category_child_top")
    private List<INCategoryChildTop> categoryChildTopList;

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

    /**
     * 用户输入的词
     */
    @ApiField("categroy_word")
    private String categroyWord;

    public List<INCategoryChildTop> getCategoryChildTopList() {
        return this.categoryChildTopList;
    }

    public void setCategoryChildTopList(List<INCategoryChildTop> categoryChildTopList) {
        this.categoryChildTopList = categoryChildTopList;
    }

    public String getCategoryDesc() {
        return this.categoryDesc;
    }

    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<INCategoryProperties> getCategoryPropertiesList() {
        return this.categoryPropertiesList;
    }

    public void setCategoryPropertiesList(List<INCategoryProperties> categoryPropertiesList) {
        this.categoryPropertiesList = categoryPropertiesList;
    }

    public String getCategroyWord() {
        return this.categroyWord;
    }

    public void setCategroyWord(String categroyWord) {
        this.categroyWord = categroyWord;
    }

}
