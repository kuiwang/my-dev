package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 类目基础数据对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class INCategoryBase extends TaobaoObject {

    private static final long serialVersionUID = 1298456864998871526L;

    /**
     * 类目ID
     */
    @ApiField("category_id")
    private Long categoryId;

    /**
     * 类目名称
     */
    @ApiField("category_name")
    private String categoryName;

    /**
     * 类目展现量
     */
    @ApiField("category_pv")
    private Long categoryPv;

    /**
     * 类目数据信息列表
     */
    @ApiListField("in_record_base_list")
    @ApiField("i_n_record_base")
    private List<INRecordBase> inRecordBaseList;

    public Long getCategoryId() {
        return this.categoryId;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public Long getCategoryPv() {
        return this.categoryPv;
    }

    public List<INRecordBase> getInRecordBaseList() {
        return this.inRecordBaseList;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setCategoryPv(Long categoryPv) {
        this.categoryPv = categoryPv;
    }

    public void setInRecordBaseList(List<INRecordBase> inRecordBaseList) {
        this.inRecordBaseList = inRecordBaseList;
    }

}
