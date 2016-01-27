package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 宝贝自定义解决方案VO
 *
 * @author auto create
 * @since 1.0, null
 */
public class ItemKnowledgeSolutionVO extends TaobaoObject {

    private static final long serialVersionUID = 8139382315978948982L;

    /**
     * 主键ID
     */
    @ApiField("id")
    private Long id;

    /**
     * 宝贝ID
     */
    @ApiField("item_id")
    private Long itemId;

    /**
     * 自定义的问题
     */
    @ApiField("question")
    private String question;

    /**
     * 解决方案
     */
    @ApiField("solution")
    private String solution;

    /**
     * 发送状态 1半自动 2全自动
     */
    @ApiField("solution_level")
    private Long solutionLevel;

    /**
     * stf 旺旺富文本格式的解决方案
     */
    @ApiField("solution_stf")
    private String solutionStf;

    /**
     * 关联 athena_item_knowledge_type 表的 type_key字段
     */
    @ApiField("type_key")
    private String typeKey;

    /**
     * 主账号
     */
    @ApiField("user_nick")
    private String userNick;

    public Long getId() {
        return this.id;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public String getQuestion() {
        return this.question;
    }

    public String getSolution() {
        return this.solution;
    }

    public Long getSolutionLevel() {
        return this.solutionLevel;
    }

    public String getSolutionStf() {
        return this.solutionStf;
    }

    public String getTypeKey() {
        return this.typeKey;
    }

    public String getUserNick() {
        return this.userNick;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public void setSolutionLevel(Long solutionLevel) {
        this.solutionLevel = solutionLevel;
    }

    public void setSolutionStf(String solutionStf) {
        this.solutionStf = solutionStf;
    }

    public void setTypeKey(String typeKey) {
        this.typeKey = typeKey;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

}
