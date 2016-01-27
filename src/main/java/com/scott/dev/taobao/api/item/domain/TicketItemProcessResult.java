package com.scott.dev.taobao.api.item.domain;

/*
 * 门票商品操作结果
 */
public class TicketItemProcessResult {

    /*
     * 商品操作流程是否被迫终止。 
     * 如果broken==false则表示成功发布商品， 则通过item_id字段获取新生成商品id；
     * 如果broken==true则表示发布商品遇到问题，则通过broken_reasons字段获取到失败原因。
     */
    private Boolean broken;

    /*
     * 操作商品遇到的错误原因
     */
    private String[] brokenReasons;

    /*
     * 成功操作的商品标识
     */
    private Number itemId;

    public Boolean getBroken() {
        return broken;
    }

    public String[] getBrokenReasons() {
        return brokenReasons;
    }

    public Number getItemId() {
        return itemId;
    }

    public void setBroken(Boolean broken) {
        this.broken = broken;
    }

    public void setBrokenReasons(String[] brokenReasons) {
        this.brokenReasons = brokenReasons;
    }

    public void setItemId(Number itemId) {
        this.itemId = itemId;
    }
}
