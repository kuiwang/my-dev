package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * feed评论
 *
 * @author auto create
 * @since 1.0, null
 */
public class FeedComment extends TaobaoObject {

    private static final long serialVersionUID = 7789511183568275277L;

    /**
     * 评论内容
     */
    @ApiField("content")
    private String content;

    /**
     * 评论的扩展数据，json格式，目前支持图片与宝贝,type=1时格式：[
     * "http://gw3.alicdn.com/tfscom/tuitui/i2/11659032089367711/T1mhfOFiJiXXb1upjX.jpg"
     * ]，type=2时格式见示例。
     */
    @ApiField("ext_symbol")
    private String extSymbol;

    /**
     * 评论所属的feed的Id
     */
    @ApiField("feed_id")
    private Long feedId;

    /**
     * 评论楼层
     */
    @ApiField("floor")
    private Long floor;

    /**
     * 评论ID
     */
    @ApiField("id")
    private Long id;

    /**
     * 评论发布的时间
     */
    @ApiField("time")
    private Long time;

    /**
     * 评论类型,0纯文本，1含有图片，2含有宝贝
     */
    @ApiField("type")
    private Long type;

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getExtSymbol() {
        return this.extSymbol;
    }

    public void setExtSymbol(String extSymbol) {
        this.extSymbol = extSymbol;
    }

    public Long getFeedId() {
        return this.feedId;
    }

    public void setFeedId(Long feedId) {
        this.feedId = feedId;
    }

    public Long getFloor() {
        return this.floor;
    }

    public void setFloor(Long floor) {
        this.floor = floor;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTime() {
        return this.time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Long getType() {
        return this.type;
    }

    public void setType(Long type) {
        this.type = type;
    }

}
