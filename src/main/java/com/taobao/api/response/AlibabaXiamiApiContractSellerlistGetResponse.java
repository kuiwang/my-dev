package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.XiamiSellerlist;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: alibaba.xiami.api.contract.sellerlist.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AlibabaXiamiApiContractSellerlistGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6538226565786321932L;

    /**
     * 卖家销售详情和总条数
     */
    @ApiField("data")
    private XiamiSellerlist data;

    public void setData(XiamiSellerlist data) {
        this.data = data;
    }

    public XiamiSellerlist getData() {
        return this.data;
    }

}
