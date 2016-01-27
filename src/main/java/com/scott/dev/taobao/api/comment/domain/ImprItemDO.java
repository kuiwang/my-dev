package com.scott.dev.taobao.api.comment.domain;

/*
 * 评价大印象返回的印象词接口
 */
public class ImprItemDO {

    /*
     * 印象标签的id
     */
    private Number attributeId;

    /*
     * 被买家评价提及到的印象标签次数
     */
    private Number count;

    /*
     * 印象标签情感倾向 1表示正面 -1表示负面 0表示中性
     */
    private Number status;

    /*
     * 印象标签的名称
     */
    private String title;

    public Number getAttributeId() {
        return attributeId;
    }

    public Number getCount() {
        return count;
    }

    public Number getStatus() {
        return status;
    }

    public String getTitle() {
        return title;
    }

    public void setAttributeId(Number attributeId) {
        this.attributeId = attributeId;
    }

    public void setCount(Number count) {
        this.count = count;
    }

    public void setStatus(Number status) {
        this.status = status;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
