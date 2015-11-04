package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.CloudsTag;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.weitao.cloudtags.tags.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WeitaoCloudtagsTagsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3828633929428935328L;

    /**
     * 是否成功
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    /**
     * 具体的标签数据
     */
    @ApiListField("tag_list")
    @ApiField("clouds_tag")
    private List<CloudsTag> tagList;

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setTagList(List<CloudsTag> tagList) {
        this.tagList = tagList;
    }

    public List<CloudsTag> getTagList() {
        return this.tagList;
    }

}
