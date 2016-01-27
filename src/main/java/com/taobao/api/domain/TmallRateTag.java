package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 天猫评价标签对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class TmallRateTag extends TaobaoObject {

    private static final long serialVersionUID = 6192919753795954324L;

    /**
     * 表示标签的极性，正极true，负极false
     */
    @ApiField("posi")
    private Boolean posi;

    /**
     * 表示标签的名称
     */
    @ApiField("tag_name")
    private String tagName;

    public Boolean getPosi() {
        return this.posi;
    }

    public String getTagName() {
        return this.tagName;
    }

    public void setPosi(Boolean posi) {
        this.posi = posi;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

}
