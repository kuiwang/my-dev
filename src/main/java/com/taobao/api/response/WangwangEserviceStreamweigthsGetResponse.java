package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.StreamWeight;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.wangwang.eservice.streamweigths.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WangwangEserviceStreamweigthsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5331751692254221676L;

    /**
     * 0表示返回正确
     */
    @ApiField("result_code")
    private Long resultCode;

    /**
     * 返回数据条数
     */
    @ApiField("result_count")
    private Long resultCount;

    /**
     * 分流权重数据
     */
    @ApiListField("staff_stream_weights")
    @ApiField("stream_weight")
    private List<StreamWeight> staffStreamWeights;

    /**
     * 返回数据的总权重，返回数据为空的时候没有这个数字
     */
    @ApiField("total_weight")
    private Long totalWeight;

    public Long getResultCode() {
        return this.resultCode;
    }

    public Long getResultCount() {
        return this.resultCount;
    }

    public List<StreamWeight> getStaffStreamWeights() {
        return this.staffStreamWeights;
    }

    public Long getTotalWeight() {
        return this.totalWeight;
    }

    public void setResultCode(Long resultCode) {
        this.resultCode = resultCode;
    }

    public void setResultCount(Long resultCount) {
        this.resultCount = resultCount;
    }

    public void setStaffStreamWeights(List<StreamWeight> staffStreamWeights) {
        this.staffStreamWeights = staffStreamWeights;
    }

    public void setTotalWeight(Long totalWeight) {
        this.totalWeight = totalWeight;
    }

}
