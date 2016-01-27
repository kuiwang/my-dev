package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.AddressResult;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.logistics.address.modify response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class LogisticsAddressModifyResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4784377259643929927L;

    /**
     * 只返回修改时间modify_date
     */
    @ApiField("address_result")
    private AddressResult addressResult;

    public AddressResult getAddressResult() {
        return this.addressResult;
    }

    public void setAddressResult(AddressResult addressResult) {
        this.addressResult = addressResult;
    }

}
