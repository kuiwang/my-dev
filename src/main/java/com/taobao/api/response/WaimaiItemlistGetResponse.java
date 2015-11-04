package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TopAuction;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.waimai.itemlist.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WaimaiItemlistGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2725775968147627785L;

    /**
     * 返回外卖宝贝列表
     */
    @ApiListField("data_list")
    @ApiField("top_auction")
    private List<TopAuction> dataList;

    /**
     * 符合条件的外卖宝贝总数
     */
    @ApiField("total_results")
    private Long totalResults;

    public void setDataList(List<TopAuction> dataList) {
        this.dataList = dataList;
    }

    public List<TopAuction> getDataList() {
        return this.dataList;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

}
