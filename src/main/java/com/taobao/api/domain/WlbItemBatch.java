package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 批次库存查询结果记录
 *
 * @author auto create
 * @since 1.0, null
 */
public class WlbItemBatch extends TaobaoObject {

    private static final long serialVersionUID = 3467625625936759841L;

    /**
     * 批次编号
     */
    @ApiField("batch_code")
    private String batchCode;

    /**
     * 创建者
     */
    @ApiField("creator")
    private String creator;

    /**
     * 残次数量
     */
    @ApiField("defect_quantity")
    private Long defectQuantity;

    /**
     * 到期时间
     */
    @ApiField("due_date")
    private Date dueDate;

    /**
     * 创建时间
     */
    @ApiField("gmt_create")
    private Date gmtCreate;

    /**
     * 最后修改时间
     */
    @ApiField("gmt_modified")
    private Date gmtModified;

    /**
     * 保质期
     */
    @ApiField("guarantee_period")
    private String guaranteePeriod;

    /**
     * 天（单位）
     */
    @ApiField("guarantee_unit")
    private Long guaranteeUnit;

    /**
     * 商品批次记录id
     */
    @ApiField("id")
    private Long id;

    /**
     * 是否删除。0：正常 1：删除
     */
    @ApiField("is_deleted")
    private Boolean isDeleted;

    /**
     * 商品id
     */
    @ApiField("item_id")
    private Long itemId;

    /**
     * 最后修改者
     */
    @ApiField("last_modifier")
    private String lastModifier;

    /**
     * 产地
     */
    @ApiField("produce_area")
    private String produceArea;

    /**
     * 生产编号
     */
    @ApiField("produce_code")
    private String produceCode;

    /**
     * 生产日期
     */
    @ApiField("produce_date")
    private Date produceDate;

    /**
     * 商品数量
     */
    @ApiField("quantity")
    private Long quantity;

    /**
     * 接受日期
     */
    @ApiField("receive_date")
    private Date receiveDate;

    /**
     * 描述
     */
    @ApiField("remarks")
    private String remarks;

    /**
     * 状态。item_batch_status_open:开放 item_batch_status_lock:冻结
     * item_batch_status_invalid:无效
     */
    @ApiField("status")
    private String status;

    /**
     * 存储类型
     */
    @ApiField("store_code")
    private String storeCode;

    /**
     * 用户id
     */
    @ApiField("user_id")
    private Long userId;

    /**
     * 版本
     */
    @ApiField("version")
    private Long version;

    public String getBatchCode() {
        return this.batchCode;
    }

    public String getCreator() {
        return this.creator;
    }

    public Long getDefectQuantity() {
        return this.defectQuantity;
    }

    public Date getDueDate() {
        return this.dueDate;
    }

    public Date getGmtCreate() {
        return this.gmtCreate;
    }

    public Date getGmtModified() {
        return this.gmtModified;
    }

    public String getGuaranteePeriod() {
        return this.guaranteePeriod;
    }

    public Long getGuaranteeUnit() {
        return this.guaranteeUnit;
    }

    public Long getId() {
        return this.id;
    }

    public Boolean getIsDeleted() {
        return this.isDeleted;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public String getLastModifier() {
        return this.lastModifier;
    }

    public String getProduceArea() {
        return this.produceArea;
    }

    public String getProduceCode() {
        return this.produceCode;
    }

    public Date getProduceDate() {
        return this.produceDate;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public Date getReceiveDate() {
        return this.receiveDate;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public String getStatus() {
        return this.status;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public Long getUserId() {
        return this.userId;
    }

    public Long getVersion() {
        return this.version;
    }

    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setDefectQuantity(Long defectQuantity) {
        this.defectQuantity = defectQuantity;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public void setGuaranteePeriod(String guaranteePeriod) {
        this.guaranteePeriod = guaranteePeriod;
    }

    public void setGuaranteeUnit(Long guaranteeUnit) {
        this.guaranteeUnit = guaranteeUnit;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public void setLastModifier(String lastModifier) {
        this.lastModifier = lastModifier;
    }

    public void setProduceArea(String produceArea) {
        this.produceArea = produceArea;
    }

    public void setProduceCode(String produceCode) {
        this.produceCode = produceCode;
    }

    public void setProduceDate(Date produceDate) {
        this.produceDate = produceDate;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

}
