package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.DeliveryTemplatesGetResponse;

/**
 * TOP API: taobao.delivery.templates.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class DeliveryTemplatesGetRequest implements TaobaoRequest<DeliveryTemplatesGetResponse> {

    /**
     * 需返回的字段列表。 <br/>
     * <B> 可选值:示例中的值;各字段之间用","隔开 </B> <br/>
     * <br/>
     * <font color=blue> template_id：查询模板ID <br/>
     * template_name:查询模板名称 <br/>
     * assumer：查询服务承担放 <br/>
     * valuation:查询计价规则 <br/>
     * supports:查询增值服务列表 <br/>
     * created:查询模板创建时间 <br/>
     * modified:查询修改时间<br/>
     * consign_area_id:运费模板上设置的卖家发货地址最小级别ID<br/>
     * address:卖家地址信息 </font> <br/>
     * <br/>
     * <font color=bule> query_cod:查询货到付款运费信息<br/>
     * query_post:查询平邮运费信息 <br/>
     * query_express:查询快递公司运费信息 <br/>
     * query_ems:查询EMS运费信息<br/>
     * query_bzsd:查询普通保障速递运费信息<br/>
     * query_wlb:查询物流宝保障速递运费信息<br/>
     * query_furniture:查询家装物流运费信息 <font color=blue> <br/>
     * <br/>
     * <font color=red>不能有空格</font>
     */
    private String fields;

    private Map<String, String> headerMap = new TaobaoHashMap();

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(fields, "fields");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.delivery.templates.get";
    }

    public String getFields() {
        return this.fields;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<DeliveryTemplatesGetResponse> getResponseClass() {
        return DeliveryTemplatesGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("fields", this.fields);
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

    public void setFields(String fields) {
        this.fields = fields;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
