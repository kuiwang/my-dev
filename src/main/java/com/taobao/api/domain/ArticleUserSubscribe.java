package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 用户订购信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class ArticleUserSubscribe extends TaobaoObject {

    private static final long serialVersionUID = 6756935596713279839L;

    /**
     * 订购关系到期时间
     */
    @ApiField("deadline")
    private Date deadline;

    /**
     * 收费项目代码，从合作伙伴后台（my.open.taobao.com）-收费管理-收费项目列表 能够获得收费项目代码
     */
    @ApiField("item_code")
    private String itemCode;

    public Date getDeadline() {
        return this.deadline;
    }

    public String getItemCode() {
        return this.itemCode;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

}
