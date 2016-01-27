package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 内容DO
 *
 * @author auto create
 * @since 1.0, null
 */
public class SpContentDOForList extends TaobaoObject {

    private static final long serialVersionUID = 8136755563916268678L;

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
