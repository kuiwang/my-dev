package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemcatsGetResponse;

/**
 * TOP API: taobao.itemcats.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class ItemcatsGetRequest implements TaobaoRequest<ItemcatsGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 商品所属类目ID列表，用半角逗号(,)分隔 例如:(18957,19562,) (cids、parent_cid至少传一个)<br />
     * 支持最大值为：9223372036854775807<br />
     * 支持最小值为：0
     */
    private String cids;

    /**
     * 需要返回的字段列表，见ItemCat，默认返回：cid,parent_cid,name,is_parent；增量类目信息,
     * 根据fields传入的参数返回相应的结果。 features字段：
     * 1、如果存在attr_key=freeze表示该类目被冻结了，attr_value
     * =0,5，value可能存在2个值（也可能只有1个），用逗号分割，0表示禁编辑，5表示禁止发布
     */
    private String fields;

    /**
     * 父商品类目 id，0表示根节点, 传输该参数返回所有子类目。 (cids、parent_cid至少传一个)<br />
     * 支持最大值为：9223372036854775807<br />
     * 支持最小值为：0
     */
    private Long parentCid;

    public void setCids(String cids) {
        this.cids = cids;
    }

    public String getCids() {
        return this.cids;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setParentCid(Long parentCid) {
        this.parentCid = parentCid;
    }

    public Long getParentCid() {
        return this.parentCid;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.itemcats.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("cids", this.cids);
        txtParams.put("fields", this.fields);
        txtParams.put("parent_cid", this.parentCid);
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

    public Class<ItemcatsGetResponse> getResponseClass() {
        return ItemcatsGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxListSize(cids, 1000, "cids");
        RequestCheckUtils.checkMaxValue(parentCid, 9223372036854775807L, "parentCid");
        RequestCheckUtils.checkMinValue(parentCid, 0L, "parentCid");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
