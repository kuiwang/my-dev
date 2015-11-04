package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 评价详细
 *
 * @author auto create
 * @since 1.0, null
 */
public class EvalDetail extends TaobaoObject {

    private static final long serialVersionUID = 4783911852499885593L;

    /**
     * 评价详细： 1 非常满意 2 满意 3 一般 4 不满意
     */
    @ApiField("eval_code")
    private Long evalCode;

    /**
     * 评价接收者
     */
    @ApiField("eval_recer")
    private String evalRecer;

    /**
     * 评价发送者
     */
    @ApiField("eval_sender")
    private String evalSender;

    /**
     * 评价时间
     */
    @ApiField("eval_time")
    private Date evalTime;

    /**
     * 评价发送时间
     */
    @ApiField("send_time")
    private Date sendTime;

    public Long getEvalCode() {
        return this.evalCode;
    }

    public void setEvalCode(Long evalCode) {
        this.evalCode = evalCode;
    }

    public String getEvalRecer() {
        return this.evalRecer;
    }

    public void setEvalRecer(String evalRecer) {
        this.evalRecer = evalRecer;
    }

    public String getEvalSender() {
        return this.evalSender;
    }

    public void setEvalSender(String evalSender) {
        this.evalSender = evalSender;
    }

    public Date getEvalTime() {
        return this.evalTime;
    }

    public void setEvalTime(Date evalTime) {
        this.evalTime = evalTime;
    }

    public Date getSendTime() {
        return this.sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

}
