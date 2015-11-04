package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Range;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.ump.range.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class UmpRangeGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2559225786972678817L;

    /**
     * 营销范围类列表！
     */
    @ApiListField("ranges")
    @ApiField("range")
    private List<Range> ranges;

    public void setRanges(List<Range> ranges) {
        this.ranges = ranges;
    }

    public List<Range> getRanges() {
        return this.ranges;
    }

}
