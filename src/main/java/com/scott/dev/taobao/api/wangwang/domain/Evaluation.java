package com.scott.dev.taobao.api.wangwang.domain;

/**
 * 客服评价
 */
public class Evaluation {

    /**
     * 客服评价内容
     */
    private String evaluationName;

    /**
     * 评价数量
     */
    private String evaluationNum;

    public String getEvaluationName() {
        return this.evaluationName;
    }

    public String getEvaluationNum() {
        return this.evaluationNum;
    }

    public void setEvaluationName(String evaluationName) {
        this.evaluationName = evaluationName;
    }

    public void setEvaluationNum(String evaluationNum) {
        this.evaluationNum = evaluationNum;
    }

}
