package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 一页ADGroupCatMatch列表
 *
 * @author auto create
 * @since 1.0, null
 */
public class ADGroupCatMatchPage extends TaobaoObject {

    private static final long serialVersionUID = 1712758538339598658L;

    /**
     * 类目出价列表
     */
    @ApiListField("adgroup_catmatch_list")
    @ApiField("a_d_group_catmatch")
    private List<ADGroupCatmatch> adgroupCatmatchList;

    /**
     * 返回第几页的数据从1开始
     */
    @ApiField("page_no")
    private Long pageNo;

    /**
     * 每页数据大小
     */
    @ApiField("page_size")
    private Long pageSize;

    /**
     * 所查询的数据总数，只有当返回第一页数据时有值，当要求返回的数据非第一页时，此返回值无效
     */
    @ApiField("total_item")
    private Long totalItem;

    public List<ADGroupCatmatch> getAdgroupCatmatchList() {
        return this.adgroupCatmatchList;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public Long getTotalItem() {
        return this.totalItem;
    }

    public void setAdgroupCatmatchList(List<ADGroupCatmatch> adgroupCatmatchList) {
        this.adgroupCatmatchList = adgroupCatmatchList;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public void setTotalItem(Long totalItem) {
        this.totalItem = totalItem;
    }

}
