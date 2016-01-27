package com.scott.dev.taobao.api.tae.domain;

import com.taobao.api.domain.DetailPriceInfo;
import com.taobao.api.domain.ItemInfo;
import com.taobao.api.domain.RateInfo;
import com.taobao.api.domain.RetailStoreInfo;
import com.taobao.api.domain.SkuInfo;

/**
 * 商品详情信息
 */
public class ItemDetailData {

    /**
     * 物流信息
     */
    private DeliveryInfo deliveryInfo;

    /**
     * 描述信息
     */
    private DescInfo descInfo;

    /**
     * 商品信息
     */
    private ItemInfo itemInfo;

    /**
     * 移动描述信息
     */
    private MobileDescInfo mobileDescInfo;

    /**
     * 价格信息
     */
    private DetailPriceInfo priceInfo;

    /**
     * 评价信息
     */
    private RateInfo rateInfo;

    /**
     * 卖家信息
     */
    private SellerInfo sellerInfo;

    /**
     * sku信息
     */
    private SkuInfo skuInfo;

    /**
     * 库存信息
     */
    private StockInfo stockInfo;

    /**
     * 门店信息
     */
    private RetailStoreInfo storeInfo;

    public DeliveryInfo getDeliveryInfo() {
        return this.deliveryInfo;
    }

    public DescInfo getDescInfo() {
        return this.descInfo;
    }

    public ItemInfo getItemInfo() {
        return this.itemInfo;
    }

    public MobileDescInfo getMobileDescInfo() {
        return this.mobileDescInfo;
    }

    public DetailPriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public RateInfo getRateInfo() {
        return this.rateInfo;
    }

    public SellerInfo getSellerInfo() {
        return this.sellerInfo;
    }

    public SkuInfo getSkuInfo() {
        return this.skuInfo;
    }

    public StockInfo getStockInfo() {
        return this.stockInfo;
    }

    public RetailStoreInfo getStoreInfo() {
        return this.storeInfo;
    }

    public void setDeliveryInfo(DeliveryInfo deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
    }

    public void setDescInfo(DescInfo descInfo) {
        this.descInfo = descInfo;
    }

    public void setItemInfo(ItemInfo itemInfo) {
        this.itemInfo = itemInfo;
    }

    public void setMobileDescInfo(MobileDescInfo mobileDescInfo) {
        this.mobileDescInfo = mobileDescInfo;
    }

    public void setPriceInfo(DetailPriceInfo priceInfo) {
        this.priceInfo = priceInfo;
    }

    public void setRateInfo(RateInfo rateInfo) {
        this.rateInfo = rateInfo;
    }

    public void setSellerInfo(SellerInfo sellerInfo) {
        this.sellerInfo = sellerInfo;
    }

    public void setSkuInfo(SkuInfo skuInfo) {
        this.skuInfo = skuInfo;
    }

    public void setStockInfo(StockInfo stockInfo) {
        this.stockInfo = stockInfo;
    }

    public void setStoreInfo(RetailStoreInfo storeInfo) {
        this.storeInfo = storeInfo;
    }

}
