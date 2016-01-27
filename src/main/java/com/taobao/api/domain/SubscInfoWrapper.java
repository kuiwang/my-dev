package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * SubscInfoWrapper
 *
 * @author auto create
 * @since 1.0, null
 */
public class SubscInfoWrapper extends TaobaoObject {

    private static final long serialVersionUID = 7621412622377885583L;

    /**
     * 需求订购信息
     */
    @ApiListField("subsc_info_list")
    @ApiField("subsc_info")
    private List<SubscInfo> subscInfoList;

    /**
     * 总量
     */
    @ApiField("total_count")
    private Long totalCount;

    public List<SubscInfo> getSubscInfoList() {
        return this.subscInfoList;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }

    public void setSubscInfoList(List<SubscInfo> subscInfoList) {
        this.subscInfoList = subscInfoList;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

}
