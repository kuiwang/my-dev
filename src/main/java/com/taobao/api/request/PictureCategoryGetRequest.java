package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PictureCategoryGetResponse;

/**
 * TOP API: taobao.picture.category.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:28
 */
public class PictureCategoryGetRequest implements TaobaoRequest<PictureCategoryGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 图片分类的修改时间点，格式:yyyy-MM-dd HH:mm:ss。查询此修改时间点之后到目前的图片分类。
     */
    private Date modifiedTime;

    /**
     * 取二级分类时设置为对应父分类id 取一级分类时父分类id设为0 取全部分类的时候不设或设为-1
     */
    private Long parentId;

    /**
     * 图片分类ID
     */
    private Long pictureCategoryId;

    /**
     * 图片分类名，不支持模糊查询
     */
    private String pictureCategoryName;

    private Long timestamp;

    /**
     * 分类类型,fixed代表店铺装修分类类别，auction代表宝贝分类类别，user-define代表用户自定义分类类别
     */
    private String type;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
    }

    @Override
    public String getApiMethodName() {
        return "taobao.picture.category.get";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Date getModifiedTime() {
        return this.modifiedTime;
    }

    public Long getParentId() {
        return this.parentId;
    }

    public Long getPictureCategoryId() {
        return this.pictureCategoryId;
    }

    public String getPictureCategoryName() {
        return this.pictureCategoryName;
    }

    @Override
    public Class<PictureCategoryGetResponse> getResponseClass() {
        return PictureCategoryGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("modified_time", this.modifiedTime);
        txtParams.put("parent_id", this.parentId);
        txtParams.put("picture_category_id", this.pictureCategoryId);
        txtParams.put("picture_category_name", this.pictureCategoryName);
        txtParams.put("type", this.type);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public void setPictureCategoryId(Long pictureCategoryId) {
        this.pictureCategoryId = pictureCategoryId;
    }

    public void setPictureCategoryName(String pictureCategoryName) {
        this.pictureCategoryName = pictureCategoryName;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setType(String type) {
        this.type = type;
    }
}
