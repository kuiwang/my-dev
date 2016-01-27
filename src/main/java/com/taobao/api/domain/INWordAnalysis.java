package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 词数据分析对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class INWordAnalysis extends TaobaoObject {

    private static final long serialVersionUID = 5585216415117878351L;

    /**
     * 词名称
     */
    @ApiField("word")
    private String word;

    /**
     * 词地域占比 格式： 地域名称:比例;地域名称2:比例2;
     */
    @ApiField("word_area_per")
    private String wordAreaPer;

    /**
     * 词竞价分布 格式： 宝贝数:价格;宝贝数:价格;
     */
    @ApiField("word_hp_price")
    private String wordHpPrice;

    /**
     * 词来源占比 格式： 来源名称1:比例值;来源名称2:比例值;
     */
    @ApiField("word_source_per")
    private String wordSourcePer;

    public String getWord() {
        return this.word;
    }

    public String getWordAreaPer() {
        return this.wordAreaPer;
    }

    public String getWordHpPrice() {
        return this.wordHpPrice;
    }

    public String getWordSourcePer() {
        return this.wordSourcePer;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setWordAreaPer(String wordAreaPer) {
        this.wordAreaPer = wordAreaPer;
    }

    public void setWordHpPrice(String wordHpPrice) {
        this.wordHpPrice = wordHpPrice;
    }

    public void setWordSourcePer(String wordSourcePer) {
        this.wordSourcePer = wordSourcePer;
    }

}
