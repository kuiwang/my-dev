package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Distributor;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.fenxiao.distributors.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoDistributorsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6696791864491374578L;

    /**
     * 分销商详细信息
     */
    @ApiListField("distributors")
    @ApiField("distributor")
    private List<Distributor> distributors;

    public void setDistributors(List<Distributor> distributors) {
        this.distributors = distributors;
    }

    public List<Distributor> getDistributors() {
        return this.distributors;
    }

}
