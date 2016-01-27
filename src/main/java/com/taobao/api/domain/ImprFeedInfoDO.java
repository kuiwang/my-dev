package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 大家印象标签对应评价信息对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class ImprFeedInfoDO extends TaobaoObject {

    private static final long serialVersionUID = 3588859277351764145L;

    /**
     * 1:主评 2:追评
     */
    @ApiField("biz_type")
    private Long bizType;

    /**
     * 评价内容
     */
    @ApiField("feedback")
    private String feedback;

    /**
     * 评价创建时间
     */
    @ApiField("gmt_create")
    private Date gmtCreate;

    /**
     * 评价的修改时间
     */
    @ApiField("gmt_modified")
    private Date gmtModified;

    /**
     * 从评价内容里提取的语义标签
     */
    @ApiListField("impr_words")
    @ApiField("string")
    private List<String> imprWords;

    public Long getBizType() {
        return this.bizType;
    }

    public String getFeedback() {
        return this.feedback;
    }

    public Date getGmtCreate() {
        return this.gmtCreate;
    }

    public Date getGmtModified() {
        return this.gmtModified;
    }

    public List<String> getImprWords() {
        return this.imprWords;
    }

    public void setBizType(Long bizType) {
        this.bizType = bizType;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public void setImprWords(List<String> imprWords) {
        this.imprWords = imprWords;
    }

}
