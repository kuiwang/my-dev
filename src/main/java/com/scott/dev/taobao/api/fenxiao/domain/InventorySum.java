package com.scott.dev.taobao.api.fenxiao.domain;

/*
 * 商品库存对象
 */
public class InventorySum {

    /*
     * 商品后端ID，如果有传sc_item_code,参数可以为0
     */
    private Number scItemId;

    /*
     * 商品商家编码
     */
    private String scItemCode;

    /*
     * 商家仓库编码
     */
    private String storeCode;

    /*
     * 库存类型： 1：正常 2：损坏 3：冻结 10：质押 11-20:商家自定义
     */
    private Number inventoryType;

    /*
     * 库存类型名称
     */
    private String inventoryTypeName;

    /*
     * 总物理库存数量
     */
    private Number quantity;

    /*
     * 总预扣数量
     */
    private Number reserveQuantity;

    /*
     * 总占用数量
     */
    private Number occupyQuantity;

    public Number getScItemId() {
        return scItemId;
    }

    public void setScItemId(Number scItemId) {
        this.scItemId = scItemId;
    }

    public String getScItemCode() {
        return scItemCode;
    }

    public void setScItemCode(String scItemCode) {
        this.scItemCode = scItemCode;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public Number getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(Number inventoryType) {
        this.inventoryType = inventoryType;
    }

    public String getInventoryTypeName() {
        return inventoryTypeName;
    }

    public void setInventoryTypeName(String inventoryTypeName) {
        this.inventoryTypeName = inventoryTypeName;
    }

    public Number getQuantity() {
        return quantity;
    }

    public void setQuantity(Number quantity) {
        this.quantity = quantity;
    }

    public Number getReserveQuantity() {
        return reserveQuantity;
    }

    public void setReserveQuantity(Number reserveQuantity) {
        this.reserveQuantity = reserveQuantity;
    }

    public Number getOccupyQuantity() {
        return occupyQuantity;
    }

    public void setOccupyQuantity(Number occupyQuantity) {
        this.occupyQuantity = occupyQuantity;
    }

}
