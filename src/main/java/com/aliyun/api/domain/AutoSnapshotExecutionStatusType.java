package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 自动快照执行状态类型，返回上一次的执行结果。
 *
 * @author auto create
 * @since 1.0, null
 */
public class AutoSnapshotExecutionStatusType extends TaobaoObject {

    private static final long serialVersionUID = 1547883216598519871L;

    /**
     * 返回最近一次执行的状态：Standby|Excuted|Failed
     * Standby：刚设置完成还未开始执行或者系统盘和数据盘的策略都关闭 Executed：执行成功 Failed：执行失败
     */
    @ApiField("DataDiskExcutionStatus")
    private String dataDiskExcutionStatus;

    /**
     * 返回最近一次执行的状态：Standby|Executed|Failed
     * Standby：刚设置完成还未开始执行或者系统盘和数据盘的策略都关闭 Executed：执行成功 Failed：执行失败
     */
    @ApiField("SystemDiskExcutionStatus")
    private String systemDiskExcutionStatus;

    public String getDataDiskExcutionStatus() {
        return this.dataDiskExcutionStatus;
    }

    public String getSystemDiskExcutionStatus() {
        return this.systemDiskExcutionStatus;
    }

    public void setDataDiskExcutionStatus(String dataDiskExcutionStatus) {
        this.dataDiskExcutionStatus = dataDiskExcutionStatus;
    }

    public void setSystemDiskExcutionStatus(String systemDiskExcutionStatus) {
        this.systemDiskExcutionStatus = systemDiskExcutionStatus;
    }

}
