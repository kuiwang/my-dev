package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 提示信息对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class TipInfo extends TaobaoObject {

    private static final long serialVersionUID = 6266941526695473825L;

    /**
     * 提示信息
     */
    @ApiField("info")
    private String info;

    /**
     * 后端商品ID或者商家编码
     */
    @ApiField("sc_item_id")
    private String scItemId;

    public String getInfo() {
        return this.info;
    }

    public String getScItemId() {
        return this.scItemId;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setScItemId(String scItemId) {
        this.scItemId = scItemId;
    }

}
