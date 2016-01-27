package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 库存明细
 *
 * @author auto create
 * @since 1.0, null
 */
public class IpcInventoryDetailDo extends TaobaoObject {

    private static final long serialVersionUID = 5514541251412529396L;

    /**
     * 主订单号
     */
    @ApiField("biz_order_id")
    private Long bizOrderId;

    /**
     * 子订单号
     */
    @ApiField("biz_sub_order_id")
    private Long bizSubOrderId;

    /**
     * 1拍减 2付减
     */
    @ApiField("flag")
    private Long flag;

    /**
     * 占用数量
     */
    @ApiField("occupy_quantity")
    private Long occupyQuantity;

    /**
     * 货主昵称
     */
    @ApiField("owner_nick")
    private String ownerNick;

    /**
     * 预扣库存数
     */
    @ApiField("reserve_quantity")
    private Long reserveQuantity;

    /**
     * 仓储商品id
     */
    @ApiField("sc_item_id")
    private Long scItemId;

    /**
     * 仓库编码
     */
    @ApiField("store_code")
    private String storeCode;

    public Long getBizOrderId() {
        return this.bizOrderId;
    }

    public Long getBizSubOrderId() {
        return this.bizSubOrderId;
    }

    public Long getFlag() {
        return this.flag;
    }

    public Long getOccupyQuantity() {
        return this.occupyQuantity;
    }

    public String getOwnerNick() {
        return this.ownerNick;
    }

    public Long getReserveQuantity() {
        return this.reserveQuantity;
    }

    public Long getScItemId() {
        return this.scItemId;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public void setBizOrderId(Long bizOrderId) {
        this.bizOrderId = bizOrderId;
    }

    public void setBizSubOrderId(Long bizSubOrderId) {
        this.bizSubOrderId = bizSubOrderId;
    }

    public void setFlag(Long flag) {
        this.flag = flag;
    }

    public void setOccupyQuantity(Long occupyQuantity) {
        this.occupyQuantity = occupyQuantity;
    }

    public void setOwnerNick(String ownerNick) {
        this.ownerNick = ownerNick;
    }

    public void setReserveQuantity(Long reserveQuantity) {
        this.reserveQuantity = reserveQuantity;
    }

    public void setScItemId(Long scItemId) {
        this.scItemId = scItemId;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

}
