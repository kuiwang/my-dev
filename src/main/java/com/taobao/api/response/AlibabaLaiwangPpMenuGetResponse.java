package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.LaiwangPPMenu;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: alibaba.laiwang.pp.menu.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AlibabaLaiwangPpMenuGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3151316466554482471L;

    /**
     * 所创建菜单的结构化json串数据.
     */
    @ApiField("menu")
    private LaiwangPPMenu menu;

    public LaiwangPPMenu getMenu() {
        return this.menu;
    }

    public void setMenu(LaiwangPPMenu menu) {
        this.menu = menu;
    }

}
