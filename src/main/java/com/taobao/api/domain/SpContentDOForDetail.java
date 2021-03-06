package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 建站内容详情DO
 *
 * @author auto create
 * @since 1.0, null
 */
public class SpContentDOForDetail extends TaobaoObject {

    private static final long serialVersionUID = 8499543947939149275L;

    /**
     * 类型为文章的内容摘要
     */
    @ApiField("articleabstract")
    private String articleabstract;

    /**
     * 分类名称
     */
    @ApiField("classname")
    private String classname;

    /**
     * 评论数
     */
    @ApiField("commentnum")
    private Long commentnum;

    /**
     * 推荐理
     */
    @ApiField("comments")
    private String comments;

    /**
     * 文章内容
     */
    @ApiField("content")
    private String content;

    /**
     * 内容的detail页面地址，数值为html链接，主要用于展现内容的detail信息的
     */
    @ApiField("detailurl")
    private String detailurl;

    /**
     * 创建时间
     */
    @ApiField("gmtcreate")
    private Date gmtcreate;

    /**
     * 修改时间
     */
    @ApiField("gmtmodified")
    private Date gmtmodified;

    /**
     * 内容主键ID
     */
    @ApiField("id")
    private Long id;

    /**
     * 内容关联的商品详细信息列表，Json格式的字符串，每个对象包含的信息如下: 1:auctionId 宝贝ID; 2:title 宝贝标题
     * 3:categoryId 宝贝的类目ID 4:price 宝贝价格 5:commission 宝贝淘客价格 6:picUrl
     * 宝贝主图地址 7:picUrls 宝贝所有的普通商品图片 8:detailUrl 宝贝的detail地址
     */
    @ApiField("items")
    private String items;

    /**
     * 喜欢数
     */
    @ApiField("likenum")
    private Long likenum;

    /**
     * 主图
     */
    @ApiField("mainpic")
    private String mainpic;

    /**
     * 图片URL,多个图片中间以,分割
     */
    @ApiField("picurl")
    private String picurl;

    /**
     * 价格
     */
    @ApiField("price")
    private String price;

    /**
     * 内容平台的内容id
     */
    @ApiField("referid")
    private Long referid;

    /**
     * 内容关联到的商品。如果有多个商品，用,分割
     */
    @ApiField("referitems")
    private String referitems;

    /**
     * 内容类型: uz.item:宝贝 uz.image:图片 uz.article:自定义 uz.graphic:图文
     */
    @ApiField("schemaname")
    private String schemaname;

    /**
     * 分享数
     */
    @ApiField("sharenum")
    private Long sharenum;

    /**
     * 物种ID
     */
    @ApiField("sitecategoryid")
    private Long sitecategoryid;

    /**
     * 站点ID
     */
    @ApiField("taesiteid")
    private Long taesiteid;

    /**
     * 标签名称。多个标签以,分割
     */
    @ApiField("tags")
    private String tags;

    /**
     * 附着目标的目标id
     */
    @ApiField("targetid")
    private Long targetid;

    /**
     * 内容标题
     */
    @ApiField("title")
    private String title;

    /**
     * 是否置顶
     */
    @ApiField("topenable")
    private Long topenable;

    /**
     * 用户ID
     */
    @ApiField("userid")
    private Long userid;

    /**
     * 浏览数
     */
    @ApiField("viewnum")
    private Long viewnum;

    public String getArticleabstract() {
        return this.articleabstract;
    }

    public String getClassname() {
        return this.classname;
    }

    public Long getCommentnum() {
        return this.commentnum;
    }

    public String getComments() {
        return this.comments;
    }

    public String getContent() {
        return this.content;
    }

    public String getDetailurl() {
        return this.detailurl;
    }

    public Date getGmtcreate() {
        return this.gmtcreate;
    }

    public Date getGmtmodified() {
        return this.gmtmodified;
    }

    public Long getId() {
        return this.id;
    }

    public String getItems() {
        return this.items;
    }

    public Long getLikenum() {
        return this.likenum;
    }

    public String getMainpic() {
        return this.mainpic;
    }

    public String getPicurl() {
        return this.picurl;
    }

    public String getPrice() {
        return this.price;
    }

    public Long getReferid() {
        return this.referid;
    }

    public String getReferitems() {
        return this.referitems;
    }

    public String getSchemaname() {
        return this.schemaname;
    }

    public Long getSharenum() {
        return this.sharenum;
    }

    public Long getSitecategoryid() {
        return this.sitecategoryid;
    }

    public Long getTaesiteid() {
        return this.taesiteid;
    }

    public String getTags() {
        return this.tags;
    }

    public Long getTargetid() {
        return this.targetid;
    }

    public String getTitle() {
        return this.title;
    }

    public Long getTopenable() {
        return this.topenable;
    }

    public Long getUserid() {
        return this.userid;
    }

    public Long getViewnum() {
        return this.viewnum;
    }

    public void setArticleabstract(String articleabstract) {
        this.articleabstract = articleabstract;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public void setCommentnum(Long commentnum) {
        this.commentnum = commentnum;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDetailurl(String detailurl) {
        this.detailurl = detailurl;
    }

    public void setGmtcreate(Date gmtcreate) {
        this.gmtcreate = gmtcreate;
    }

    public void setGmtmodified(Date gmtmodified) {
        this.gmtmodified = gmtmodified;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public void setLikenum(Long likenum) {
        this.likenum = likenum;
    }

    public void setMainpic(String mainpic) {
        this.mainpic = mainpic;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setReferid(Long referid) {
        this.referid = referid;
    }

    public void setReferitems(String referitems) {
        this.referitems = referitems;
    }

    public void setSchemaname(String schemaname) {
        this.schemaname = schemaname;
    }

    public void setSharenum(Long sharenum) {
        this.sharenum = sharenum;
    }

    public void setSitecategoryid(Long sitecategoryid) {
        this.sitecategoryid = sitecategoryid;
    }

    public void setTaesiteid(Long taesiteid) {
        this.taesiteid = taesiteid;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public void setTargetid(Long targetid) {
        this.targetid = targetid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTopenable(Long topenable) {
        this.topenable = topenable;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public void setViewnum(Long viewnum) {
        this.viewnum = viewnum;
    }

}
