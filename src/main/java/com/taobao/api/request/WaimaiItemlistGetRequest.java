package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WaimaiItemlistGetResponse;

/**
 * TOP API: taobao.waimai.itemlist.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:28
 */
public class WaimaiItemlistGetRequest implements TaobaoRequest<WaimaiItemlistGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 外卖前台类目id<br />
     * 支持的最大列表长度为：11
     */
    private Long categoryId;

    /**
     * 商品截止修改时间格式如(2013-10-25 00:00：00)
     */
    private String endModified;

    /**
     * 只返回对应的字段信息，可输入(itemid,title,price,oriprice,goods_no,auction_status,
     * quantity ,auction_desc,pic_url,category_id,limit_buy,viceImage,sku,
     * recommend ,create_time,modify_time)，多个以英文逗号分隔
     */
    private String fields;

    /**
     * 外卖宝贝标题关键字
     */
    private String keyword;

    /**
     * 格式为column:asc/desc ，column可选值:modify_time(修改时间),price(宝贝价格);
     * 默认修改降序(即最新上架及修改的排在前面)。如按照上架时间降序排序方式为modify_time:desc
     */
    private String orderBy;

    /**
     * 查询菜品的页码。1则为第一页<br />
     * 支持最大值为：500<br />
     * 支持最小值为：1<br />
     * 支持的最大列表长度为：3
     */
    private Long pageNo;

    /**
     * 每一次查询返回的条数<br />
     * 支持最大值为：500<br />
     * 支持最小值为：1
     */
    private Long pageSize;

    /**
     * 出售中宝贝1,仓库中宝贝2,所有宝贝0<br />
     * 支持最大值为：2<br />
     * 支持最小值为：0<br />
     * 支持的最大列表长度为：1
     */
    private Long salesStatus;

    /**
     * 外卖数字型店铺id<br />
     * 支持的最大列表长度为：9
     */
    private Long shopid;

    /**
     * 商品起始的修改时间格式如(2013-10-22 00:00：00)
     */
    private String startModified;

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public void setEndModified(String endModified) {
        this.endModified = endModified;
    }

    public String getEndModified() {
        return this.endModified;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getOrderBy() {
        return this.orderBy;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setSalesStatus(Long salesStatus) {
        this.salesStatus = salesStatus;
    }

    public Long getSalesStatus() {
        return this.salesStatus;
    }

    public void setShopid(Long shopid) {
        this.shopid = shopid;
    }

    public Long getShopid() {
        return this.shopid;
    }

    public void setStartModified(String startModified) {
        this.startModified = startModified;
    }

    public String getStartModified() {
        return this.startModified;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.waimai.itemlist.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("category_id", this.categoryId);
        txtParams.put("end_modified", this.endModified);
        txtParams.put("fields", this.fields);
        txtParams.put("keyword", this.keyword);
        txtParams.put("order_by", this.orderBy);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("sales_status", this.salesStatus);
        txtParams.put("shopid", this.shopid);
        txtParams.put("start_modified", this.startModified);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public Class<WaimaiItemlistGetResponse> getResponseClass() {
        return WaimaiItemlistGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(fields, "fields");
        RequestCheckUtils.checkNotEmpty(pageNo, "pageNo");
        RequestCheckUtils.checkMaxValue(pageNo, 500L, "pageNo");
        RequestCheckUtils.checkMinValue(pageNo, 1L, "pageNo");
        RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
        RequestCheckUtils.checkMaxValue(pageSize, 500L, "pageSize");
        RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
        RequestCheckUtils.checkNotEmpty(salesStatus, "salesStatus");
        RequestCheckUtils.checkMaxValue(salesStatus, 2L, "salesStatus");
        RequestCheckUtils.checkMinValue(salesStatus, 0L, "salesStatus");
        RequestCheckUtils.checkNotEmpty(shopid, "shopid");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
