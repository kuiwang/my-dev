package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 创意修改记录，只记录最后一次修改
 *
 * @author auto create
 * @since 1.0, null
 */
public class CreativeRecord extends TaobaoObject {

    private static final long serialVersionUID = 6689571756613544823L;

    /**
     * 审核拒绝原因描述
     */
    @ApiField("audit_desc")
    private String auditDesc;

    /**
     * 审核状态：
     * audit_wait-待审核；audit_pass-审核通过(上线)；audit_reject-审核拒绝；默认为audit_pass。
     */
    @ApiField("audit_status")
    private String auditStatus;

    /**
     * 创建时间
     */
    @ApiField("create_time")
    private Date createTime;

    /**
     * 关键词id
     */
    @ApiField("creative_id")
    private Long creativeId;

    /**
     * 创意图片地址，必须是推广组对应商品的图片之一
     */
    @ApiField("img_url")
    private String imgUrl;

    /**
     * 系统记录最后修改时间
     */
    @ApiField("modified_time")
    private Date modifiedTime;

    /**
     * 创意被修改的时间
     */
    @ApiField("modify_time")
    private Date modifyTime;

    /**
     * 主人昵称
     */
    @ApiField("nick")
    private String nick;

    /**
     * 修改前创意图片地址
     */
    @ApiField("old_img_url")
    private String oldImgUrl;

    /**
     * 修改前创意标题
     */
    @ApiField("old_title")
    private String oldTitle;

    /**
     * 创意标题，最多20个汉字
     */
    @ApiField("title")
    private String title;

    public String getAuditDesc() {
        return this.auditDesc;
    }

    public void setAuditDesc(String auditDesc) {
        this.auditDesc = auditDesc;
    }

    public String getAuditStatus() {
        return this.auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreativeId() {
        return this.creativeId;
    }

    public void setCreativeId(Long creativeId) {
        this.creativeId = creativeId;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Date getModifiedTime() {
        return this.modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public Date getModifyTime() {
        return this.modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getNick() {
        return this.nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getOldImgUrl() {
        return this.oldImgUrl;
    }

    public void setOldImgUrl(String oldImgUrl) {
        this.oldImgUrl = oldImgUrl;
    }

    public String getOldTitle() {
        return this.oldTitle;
    }

    public void setOldTitle(String oldTitle) {
        this.oldTitle = oldTitle;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
