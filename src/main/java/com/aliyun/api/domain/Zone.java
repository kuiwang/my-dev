package com.aliyun.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * Zone
 *
 * @author auto create
 * @since 1.0, null
 */
public class Zone extends TaobaoObject {

    private static final long serialVersionUID = 2593893676116691742L;

    /**
     * 允许创建的资源类型
     */
    @ApiListField("AvailableDiskCategories")
    @ApiField("DiskCategories")
    private List<DiskCategories> availableDiskCategories;

    /**
     * 允许创建的资源类型
     */
    @ApiListField("AvailableResourceCreation")
    @ApiField("ResourceTypes")
    private List<ResourceTypes> availableResourceCreation;

    /**
     * 区域名称
     */
    @ApiField("LocalName")
    private String localName;

    /**
     * 区域ID
     */
    @ApiField("ZoneId")
    private String zoneId;

    public List<DiskCategories> getAvailableDiskCategories() {
        return this.availableDiskCategories;
    }

    public void setAvailableDiskCategories(List<DiskCategories> availableDiskCategories) {
        this.availableDiskCategories = availableDiskCategories;
    }

    public List<ResourceTypes> getAvailableResourceCreation() {
        return this.availableResourceCreation;
    }

    public void setAvailableResourceCreation(List<ResourceTypes> availableResourceCreation) {
        this.availableResourceCreation = availableResourceCreation;
    }

    public String getLocalName() {
        return this.localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

}
