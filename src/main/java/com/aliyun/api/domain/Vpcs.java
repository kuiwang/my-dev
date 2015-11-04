package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 虚拟网络详情
 *
 * @author auto create
 * @since 1.0, null
 */
public class Vpcs extends TaobaoObject {

    private static final long serialVersionUID = 6734831373719227867L;

    /**
     * 虚拟网络所在的地域
     */
    @ApiField("RegionId")
    private String regionId;

    /**
     * 虚拟网络状态，包括pending和Available两种
     */
    @ApiField("Status")
    private String status;

    /**
     * 虚拟网络ID
     */
    @ApiField("VpcId")
    private String vpcId;

    /**
     * 虚拟网络名称，[1,128]英文或中文字符，不能以http://和https://开头。
     */
    @ApiField("VpcName")
    private String vpcName;

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getVpcName() {
        return this.vpcName;
    }

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

}
