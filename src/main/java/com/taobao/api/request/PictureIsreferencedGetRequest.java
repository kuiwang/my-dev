package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PictureIsreferencedGetResponse;

/**
 * TOP API: taobao.picture.isreferenced.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:28
 */
public class PictureIsreferencedGetRequest
        implements TaobaoRequest<PictureIsreferencedGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 图片id
     */
    private Long pictureId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(pictureId, "pictureId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.picture.isreferenced.get";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getPictureId() {
        return this.pictureId;
    }

    @Override
    public Class<PictureIsreferencedGetResponse> getResponseClass() {
        return PictureIsreferencedGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("picture_id", this.pictureId);
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

    public void setPictureId(Long pictureId) {
        this.pictureId = pictureId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
