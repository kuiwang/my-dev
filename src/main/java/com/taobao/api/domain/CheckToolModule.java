package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 工具审核结果
 *
 * @author auto create
 * @since 1.0, null
 */
public class CheckToolModule extends TaobaoObject {

    private static final long serialVersionUID = 5321552875516949829L;

    /**
     * 工具审核的URL，工具检测通过后，ISV需要把该URL和工具基本信息一起提交UMP工具技术审核。
     */
    @ApiField("check_url")
    private String checkUrl;

    /**
     * 工具检测结果中的错误信息。
     */
    @ApiField("error_message")
    private String errorMessage;

    /**
     * 工具是否检测通过。
     */
    @ApiField("is_pass")
    private String isPass;

    /**
     * 工具中已经使用的元数据。
     */
    @ApiField("meta_def")
    private String metaDef;

    public String getCheckUrl() {
        return this.checkUrl;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public String getIsPass() {
        return this.isPass;
    }

    public String getMetaDef() {
        return this.metaDef;
    }

    public void setCheckUrl(String checkUrl) {
        this.checkUrl = checkUrl;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void setIsPass(String isPass) {
        this.isPass = isPass;
    }

    public void setMetaDef(String metaDef) {
        this.metaDef = metaDef;
    }

}
