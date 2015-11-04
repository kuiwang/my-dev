package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 分析数据
 *
 * @author auto create
 * @since 1.0, null
 */
public class AnalyzeData extends TaobaoObject {

    private static final long serialVersionUID = 4567274653497691223L;

    /**
     * 返回结果
     */
    @ApiListField("result_list")
    @ApiField("string")
    private List<String> resultList;

    public List<String> getResultList() {
        return this.resultList;
    }

    public void setResultList(List<String> resultList) {
        this.resultList = resultList;
    }

}
