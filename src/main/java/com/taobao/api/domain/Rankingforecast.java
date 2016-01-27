package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 关键词预估
 *
 * @author auto create
 * @since 1.0, null
 */
public class Rankingforecast extends TaobaoObject {

    private static final long serialVersionUID = 3688216241873872757L;

    /**
     * 词ID
     */
    @ApiField("keyword_id")
    private Long keywordId;

    /**
     * 主人昵称
     */
    @ApiField("nick")
    private String nick;

    /**
     * 返回prices对应的排名
     */
    @ApiListField("prices")
    @ApiField("number")
    private List<Long> prices;

    /**
     * 词名称
     */
    @ApiField("word")
    private String word;

    public Long getKeywordId() {
        return this.keywordId;
    }

    public String getNick() {
        return this.nick;
    }

    public List<Long> getPrices() {
        return this.prices;
    }

    public String getWord() {
        return this.word;
    }

    public void setKeywordId(Long keywordId) {
        this.keywordId = keywordId;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setPrices(List<Long> prices) {
        this.prices = prices;
    }

    public void setWord(String word) {
        this.word = word;
    }

}
