package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.File;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.media.file.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class MediaFileGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6636575259975327192L;

    /**
     * 查询分页数据对象
     */
    @ApiListField("result")
    @ApiField("file")
    private List<File> result;

    /**
     * 文件总数
     */
    @ApiField("total")
    private Long total;

    public List<File> getResult() {
        return this.result;
    }

    public Long getTotal() {
        return this.total;
    }

    public void setResult(List<File> result) {
        this.result = result;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

}
