package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.DdTopMenuDetailVO;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.dd.menu.detail response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DdMenuDetailResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8667284798862179477L;

    /**
     * 点菜单订单详情
     */
    @ApiField("result")
    private DdTopMenuDetailVO result;

    public void setResult(DdTopMenuDetailVO result) {
        this.result = result;
    }

    public DdTopMenuDetailVO getResult() {
        return this.result;
    }

}
