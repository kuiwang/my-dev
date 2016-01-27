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

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(numIid, "numIid");
        RequestCheckUtils.checkMinValue(numIid, 0L, "numIid");
        RequestCheckUtils.checkNotEmpty(picPath, "picPath");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.item.joint.img";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getId() {
        return this.id;
    }

    public Boolean getIsMajor() {
        return this.isMajor;
    }

    public Long getNumIid() {
        return this.numIid;
    }

    public String getPicPath() {
        return this.picPath;
    }

    public Long getPosition() {
        return this.position;
    }

    @Override
    public Class<ItemJointImgResponse> getResponseClass() {
        return ItemJointImgResponse.class;
    }

    @Override
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

    public void setId(Long id) {
        this.id = id;
    }

    public void setIsMajor(Boolean isMajor) {
        this.isMajor = isMajor;
    }

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
