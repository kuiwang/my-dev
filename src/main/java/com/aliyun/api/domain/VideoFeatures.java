package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 视频特征信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class VideoFeatures extends TaobaoObject {

    private static final long serialVersionUID = 6368198196536864526L;

    /**
     * 视频的码率
     */
    @ApiField("BitRate")
    private Long bitRate;

    /**
     * 视频时长(s)
     */
    @ApiField("Duration")
    private Long duration;

    /**
     * 视频的格式
     */
    @ApiField("FileFormat")
    private String fileFormat;

    /**
     * 视频文件大小(byte)
     */
    @ApiField("FileSize")
    private Long fileSize;

    /**
     * 视频的帧率
     */
    @ApiField("FrameRate")
    private Long frameRate;

    /**
     * 视频的高(像素)
     */
    @ApiField("Height")
    private Long height;

    /**
     * 视频的宽(像素)
     */
    @ApiField("Width")
    private Long width;

    public Long getBitRate() {
        return this.bitRate;
    }

    public Long getDuration() {
        return this.duration;
    }

    public String getFileFormat() {
        return this.fileFormat;
    }

    public Long getFileSize() {
        return this.fileSize;
    }

    public Long getFrameRate() {
        return this.frameRate;
    }

    public Long getHeight() {
        return this.height;
    }

    public Long getWidth() {
        return this.width;
    }

    public void setBitRate(Long bitRate) {
        this.bitRate = bitRate;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public void setFrameRate(Long frameRate) {
        this.frameRate = frameRate;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public void setWidth(Long width) {
        this.width = width;
    }

}
