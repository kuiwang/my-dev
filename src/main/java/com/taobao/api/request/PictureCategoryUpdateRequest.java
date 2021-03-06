package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PictureCategoryUpdateResponse;

/**
 * TOP API: taobao.picture.category.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:28
 */
public class PictureCategoryUpdateRequest implements TaobaoRequest<PictureCategoryUpdateResponse> {

    /**
     * 要更新的图片分类的id
     */
    private Long categoryId;

    /**
     * 图片分类的新名字，最大长度20字符，不能为空<br />
     * 支持最大长度为：20<br />
     * 支持的最大列表长度为：20
     */
    private String categoryName;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 图片分类的新父分类id
     */
    private Long parentId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(categoryId, "categoryId");
        RequestCheckUtils.checkMaxLength(categoryName, 20, "categoryName");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.picture.category.update";
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getParentId() {
        return this.parentId;
    }

    @Override
    public Class<PictureCategoryUpdateResponse> getResponseClass() {
        return PictureCategoryUpdateResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("category_id", this.categoryId);
        txtParams.put("category_name", this.categoryName);
        txtParams.put("parent_id", this.parentId);
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

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
