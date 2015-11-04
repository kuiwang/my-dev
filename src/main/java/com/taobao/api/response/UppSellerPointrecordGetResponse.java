package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SellerPointRecordModule;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.upp.seller.pointrecord.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class UppSellerPointrecordGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6255578698658477314L;

    /**
     * 是否调用成功
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    /**
     * 卖家积分明细记录列表
     */
    @ApiListField("seller_point_record_list")
    @ApiField("seller_point_record_module")
    private List<SellerPointRecordModule> sellerPointRecordList;

    /**
     * 记录总数
     */
    @ApiField("total_count")
    private Long totalCount;

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setSellerPointRecordList(List<SellerPointRecordModule> sellerPointRecordList) {
        this.sellerPointRecordList = sellerPointRecordList;
    }

    public List<SellerPointRecordModule> getSellerPointRecordList() {
        return this.sellerPointRecordList;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }

}
