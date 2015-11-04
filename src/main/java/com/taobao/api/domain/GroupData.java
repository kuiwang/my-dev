package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 聚划算商品组对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class GroupData extends TaobaoObject {

    private static final long serialVersionUID = 3461485634869974654L;

    /**
     * 团结束时间
     */
    @ApiField("group_end_time")
    private Date groupEndTime;

    /**
     * 组id，唯一标识一个聚划算的组
     */
    @ApiField("group_id")
    private Long groupId;

    /**
     * 组的名称
     */
    @ApiField("group_name")
    private String groupName;

    /**
     * 团开始时间
     */
    @ApiField("group_start_time")
    private Date groupStartTime;

    /**
     * 聚划算商品对象列表
     */
    @ApiListField("item_list")
    @ApiField("item_data")
    private List<ItemData> itemList;

    /**
     * 该组是否在聚划算平台显示
     */
    @ApiField("ju_view")
    private Boolean juView;

    /**
     * 商品组所对应的平台id，1001=聚划算
     */
    @ApiField("platform_id")
    private Long platformId;

    public Date getGroupEndTime() {
        return this.groupEndTime;
    }

    public void setGroupEndTime(Date groupEndTime) {
        this.groupEndTime = groupEndTime;
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Date getGroupStartTime() {
        return this.groupStartTime;
    }

    public void setGroupStartTime(Date groupStartTime) {
        this.groupStartTime = groupStartTime;
    }

    public List<ItemData> getItemList() {
        return this.itemList;
    }

    public void setItemList(List<ItemData> itemList) {
        this.itemList = itemList;
    }

    public Boolean getJuView() {
        return this.juView;
    }

    public void setJuView(Boolean juView) {
        this.juView = juView;
    }

    public Long getPlatformId() {
        return this.platformId;
    }

    public void setPlatformId(Long platformId) {
        this.platformId = platformId;
    }

}
