package com.scott.dev.taobao.api.comment.domain;

import java.util.Date;

/*
 * 大家印象标签对应评价信息对象
 */
public class ImprFeedInfoDO {

    /*
     * 1:主评 2:追评
     */
    private Number bizType;

    /*
     * 评价内容
     */
    private String feedback;

    /*
     * 评价创建时间
     */
    private Date gmtCreate;

    /*
     * 评价的修改时间
     */
    private Date gmtModified;

    /*
     * 从评价内容里提取的语义标签
     */
    private String[] imprWords;

    public Number getBizType() {
        return bizType;
    }

    public String getFeedback() {
        return feedback;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public String[] getImprWords() {
        return imprWords;
    }

    public void setBizType(Number bizType) {
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

    public void setImprWords(String[] imprWords) {
        this.imprWords = imprWords;
    }
}
