package com.aliyun.api.ecs.ecs20140526.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: ecs.aliyuncs.com.AbsConfigService.2014-05-26 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AbsConfigServiceResponse extends AliyunResponse {

    private static final long serialVersionUID = 1146572397742489719L;

    /**
     * List
     */
    @ApiListField("List")
    @ApiField("String")
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public List<String> getList() {
        return this.list;
    }

}
