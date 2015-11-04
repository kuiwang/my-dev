package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.weitao.menu.query response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WeitaoMenuQueryResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8579152692884372678L;

    /**
     * 是否成功
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    /**
     * 菜单数据
     */
    @ApiField("menu")
    private String menu;

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getMenu() {
        return this.menu;
    }

}
