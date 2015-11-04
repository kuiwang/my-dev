package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemJointImgResponse;

/**
 * TOP API: taobao.item.joint.img request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class ItemJointImgRequest implements TaobaoRequest<ItemJointImgResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 商品图片id(如果是更新图片，则需要传该参数)
     */
    private Long id;

    /**
     * 上传的图片是否关联为商品主图（如果需更新主图，则需要传人true）
     */
    private Boolean isMajor;

    /**
     * 商品数字ID，必选<br />
     * 支持最小值为：0
     */
    private Long numIid;

    /**
     * 图片URL,图片空间图片的相对地址
     */
    private String picPath;

    /**
     * 图片序号
     */
    private Long position;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setIsMajor(Boolean isMajor) {
        this.isMajor = isMajor;
    }

    public Boolean getIsMajor() {
        return this.isMajor;
    }

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public Long getNumIid() {
        return this.numIid;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getPicPath() {
        return this.picPath;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public Long getPosition() {
        return this.position;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.item.joint.img";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("id", this.id);
        txtParams.put("is_major", this.isMajor);
        txtParams.put("num_iid", this.numIid);
        txtParams.put("pic_path", this.picPath);
        txtParams.put("position", this.position);
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

    public Class<ItemJointImgResponse> getResponseClass() {
        return ItemJointImgResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(numIid, "numIid");
        RequestCheckUtils.checkMinValue(numIid, 0L, "numIid");
        RequestCheckUtils.checkNotEmpty(picPath, "picPath");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
