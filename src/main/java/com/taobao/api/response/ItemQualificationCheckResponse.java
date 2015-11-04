package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.RemoteResult;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.item.qualification.check response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ItemQualificationCheckResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8297869177232792274L;

    /**
     * 商品资质信息校验结果
     */
    @ApiField("remote_result")
    private RemoteResult remoteResult;

    public void setRemoteResult(RemoteResult remoteResult) {
        this.remoteResult = remoteResult;
    }

    public RemoteResult getRemoteResult() {
        return this.remoteResult;
    }

}
