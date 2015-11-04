package com.scott.dev.taobao.api.comment.domain;

/*
 * 天猫评价标签对象
 */
public class TmallRateTag {

    /*
     * 表示标签的名称
     */
    private String tagName;

    /*
     *表示标签的极性，正极true，负极false
     */
    private Boolean posi;

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public Boolean getPosi() {
        return posi;
    }

    public void setPosi(Boolean posi) {
        this.posi = posi;
    }
}
