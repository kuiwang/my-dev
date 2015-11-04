package com.scott.dev.taobao.api.caipiao.domain;

/**
 * 淘宝彩票彩种信息描述
 */
public class LotteryType {

    /**
     * 彩种ID
     */
    private Long id;

    /**
     * 彩种名称
     */
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
