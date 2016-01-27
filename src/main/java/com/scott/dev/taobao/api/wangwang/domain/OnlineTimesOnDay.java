package com.scott.dev.taobao.api.wangwang.domain;

import java.util.Date;
import java.util.List;

/**
 * 某天的客服在线时长列表
 */
public class OnlineTimesOnDay {

    /**
     * 在线日期
     */
    private Date onlineDate;

    /**
     * 在线时长列表
     */
    private List<OnlineTimeById> onlineTimeByIds;

    public Date getOnlineDate() {
        return this.onlineDate;
    }

    public List<OnlineTimeById> getOnlineTimeByIds() {
        return this.onlineTimeByIds;
    }

    public void setOnlineDate(Date onlineDate) {
        this.onlineDate = onlineDate;
    }

    public void setOnlineTimeByIds(List<OnlineTimeById> onlineTimeByIds) {
        this.onlineTimeByIds = onlineTimeByIds;
    }

}
