package com.taobao.api.request;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ProductAddResponse;

/**
 * TOP API: taobao.product.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class ProductAddRequest implements TaobaoUploadRequest<ProductAddResponse> {

    /**
     * 非关键属性结构:pid:vid;pid:vid.<br>
     * 非关键属性<font color=red>不包含</font>关键属性、销售属性、用户自定义属性、商品属性; <br>
     * 调用taobao.itemprops.get获取pid,调用taobao.itempropvalues.get获取vid.<br>
     * <font color=red>注:支持最大长度为512字节</font><br />
     * 支持最大长度为：512<br />
     * 支持的最大列表长度为：512
     */
    private String binds;

    /**
     * 商品类目ID.调用taobao.itemcats.get获取;注意:必须是叶子类目 id.
     */
    private Long cid;

    /**
     * 用户自定义属性,结构：pid1:value1;pid2:value2，如果有型号，系列等子属性用: 隔开
     * 例如：“20000:优衣库:型号:001;632501:1234”，表示“品牌:优衣库:型号:001;货号:1234” <br>
     * <font color=red>注：包含所有自定义属性的传入</font>
     */
    private String customerProps;

    /**
     * 产品描述.最大不超过25000个字符
     */
    private String desc;

    /**
     * 存放产品扩展信息，由List(ProductExtraInfo)转化成jsonArray存入.<br />
     * 支持最大长度为：25000<br />
     * 支持的最大列表长度为：25000
     */
    private String extraInfo;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 产品主图片.最大1M,目前仅支持GIF,JPG.<br />
     * 支持的文件类型为：gif,jpg,png,jpeg<br />
     * 支持的最大列表长度为：1048576
     */
    private FileItem image;

    /**
     * 是否发布套装产品，和suite_items_str配合使用，is_pub_suite=true走套装SPU发布逻辑，
     * 达尔文体系下不需要再走tmall.product.spec.add发布产品规格
     */
    private Boolean isPubSuite;

    /**
     * 是不是主图
     */
    private Boolean major;

    /**
     * 市场ID，1为新增C2C市场的产品信息， 2为新增B2C市场的产品信息。
     * 不填写此值则C用户新增B2C市场的产品信息，B用户新增B2C市场的产品信息。
     */
    private String marketId;

    /**
     * 上市时间。目前只支持鞋城类目传入此参数
     */
    private Date marketTime;

    /**
     * 产品名称,最大30个字符.
     */
    private String name;

    /**
     * 外部产品ID
     */
    private String outerId;

    /**
     * 包装清单。注意，在管控类目下，包装清单不能为空，同时保证清单的格式为： 名称:数字;名称:数字;
     * 其中，名称不能违禁、不能超过60字符，数字不能超过999
     */
    private String packingList;

    /**
     * 产品市场价.精确到2位小数;单位为元.如：200.07
     */
    private String price;

    /**
     * 销售属性值别名。格式为pid1:vid1:alias1;pid1:vid2:alia2。只有少数销售属性值支持传入别名，比如颜色和尺寸
     */
    private String propertyAlias;

    /**
     * 关键属性 结构:pid:vid;pid:vid.调用taobao.itemprops.get获取pid,调用taobao.
     * itempropvalues.get获取vid;如果碰到用户自定义属性,请用customer_props.
     */
    private String props;

    /**
     * 销售属性结构:pid:vid;pid:vid.调用taobao.itemprops.get获取is_sale_prop＝true的pid
     * ,调用taobao.itempropvalues.get获取vid.
     */
    private String saleProps;

    /**
     * 商品卖点描述，长度限制为20个汉字
     */
    private String sellPt;

    /**
     * 发布套装产品时，套装关联的产品规格+数量的字符串，格式：specsId:number。
     */
    private String suiteItemsStr;

    /**
     * 在天猫，无关键属性发布产品，必须指定模板ID,模板ID通过tmall.product.template.get获取
     */
    private Long templateId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {

        RequestCheckUtils.checkMaxLength(binds, 512, "binds");
        RequestCheckUtils.checkNotEmpty(cid, "cid");
        RequestCheckUtils.checkMaxLength(extraInfo, 25000, "extraInfo");
        RequestCheckUtils.checkNotEmpty(image, "image");
        RequestCheckUtils.checkMaxLength(image, 1048576, "image");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.product.add";
    }

    public String getBinds() {
        return this.binds;
    }

    public Long getCid() {
        return this.cid;
    }

    public String getCustomerProps() {
        return this.customerProps;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getExtraInfo() {
        return this.extraInfo;
    }

    @Override
    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap<String, FileItem>();
        params.put("image", this.image);
        return params;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public FileItem getImage() {
        return this.image;
    }

    public Boolean getIsPubSuite() {
        return this.isPubSuite;
    }

    public Boolean getMajor() {
        return this.major;
    }

    public String getMarketId() {
        return this.marketId;
    }

    public Date getMarketTime() {
        return this.marketTime;
    }

    public String getName() {
        return this.name;
    }

    public String getOuterId() {
        return this.outerId;
    }

    public String getPackingList() {
        return this.packingList;
    }

    public String getPrice() {
        return this.price;
    }

    public String getPropertyAlias() {
        return this.propertyAlias;
    }

    public String getProps() {
        return this.props;
    }

    @Override
    public Class<ProductAddResponse> getResponseClass() {
        return ProductAddResponse.class;
    }

    public String getSaleProps() {
        return this.saleProps;
    }

    public String getSellPt() {
        return this.sellPt;
    }

    public String getSuiteItemsStr() {
        return this.suiteItemsStr;
    }

    public Long getTemplateId() {
        return this.templateId;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("binds", this.binds);
        txtParams.put("cid", this.cid);
        txtParams.put("customer_props", this.customerProps);
        txtParams.put("desc", this.desc);
        txtParams.put("extra_info", this.extraInfo);
        txtParams.put("is_pub_suite", this.isPubSuite);
        txtParams.put("major", this.major);
        txtParams.put("market_id", this.marketId);
        txtParams.put("market_time", this.marketTime);
        txtParams.put("name", this.name);
        txtParams.put("outer_id", this.outerId);
        txtParams.put("packing_list", this.packingList);
        txtParams.put("price", this.price);
        txtParams.put("property_alias", this.propertyAlias);
        txtParams.put("props", this.props);
        txtParams.put("sale_props", this.saleProps);
        txtParams.put("sell_pt", this.sellPt);
        txtParams.put("suite_items_str", this.suiteItemsStr);
        txtParams.put("template_id", this.templateId);
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

    public void setBinds(String binds) {
        this.binds = binds;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public void setCustomerProps(String customerProps) {
        this.customerProps = customerProps;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public void setImage(FileItem image) {
        this.image = image;
    }

    public void setIsPubSuite(Boolean isPubSuite) {
        this.isPubSuite = isPubSuite;
    }

    public void setMajor(Boolean major) {
        this.major = major;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }

    public void setMarketTime(Date marketTime) {
        this.marketTime = marketTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public void setPackingList(String packingList) {
        this.packingList = packingList;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setPropertyAlias(String propertyAlias) {
        this.propertyAlias = propertyAlias;
    }

    public void setProps(String props) {
        this.props = props;
    }

    public void setSaleProps(String saleProps) {
        this.saleProps = saleProps;
    }

    public void setSellPt(String sellPt) {
        this.sellPt = sellPt;
    }

    public void setSuiteItemsStr(String suiteItemsStr) {
        this.suiteItemsStr = suiteItemsStr;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
