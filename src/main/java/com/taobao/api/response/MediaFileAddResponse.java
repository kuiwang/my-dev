package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.File;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.media.file.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class MediaFileAddResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2646126977974773141L;

    /**
     * 上传到多媒体平台的文件
     */
    @ApiField("file")
    private File file;

    public void setFile(File file) {
        this.file = file;
    }

    public File getFile() {
        return this.file;
    }

}
