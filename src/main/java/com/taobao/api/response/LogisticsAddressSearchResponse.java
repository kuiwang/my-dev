package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.AddressResult;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.logistics.address.search response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class LogisticsAddressSearchResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7171122217321494168L;

    /**
     * 一组地址库数据，
     */
    @ApiListField("addresses")
    @ApiField("address_result")
    private List<AddressResult> addresses;

    public void setAddresses(List<AddressResult> addresses) {
        this.addresses = addresses;
    }

    public List<AddressResult> getAddresses() {
        return this.addresses;
    }

}
