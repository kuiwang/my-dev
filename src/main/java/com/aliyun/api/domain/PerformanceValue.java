package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 性能值的列表
 *
 * @author auto create
 * @since 1.0, null
 */
public class PerformanceValue extends TaobaoObject {

    private static final long serialVersionUID = 6727894926748779453L;

    /**
     * 计算日期
     */
    @ApiField("Date")
    private String date;

    /**
     * 性能值
     */
    @ApiField("Value")
    private String value;

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
