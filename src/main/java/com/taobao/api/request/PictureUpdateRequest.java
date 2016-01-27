package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PictureUpdateResponse;

/**
 * TOP API: taobao.picture.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:28
 */
public class PictureUpdateRequest implements TaobaoRequest<PictureUpdateResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 新的图片名，最大长度50字符，不能为空<br />
     * 支持最大长度为：50<br />
     * 支持的最大列表长度为：50
     */
    private String newName;

    /**
     * 要更改名字的图片的id
     */
    private Long pictureId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(newName, "newName");
        RequestCheckUtils.checkMaxLength(newName, 50, "newName");
        RequestCheckUtils.checkNotEmpty(pictureId, "pictureId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.picture.update";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getNewName() {
        return this.newName;
    }

    public Long getPictureId() {
        return this.pictureId;
    }

    @Override
    public Class<PictureUpdateResponse> getResponseClass() {
        return PictureUpdateResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("new_name", this.newName);
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

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public void setPictureId(Long pictureId) {
        this.pictureId = pictureId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
