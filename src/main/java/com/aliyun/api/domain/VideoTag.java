package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 标签类型
 *
 * @author auto create
 * @since 1.0, null
 */
public class VideoTag extends TaobaoObject {

    private static final long serialVersionUID = 4314984458724583193L;

    /**
     * tag类型
     */
    @ApiField("TagName")
    private String tagName;

    public String getTagName() {
        return this.tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

}
