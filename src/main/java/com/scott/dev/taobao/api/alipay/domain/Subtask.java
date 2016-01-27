package com.scott.dev.taobao.api.alipay.domain;

/**
 * 批量异步任务的子任务结果
 */
public class Subtask {

    /**
     * 标记子任务是否成功。为true表示子任务成功，用户可以按照正确执行的结果格式解析sub_task_result。
     * 为false表示子任务失败了，用户需要按照失败的结果格式解析sub_task_result（里面只有sub_code和sub_msg）
     */
    private Boolean isSuccess;

    /**
     * 子任务的有效请求参数，以json格式进行key:value的组合
     */
    private String subTaskRequest;

    /**
     * 子任务返回的结果，以json格式进行key:value组合，可以和单个api请求结果解析复用。以获取交易订单详情为例：
     * 子任务执行成功返回的结果格式为
     * ：{“trade”:{"tid":123456,"seller_nick":"淘宝卖家"}}；子任务执行失败结果格式为
     * {"sub_code":"isv.trade-not-exist","sub_msg":"交易订单不存在"}
     */
    private String subTaskResult;

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public String getSubTaskRequest() {
        return this.subTaskRequest;
    }

    public String getSubTaskResult() {
        return this.subTaskResult;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public void setSubTaskRequest(String subTaskRequest) {
        this.subTaskRequest = subTaskRequest;
    }

    public void setSubTaskResult(String subTaskResult) {
        this.subTaskResult = subTaskResult;
    }

}
