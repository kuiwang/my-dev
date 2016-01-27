package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 物流宝代销关系
 *
 * @author auto create
 * @since 1.0, null
 */
public class WlbConsignMent extends TaobaoObject {

    private static final long serialVersionUID = 1145932373934478621L;

    /**
     * 代销关系id
     */
    @ApiField("id")
    private Long id;

    /**
     * 代销商用户前台宝贝id
     */
    @ApiField("item_id")
    private Long itemId;

    /**
     * 代销数量
     */
    @ApiField("number")
    private Long number;

    /**
     * 供应商商品id
     */
    @ApiField("tgt_item_id")
    private Long tgtItemId;

    /**
     * 供应商用户id
     */
    @ApiField("tgt_user_id")
    private Long tgtUserId;

    /**
     * 代销商用户id
     */
    @ApiField("user_id")
    private Long userId;

    public Long getId() {
        return this.id;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public Long getNumber() {
        return this.number;
    }

    public Long getTgtItemId() {
        return this.tgtItemId;
    }

    public Long getTgtUserId() {
        return this.tgtUserId;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public void setTgtItemId(Long tgtItemId) {
        this.tgtItemId = tgtItemId;
    }

    public void setTgtUserId(Long tgtUserId) {
        this.tgtUserId = tgtUserId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}
