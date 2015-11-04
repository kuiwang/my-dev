package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 视频编解码配置信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class VideoCodecConfiguration extends TaobaoObject {

    private static final long serialVersionUID = 4423122513391421622L;

    /**
     * 编解码标准
     */
    @ApiField("Codec")
    private String codec;

    /**
     * 视频编解码选项
     */
    @ApiField("CodecOptions")
    private VideoCodecOptions codecOptions;

    public String getCodec() {
        return this.codec;
    }

    public void setCodec(String codec) {
        this.codec = codec;
    }

    public VideoCodecOptions getCodecOptions() {
        return this.codecOptions;
    }

    public void setCodecOptions(VideoCodecOptions codecOptions) {
        this.codecOptions = codecOptions;
    }

}
