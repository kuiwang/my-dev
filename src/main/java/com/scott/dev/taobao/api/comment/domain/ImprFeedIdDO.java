package com.scott.dev.taobao.api.comment.domain;

/*
 * 单条交易子订单语义标签对象
 */
public class ImprFeedIdDO {

    /*
     * 评价结果（1好评 0中评 -1差评）
     */
    private Number rate;

    /*
     * 被评价者昵称
     */
    private String nick;

    /*
     * 存放主评和追评的评价标签信息 biz_type(1:主评 2:追评)
     */
    private ImprFeedInfoDO[] feedInfoList;

    public Number getRate() {
        return rate;
    }

    public void setRate(Number rate) {
        this.rate = rate;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public ImprFeedInfoDO[] getFeedInfoList() {
        return feedInfoList;
    }

    public void setFeedInfoList(ImprFeedInfoDO[] feedInfoList) {
        this.feedInfoList = feedInfoList;
    }
}
