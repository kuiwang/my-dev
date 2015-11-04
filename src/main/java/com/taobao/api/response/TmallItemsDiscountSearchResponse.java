package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TmallBrand;
import com.taobao.api.domain.TmallCat;
import com.taobao.api.domain.TmallMinisite;
import com.taobao.api.domain.TmallSearchItem;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: tmall.items.discount.search response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TmallItemsDiscountSearchResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4676255444358323732L;

    /**
     * 搜索结果品牌列表
     */
    @ApiListField("brand_list")
    @ApiField("tmall_brand")
    private List<TmallBrand> brandList;

    /**
     * 搜索结果类目列表
     */
    @ApiListField("cat_list")
    @ApiField("tmall_cat")
    private List<TmallCat> catList;

    /**
     * 搜索结果宝贝列表
     */
    @ApiListField("item_list")
    @ApiField("tmall_search_item")
    private List<TmallSearchItem> itemList;

    /**
     * 搜索结果minisite列表
     */
    @ApiListField("minisite_list")
    @ApiField("tmall_minisite")
    private List<TmallMinisite> minisiteList;

    /**
     * 当前页数
     */
    @ApiField("page")
    private Long page;

    /**
     * 每页搜索返回数
     */
    @ApiField("page_size")
    private Long pageSize;

    /**
     * 搜索关键词
     */
    @ApiField("param_value")
    private String paramValue;

    /**
     * 搜索的URL
     */
    @ApiField("search_url")
    private String searchUrl;

    /**
     * 搜索总页数
     */
    @ApiField("total_page")
    private Long totalPage;

    /**
     * 搜索结果总数
     */
    @ApiField("total_results")
    private String totalResults;

    public void setBrandList(List<TmallBrand> brandList) {
        this.brandList = brandList;
    }

    public List<TmallBrand> getBrandList() {
        return this.brandList;
    }

    public void setCatList(List<TmallCat> catList) {
        this.catList = catList;
    }

    public List<TmallCat> getCatList() {
        return this.catList;
    }

    public void setItemList(List<TmallSearchItem> itemList) {
        this.itemList = itemList;
    }

    public List<TmallSearchItem> getItemList() {
        return this.itemList;
    }

    public void setMinisiteList(List<TmallMinisite> minisiteList) {
        this.minisiteList = minisiteList;
    }

    public List<TmallMinisite> getMinisiteList() {
        return this.minisiteList;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public Long getPage() {
        return this.page;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    public String getParamValue() {
        return this.paramValue;
    }

    public void setSearchUrl(String searchUrl) {
        this.searchUrl = searchUrl;
    }

    public String getSearchUrl() {
        return this.searchUrl;
    }

    public void setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
    }

    public Long getTotalPage() {
        return this.totalPage;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public String getTotalResults() {
        return this.totalResults;
    }

}
