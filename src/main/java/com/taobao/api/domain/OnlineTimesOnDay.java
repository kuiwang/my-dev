package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 某天的客服在线时长列表
 *
 * @author auto create
 * @since 1.0, null
 */
public class OnlineTimesOnDay extends TaobaoObject {

    private static final long serialVersionUID = 1869992869994814619L;

    /**
     * 在线日期
     */
    @ApiField("online_date")
    private Date onlineDate;

    /**
     * 在线时长列表
     */
    @ApiListField("online_time_by_ids")
    @ApiField("online_time_by_id")
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
