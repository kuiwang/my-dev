package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 外卖订单查询结果
 *
 * @author auto create
 * @since 1.0, null
 */
public class ListResult extends TaobaoObject {

    private static final long serialVersionUID = 5859199589649752155L;

    /**
     * 订单列表
     */
    @ApiListField("result_list")
    @ApiField("takeout_third_order")
    private List<TakeoutThirdOrder> resultList;

    /**
     * 返回记录数
     */
    @ApiField("result_size")
    private Long resultSize;

    /**
     * 0:失败 1:成功
     */
    @ApiField("ret_code")
    private String retCode;

    /**
     * 总记录数
     */
    @ApiField("total_count")
    private Long totalCount;

    public List<TakeoutThirdOrder> getResultList() {
        return this.resultList;
    }

    public Long getResultSize() {
        return this.resultSize;
    }

    public String getRetCode() {
        return this.retCode;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }

    public void setResultList(List<TakeoutThirdOrder> resultList) {
        this.resultList = resultList;
    }

    public void setResultSize(Long resultSize) {
        this.resultSize = resultSize;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

}
