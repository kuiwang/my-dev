package com.scott.dev.taobao.api.wangwang.domain;

import java.util.Date;

/**
 * 评价详细
 */
public class EvalDetail {

    /**
     * 评价详细： 1 非常满意 2 满意 3 一般 4 不满意
     */
    private Long evalCode;

    /**
     * 评价接收者
     */
    private String evalRecer;

    /**
     * 评价发送者
     */
    private String evalSender;

    /**
     * 评价时间
     */
    private Date evalTime;

    /**
     * 评价发送时间
     */
    private Date sendTime;

    public Long getEvalCode() {
        return this.evalCode;
    }

    public String getEvalRecer() {
        return this.evalRecer;
    }

    public String getEvalSender() {
        return this.evalSender;
    }

    public Date getEvalTime() {
        return this.evalTime;
    }

    public Date getSendTime() {
        return this.sendTime;
    }

    public void setEvalCode(Long evalCode) {
        this.evalCode = evalCode;
    }

    public void setEvalRecer(String evalRecer) {
        this.evalRecer = evalRecer;
    }

    public void setEvalSender(String evalSender) {
        this.evalSender = evalSender;
    }

    public void setEvalTime(Date evalTime) {
        this.evalTime = evalTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

}
