package com.scott.dev.taobao.api.item.domain;

/*
 * 用于保存宝贝描述规范化模块信息
 */
public class IdsModule {

    /*
     * 宝贝描述规范化模块id
     */
    private Number id;

    /*
     * 宝贝描述规范化模块名
     */
    private String name;

    /*
     * 0为自动打标； 1为人工打标；
     */
    private Number type;

    public Number getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Number getType() {
        return type;
    }

    public void setId(Number id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Number type) {
        this.type = type;
    }
}
