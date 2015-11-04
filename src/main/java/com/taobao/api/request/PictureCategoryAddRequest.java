package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PictureCategoryAddResponse;

/**
 * TOP API: taobao.picture.category.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:28
 */
public class PictureCategoryAddRequest implements TaobaoRequest<PictureCategoryAddResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 图片分类的父分类,一级分类的parent_id为0,二级分类的则为其父分类的picture_category_id
     */
    private Long parentId;

    /**
     * 图片分类名称，最大长度20字符，中文字符算2个字符，不能为空
     */
    private String pictureCategoryName;

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getParentId() {
        return this.parentId;
    }

    public void setPictureCategoryName(String pictureCategoryName) {
        this.pictureCategoryName = pictureCategoryName;
    }

    public String getPictureCategoryName() {
        return this.pictureCategoryName;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.picture.category.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("parent_id", this.parentId);
        txtParams.put("picture_category_name", this.pictureCategoryName);
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

    public Class<PictureCategoryAddResponse> getResponseClass() {
        return PictureCategoryAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(pictureCategoryName, "pictureCategoryName");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
