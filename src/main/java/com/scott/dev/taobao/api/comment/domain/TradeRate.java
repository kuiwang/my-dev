package com.scott.dev.taobao.api.comment.domain;

import java.util.Date;

import com.scott.dev.taobao.api.Price;

/*
 * 评价列表
 */
public class TradeRate {

    //评价内容,最大长度:500个汉字
    private String content;

    //评价创建时间,格式:yyyy-MM-dd HH:mm:ss
    private Date created;

    //商品价格,精确到2位小数;单位:元.如:200.07，表示:200元7分
    private Price itemPrice;

    //商品标题
    private String itemTitle;

    //评价者昵称
    private String nick;

    //商品的数字ID
    private Number numIid;

    //子订单ID
    private Number oid;

    //被评价者昵称
    private String ratedNick;

    //评价解释,最大长度:500个汉字
    private String reply;

    //评价结果,可选值:good(好评),neutral(中评),bad(差评)
    private String result;

    //评价者角色.可选值:seller(卖家),buyer(买家)
    private String role;

    //交易ID
    private Number tid;

    ///评价信息是否用于记分， 可取值：true(参与记分)和false(不参与记分)
    private Boolean validScore;

    public String getContent() {
        return content;
    }

    public Date getCreated() {
        return created;
    }

    public Price getItemPrice() {
        return itemPrice;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public String getNick() {
        return nick;
    }

    public Number getNumIid() {
        return numIid;
    }

    public Number getOid() {
        return oid;
    }

    public String getRatedNick() {
        return ratedNick;
    }

    public String getReply() {
        return reply;
    }

    public String getResult() {
        return result;
    }

    public String getRole() {
        return role;
    }

    public Number getTid() {
        return tid;
    }

    public Boolean getValidScore() {
        return validScore;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setItemPrice(Price itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setNumIid(Number numIid) {
        this.numIid = numIid;
    }

    public void setOid(Number oid) {
        this.oid = oid;
    }

    public void setRatedNick(String ratedNick) {
        this.ratedNick = ratedNick;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setTid(Number tid) {
        this.tid = tid;
    }

    public void setValidScore(Boolean validScore) {
        this.validScore = validScore;
    }

}
