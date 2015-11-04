package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.EbookMediaResource;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.ebookmedia.file.query response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class EbookmediaFileQueryResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3643242495278441733L;

    /**
     * 查询的结果集
     */
    @ApiListField("results")
    @ApiField("ebook_media_resource")
    private List<EbookMediaResource> results;

    public void setResults(List<EbookMediaResource> results) {
        this.results = results;
    }

    public List<EbookMediaResource> getResults() {
        return this.results;
    }

}
