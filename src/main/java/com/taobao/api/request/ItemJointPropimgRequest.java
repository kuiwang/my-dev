package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemJointPropimgResponse;

/**
 * TOP API: taobao.item.joint.propimg request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class ItemJointPropimgRequest implements TaobaoRequest<ItemJointPropimgResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 属性图片ID。如果是新增不需要填写
     */
    private Long id;

    /**
     * 商品数字ID，必选<br />
     * 支持最小值为：0
     */
    private Long numIid;

    /**
     * 图片地址(传入图片相对地址即可,即不需包含 http://img02.taobao.net/bao/uploaded )
     */
    private String picPath;

    /**
     * 图片序号
     */
    private Long position;

    /**
     * 属性列表。调用taobao.itemprops.get获取，属性必须是颜色属性，格式:pid:vid。
     */
    private String properties;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(numIid, "numIid");
        RequestCheckUtils.checkMinValue(numIid, 0L, "numIid");
        RequestCheckUtils.checkNotEmpty(picPath, "picPath");
        RequestCheckUtils.checkNotEmpty(properties, "properties");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.item.joint.propimg";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getId() {
        return this.id;
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

    public String getProperties() {
        return this.properties;
    }

    @Override
    public Class<ItemJointPropimgResponse> getResponseClass() {
        return ItemJointPropimgResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("id", this.id);
        txtParams.put("num_iid", this.numIid);
        txtParams.put("pic_path", this.picPath);
        txtParams.put("position", this.position);
        txtParams.put("properties", this.properties);
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

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
