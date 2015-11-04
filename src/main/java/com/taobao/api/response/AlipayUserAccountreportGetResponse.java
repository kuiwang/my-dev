package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.AlipayRecord;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: alipay.user.accountreport.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AlipayUserAccountreportGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5118643367353261182L;

    /**
     * 对账记录列表
     */
    @ApiListField("alipay_records")
    @ApiField("alipay_record")
    private List<AlipayRecord> alipayRecords;

    /**
     * 总页数
     */
    @ApiField("total_pages")
    private Long totalPages;

    /**
     * 总记录数
     */
    @ApiField("total_results")
    private Long totalResults;

    public void setAlipayRecords(List<AlipayRecord> alipayRecords) {
        this.alipayRecords = alipayRecords;
    }

    public List<AlipayRecord> getAlipayRecords() {
        return this.alipayRecords;
    }

    public void setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
    }

    public Long getTotalPages() {
        return this.totalPages;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

}
