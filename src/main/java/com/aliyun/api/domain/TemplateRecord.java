package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TemplateRecord
 *
 * @author auto create
 * @since 1.0, null
 */
public class TemplateRecord extends TaobaoObject {

    private static final long serialVersionUID = 3242186217917282556L;

    /**
     * 校验代码，参数的可选范围,是一个正则表达式
     */
    @ApiField("CheckingCode")
    private String checkingCode;

    /**
     * 是否可修改，Flase: 不可修改 Ture:可修改
     */
    @ApiField("ForceModify")
    private String forceModify;

    /**
     * 是否立即生效，取值：取值：True: 需要重启数据库才能生效 False: 立即生效
     */
    @ApiField("ForceRestart")
    private String forceRestart;

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
     * 参数默认值
     */
    @ApiField("ParameterValue")
    private String parameterValue;

    public String getCheckingCode() {
        return this.checkingCode;
    }

    public String getForceModify() {
        return this.forceModify;
    }

    public String getForceRestart() {
        return this.forceRestart;
    }

    public String getParameterDescription() {
        return this.parameterDescription;
    }

    public String getParameterName() {
        return this.parameterName;
    }

    public String getParameterValue() {
        return this.parameterValue;
    }

    public void setCheckingCode(String checkingCode) {
        this.checkingCode = checkingCode;
    }

    public void setForceModify(String forceModify) {
        this.forceModify = forceModify;
    }

    public void setForceRestart(String forceRestart) {
        this.forceRestart = forceRestart;
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
