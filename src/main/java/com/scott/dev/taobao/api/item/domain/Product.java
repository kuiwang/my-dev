package com.scott.dev.taobao.api.item.domain;

import java.util.Date;

import com.scott.dev.taobao.api.Price;

/*
 * 产品结构
 */
public class Product {

    /*
     * 产品名称
     */
    private String name;

    /*
     * 产品的非关键属性列表.格式:pid:vid;pid:vid.
     */
    private String binds;

    /*
     * 产品的销售属性列表.格式:pid:vid;pid:vid
     */
    private String saleProps;

    /*
     * 产品的市场价.单位为元.精确到2位小数;如:200.07
     */
    private Price price;

    /*
     * 产品的描述.最大25000个字节
     */
    private String desc;

    /*
     * 产品的主图片地址.(绝对地址,格式:http://host/image_path)
     */
    private String picUrl;

    /*
     * 修改时间.格式:yyyy-mm-dd hh:mm:ss
     */
    private Date modified;

    /*
     * 产品的属性图片.比如说黄色对应的产品图片,绿色对应的产品图片。
     * fields中设置为product_prop_imgs.id、 product_prop_imgs.props、
     * product_prop_imgs.url、product_prop_imgs.position等形式就会返回相应的字段
     */
    private ProductPropImg[] productPropImgs;

    /*
     * 当前状态(0 商家确认 1 屏蔽 3 小二确认 2 未确认 -1 删除)
     */
    private Number status;

    /*
     * 产品的级别level
     */
    private Number level;

    /*
     * 产品对应的图片路径
     */
    private String picPath;

    /*
     * 产品的评分次数
     */
    private Number rateNum;

    /*
     * 产品的销售量
     */
    private Number saleNum;

    /*
     * 产品的店内价格
     */
    private String shopPrice;

    /*
     * 产品的标准价格
     */
    private String standardPrice;

    /*
     * 垂直市场,如：3（3C），4（鞋城）
     */
    private Number verticalMarket;

    /*
     * 用户自定义属性,结构：pid1:value1;pid2:value2 
     * 例如：“20000:优衣库”，表示“品牌:优衣库”
     */
    private String customerProps;

    /*
     * 销售属性值别名。格式为pid1:vid1:alias1;pid1:vid2:alia2
     */
    private String propertyAlias;

    /*
     * 产品ID
     */
    private Number productId;

    /*
     *  外部产品ID
     */
    private String outerId;

    /*
     * 创建时间.格式:yyyy-mm-dd hh:mm:ss
     */
    private Date created;

    /*
     * 淘宝标准产品编码
     */
    private String tsc;

    /*
     * 商品类目ID.必须是叶子类目ID
     */
    private Number cid;

    /*
     * 商品类目名称
     */
    private String catName;

    /*
     * 产品的关键属性列表.格式：pid:vid;pid:vid
     */
    private String props;

    /*
     * 产品的关键属性字符串列表.比如:品牌:诺基亚;型号:N73
     * (注：属性名称中的冒号":"被转换为："#cln#"; 分号";"被转换为："#scln#" )
     */
    private String propsStr;

    /*
     * 产品的非关键属性字符串列表.格式同props_str
     * (注：属性名称中的冒号":"被转换为："#cln#"; 分号";"被转换为："#scln#" )
     */
    private String bindsStr;

    /*
     * 产品的销售属性字符串列表.格式同props_str
     * (注：属性名称中的冒号":"被转换为："#cln#"; 分号";"被转换为："#scln#" )
     */
    private String salePropsStr;

    /*
     * 产品的collect次数（不提供数据，返回0)
     */
    private Number collectNum;

    /*
     *  产品的子图片.目前最多支持4张。fields中设置为product_imgs.id、
     *  product_imgs.url、product_imgs.position 等形式就会返回相应的字段
     */
    private ProductImg[] productImgs;

    /*
     * 产品扩展信息
     */
    private ProductExtraInfo[] productExtraInfos;

    /*
     * 产品卖点描述，长度限制20个汉字
     */
    private String sellPt;

    /*
     * 标识是否为达尔文体系下的产品 。 如果为空表示是非达尔文体系下的产品 
     * 如果cspu:0 表示是达尔文体系下的产品，有cspu正在待小二审核，但不能发布商品。 
     * 如果cspu:1 表示是达尔文体系下的产品，且有小二确认的cspu，能发布商品
     */
    private String cspuFeature;

    /*
     * 模板ID
     */
    private Number templateId;

    /*
     * 品类ID
     */
    private Number commodityId;

