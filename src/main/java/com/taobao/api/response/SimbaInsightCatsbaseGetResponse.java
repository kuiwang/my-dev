package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.INCategoryBase;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.simba.insight.catsbase.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaInsightCatsbaseGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8281354946942558144L;

    /**
     * 类目基础数据列表
     */
    @ApiListField("in_category_bases")
    @ApiField("i_n_category_base")
    private List<INCategoryBase> inCategoryBases;

    public List<INCategoryBase> getInCategoryBases() {
        return this.inCategoryBases;
    }

    public void setInCategoryBases(List<INCategoryBase> inCategoryBases) {
        this.inCategoryBases = inCategoryBases;
    }

}
