package com.scott.dev.taobao.api.laiwang.domain;

import com.alibaba.fastjson.JSON;

//公众账号关注者openid列表
public class LaiwangUsers {

    //关注该公众账号的总用户数
    private Number total;

    //拉取的OPENID个数，最大值为10000
    private Number count;

    //OPENID列表数据
    private JSON data;

    //拉取列表的后一个用户的OPENID
    private String nextOpenid;
}
