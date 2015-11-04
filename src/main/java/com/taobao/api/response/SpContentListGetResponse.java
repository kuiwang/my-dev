package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SpContentDOForList;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.sp.content.list.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SpContentListGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3176771788433787869L;

    /**
     * 内容列表
     */
    @ApiListField("contents")
    @ApiField("sp_content_d_o_for_list")
    private List<SpContentDOForList> contents;

    /**
     * 符合条件的总记录数
     */
    @ApiField("total_result")
    private Long totalResult;

    public void setContents(List<SpContentDOForList> contents) {
        this.contents = contents;
    }

    public List<SpContentDOForList> getContents() {
        return this.contents;
    }

    public void setTotalResult(Long totalResult) {
        this.totalResult = totalResult;
    }

    public Long getTotalResult() {
        return this.totalResult;
    }

}
