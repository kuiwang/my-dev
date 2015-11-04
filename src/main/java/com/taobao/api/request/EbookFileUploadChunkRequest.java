package com.taobao.api.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.EbookFileUploadChunkResponse;

/**
 * TOP API: taobao.ebook.file.upload.chunk request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:47
 */
public class EbookFileUploadChunkRequest implements
        TaobaoUploadRequest<EbookFileUploadChunkResponse> {

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 文件块总数
     */
    private Long chunkCount;

    /**
     * 传输文件块，除最后一块外每块的大小 必须为 4MB
     */
    private FileItem chunkData;

    /**
     * 文件块的MD5
     */
    private String chunkMd5;

    /**
     * 文件的ID，上传第一个文件块生成放回，在上传后续文件块时此参数必选
     */
    private String fileId;

    /**
     * 文件名
     */
    private String fileName;

    /**
     * 文件大小（非文件块大小）
     */
    private Long fileSize;

    /**
     * 文件块序号
     */
    private Long sequence;

    public void setChunkCount(Long chunkCount) {
        this.chunkCount = chunkCount;
    }

    public Long getChunkCount() {
        return this.chunkCount;
    }

    public void setChunkData(FileItem chunkData) {
        this.chunkData = chunkData;
    }

    public FileItem getChunkData() {
        return this.chunkData;
    }

    public void setChunkMd5(String chunkMd5) {
        this.chunkMd5 = chunkMd5;
    }

    public String getChunkMd5() {
        return this.chunkMd5;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getFileId() {
        return this.fileId;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public Long getFileSize() {
        return this.fileSize;
    }

    public void setSequence(Long sequence) {
        this.sequence = sequence;
    }

    public Long getSequence() {
        return this.sequence;
    }

    private Map<String, String> headerMap = new TaobaoHashMap();

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.ebook.file.upload.chunk";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("chunk_count", this.chunkCount);
        txtParams.put("chunk_md5", this.chunkMd5);
        txtParams.put("file_id", this.fileId);
        txtParams.put("file_name", this.fileName);
        txtParams.put("file_size", this.fileSize);
        txtParams.put("sequence", this.sequence);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap<String, FileItem>();
        params.put("chunk_data", this.chunkData);
        return params;
    }

    public Class<EbookFileUploadChunkResponse> getResponseClass() {
        return EbookFileUploadChunkResponse.class;
    }

    public void check() throws ApiRuleException {

        RequestCheckUtils.checkNotEmpty(chunkCount, "chunkCount");
        RequestCheckUtils.checkNotEmpty(chunkData, "chunkData");
        RequestCheckUtils.checkNotEmpty(chunkMd5, "chunkMd5");
        RequestCheckUtils.checkNotEmpty(fileName, "fileName");
        RequestCheckUtils.checkNotEmpty(fileSize, "fileSize");
        RequestCheckUtils.checkNotEmpty(sequence, "sequence");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
