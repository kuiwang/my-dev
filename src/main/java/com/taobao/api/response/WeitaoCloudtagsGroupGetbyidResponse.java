package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.CloudGroup;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.weitao.cloudtags.group.getbyid response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WeitaoCloudtagsGroupGetbyidResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4518235896773566688L;

    /**
     * 分组列表信息
     */
    @ApiListField("group_list")
    @ApiField("cloud_group")
    private List<CloudGroup> groupList;

    public void setGroupList(List<CloudGroup> groupList) {
        this.groupList = groupList;
    }

    public List<CloudGroup> getGroupList() {
        return this.groupList;
    }

}
