package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 来往公众账号菜单子按钮
 *
 * @author auto create
 * @since 1.0, null
 */
public class LaiwangPPSubButton extends TaobaoObject {

    private static final long serialVersionUID = 3364885272233815613L;

    /**
     * 按钮的key.
     */
    @ApiField("key")
    private String key;

    /**
     * 公众账号的菜单名称
     */
    @ApiField("name")
    private String name;

    /**
     * 按钮点击后跳转的目的地址.
     */
    @ApiField("target")
    private String target;

    /**
     * 按钮的类型
     */
    @ApiField("type")
    private String type;

    /**
     * 按钮跳转的url
     */
    @ApiField("url")
    private String url;

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTarget() {
        return this.target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
