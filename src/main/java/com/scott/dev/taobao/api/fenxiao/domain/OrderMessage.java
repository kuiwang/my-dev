package com.scott.dev.taobao.api.fenxiao.domain;

import java.util.Date;

/*
 * 采购单留言列表
 */
public class OrderMessage {

    /*
     * 留言内容
     */
    private String messageContent;

    /*
     * 留言时间
     */
    private Date messageTime;

    /*
     * 留言标题，例如：分销商留言，供应商留言，买家留言
     */
    private String messageTitle;

    /*
     * 留言时的图片地址
     */
    private String picUrl;

    public String getMessageContent() {
        return messageContent;
    }

    public Date getMessageTime() {
        return messageTime;
    }

    public String getMessageTitle() {
        return messageTitle;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public void setMessageTime(Date messageTime) {
        this.messageTime = messageTime;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }
}
