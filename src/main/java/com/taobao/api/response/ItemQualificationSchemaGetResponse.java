package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Qualifications;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.item.qualification.schema.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ItemQualificationSchemaGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3754172111685161848L;

    /**
     * 商品资质返回信息结构，返回的内容，使用URLEncoder进行encoder，字符集：UTF-8
     */
    @ApiField("qualifications")
    private Qualifications qualifications;

    public Qualifications getQualifications() {
        return this.qualifications;
    }

    public void setQualifications(Qualifications qualifications) {
        this.qualifications = qualifications;
    }

}
