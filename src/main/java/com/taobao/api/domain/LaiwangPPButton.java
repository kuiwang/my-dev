package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 来往公众账号菜单按钮
 *
 * @author auto create
 * @since 1.0, null
 */
public class LaiwangPPButton extends TaobaoObject {

    private static final long serialVersionUID = 5296619676337548565L;

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
     * 二级按钮列表
     */
    @ApiListField("sub_button")
    @ApiField("laiwang_p_p_sub_button")
    private List<LaiwangPPSubButton> subButton;

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

    public List<LaiwangPPSubButton> getSubButton() {
        return this.subButton;
    }

    public void setSubButton(List<LaiwangPPSubButton> subButton) {
        this.subButton = subButton;
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
