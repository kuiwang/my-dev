package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.InsightCategoryDataDTO;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.simba.insight.catsdata.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaInsightCatsdataGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7699446164494336895L;

    /**
     * 类目详细数据列表
     */
    @ApiListField("cat_data_list")
    @ApiField("insight_category_data_d_t_o")
    private List<InsightCategoryDataDTO> catDataList;

    public List<InsightCategoryDataDTO> getCatDataList() {
        return this.catDataList;
    }

    public void setCatDataList(List<InsightCategoryDataDTO> catDataList) {
        this.catDataList = catDataList;
    }

}
