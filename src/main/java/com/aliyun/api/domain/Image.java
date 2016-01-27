package com.aliyun.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 镜像信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class Image extends TaobaoObject {

    private static final long serialVersionUID = 1522482938944763424L;

    /**
     * 操作系统位数
     */
    @ApiField("Architecture")
    private String architecture;

    /**
     * 创建时间。按照ISO8601标准表示，并需要使用UTC时间。格式为： YYYY-MM-DDThh:mmZ
     */
    @ApiField("CreationTime")
    private String creationTime;

    /**
     * 描述
     */
    @ApiField("Description")
    private String description;

    /**
     * 镜像下包含磁盘和快照的系统描述
     */
    @ApiListField("DiskDeviceMappings")
    @ApiField("DiskDeviceMapping")
    private List<DiskDeviceMapping> diskDeviceMappings;

    /**
     * 镜像ID
     */
    @ApiField("ImageId")
    private String imageId;

    /**
     * 镜像名称
     */
    @ApiField("ImageName")
    private String imageName;

    /**
     * 镜像所有者
     */
    @ApiField("ImageOwnerAlias")
    private String imageOwnerAlias;

    /**
     * 镜像版本
     */
    @ApiField("ImageVersion")
    private String imageVersion;

    /**
     * 用户是否订阅了该镜像的ProductCode对应的镜像商品的服务条款. True：表示已经订阅 False：表示未订阅
     */
    @ApiField("IsSubscribed")
    private String isSubscribed;

    /**
     * 操作系统名称
     */
    @ApiField("OSName")
    private String oSName;

    /**
     * 平台
     */
    @ApiField("Platform")
    private String platform;

    /**
     * 镜像市场的镜像商品标示
     */
    @ApiField("ProductCode")
    private String productCode;

    /**
     * 大小
     */
    @ApiField("Size")
    private Long size;

    /**
     * 可见性
     */
    @ApiField("Visibility")
    private String visibility;

    public String getArchitecture() {
        return this.architecture;
    }

    public String getCreationTime() {
        return this.creationTime;
    }

    public String getDescription() {
        return this.description;
    }

    public List<DiskDeviceMapping> getDiskDeviceMappings() {
        return this.diskDeviceMappings;
    }

    public String getImageId() {
        return this.imageId;
    }

    public String getImageName() {
        return this.imageName;
    }

    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    public String getImageVersion() {
        return this.imageVersion;
    }

    public String getIsSubscribed() {
        return this.isSubscribed;
    }

    public String getoSName() {
        return this.oSName;
    }

    public String getPlatform() {
        return this.platform;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public Long getSize() {
        return this.size;
    }

    public String getVisibility() {
        return this.visibility;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDiskDeviceMappings(List<DiskDeviceMapping> diskDeviceMappings) {
        this.diskDeviceMappings = diskDeviceMappings;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public void setImageOwnerAlias(String imageOwnerAlias) {
        this.imageOwnerAlias = imageOwnerAlias;
    }

    public void setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
    }

    public void setIsSubscribed(String isSubscribed) {
        this.isSubscribed = isSubscribed;
    }

    public void setoSName(String oSName) {
        this.oSName = oSName;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

}
