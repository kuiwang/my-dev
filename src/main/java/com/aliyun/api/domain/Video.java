package com.aliyun.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 视频信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class Video extends TaobaoObject {

    private static final long serialVersionUID = 7138921727787161986L;

    /**
     * 视频添加到媒资库的时间
     */
    @ApiField("AddedTime")
    private String addedTime;

    /**
     * 视频封面图片
     */
    @ApiField("CoverUrl")
    private String coverUrl;

    /**
     * 视频描述
     */
    @ApiField("Description")
    private String description;

    /**
     * 视频原始文件地址信息
     */
    @ApiField("InputFile")
    private OSSFile inputFile;

    /**
     * 视频媒资Id
     */
    @ApiField("MediaId")
    private String mediaId;

    /**
     * 视频标签列表
     */
    @ApiListField("Tags")
    @ApiField("VideoTag")
    private List<VideoTag> tags;

    /**
     * 视频标题
     */
    @ApiField("Title")
    private String title;

    /**
     * 视频固有特征信息
     */
    @ApiField("VideoFeatures")
    private VideoFeatures videoFeatures;

    /**
     * 视频的状态：Normal是正常,Deleted是媒资已经被删除
     */
    @ApiField("VideoStatus")
    private String videoStatus;

    public String getAddedTime() {
        return this.addedTime;
    }

    public void setAddedTime(String addedTime) {
        this.addedTime = addedTime;
    }

    public String getCoverUrl() {
        return this.coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OSSFile getInputFile() {
        return this.inputFile;
    }

    public void setInputFile(OSSFile inputFile) {
        this.inputFile = inputFile;
    }

    public String getMediaId() {
        return this.mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public List<VideoTag> getTags() {
        return this.tags;
    }

    public void setTags(List<VideoTag> tags) {
        this.tags = tags;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public VideoFeatures getVideoFeatures() {
        return this.videoFeatures;
    }

    public void setVideoFeatures(VideoFeatures videoFeatures) {
        this.videoFeatures = videoFeatures;
    }

    public String getVideoStatus() {
        return this.videoStatus;
    }

    public void setVideoStatus(String videoStatus) {
        this.videoStatus = videoStatus;
    }

}
