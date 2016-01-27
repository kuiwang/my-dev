package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.CheckToolModule;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.promotionmisc.tool.check response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PromotionmiscToolCheckResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6254667762254712315L;

    /**
     * 工具审核结果。
     */
    @ApiField("check_tool_module")
    private CheckToolModule checkToolModule;

    /**
     * 接口调用错误信息描述。
     */
    @ApiField("error_message")
    private String errorMessage;

    /**
     * 工具检测动作是否成功。检测是否通过请查看返回值default_model里的is_pass。
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    public CheckToolModule getCheckToolModule() {
        return this.checkToolModule;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setCheckToolModule(CheckToolModule checkToolModule) {
        this.checkToolModule = checkToolModule;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

}
