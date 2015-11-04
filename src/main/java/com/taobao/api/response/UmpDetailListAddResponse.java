package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.ump.detail.list.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class UmpDetailListAddResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7532434875598996237L;

    /**
     * 返回对应的营销详情的id列表！若有某一条插入失败，会将插入成功的detail_id放到errorMessage里面返回，
     * 此时errorMessage里面会包含格式为
     * (id1,id2,id3)的插入成功id列表。这些ids会对交易产生影响，通过截取此信息，将对应detail删除！
     */
    @ApiListField("detail_id_list")
    @ApiField("number")
    private List<Long> detailIdList;

    public void setDetailIdList(List<Long> detailIdList) {
        this.detailIdList = detailIdList;
    }

    public List<Long> getDetailIdList() {
        return this.detailIdList;
    }

}
