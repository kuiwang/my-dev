package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 公众账号关注者openid列表
 *
 * @author auto create
 * @since 1.0, null
 */
public class LaiwangUsers extends TaobaoObject {

    private static final long serialVersionUID = 2457369637134342976L;

    /**
     * 拉取的OPENID个数，最大值为10000
     */
    @ApiField("count")
    private Long count;

    /**
     * OPENID列表数据
     */
    @ApiField("data")
    private String data;

    /**
     * 拉取列表的后一个用户的OPENID
     */
    @ApiField("next_openid")
    private String nextOpenid;

    /**
     * 关注该公众账号的总用户数
     */
    @ApiField("total")
    private Long total;

    public Long getCount() {
        return this.count;
    }

    public String getData() {
        return this.data;
    }

    public String getNextOpenid() {
        return this.nextOpenid;
    }

    public Long getTotal() {
        return this.total;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setNextOpenid(String nextOpenid) {
        this.nextOpenid = nextOpenid;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

}
