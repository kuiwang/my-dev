package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 分销商品下载记录
 *
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoItemRecord extends TaobaoObject {

    private static final long serialVersionUID = 1224533267123141852L;

    /**
     * 下载时间
     */
    @ApiField("created")
    private Date created;

    /**
     * 分销商ID
     */
    @ApiField("distributor_id")
    private Long distributorId;

    /**
     * 商品ID
     */
    @ApiField("item_id")
    private Long itemId;

    /**
     * 更新时间（系统时间，无业务意义）
     */
    @ApiField("modified")
    private Date modified;

    /**
     * 产品ID
     */
    @ApiField("product_id")
    private Long productId;

    /**
     * 分销方式：AGENT（只做代销，默认值）、DEALER（只做经销）
     */
    @ApiField("trade_type")
    private String tradeType;

    public Date getCreated() {
        return this.created;
    }

    public Long getDistributorId() {
        return this.distributorId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public Date getModified() {
        return this.modified;
    }

    public Long getProductId() {
        return this.productId;
    }

    public String getTradeType() {
        return this.tradeType;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setDistributorId(Long distributorId) {
        this.distributorId = distributorId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

}
