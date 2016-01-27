package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: tmall.promotag.tag.apply response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TmallPromotagTagApplyResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4499347114714875897L;

    /**
     * 是否设置成功
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    /**
     * 优惠标签ID
     */
    @ApiField("tag_id")
    private Long tagId;

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public Long getTagId() {
        return this.tagId;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

}
