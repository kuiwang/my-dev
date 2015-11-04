package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 磁盘种类 cloud：支持创建云磁盘和独立云磁盘 ephemeral：支持创建临时磁盘
 *
 * @author auto create
 * @since 1.0, null
 */
public class DiskCategories extends TaobaoObject {

    private static final long serialVersionUID = 5497537349555293663L;

    /**
     * 磁盘种类
     */
    @ApiField("DiskCategories")
    private String diskCategories;

    public String getDiskCategories() {
        return this.diskCategories;
    }

    public void setDiskCategories(String diskCategories) {
        this.diskCategories = diskCategories;
    }

}
