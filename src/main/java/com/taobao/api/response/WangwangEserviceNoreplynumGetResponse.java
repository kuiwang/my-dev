package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.NonReplyStatOnDay;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.wangwang.eservice.noreplynum.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WangwangEserviceNoreplynumGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1747244629373414165L;

    /**
     * 未回复统计列表
     */
    @ApiListField("non_reply_stat_on_days")
    @ApiField("non_reply_stat_on_day")
    private List<NonReplyStatOnDay> nonReplyStatOnDays;

    public List<NonReplyStatOnDay> getNonReplyStatOnDays() {
        return this.nonReplyStatOnDays;
    }

    public void setNonReplyStatOnDays(List<NonReplyStatOnDay> nonReplyStatOnDays) {
        this.nonReplyStatOnDays = nonReplyStatOnDays;
    }

}
