package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 宝贝自定义问题类型
 *
 * @author auto create
 * @since 1.0, null
 */
public class ItemKnowledgeType extends TaobaoObject {

    private static final long serialVersionUID = 7755355368154348169L;

    /**
     * 主键ID
     */
    @ApiField("id")
    private Long id;

    /**
     * 类型描述
     */
    @ApiField("type_desc")
    private String typeDesc;

    /**
     * 问题类型
     */
    @ApiField("type_key")
    private String typeKey;

    /**
     * 类型名称
     */
    @ApiField("type_name")
    private String typeName;

    public Long getId() {
        return this.id;
    }

    public String getTypeDesc() {
        return this.typeDesc;
    }

    public String getTypeKey() {
        return this.typeKey;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public void setTypeKey(String typeKey) {
        this.typeKey = typeKey;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

}
