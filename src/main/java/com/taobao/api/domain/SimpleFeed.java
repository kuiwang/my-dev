package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 查询feed列表里，返回简单的feed数据：标题和id
 *
 * @author auto create
 * @since 1.0, null
 */
public class SimpleFeed extends TaobaoObject {

    private static final long serialVersionUID = 6357555784969796131L;

    /**
     * feedId
     */
    @ApiField("id")
    private Long id;

    /**
     * feed的标题
     */
    @ApiField("title")
    private String title;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