    /*
     * 标识套装产品是否有效，无效的套装产品需要重新发布
     */
    private Boolean isSuiteEffective;

    /*
     * 套装产品关联的子规格,同时该字段不为空标识该产品是套装产品
     */
    private String suiteItemsStr;

    /*
     * 产品条码信息，仅在taobao.products.search接口且商城可用
     */
    private String barcodeStr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBinds() {
        return binds;
    }

    public void setBinds(String binds) {
        this.binds = binds;
    }

    public String getSaleProps() {
        return saleProps;
    }

    public void setSaleProps(String saleProps) {
        this.saleProps = saleProps;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public ProductPropImg[] getProductPropImgs() {
        return productPropImgs;
    }

    public void setProductPropImgs(ProductPropImg[] productPropImgs) {
        this.productPropImgs = productPropImgs;
    }

    public Number getStatus() {
        return status;
    }

    public void setStatus(Number status) {
        this.status = status;
    }

    public Number getLevel() {
        return level;
    }

    public void setLevel(Number level) {
        this.level = level;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public Number getRateNum() {
        return rateNum;
    }

    public void setRateNum(Number rateNum) {
        this.rateNum = rateNum;
    }

    public Number getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(Number saleNum) {
        this.saleNum = saleNum;
    }

    public String getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(String shopPrice) {
        this.shopPrice = shopPrice;
    }

    public String getStandardPrice() {
        return standardPrice;
    }

    public void setStandardPrice(String standardPrice) {
        this.standardPrice = standardPrice;
    }

    public Number getVerticalMarket() {
        return verticalMarket;
    }

    public void setVerticalMarket(Number verticalMarket) {
        this.verticalMarket = verticalMarket;
    }

    public String getCustomerProps() {
        return customerProps;
    }

    public void setCustomerProps(String customerProps) {
        this.customerProps = customerProps;
    }

    public String getPropertyAlias() {
        return propertyAlias;
    }

    public void setPropertyAlias(String propertyAlias) {
        this.propertyAlias = propertyAlias;
    }

    public Number getProductId() {
        return productId;
    }

    public void setProductId(Number productId) {
        this.productId = productId;
    }

    public String getOuterId() {
        return outerId;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getTsc() {
        return tsc;
    }

    public void setTsc(String tsc) {
        this.tsc = tsc;
    }

    public Number getCid() {
        return cid;
    }

    public void setCid(Number cid) {
        this.cid = cid;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getProps() {
        return props;
    }

    public void setProps(String props) {
        this.props = props;
    }

    public String getPropsStr() {
        return propsStr;
    }

    public void setPropsStr(String propsStr) {
        this.propsStr = propsStr;
    }

    public String getBindsStr() {
        return bindsStr;
    }

    public void setBindsStr(String bindsStr) {
        this.bindsStr = bindsStr;
    }

    public String getSalePropsStr() {
        return salePropsStr;
    }

    public void setSalePropsStr(String salePropsStr) {
        this.salePropsStr = salePropsStr;
    }

    public Number getCollectNum() {
        return collectNum;
    }

    public void setCollectNum(Number collectNum) {
        this.collectNum = collectNum;
    }

    public ProductImg[] getProductImgs() {
        return productImgs;
    }

    public void setProductImgs(ProductImg[] productImgs) {
        this.productImgs = productImgs;
    }

    public ProductExtraInfo[] getProductExtraInfos() {
        return productExtraInfos;
    }

    public void setProductExtraInfos(ProductExtraInfo[] productExtraInfos) {
        this.productExtraInfos = productExtraInfos;
    }

    public String getSellPt() {
        return sellPt;
    }

    public void setSellPt(String sellPt) {
        this.sellPt = sellPt;
    }

    public String getCspuFeature() {
        return cspuFeature;
    }

    public void setCspuFeature(String cspuFeature) {
        this.cspuFeature = cspuFeature;
    }

    public Number getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Number templateId) {
        this.templateId = templateId;
    }

    public Number getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Number commodityId) {
        this.commodityId = commodityId;
    }

    public Boolean getIsSuiteEffective() {
        return isSuiteEffective;
    }

    public void setIsSuiteEffective(Boolean isSuiteEffective) {
        this.isSuiteEffective = isSuiteEffective;
    }

    public String getSuiteItemsStr() {
        return suiteItemsStr;
    }

    public void setSuiteItemsStr(String suiteItemsStr) {
        this.suiteItemsStr = suiteItemsStr;
    }

    public String getBarcodeStr() {
        return barcodeStr;
    }

    public void setBarcodeStr(String barcodeStr) {
        this.barcodeStr = barcodeStr;
    }

}
