package com.scott.dev.taobao.api.wangwang.domain;

/**
 * 关键词统计
 */
public class WordCountList {

    /**
     * 关键词数量
     */
    private Long count;

    /**
     * 关键词
     */
    private String word;

    public Long getCount() {
        return this.count;
    }

    public String getWord() {
        return this.word;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public void setWord(String word) {
        this.word = word;
    }

}
