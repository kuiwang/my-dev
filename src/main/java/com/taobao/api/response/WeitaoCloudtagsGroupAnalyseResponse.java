package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.AnalyzeDO;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.weitao.cloudtags.group.analyse response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WeitaoCloudtagsGroupAnalyseResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1774418895636123546L;

    /**
     * 透视返回结果
     */
    @ApiField("data_list")
    private AnalyzeDO dataList;

    /**
     * 是否成功
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    public void setDataList(AnalyzeDO dataList) {
        this.dataList = dataList;
    }

    public AnalyzeDO getDataList() {
        return this.dataList;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

}
