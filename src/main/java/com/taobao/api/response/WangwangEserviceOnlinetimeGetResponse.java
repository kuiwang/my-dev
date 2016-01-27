package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.OnlineTimesOnDay;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.wangwang.eservice.onlinetime.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WangwangEserviceOnlinetimeGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6455439979272445414L;

    /**
     * 客服在线时长（按天统计，排列）
     */
    @ApiListField("online_times_list_on_days")
    @ApiField("online_times_on_day")
    private List<OnlineTimesOnDay> onlineTimesListOnDays;

    public List<OnlineTimesOnDay> getOnlineTimesListOnDays() {
        return this.onlineTimesListOnDays;
    }

    public void setOnlineTimesListOnDays(List<OnlineTimesOnDay> onlineTimesListOnDays) {
        this.onlineTimesListOnDays = onlineTimesListOnDays;
    }

}
