package com.scott.dev.taobao.api.wangwang.domain;

import java.util.List;

/**
 * 聊天记录列表
 */
public class MsgList {

    /**
     * 当direction=0有效，完整消息内容
     */
    private String content;

    /**
     * 表示消息方向 0:from_id->to_id 1:to_id->from_id
     */
    private Long direction;

    /**
     * 当direction=1有效，消息长度
     */
    private Long length;

    /**
     * 东八区时间
     */
    private String time;

    /**
     * type & 1 ：自动回复<br>
     * type & 2 : 陌生人消息（等于0是好友消息）<br>
     * type & 4 : 广播消息<br>
     * type & 8 : 最近联系人陌生人消息<br>
     * type & 16 : 离线消息<br>
     * type & 32 : 子账号转发系统消息
     */
    private Long type;

    /**
     * 当direction=1有效，url列表
     */
    private List<UrlList> urlLists;

    /**
     * 当direction=1有效，（关键词，数量）列表
     */
    private List<WordCountList> wordLists;

    public String getContent() {
        return this.content;
    }

    public Long getDirection() {
        return this.direction;
    }

    public Long getLength() {
        return this.length;
    }

    public String getTime() {
        return this.time;
    }

    public Long getType() {
        return this.type;
    }

    public List<UrlList> getUrlLists() {
        return this.urlLists;
    }

    public List<WordCountList> getWordLists() {
        return this.wordLists;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDirection(Long direction) {
        this.direction = direction;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public void setUrlLists(List<UrlList> urlLists) {
        this.urlLists = urlLists;
    }

    public void setWordLists(List<WordCountList> wordLists) {
        this.wordLists = wordLists;
    }

}
