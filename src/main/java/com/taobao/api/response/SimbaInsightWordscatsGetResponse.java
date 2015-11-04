package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.INWordCategory;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.simba.insight.wordscats.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaInsightWordscatsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7724116735221886776L;

    /**
     * 词和类目基础信息对象列表
     */
    @ApiListField("in_word_categories")
    @ApiField("i_n_word_category")
    private List<INWordCategory> inWordCategories;

    public void setInWordCategories(List<INWordCategory> inWordCategories) {
        this.inWordCategories = inWordCategories;
    }

    public List<INWordCategory> getInWordCategories() {
        return this.inWordCategories;
    }

}
