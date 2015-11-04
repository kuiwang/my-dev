package com.scott.dev.taobao.api.laiwang.domain;

import java.util.List;

import com.taobao.api.domain.LaiwangPPSubButton;

//来往公众账号菜单按钮
public class LaiwangPPButton {

    /**
     * 按钮的key.
     */
    private String key;

    /**
     * 公众账号的菜单名称
     */
    private String name;

    /**
     * 按钮点击后跳转的目的地址.
     */
    private String target;

    /**
     * 按钮跳转的url
     */
    private String url;

    /**
     * 按钮的类型
     */
    private String type;

    /**
     * 二级按钮列表
     */
    private List<LaiwangPPSubButton> subButton;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<LaiwangPPSubButton> getSubButton() {
        return subButton;
    }

    public void setSubButton(List<LaiwangPPSubButton> subButton) {
        this.subButton = subButton;
    }

}
