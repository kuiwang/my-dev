package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 商品详情信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class ItemDetailData extends TaobaoObject {

    private static final long serialVersionUID = 3472679887732427698L;

    /**
     * 物流信息
     */
    @ApiField("delivery_info")
    private DeliveryInfo deliveryInfo;

    /**
     * 描述信息
     */
    @ApiField("desc_info")
    private DescInfo descInfo;

    /**
     * 商品信息
     */
    @ApiField("item_info")
    private ItemInfo itemInfo;

    /**
     * 移动描述信息
     */
    @ApiField("mobile_desc_info")
    private MobileDescInfo mobileDescInfo;

    /**
     * 价格信息
     */
    @ApiField("price_info")
    private DetailPriceInfo priceInfo;

    /**
     * 评价信息
     */
    @ApiField("rate_info")
    private RateInfo rateInfo;

    /**
     * 卖家信息
     */
    @ApiField("seller_info")
    private SellerInfo sellerInfo;

    /**
     * sku信息
     */
    @ApiField("sku_info")
    private SkuInfo skuInfo;

    /**
     * 库存信息
     */
    @ApiField("stock_info")
    private StockInfo stockInfo;

    /**
     * 门店信息
     */
    @ApiField("store_info")
    private RetailStoreInfo storeInfo;

    public DeliveryInfo getDeliveryInfo() {
        return this.deliveryInfo;
    }

    public void setDeliveryInfo(DeliveryInfo deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
    }

    public DescInfo getDescInfo() {
        return this.descInfo;
    }

    public void setDescInfo(DescInfo descInfo) {
        this.descInfo = descInfo;
    }

    public ItemInfo getItemInfo() {
        return this.itemInfo;
    }

    public void setItemInfo(ItemInfo itemInfo) {
        this.itemInfo = itemInfo;
    }

    public MobileDescInfo getMobileDescInfo() {
        return this.mobileDescInfo;
    }

    public void setMobileDescInfo(MobileDescInfo mobileDescInfo) {
        this.mobileDescInfo = mobileDescInfo;
    }

    public DetailPriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public void setPriceInfo(DetailPriceInfo priceInfo) {
        this.priceInfo = priceInfo;
    }

    public RateInfo getRateInfo() {
        return this.rateInfo;
    }

    public void setRateInfo(RateInfo rateInfo) {
        this.rateInfo = rateInfo;
    }

    public SellerInfo getSellerInfo() {
        return this.sellerInfo;
    }

    public void setSellerInfo(SellerInfo sellerInfo) {
        this.sellerInfo = sellerInfo;
    }

    public SkuInfo getSkuInfo() {
        return this.skuInfo;
    }

    public void setSkuInfo(SkuInfo skuInfo) {
        this.skuInfo = skuInfo;
    }

    public StockInfo getStockInfo() {
        return this.stockInfo;
    }

    public void setStockInfo(StockInfo stockInfo) {
        this.stockInfo = stockInfo;
    }

    public RetailStoreInfo getStoreInfo() {
        return this.storeInfo;
    }

    public void setStoreInfo(RetailStoreInfo storeInfo) {
        this.storeInfo = storeInfo;
    }

}
