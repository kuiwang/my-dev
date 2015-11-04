package com.scott.dev.taobao.api.juhuasuan.domain;

import java.util.Date;
import java.util.List;

/**
 * 聚划算商品组对象
 */
public class GroupData {

    /**
     * 组id，唯一标识一个聚划算的组
     */
    private Long groupId;

    /**
     * 组的名称
     */
    private String groupName;

    /**
     * 商品组所对应的平台id，1001=聚划算
     */
    private Long platformId;

    /**
     * 团开始时间
     */
    private Date groupStartTime;

    /**
     * 团结束时间
     */
    private Date groupEndTime;

    /**
     * 该组是否在聚划算平台显示
     */
    private Boolean juView;

    /**
     * 聚划算商品对象列表
     */
    private List<ItemData> itemList;

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Long getPlatformId() {
        return platformId;
    }

    public void setPlatformId(Long platformId) {
        this.platformId = platformId;
    }

    public Date getGroupStartTime() {
        return groupStartTime;
    }

    public void setGroupStartTime(Date groupStartTime) {
        this.groupStartTime = groupStartTime;
    }

    public Date getGroupEndTime() {
        return groupEndTime;
    }

    public void setGroupEndTime(Date groupEndTime) {
        this.groupEndTime = groupEndTime;
    }

    public Boolean getJuView() {
        return juView;
    }

    public void setJuView(Boolean juView) {
        this.juView = juView;
    }

    public List<ItemData> getItemList() {
        return itemList;
    }

    public void setItemList(List<ItemData> itemList) {
        this.itemList = itemList;
    }

}
