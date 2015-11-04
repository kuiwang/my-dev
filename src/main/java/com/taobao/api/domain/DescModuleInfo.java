package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 该数据结构保存宝贝描述对应的规范化信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class DescModuleInfo extends TaobaoObject {

    private static final long serialVersionUID = 8681637143844417916L;

    /**
     * 代表宝贝描述中规范化打标使用到的模块id列表，以逗号分隔。
     */
    @ApiField("anchor_module_ids")
    private String anchorModuleIds;

    /**
     * 类型代表规范化打标的类型：人工或自动化
     */
    @ApiField("type")
    private Long type;

    public String getAnchorModuleIds() {
        return this.anchorModuleIds;
    }

    public void setAnchorModuleIds(String anchorModuleIds) {
        this.anchorModuleIds = anchorModuleIds;
    }

    public Long getType() {
        return this.type;
    }

    public void setType(Long type) {
        this.type = type;
    }

}
