package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ProductGetResponse;

/**
 * TOP API: taobao.product.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class ProductGetRequest implements TaobaoRequest<ProductGetResponse> {

    /**
     * 商品类目id.调用taobao.itemcats.get获取;必须是叶子类目id,如果没有传product_id,
     * 那么cid和props必须要传.
     */
    private Long cid;

    /**
     * 用户自定义关键属性,结构：pid1:value1;pid2:value2，如果有型号，系列等子属性用: 隔开
     * 例如：“20000:优衣库:型号:001;632501:1234”，表示“品牌:优衣库:型号:001;货号:1234”
     */
    private String customerProps;

    /**
     * 需返回的字段列表.可选值:Product数据结构中的所有字段;多个字段之间用","分隔.
     */
    private String fields;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 市场ID，1为取C2C市场的产品信息， 2为取B2C市场的产品信息。 不填写此值则默认取C2C的产品信息。
     */
    private String marketId;

    /**
     * Product的id.两种方式来查看一个产品:1.传入product_id来查询 2.传入cid和props来查询
     */
    private Long productId;

    /**
     * 比如:诺基亚N73这个产品的关键属性列表就是:品牌:诺基亚;型号:N73,对应的PV值就是10005:10027;10006:
     * 29729.
     */
    private String props;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(fields, "fields");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.product.get";
    }

    public Long getCid() {
        return this.cid;
    }

    public String getCustomerProps() {
        return this.customerProps;
    }

    public String getFields() {
        return this.fields;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getMarketId() {
        return this.marketId;
    }

    public Long getProductId() {
        return this.productId;
    }

    public String getProps() {
        return this.props;
    }

    @Override
    public Class<ProductGetResponse> getResponseClass() {
        return ProductGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("cid", this.cid);
        txtParams.put("customer_props", this.customerProps);
        txtParams.put("fields", this.fields);
        txtParams.put("market_id", this.marketId);
        txtParams.put("product_id", this.productId);
        txtParams.put("props", this.props);
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

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public void setCustomerProps(String customerProps) {
        this.customerProps = customerProps;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setProps(String props) {
        this.props = props;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
