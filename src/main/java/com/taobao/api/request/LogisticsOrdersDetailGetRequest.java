package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsOrdersDetailGetResponse;

/**
 * TOP API: taobao.logistics.orders.detail.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class LogisticsOrdersDetailGetRequest implements
        TaobaoRequest<LogisticsOrdersDetailGetResponse> {

    /**
     * 买家昵称
     */
    private String buyerNick;

    /**
     * 创建时间结束.格式:yyyy-MM-dd HH:mm:ss
     */
    private Date endCreated;

    /**
     * 需返回的字段列表.可选值:Shipping 物流数据结构中所有字段.fileds中可以指定返回以上任意一个或者多个字段,以","分隔.
     */
    private String fields;

    /**
     * 谁承担运费.可选值:buyer(买家),seller(卖家).如:buyer
     */
    private String freightPayer;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 页码.该字段没传 或 值<1 ,则默认page_no为1
     */
    private Long pageNo;

    /**
     * 每页条数.该字段没传 或 值<1 ，则默认page_size为40<br />
     * 支持最大值为：100
     */
    private Long pageSize;

    /**
     * 收货人姓名
     */
    private String receiverName;

    /**
     * 卖家是否发货.可选值:yes(是),no(否).如:yes.
     */
    private String sellerConfirm;

    /**
     * 创建时间开始.格式:yyyy-MM-dd HH:mm:ss
     */
    private Date startCreated;

    /**
     * 物流状态.可查看数据结构 Shipping 中的status字段.
     */
    private String status;

    /**
     * 交易ID.如果加入tid参数的话,不用传其他的参数,但是仅会返回一条物流订单信息.
     */
    private Long tid;

    private Long timestamp;

    /**
     * 物流方式.可选值:post(平邮),express(快递),ems(EMS).如:post
     */
    private String type;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(fields, "fields");
        RequestCheckUtils.checkMaxValue(pageSize, 100L, "pageSize");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.logistics.orders.detail.get";
    }

    public String getBuyerNick() {
        return this.buyerNick;
    }

    public Date getEndCreated() {
        return this.endCreated;
    }

    public String getFields() {
        return this.fields;
    }

    public String getFreightPayer() {
        return this.freightPayer;
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

    public String getReceiverName() {
        return this.receiverName;
    }

    @Override
    public Class<LogisticsOrdersDetailGetResponse> getResponseClass() {
        return LogisticsOrdersDetailGetResponse.class;
    }

    public String getSellerConfirm() {
        return this.sellerConfirm;
    }

    public Date getStartCreated() {
        return this.startCreated;
    }

    public String getStatus() {
        return this.status;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("buyer_nick", this.buyerNick);
        txtParams.put("end_created", this.endCreated);
        txtParams.put("fields", this.fields);
        txtParams.put("freight_payer", this.freightPayer);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("receiver_name", this.receiverName);
        txtParams.put("seller_confirm", this.sellerConfirm);
        txtParams.put("start_created", this.startCreated);
        txtParams.put("status", this.status);
        txtParams.put("tid", this.tid);
        txtParams.put("type", this.type);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Long getTid() {
        return this.tid;
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

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public void setEndCreated(Date endCreated) {
        this.endCreated = endCreated;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public void setFreightPayer(String freightPayer) {
        this.freightPayer = freightPayer;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public void setSellerConfirm(String sellerConfirm) {
        this.sellerConfirm = sellerConfirm;
    }

    public void setStartCreated(Date startCreated) {
        this.startCreated = startCreated;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setType(String type) {
        this.type = type;
    }
}
