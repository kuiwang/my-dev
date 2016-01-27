package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 表示类目的详细信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class InsightCategoryInfoDTO extends TaobaoObject {

    private static final long serialVersionUID = 5111841379426547696L;

    /**
     * 类目Id
     */
    @ApiField("cat_id")
    private Long catId;

    /**
     * 类目的级别
     */
    @ApiField("cat_level")
    private Long catLevel;

    /**
     * 类目名称
     */
    @ApiField("cat_name")
    private String catName;

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
     * 表示类目信息上次同步的时间
     */
    @ApiField("last_sync_time")
    private Date lastSyncTime;

    /**
     * 父类目Id
     */
    @ApiField("parent_cat_id")
    private Long parentCatId;

    public Long getCatId() {
        return this.catId;
    }

    public Long getCatLevel() {
        return this.catLevel;
    }

    public String getCatName() {
        return this.catName;
    }

    public String getCatPathId() {
        return this.catPathId;
    }

    public String getCatPathName() {
        return this.catPathName;
    }

    public Date getLastSyncTime() {
        return this.lastSyncTime;
    }

    public Long getParentCatId() {
        return this.parentCatId;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public void setCatLevel(Long catLevel) {
        this.catLevel = catLevel;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public void setCatPathId(String catPathId) {
        this.catPathId = catPathId;
    }

    public void setCatPathName(String catPathName) {
        this.catPathName = catPathName;
    }

    public void setLastSyncTime(Date lastSyncTime) {
        this.lastSyncTime = lastSyncTime;
    }

    public void setParentCatId(Long parentCatId) {
        this.parentCatId = parentCatId;
    }

}
