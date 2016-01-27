package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.scitem.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ScitemUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8278367844276621631L;

    /**
     * 更新商品数量,1表示成功更新了一条数据，0：表示未找到匹配的数据
     */
    @ApiField("update_rows")
    private Long updateRows;

    public Long getUpdateRows() {
        return this.updateRows;
    }

    public void setUpdateRows(Long updateRows) {
        this.updateRows = updateRows;
    }

}
