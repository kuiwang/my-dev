package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 点点店铺分页结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class DianDianShopPage extends TaobaoObject {

    private static final long serialVersionUID = 2572263648588259738L;

    /**
     * 淘点点店铺数据列表
     */
    @ApiListField("dian_dian_shop_list")
    @ApiField("dian_dian_shop")
    private List<DianDianShop> dianDianShopList;

    /**
     * 下一页页码
     */
    @ApiField("next_page")
    private Long nextPage;

    /**
     * 页码
     */
    @ApiField("page_no")
    private Long pageNo;

    /**
     * 每页大小
     */
    @ApiField("page_size")
    private Long pageSize;

    /**
     * 上一页页码
     */
    @ApiField("prev_page")
    private Long prevPage;

    /**
     * 总条数
     */
    @ApiField("total_count")
    private Long totalCount;

    /**
     * 总页数
     */
    @ApiField("total_page")
    private Long totalPage;

    public List<DianDianShop> getDianDianShopList() {
        return this.dianDianShopList;
    }

    public Long getNextPage() {
        return this.nextPage;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public Long getPrevPage() {
        return this.prevPage;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }

    public Long getTotalPage() {
        return this.totalPage;
    }

    public void setDianDianShopList(List<DianDianShop> dianDianShopList) {
        this.dianDianShopList = dianDianShopList;
    }

    public void setNextPage(Long nextPage) {
        this.nextPage = nextPage;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public void setPrevPage(Long prevPage) {
        this.prevPage = prevPage;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public void setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
    }

}
