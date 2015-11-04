package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.StoreInfo;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.wlb.stores.baseinfo.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WlbStoresBaseinfoGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8712266362122237439L;

    /**
     * 仓库列表
     */
    @ApiListField("store_info_list")
    @ApiField("store_info")
    private List<StoreInfo> storeInfoList;

    /**
     * 返回的总数
     */
    @ApiField("total_count")
    private Long totalCount;

    public void setStoreInfoList(List<StoreInfo> storeInfoList) {
        this.storeInfoList = storeInfoList;
    }

    public List<StoreInfo> getStoreInfoList() {
        return this.storeInfoList;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }

}
