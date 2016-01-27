package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 折扣信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class Discount extends TaobaoObject {

    private static final long serialVersionUID = 7373136297935725138L;

    /**
     * 创建时间
     */
    @ApiField("created")
    private Date created;

    /**
     * 折扣详情
     */
    @ApiListField("details")
    @ApiField("discount_detail")
    private List<DiscountDetail> details;

    /**
     * 折扣ID
     */
    @ApiField("discount_id")
    private Long discountId;

    /**
     * 修改时间
     */
    @ApiField("modified")
    private Date modified;

    /**
     * 折扣名称
     */
    @ApiField("name")
    private String name;

    public Date getCreated() {
        return this.created;
    }

    public List<DiscountDetail> getDetails() {
        return this.details;
    }

    public Long getDiscountId() {
        return this.discountId;
    }

    public Date getModified() {
        return this.modified;
    }

    public String getName() {
        return this.name;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setDetails(List<DiscountDetail> details) {
        this.details = details;
    }

    public void setDiscountId(Long discountId) {
        this.discountId = discountId;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public void setName(String name) {
        this.name = name;
    }

}
