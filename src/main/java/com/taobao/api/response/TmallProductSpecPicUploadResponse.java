package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: tmall.product.spec.pic.upload response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TmallProductSpecPicUploadResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5471886471334332361L;

    /**
     * 上传成功的产品规格认证图片url
     */
    @ApiField("spec_pic_url")
    private String specPicUrl;

    public String getSpecPicUrl() {
        return this.specPicUrl;
    }

    public void setSpecPicUrl(String specPicUrl) {
        this.specPicUrl = specPicUrl;
    }

}
