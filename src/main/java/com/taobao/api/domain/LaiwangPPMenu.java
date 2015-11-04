package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 来往公众账号菜单
 *
 * @author auto create
 * @since 1.0, null
 */
public class LaiwangPPMenu extends TaobaoObject {

    private static final long serialVersionUID = 3398377574413196748L;

    /**
     * 来往公众账号菜单按钮
     */
    @ApiListField("button")
    @ApiField("laiwang_p_p_button")
    private List<LaiwangPPButton> button;

    public List<LaiwangPPButton> getButton() {
        return this.button;
    }

    public void setButton(List<LaiwangPPButton> button) {
        this.button = button;
    }

}
