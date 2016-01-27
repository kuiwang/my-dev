package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 无线描述片段
 *
 * @author auto create
 * @since 1.0, null
 */
public class DescFragment extends TaobaoObject {

    private static final long serialVersionUID = 7743937387358878119L;

    /**
     * 内容体目前支持支持图片url
     */
    @ApiField("content")
    private String content;

    /**
     * 内容label，目前支持支持图片txt,img
     */
    @ApiField("label")
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
