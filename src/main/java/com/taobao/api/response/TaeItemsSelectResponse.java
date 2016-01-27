package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ItemSelect;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.tae.items.select response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TaeItemsSelectResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5888423413358999991L;

    /**
     * 是否存在下一页
     */
    @ApiField("has_next")
    private Boolean hasNext;

    /**
     * 商品选品服务
     */
    @ApiListField("items")
    @ApiField("item_select")
    private List<ItemSelect> items;

    /**
     * 当前返回的是第几页，可能>此次请求的pageNo 每次调用请求的pageNo为前一次调用返回的pageNo+1
     */
    @ApiField("page_no")
    private Long pageNo;

    public Boolean getHasNext() {
        return this.hasNext;
    }

    public List<ItemSelect> getItems() {
        return this.items;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public void setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
    }

    public void setItems(List<ItemSelect> items) {
        this.items = items;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

}
