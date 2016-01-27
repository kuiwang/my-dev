package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 视频文件地址
 *
 * @author auto create
 * @since 1.0, null
 */
public class OSSFile extends TaobaoObject {

    private static final long serialVersionUID = 3591552449836743388L;

    /**
     * OSS bucket名称
     */
    @ApiField("Bucket")
    private String bucket;

    /**
     * oss 数据中心
     */
    @ApiField("Location")
    private String location;

    /**
     * OSS 文件对象名称
     */
    @ApiField("Object")
    private String object;

    public String getBucket() {
        return this.bucket;
    }

    public String getLocation() {
        return this.location;
    }

    public String getObject() {
        return this.object;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setObject(String object) {
        this.object = object;
    }

}
