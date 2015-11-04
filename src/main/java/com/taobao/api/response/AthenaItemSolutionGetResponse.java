package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ItemKnowledgeSolutionVO;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.athena.item.solution.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AthenaItemSolutionGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7716597772924118448L;

    /**
     * 解决方案列表
     */
    @ApiListField("item_solutions")
    @ApiField("item_knowledge_solution_v_o")
    private List<ItemKnowledgeSolutionVO> itemSolutions;

    public void setItemSolutions(List<ItemKnowledgeSolutionVO> itemSolutions) {
        this.itemSolutions = itemSolutions;
    }

    public List<ItemKnowledgeSolutionVO> getItemSolutions() {
        return this.itemSolutions;
    }

}
