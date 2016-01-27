package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelOrdersSearchResponse;

/**
 * TOP API: taobao.hotel.orders.search request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:25
 */
public class HotelOrdersSearchRequest implements TaobaoRequest<HotelOrdersSearchResponse> {

    /**
     * 入住时间查询结束时间，格式为：yyyy-MM-dd。不能早于checkin_date_start，间隔不能大于30
     */
    private Date checkinDateEnd;

    /**
     * 入住时间查询起始时间，格式为：yyyy-MM-dd
     */
    private Date checkinDateStart;

    /**
     * 离店时间查询结束时间，格式为：yyyy-MM-dd。不能早于checkout_date_start，间隔不能大于30
     */
    private Date checkoutDateEnd;

    /**
     * 离店时间查询起始时间，格式为：yyyy-MM-dd
     */
    private Date checkoutDateStart;

    /**
     * 订单创建时间查询结束时间，格式为：yyyy-MM-dd。不能早于created_start，间隔不能大于30
     */
    private Date createdEnd;

    /**
     * 订单创建时间查询起始时间，格式为：yyyy-MM-dd
     */
    private Date createdStart;

    /**
     * 商品gid列表，多个gid用英文逗号隔开，一次不超过5个
     */
    private String gids;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 酒店hid列表，多个hid用英文逗号隔开，一次不超过5个
     */
    private String hids;

    /**
     * 是否需要返回该订单的入住人列表。可选值：true，false。
     */
    private Boolean needGuest;

    /**
     * 是否显示买家留言，可选值true、false
     */
    private Boolean needMessage;

    /**
     * 酒店订单oids列表，多个oid用英文逗号隔开，一次不超过20个。oids，tids，hids，rids，gids，（
     * checkin_date_start
     * ，checkin_date_end），（checkout_date_start，checkout_date_end
     * ），（created_start，created_end）必须传入一项，括号表示需同时存在才做为查询条件。
     * oids，tids，hids，rids，gids同时出现时，优先级按此顺序由高到低只取一项。其他同时出现时，并列使用。
     */
    private String oids;

    /**
     * 分页页码。取值范围，大于零的整数，默认值1，即返回第一页的数据。页面大小为20
     */
    private Long pageNo;

    /**
     * 房型rid列表，多个rid用英文逗号隔开，一次不超过5个
     */
    private String rids;

    /**
     * 订单状态。A：等待买家付款。B：买家已付款待卖家发货。C：卖家已发货待买家确认。D：交易成功。E：交易关闭<br />
     * 支持最大长度为：1<br />
     * 支持的最大列表长度为：1
     */
    private String status;

    /**
     * 淘宝订单tid列表，多个tid用英文逗号隔开，一次不超过20个。
     */
    private String tids;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxLength(status, 1, "status");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.hotel.orders.search";
    }

    public Date getCheckinDateEnd() {
        return this.checkinDateEnd;
    }

    public Date getCheckinDateStart() {
        return this.checkinDateStart;
    }

    public Date getCheckoutDateEnd() {
        return this.checkoutDateEnd;
    }

    public Date getCheckoutDateStart() {
        return this.checkoutDateStart;
    }

    public Date getCreatedEnd() {
        return this.createdEnd;
    }

    public Date getCreatedStart() {
        return this.createdStart;
    }

    public String getGids() {
        return this.gids;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getHids() {
        return this.hids;
    }

    public Boolean getNeedGuest() {
        return this.needGuest;
    }

    public Boolean getNeedMessage() {
        return this.needMessage;
    }

    public String getOids() {
        return this.oids;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    @Override
    public Class<HotelOrdersSearchResponse> getResponseClass() {
        return HotelOrdersSearchResponse.class;
    }

    public String getRids() {
        return this.rids;
    }

    public String getStatus() {
        return this.status;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("checkin_date_end", this.checkinDateEnd);
        txtParams.put("checkin_date_start", this.checkinDateStart);
        txtParams.put("checkout_date_end", this.checkoutDateEnd);
        txtParams.put("checkout_date_start", this.checkoutDateStart);
        txtParams.put("created_end", this.createdEnd);
        txtParams.put("created_start", this.createdStart);
        txtParams.put("gids", this.gids);
        txtParams.put("hids", this.hids);
        txtParams.put("need_guest", this.needGuest);
        txtParams.put("need_message", this.needMessage);
        txtParams.put("oids", this.oids);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("rids", this.rids);
        txtParams.put("status", this.status);
        txtParams.put("tids", this.tids);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public String getTids() {
        return this.tids;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setCheckinDateEnd(Date checkinDateEnd) {
        this.checkinDateEnd = checkinDateEnd;
    }

    public void setCheckinDateStart(Date checkinDateStart) {
        this.checkinDateStart = checkinDateStart;
    }

    public void setCheckoutDateEnd(Date checkoutDateEnd) {
        this.checkoutDateEnd = checkoutDateEnd;
    }

    public void setCheckoutDateStart(Date checkoutDateStart) {
        this.checkoutDateStart = checkoutDateStart;
    }

    public void setCreatedEnd(Date createdEnd) {
        this.createdEnd = createdEnd;
    }

    public void setCreatedStart(Date createdStart) {
        this.createdStart = createdStart;
    }

    public void setGids(String gids) {
        this.gids = gids;
    }

    public void setHids(String hids) {
        this.hids = hids;
    }

    public void setNeedGuest(Boolean needGuest) {
        this.needGuest = needGuest;
    }

    public void setNeedMessage(Boolean needMessage) {
        this.needMessage = needMessage;
    }

    public void setOids(String oids) {
        this.oids = oids;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public void setRids(String rids) {
        this.rids = rids;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTids(String tids) {
        this.tids = tids;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
