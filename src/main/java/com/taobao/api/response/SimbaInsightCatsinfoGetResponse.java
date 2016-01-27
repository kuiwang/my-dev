package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.InsightCategoryInfoDTO;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.simba.insight.catsinfo.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaInsightCatsinfoGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5252433475549882576L;

    /**
     * 类目详细信息
     */
    @ApiListField("category_info_list")
    @ApiField("insight_category_info_d_t_o")
    private List<InsightCategoryInfoDTO> categoryInfoList;

    public List<InsightCategoryInfoDTO> getCategoryInfoList() {
        return this.categoryInfoList;
    }

    public void setCategoryInfoList(List<InsightCategoryInfoDTO> categoryInfoList) {
        this.categoryInfoList = categoryInfoList;
    }

}
