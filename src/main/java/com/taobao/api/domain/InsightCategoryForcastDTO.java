package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 词的预测类目对应的结果对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class InsightCategoryForcastDTO extends TaobaoObject {

    private static final long serialVersionUID = 4439377844457588692L;

    /**
     * 查询词
     */
    @ApiField("bidword")
    private String bidword;

    /**
     * 表示该类目的所有父级类目，按层级顺序排列，层级越高的在前面，不同的层级之间用空格分隔
     */
    @ApiField("cat_path_id")
    private String catPathId;

    /**
     * 表示类目的所有父级类目的名称，不同层级之间用（ascii码为2的字符）分隔开
     */
    @ApiField("cat_path_name")
    private String catPathName;

    /**
     * 表示词与该类目的相关度，值越大表示越相关
     */
    @ApiField("score")
    private String score;

    public String getBidword() {
        return this.bidword;
    }

    public void setBidword(String bidword) {
        this.bidword = bidword;
    }

    public String getCatPathId() {
        return this.catPathId;
    }

    public void setCatPathId(String catPathId) {
        this.catPathId = catPathId;
    }

    public String getCatPathName() {
        return this.catPathName;
    }

    public void setCatPathName(String catPathName) {
        this.catPathName = catPathName;
    }

    public String getScore() {
        return this.score;
    }

    public void setScore(String score) {
        this.score = score;
    }

}
