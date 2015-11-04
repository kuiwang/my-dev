package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 淘宝彩票彩种信息描述
 *
 * @author auto create
 * @since 1.0, null
 */
public class LotteryType extends TaobaoObject {

    private static final long serialVersionUID = 7466363243153254296L;

    /**
     * 彩种ID
     */
    @ApiField("id")
    private Long id;

    /**
     * 彩种名称
     */
    @ApiField("name")
    private String name;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
