package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 一页推荐词列表
 *
 * @author auto create
 * @since 1.0, null
 */
public class RecommendWordPage extends TaobaoObject {

    private static final long serialVersionUID = 4325162697673597784L;

    /**
     * 返回第几页的数据从1开始。 如果输入的值大于可取得的最大页码值时，将返回 最大的页码值并且recommend_word_list值将
     * 为空
     */
    @ApiField("page_no")
    private Long pageNo;

    /**
     * 每页数据大小
     */
    @ApiField("page_size")
    private Long pageSize;

    /**
     * 推荐词分页对象列表
     */
    @ApiListField("recommend_word_list")
    @ApiField("recommend_word")
    private List<RecommendWord> recommendWordList;

    /**
     * 所查询的数据总数
     */
    @ApiField("total_item")
    private Long totalItem;

    public Long getPageNo() {
        return this.pageNo;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public List<RecommendWord> getRecommendWordList() {
        return this.recommendWordList;
    }

    public Long getTotalItem() {
        return this.totalItem;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public void setRecommendWordList(List<RecommendWord> recommendWordList) {
        this.recommendWordList = recommendWordList;
    }

    public void setTotalItem(Long totalItem) {
        this.totalItem = totalItem;
    }

}
