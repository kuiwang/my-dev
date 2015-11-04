package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.AddressResult;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.logistics.address.remove response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class LogisticsAddressRemoveResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6377331162995134962L;

    /**
     * 只返回修改日期modify_date
     */
    @ApiField("address_result")
    private AddressResult addressResult;

    public void setAddressResult(AddressResult addressResult) {
        this.addressResult = addressResult;
    }

    public AddressResult getAddressResult() {
        return this.addressResult;
    }

}
