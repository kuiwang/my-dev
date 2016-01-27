package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PictureDeleteResponse;

/**
 * TOP API: taobao.picture.delete request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:28
 */
public class PictureDeleteRequest implements TaobaoRequest<PictureDeleteResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 图片ID字符串,可以一个也可以一组,用英文逗号间隔,如450,120,155.限制数量是100
     */
    private String pictureIds;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(pictureIds, "pictureIds");
        RequestCheckUtils.checkMaxListSize(pictureIds, 100, "pictureIds");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.picture.delete";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getPictureIds() {
        return this.pictureIds;
    }

    @Override
    public Class<PictureDeleteResponse> getResponseClass() {
        return PictureDeleteResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("picture_ids", this.pictureIds);
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

    public void setPictureIds(String pictureIds) {
        this.pictureIds = pictureIds;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
