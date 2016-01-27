package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * DBInstanceParameter
 *
 * @author auto create
 * @since 1.0, null
 */
public class DBInstanceParameter extends TaobaoObject {

    private static final long serialVersionUID = 3712714155943319898L;

    /**
     * 参数描述
     */
    @ApiField("ParameterDescription")
    private String parameterDescription;

    /**
     * 参数名
     */
    @ApiField("ParameterName")
    private String parameterName;

    /**
     * 参数值
     */
    @ApiField("ParameterValue")
    private String parameterValue;

    public String getParameterDescription() {
        return this.parameterDescription;
    }

    public String getParameterName() {
        return this.parameterName;
    }

    public String getParameterValue() {
        return this.parameterValue;
    }

    public void setParameterDescription(String parameterDescription) {
        this.parameterDescription = parameterDescription;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }

}
