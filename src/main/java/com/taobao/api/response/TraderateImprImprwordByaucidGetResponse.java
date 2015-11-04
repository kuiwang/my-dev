package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ImprItemDO;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.traderate.impr.imprword.byaucid.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TraderateImprImprwordByaucidGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5632567835784148963L;

    /**
     * 返回的大家印象的结构体
     */
    @ApiListField("impr_word_list")
    @ApiField("impr_item_d_o")
    private List<ImprItemDO> imprWordList;

    public void setImprWordList(List<ImprItemDO> imprWordList) {
        this.imprWordList = imprWordList;
    }

    public List<ImprItemDO> getImprWordList() {
        return this.imprWordList;
    }

}
