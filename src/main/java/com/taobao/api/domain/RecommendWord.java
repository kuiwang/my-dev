package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 推荐词
 *
 * @author auto create
 * @since 1.0, null
 */
public class RecommendWord extends TaobaoObject {

    private static final long serialVersionUID = 8594248417958927243L;

    /**
     * 平均价格
     */
    @ApiField("average_price")
    private String averagePrice;

    /**
     * 相关度
     */
    @ApiField("pertinence")
    private String pertinence;

    /**
     * 搜索量
     */
    @ApiField("pv")
    private String pv;

    /**
     * 推荐的关键词
     */
    @ApiField("word")
    private String word;

    public String getAveragePrice() {
        return this.averagePrice;
    }

    public String getPertinence() {
        return this.pertinence;
    }

    public String getPv() {
        return this.pv;
    }

    public String getWord() {
        return this.word;
    }

    public void setAveragePrice(String averagePrice) {
        this.averagePrice = averagePrice;
    }

    public void setPertinence(String pertinence) {
        this.pertinence = pertinence;
    }

    public void setPv(String pv) {
        this.pv = pv;
    }

    public void setWord(String word) {
        this.word = word;
    }

}
