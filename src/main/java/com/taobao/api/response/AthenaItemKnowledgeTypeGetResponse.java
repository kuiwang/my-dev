package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ItemKnowledgeType;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.athena.item.knowledge.type.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AthenaItemKnowledgeTypeGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2616874543581437238L;

    /**
     * 宝贝自定义问题列表
     */
    @ApiListField("item_knowledge_type_list")
    @ApiField("item_knowledge_type")
    private List<ItemKnowledgeType> itemKnowledgeTypeList;

    public void setItemKnowledgeTypeList(List<ItemKnowledgeType> itemKnowledgeTypeList) {
        this.itemKnowledgeTypeList = itemKnowledgeTypeList;
    }

    public List<ItemKnowledgeType> getItemKnowledgeTypeList() {
        return this.itemKnowledgeTypeList;
    }

}
