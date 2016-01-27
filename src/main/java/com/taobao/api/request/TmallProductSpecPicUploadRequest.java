package com.taobao.api.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallProductSpecPicUploadResponse;

/**
 * TOP API: tmall.product.spec.pic.upload request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class TmallProductSpecPicUploadRequest implements
        TaobaoUploadRequest<TmallProductSpecPicUploadResponse> {

    /**
     * 上传的认证图片文件
     */
    private FileItem certifyPic;

    /**
     * 上传的认证图片的认证类型<br>
     * 1：代表产品包装正面图<br>
     * 2：代表完整产品资质<br>
     * 3：代表产品包装反面图<br>
     * 4：代表产品包装侧面图<br>
     * 5：代表产品包装条形码特写<br>
     * 6：代表特殊用途化妆品批准文号<br>
     * 7：代表3C认证图标<br>
     */
    private Long certifyType;

    private Map<String, String> headerMap = new TaobaoHashMap();

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {

        RequestCheckUtils.checkNotEmpty(certifyPic, "certifyPic");
        RequestCheckUtils.checkNotEmpty(certifyType, "certifyType");
    }

    @Override
    public String getApiMethodName() {
        return "tmall.product.spec.pic.upload";
    }

    public FileItem getCertifyPic() {
        return this.certifyPic;
    }

    public Long getCertifyType() {
        return this.certifyType;
    }

    @Override
    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap<String, FileItem>();
        params.put("certify_pic", this.certifyPic);
        return params;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<TmallProductSpecPicUploadResponse> getResponseClass() {
        return TmallProductSpecPicUploadResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("certify_type", this.certifyType);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setCertifyPic(FileItem certifyPic) {
        this.certifyPic = certifyPic;
    }

    public void setCertifyType(Long certifyType) {
        this.certifyType = certifyType;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
