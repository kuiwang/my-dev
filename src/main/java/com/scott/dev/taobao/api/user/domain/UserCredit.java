package com.scott.dev.taobao.api.user.domain;

/*
 * 用户信用
 */
public class UserCredit {

    /*
     * 信用等级（是根据score生成的），
     * 信用等级：淘宝会员在淘宝网上的信用度，分为20个级别，
     * 级别如：level = 1 时，表示一心；level = 2 时，表示二心
     */
    private Integer level;

    /*
     * 信用总分（“好评”加一分，“中评”不加分，“差评”扣一分。分越高，等级越高）
     */
    private Integer score;

    /*
     * 收到的评价总条数。取值范围:大于零的整数
     */
    private Integer totalNum;

    /*
     * 收到的好评总条数。取值范围:大于零的整数
     */
    private Integer goodNum;

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getGoodNum() {
        return goodNum;
    }

    public void setGoodNum(Integer goodNum) {
        this.goodNum = goodNum;
    }
}
