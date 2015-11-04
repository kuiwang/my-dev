package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallItemDescModulesGetResponse;

/**
 * TOP API: tmall.item.desc.modules.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class TmallItemDescModulesGetRequest implements
        TaobaoRequest<TmallItemDescModulesGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 淘宝后台发布商品的叶子类目id，可通过taobao.itemcats.get查到。api
     * 访问地址http://api.taobao.com
     * /apidoc/api.htm?spm=0.0.0.0.CFhhk4&path=cid:3-apiId:122
     */
    private Long catId;

    /**
     * 商家主帐号id
     */
    private Long usrId;

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public Long getCatId() {
        return this.catId;
    }

    public void setUsrId(Long usrId) {
        this.usrId = usrId;
    }

    public Long getUsrId() {
        return this.usrId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "tmall.item.desc.modules.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("cat_id", this.catId);
        txtParams.put("usr_id", this.usrId);
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

    public Class<TmallItemDescModulesGetResponse> getResponseClass() {
        return TmallItemDescModulesGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(catId, "catId");
        RequestCheckUtils.checkNotEmpty(usrId, "usrId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
