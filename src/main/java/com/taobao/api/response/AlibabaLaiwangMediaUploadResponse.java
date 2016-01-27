package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: alibaba.laiwang.media.upload response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AlibabaLaiwangMediaUploadResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4384189315371896448L;

    /**
     * 多媒体文件上传后返回的文件标识.
     */
    @ApiField("mediaid")
    private String mediaid;

    /**
     * 访问上传文件的url路径信息.
     */
    @ApiField("url")
    private String url;

    public String getMediaid() {
        return this.mediaid;
    }

    public String getUrl() {
        return this.url;
    }

    public void setMediaid(String mediaid) {
        this.mediaid = mediaid;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
