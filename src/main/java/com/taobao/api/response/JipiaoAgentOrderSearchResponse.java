package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SearchOrderResult;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.jipiao.agent.order.search response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class JipiaoAgentOrderSearchResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6314315325964217365L;

    /**
     * 失败时的错误信息
     */
    @ApiField("error_message")
    private String errorMessage;

    /**
     * 返回操作成功失败信息
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    /**
     * 机票订单搜索返回结果对象
     */
    @ApiField("search_result")
    private SearchOrderResult searchResult;

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setSearchResult(SearchOrderResult searchResult) {
        this.searchResult = searchResult;
    }

    public SearchOrderResult getSearchResult() {
        return this.searchResult;
    }

}
