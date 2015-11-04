package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 无线描述信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class MobileDescInfo extends TaobaoObject {

    private static final long serialVersionUID = 3579614747787899957L;

    /**
     * 无线描述信息
     */
    @ApiListField("desc_list")
    @ApiField("desc_fragment")
    private List<DescFragment> descList;

    public List<DescFragment> getDescList() {
        return this.descList;
    }

    public void setDescList(List<DescFragment> descList) {
        this.descList = descList;
    }

}
