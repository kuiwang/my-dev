package com.scott.dev.taobao.api.tools.domain;

/*
 * KFC 关键词过滤匹配结果
 */
public class KfcSearchResult {

    /*
     * 是否匹配到关键词,匹配到则为true.
     */
    private Boolean matched;

    /*
     * 匹配到的关键词的等级，值为null，或为A、B、C、D。 
     * 当匹配不到关键词时，值为null，否则值为A、B、C、D中的一个。
     *  A、B、C、D等级按严重程度从高至低排列
     */
    private String level;

    /*
     *过滤后的文本： 当匹配到B等级的词时，文本中的关键词被替换为*号，
     *content即为关键词替换后的文本； 其他情况，content始终为null 
     */
    private String content;

    public Boolean getMatched() {
        return matched;
    }

    public void setMatched(Boolean matched) {
        this.matched = matched;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
