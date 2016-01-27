package com.scott.dev.taobao.api.fenxiao.domain;

/*
 * 商品库存对象
 */
public class InventorySum {

    /*
     * 库存类型： 1：正常 2：损坏 3：冻结 10：质押 11-20:商家自定义
     */
    private Number inventoryType;

    /*
     * 库存类型名称
     */
    private String inventoryTypeName;

    /*
     * 总占用数量
     */
    private Number occupyQuantity;

    /*
     * 总物理库存数量
     */
    private Number quantity;

    /*
     * 总预扣数量
     */
    private Number reserveQuantity;

    /*
     * 商品商家编码
     */
    private String scItemCode;

    /*
     * 商品后端ID，如果有传sc_item_code,参数可以为0
     */
    private Number scItemId;

    /*
     * 商家仓库编码
     */
    private String storeCode;

    public Number getInventoryType() {
        return inventoryType;
    }

    public String getInventoryTypeName() {
        return inventoryTypeName;
    }

    public Number getOccupyQuantity() {
        return occupyQuantity;
    }

    public Number getQuantity() {
        return quantity;
    }

    public Number getReserveQuantity() {
        return reserveQuantity;
    }

    public String getScItemCode() {
        return scItemCode;
    }

    public Number getScItemId() {
        return scItemId;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public void setInventoryType(Number inventoryType) {
        this.inventoryType = inventoryType;
    }

    public void setInventoryTypeName(String inventoryTypeName) {
        this.inventoryTypeName = inventoryTypeName;
    }

    public void setOccupyQuantity(Number occupyQuantity) {
        this.occupyQuantity = occupyQuantity;
    }

    public void setQuantity(Number quantity) {
        this.quantity = quantity;
    }

    public void setReserveQuantity(Number reserveQuantity) {
        this.reserveQuantity = reserveQuantity;
    }

    public void setScItemCode(String scItemCode) {
        this.scItemCode = scItemCode;
    }

    public void setScItemId(Number scItemId) {
        this.scItemId = scItemId;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

}
