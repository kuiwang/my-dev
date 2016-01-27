package com.scott.dev.taobao.api.wangwang.domain;

/**
 * 分流权重
 */
public class StreamWeight {

    /**
     * 账号
     */
    private String user;

    /**
     * 账号对应的权重
     */
    private Long weight;

    public String getUser() {
        return this.user;
    }

    public Long getWeight() {
        return this.weight;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

}
