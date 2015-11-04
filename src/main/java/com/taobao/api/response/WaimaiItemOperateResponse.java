package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.BatchOperateResult;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.waimai.item.operate response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WaimaiItemOperateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8338568519323364435L;

    /**
     * 批量操作结果
     */
    @ApiField("batch_operate_result")
    private BatchOperateResult batchOperateResult;

    public void setBatchOperateResult(BatchOperateResult batchOperateResult) {
        this.batchOperateResult = batchOperateResult;
    }

    public BatchOperateResult getBatchOperateResult() {
        return this.batchOperateResult;
    }

}
