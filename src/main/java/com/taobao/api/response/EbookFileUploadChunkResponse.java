package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.ebook.file.upload.chunk response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class EbookFileUploadChunkResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4267942328229226667L;

    /**
     * 文件ID
     */
    @ApiField("file_id")
    private String fileId;

    public String getFileId() {
        return this.fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

}
