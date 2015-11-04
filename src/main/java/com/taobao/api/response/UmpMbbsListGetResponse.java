package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.ump.mbbs.list.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class UmpMbbsListGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5822596383761183398L;

    /**
     * 营销积木块内容列表，内容为json格式的，可以通过ump sdk里面的MBB.fromJson来处理
     */
    @ApiListField("mbbs")
    @ApiField("string")
    private List<String> mbbs;

    public void setMbbs(List<String> mbbs) {
        this.mbbs = mbbs;
    }

    public List<String> getMbbs() {
        return this.mbbs;
    }

}
