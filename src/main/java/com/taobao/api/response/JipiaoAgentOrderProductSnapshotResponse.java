package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.jipiao.agent.order.product.snapshot response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class JipiaoAgentOrderProductSnapshotResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5359832943975637763L;

    /**
     * { "pnr_id": { "passengers": ["用户姓名"], "isAutoBook": false,
     * "segments": [{ "depTime": "2014-04-04 15:25:00.0", "filghtNO":
     * "KN5856", "flightSegment": "SZX-NAY" }], "pnr": "-", "policyMemo":
     * "-", "fareMemo": "-", "channel": "渠道" } }
     * 
     * pnr_id:淘宝内部pnr id 例如72749001 isAutoBook：是否使用淘宝自动出票
     * passengers：乘客姓名，可包含多个 segments：航段信息 pnr：pnr值 如果没有值，则返回"-"
     * policyMemo：政策备注，如果没有值，则返回"-" fareMemo：运价备注，如果没有值，则返回"-" channel：渠道
     * 例如51book:300001
     */
    @ApiField("data")
    private String data;

    /**
     * 失败时的错误信息
     */
    @ApiField("error_message")
    private String errorMessage;

    /**
     * 返回操作成功失败信息
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return this.data;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

}
