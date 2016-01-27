package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoProductcatAddResponse;

/**
 * TOP API: taobao.fenxiao.productcat.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class FenxiaoProductcatAddRequest implements TaobaoRequest<FenxiaoProductcatAddResponse> {

    /**
     * 代销默认采购价比例，注意：100.00%，则输入为10000<br />
     * 支持最大值为：99999<br />
     * 支持最小值为：100
     */
    private Long agentCostPercent;

    /**
     * 经销默认采购价比例，注意：100.00%，则输入为10000<br />
     * 支持最大值为：99999<br />
     * 支持最小值为：100
     */
    private Long dealerCostPercent;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 产品线名称<br />
     * 支持最大长度为：10<br />
     * 支持的最大列表长度为：10
     */
    private String name;

    /**
     * 最高零售价比例，注意：100.00%，则输入为10000<br />
     * 支持最大值为：99999<br />
     * 支持最小值为：100
     */
    private Long retailHighPercent;

    /**
     * 最低零售价比例，注意：100.00%，则输入为10000<br />
     * 支持最大值为：99999<br />
     * 支持最小值为：100
     */
    private Long retailLowPercent;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(agentCostPercent, "agentCostPercent");
        RequestCheckUtils.checkMaxValue(agentCostPercent, 99999L, "agentCostPercent");
        RequestCheckUtils.checkMinValue(agentCostPercent, 100L, "agentCostPercent");
        RequestCheckUtils.checkNotEmpty(dealerCostPercent, "dealerCostPercent");
        RequestCheckUtils.checkMaxValue(dealerCostPercent, 99999L, "dealerCostPercent");
        RequestCheckUtils.checkMinValue(dealerCostPercent, 100L, "dealerCostPercent");
        RequestCheckUtils.checkNotEmpty(name, "name");
        RequestCheckUtils.checkMaxLength(name, 10, "name");
        RequestCheckUtils.checkNotEmpty(retailHighPercent, "retailHighPercent");
        RequestCheckUtils.checkMaxValue(retailHighPercent, 99999L, "retailHighPercent");
        RequestCheckUtils.checkMinValue(retailHighPercent, 100L, "retailHighPercent");
        RequestCheckUtils.checkNotEmpty(retailLowPercent, "retailLowPercent");
        RequestCheckUtils.checkMaxValue(retailLowPercent, 99999L, "retailLowPercent");
        RequestCheckUtils.checkMinValue(retailLowPercent, 100L, "retailLowPercent");
    }

    public Long getAgentCostPercent() {
        return this.agentCostPercent;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.fenxiao.productcat.add";
    }

    public Long getDealerCostPercent() {
        return this.dealerCostPercent;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public Class<FenxiaoProductcatAddResponse> getResponseClass() {
        return FenxiaoProductcatAddResponse.class;
    }

    public Long getRetailHighPercent() {
        return this.retailHighPercent;
    }

    public Long getRetailLowPercent() {
        return this.retailLowPercent;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("agent_cost_percent", this.agentCostPercent);
        txtParams.put("dealer_cost_percent", this.dealerCostPercent);
        txtParams.put("name", this.name);
        txtParams.put("retail_high_percent", this.retailHighPercent);
        txtParams.put("retail_low_percent", this.retailLowPercent);
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

    public void setAgentCostPercent(Long agentCostPercent) {
        this.agentCostPercent = agentCostPercent;
    }

    public void setDealerCostPercent(Long dealerCostPercent) {
        this.dealerCostPercent = dealerCostPercent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRetailHighPercent(Long retailHighPercent) {
        this.retailHighPercent = retailHighPercent;
    }

    public void setRetailLowPercent(Long retailLowPercent) {
        this.retailLowPercent = retailLowPercent;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
