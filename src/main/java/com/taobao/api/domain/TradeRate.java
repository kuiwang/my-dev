package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 评价列表
 *
 * @author auto create
 * @since 1.0, null
 */
public class TradeRate extends TaobaoObject {

    private static final long serialVersionUID = 1378534286495937578L;

    /**
     * 评价内容,最大长度:500个汉字
     */
    @ApiField("content")
    private String content;

    /**
     * 评价创建时间,格式:yyyy-MM-dd HH:mm:ss
     */
    @ApiField("created")
    private Date created;

    /**
     * 商品价格,精确到2位小数;单位:元.如:200.07，表示:200元7分
     */
    @ApiField("item_price")
    private String itemPrice;

    /**
     * 商品标题
     */
    @ApiField("item_title")
    private String itemTitle;

    /**
     * 评价者昵称
     */
    @ApiField("nick")
    private String nick;

    /**
     * 商品的数字ID
     */
    @ApiField("num_iid")
    private Long numIid;

    /**
     * 子订单ID
     */
    @ApiField("oid")
    private Long oid;

    /**
     * 被评价者昵称
     */
    @ApiField("rated_nick")
    private String ratedNick;

    /**
     * 评价解释,最大长度:500个汉字
     */
    @ApiField("reply")
    private String reply;

    /**
     * 评价结果,可选值:good(好评),neutral(中评),bad(差评)
     */
    @ApiField("result")
    private String result;

    /**
     * 评价者角色.可选值:seller(卖家),buyer(买家)
     */
    @ApiField("role")
    private String role;

    /**
     * 交易ID
     */
    @ApiField("tid")
    private Long tid;

    /**
     * 评价信息是否用于记分， 可取值：true(参与记分)和false(不参与记分)
     */
    @ApiField("valid_score")
    private Boolean validScore;

    public String getContent() {
        return this.content;
    }

    public Date getCreated() {
        return this.created;
    }

    public String getItemPrice() {
        return this.itemPrice;
    }

    public String getItemTitle() {
        return this.itemTitle;
    }

    public String getNick() {
        return this.nick;
    }

    public Long getNumIid() {
        return this.numIid;
    }

    public Long getOid() {
        return this.oid;
    }

    public String getRatedNick() {
        return this.ratedNick;
    }

    public String getReply() {
        return this.reply;
    }

    public String getResult() {
        return this.result;
    }

    public String getRole() {
        return this.role;
    }

    public Long getTid() {
        return this.tid;
    }

    public Boolean getValidScore() {
        return this.validScore;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public void setOid(Long oid) {
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

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public void setValidScore(Boolean validScore) {
        this.validScore = validScore;
    }

}
