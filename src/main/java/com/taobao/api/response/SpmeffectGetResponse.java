package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SpmResult;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.spmeffect.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SpmeffectGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7229313351141825797L;

    /**
     * 某一天该Appkey的站点导购数据
     */
    @ApiField("spm_result")
    private SpmResult spmResult;

    public SpmResult getSpmResult() {
        return this.spmResult;
    }

    public void setSpmResult(SpmResult spmResult) {
        this.spmResult = spmResult;
    }

}
