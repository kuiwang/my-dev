package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.RefundsApplyGetResponse;

/**
 * TOP API: taobao.refunds.apply.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:29
 */
public class RefundsApplyGetRequest implements TaobaoRequest<RefundsApplyGetResponse> {

    /**
     * 需要返回的字段。目前支持有：refund_id, tid, title, buyer_nick, seller_nick,
     * total_fee, status, created, refund_fee
     */
    private String fields;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 页码。传入值为 1 代表第一页，传入值为 2 代表第二页，依此类推。默认返回的数据是从第一页开始<br />
     * 支持最小值为：1
     */
    private Long pageNo;

    /**
     * 每页条数。取值范围:大于零的整数; 默认值:40;最大值:100<br />
     * 支持最大值为：100<br />
     * 支持最小值为：1
     */
    private Long pageSize;

    /**
     * 卖家昵称
     */
    private String sellerNick;

    /**
     * 退款状态，默认查询所有退款状态的数据，除了默认值外每次只能查询一种状态。
     * WAIT_SELLER_AGREE(买家已经申请退款，等待卖家同意)
     * WAIT_BUYER_RETURN_GOODS(卖家已经同意退款，等待买家退货)
     * WAIT_SELLER_CONFIRM_GOODS(买家已经退货，等待卖家确认收货)
     * SELLER_REFUSE_BUYER(卖家拒绝退款) CLOSED(退款关闭) SUCCESS(退款成功)
     */
    private String status;

    private Long timestamp;

    /**
     * 交易类型列表，一次查询多种类型可用半角逗号分隔，默认同时查询guarantee_trade,
     * auto_delivery的2种类型的数据。 fixed(一口价) auction(拍卖)
     * guarantee_trade(一口价、拍卖) independent_simple_trade(旺店入门版交易)
     * independent_shop_trade(旺店标准版交易) auto_delivery(自动发货) ec(直冲) cod(货到付款)
     * fenxiao(分销) game_equipment(游戏装备) shopex_trade(ShopEX交易)
     * netcn_trade(万网交易) external_trade(统一外部交易)
     */
    private String type;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(fields, "fields");
        RequestCheckUtils.checkMinValue(pageNo, 1L, "pageNo");
        RequestCheckUtils.checkMaxValue(pageSize, 100L, "pageSize");
        RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.refunds.apply.get";
    }

    public String getFields() {
        return this.fields;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    @Override
    public Class<RefundsApplyGetResponse> getResponseClass() {
        return RefundsApplyGetResponse.class;
    }

    public String getSellerNick() {
        return this.sellerNick;
    }

    public String getStatus() {
        return this.status;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("fields", this.fields);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("seller_nick", this.sellerNick);
        txtParams.put("status", this.status);
        txtParams.put("type", this.type);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setType(String type) {
        this.type = type;
    }
}
