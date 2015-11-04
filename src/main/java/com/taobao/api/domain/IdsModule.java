package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 用于保存宝贝描述规范化模块信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class IdsModule extends TaobaoObject {

    private static final long serialVersionUID = 3258577296669323811L;

    /**
     * 宝贝描述规范化模块id
     */
    @ApiField("id")
    private Long id;

    /**
     * 宝贝描述规范化模块名
     */
    @ApiField("name")
    private String name;

    /**
     * 0为自动打标； 1为人工打标；
     */
    @ApiField("type")
    private Long type;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getType() {
        return this.type;
    }

    public void setType(Long type) {
        this.type = type;
    }

}
