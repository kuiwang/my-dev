package com.scott.dev.taobao.api.comment.domain;

/*
 * 天猫评价标签详细信息
 */
public class TmallRateTagDetail {

    /*
     * 标签名称
     */
    private String tagName;

    /*
     * 反应该标签的评价数量
     */
    private Number count;

    /*
     * 标签的极性：1正极 -1负极
     */
    private Boolean posi;

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public Number getCount() {
        return count;
    }

    public void setCount(Number count) {
        this.count = count;
    }

    public Boolean getPosi() {
        return posi;
    }

    public void setPosi(Boolean posi) {
        this.posi = posi;
    }
}
