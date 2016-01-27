package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * SQLReport
 *
 * @author auto create
 * @since 1.0, null
 */
public class SQLReport extends TaobaoObject {

    private static final long serialVersionUID = 3222782422217888585L;

    /**
     * 返回行总数
     */
    @ApiField("ReturnTotalRowCounts")
    private String returnTotalRowCounts;

    /**
     * SQL语句
     */
    @ApiField("SQLText")
    private String sQLText;

    /**
     * 执行总时长
     */
    @ApiField("TotalExecutionCounts")
    private String totalExecutionCounts;

    /**
     * 总消耗时间
     */
    @ApiField("TotalExecutionTimes")
    private String totalExecutionTimes;

    public String getReturnTotalRowCounts() {
        return this.returnTotalRowCounts;
    }

    public String getsQLText() {
        return this.sQLText;
    }

    public String getTotalExecutionCounts() {
        return this.totalExecutionCounts;
    }

    public String getTotalExecutionTimes() {
        return this.totalExecutionTimes;
    }

    public void setReturnTotalRowCounts(String returnTotalRowCounts) {
        this.returnTotalRowCounts = returnTotalRowCounts;
    }

    public void setsQLText(String sQLText) {
        this.sQLText = sQLText;
    }

    public void setTotalExecutionCounts(String totalExecutionCounts) {
        this.totalExecutionCounts = totalExecutionCounts;
    }

    public void setTotalExecutionTimes(String totalExecutionTimes) {
        this.totalExecutionTimes = totalExecutionTimes;
    }

}
