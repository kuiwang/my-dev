package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 分流权重
 *
 * @author auto create
 * @since 1.0, null
 */
public class StreamWeight extends TaobaoObject {

    private static final long serialVersionUID = 7337356684719823668L;

    /**
     * 账号
     */
    @ApiField("user")
    private String user;

    /**
     * 账号对应的权重
     */
    @ApiField("weight")
    private Long weight;

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Long getWeight() {
        return this.weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

}
