package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 优惠标签对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class PromotionTag extends TaobaoObject {

    private static final long serialVersionUID = 5286645439925365224L;

    /**
     * 标签结束时间
     */
    @ApiField("end_time")
    private Date endTime;

    /**
     * 标签开始时间
     */
    @ApiField("start_time")
    private Date startTime;

    /**
     * 标签描述
     */
    @ApiField("tag_desc")
    private String tagDesc;

    /**
     * 标签ID
     */
    @ApiField("tag_id")
    private Long tagId;

    /**
     * 标签名称
     */
    @ApiField("tag_name")
    private String tagName;

    public Date getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getTagDesc() {
        return this.tagDesc;
    }

    public void setTagDesc(String tagDesc) {
        this.tagDesc = tagDesc;
    }

    public Long getTagId() {
        return this.tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return this.tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

}
