package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.FeedComment;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.weitao.comments.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WeitaoCommentsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4577562355778114464L;

    /**
     * 评论列表
     */
    @ApiListField("comment_list")
    @ApiField("feed_comment")
    private List<FeedComment> commentList;

    /**
     * 接口执行是否成功
     */
    @ApiField("result")
    private Boolean result;

    /**
     * feed的总记录数
     */
    @ApiField("total_count")
    private Long totalCount;

    public List<FeedComment> getCommentList() {
        return this.commentList;
    }

    public Boolean getResult() {
        return this.result;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }

    public void setCommentList(List<FeedComment> commentList) {
        this.commentList = commentList;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

}
