package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.ump.activities.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class UmpActivitiesGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1293965854855449167L;

    /**
     * 营销活动内容，可以通过ump sdk来进行处理
     */
    @ApiListField("contents")
    @ApiField("string")
    private List<String> contents;

    /**
     * 记录总数
     */
    @ApiField("total_count")
    private Long totalCount;

    public void setContents(List<String> contents) {
        this.contents = contents;
    }

    public List<String> getContents() {
        return this.contents;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }

}
