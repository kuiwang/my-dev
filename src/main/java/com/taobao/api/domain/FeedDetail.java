package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * feed的详细内容
 *
 * @author auto create
 * @since 1.0, null
 */
public class FeedDetail extends TaobaoObject {

    private static final long serialVersionUID = 1478545235193323398L;

    /**
     * 评论的数量
     */
    @ApiField("comment_count")
    private Long commentCount;

    /**
     * 如果是插件feed，指插件id
     */
    @ApiField("component_id")
    private Long componentId;

    /**
     * 如果是插件feed，指插件名
     */
    @ApiField("component_name")
    private String componentName;

    /**
     * feed的封面区域 feedTile里的type=cover
     */
    @ApiField("cover_tile")
    private FeedTile coverTile;

    /**
     * 是否已删除
     */
    @ApiField("deleted")
    private Boolean deleted;

    /**
     * 如果是插件Feed,对应的详情地址
     */
    @ApiField("detail_url")
    private String detailUrl;

    /**
     * 赞的数量
     */
    @ApiField("feedfavour_count")
    private Long feedfavourCount;

    /**
     * feed的Id
     */
    @ApiField("id")
    private Long id;

    /**
     * 如果是插件Feed,对应插件的信息
     */
    @ApiField("message")
    private String message;

    /**
     * feed的内容区域，type=text 或者type=pic ,type=picItem的目前不提供
     */
    @ApiListField("tiles")
    @ApiField("feed_tile")
    private List<FeedTile> tiles;

    /**
     * feed的发布时间
     */
    @ApiField("time")
    private Long time;

    /**
     * feed的标题
     */
    @ApiField("title")
    private String title;

    public Long getCommentCount() {
        return this.commentCount;
    }

    public Long getComponentId() {
        return this.componentId;
    }

    public String getComponentName() {
        return this.componentName;
    }

    public FeedTile getCoverTile() {
        return this.coverTile;
    }

    public Boolean getDeleted() {
        return this.deleted;
    }

    public String getDetailUrl() {
        return this.detailUrl;
    }

    public Long getFeedfavourCount() {
        return this.feedfavourCount;
    }

    public Long getId() {
        return this.id;
    }

    public String getMessage() {
        return this.message;
    }

    public List<FeedTile> getTiles() {
        return this.tiles;
    }

    public Long getTime() {
        return this.time;
    }

    public String getTitle() {
        return this.title;
    }

    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }

    public void setComponentId(Long componentId) {
        this.componentId = componentId;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public void setCoverTile(FeedTile coverTile) {
        this.coverTile = coverTile;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public void setFeedfavourCount(Long feedfavourCount) {
        this.feedfavourCount = feedfavourCount;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTiles(List<FeedTile> tiles) {
        this.tiles = tiles;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
