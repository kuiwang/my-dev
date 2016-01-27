package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 点菜订单详情
 *
 * @author auto create
 * @since 1.0, null
 */
public class DdTopMenuDetailVO extends TaobaoObject {

    private static final long serialVersionUID = 6849677346595346881L;

    /**
     * 联系人
     */
    @ApiField("contact")
    private String contact;

    /**
     * 菜单创建时间
     */
    @ApiField("create_time")
    private Date createTime;

    /**
     * 就餐时间
     */
    @ApiField("dining_time")
    private Date diningTime;

    /**
     * 点菜单菜品列表
     */
    @ApiListField("items")
    @ApiField("dd_item_v_o")
    private List<DdItemVO> items;

    /**
     * 菜单编码
     */
    @ApiField("menu_id")
    private Long menuId;

    /**
     * 手机号
     */
    @ApiField("mobile")
    private String mobile;

    /**
     * 买家备注
     */
    @ApiField("note")
    private String note;

    /**
     * 外部门店id
     */
    @ApiField("out_store_id")
    private String outStoreId;

    /**
     * 付款时间
     */
    @ApiField("pay_time")
    private Date payTime;

    /**
     * 就餐人数
     */
    @ApiField("people")
    private Long people;

    /**
     * 现价：小于等于原价
     */
    @ApiField("real_price")
    private String realPrice;

    /**
     * 状态：
     */
    @ApiField("status")
    private Long status;

    /**
     * 淘点点门店编码
     */
    @ApiField("store_id")
    private String storeId;

    /**
     * 桌台编码
     */
    @ApiField("table_code")
    private String tableCode;

    /**
     * 桌台名称
     */
    @ApiField("table_name")
    private String tableName;

    /**
     * 原价
     */
    @ApiField("total_price")
    private String totalPrice;

    public String getContact() {
        return this.contact;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public Date getDiningTime() {
        return this.diningTime;
    }

    public List<DdItemVO> getItems() {
        return this.items;
    }

    public Long getMenuId() {
        return this.menuId;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getNote() {
        return this.note;
    }

    public String getOutStoreId() {
        return this.outStoreId;
    }

    public Date getPayTime() {
        return this.payTime;
    }

    public Long getPeople() {
        return this.people;
    }

    public String getRealPrice() {
        return this.realPrice;
    }

    public Long getStatus() {
        return this.status;
    }

    public String getStoreId() {
        return this.storeId;
    }

    public String getTableCode() {
        return this.tableCode;
    }

    public String getTableName() {
        return this.tableName;
    }

    public String getTotalPrice() {
        return this.totalPrice;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setDiningTime(Date diningTime) {
        this.diningTime = diningTime;
    }

    public void setItems(List<DdItemVO> items) {
        this.items = items;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setOutStoreId(String outStoreId) {
        this.outStoreId = outStoreId;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public void setPeople(Long people) {
        this.people = people;
    }

    public void setRealPrice(String realPrice) {
        this.realPrice = realPrice;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public void setTableCode(String tableCode) {
        this.tableCode = tableCode;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

}
