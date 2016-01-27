package com.scott.dev.taobao.api.tae.domain;

/**
 * 无线描述片段
 */
public class DescFragment {

    /**
     * 内容体目前支持支持图片url
     */
    private String content;

    /**
     * 内容label，目前支持支持图片txt,img
     */
    private String label;

    public String getContent() {
        return this.content;
    }

    public String getLabel() {
        return this.label;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}
