package com.scott.dev.taobao.api.hotel.domain;

import java.util.Date;

/**
 * RoomType（房型）结构。各字段详细说明可参考接口定义，如：房型发布接口。
 */
public class RoomType {

    /**
     * 某卖家提供的房型别名(注：该字段将被废弃)
     */
    private String aliasName;

    /**
     * 房型审核被否决的原因
     */
    private String auditDenyReason;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 酒店id
     */
    private Long hid;

    /**
     * 修改时间
     */
    private Date modified;

    /**
     * 房型名称
     */
    private String name;

    /**
     * 房型id
     */
    private Long rid;

    /**
     * 状态。0：待审核，1：正常（审核通过），2：审核否决，3：停售
     */
    private Long status;

    public String getAliasName() {
        return this.aliasName;
    }

    public String getAuditDenyReason() {
        return this.auditDenyReason;
    }

    public Date getCreated() {
        return this.created;
    }

    public Long getHid() {
        return this.hid;
    }

    public Date getModified() {
        return this.modified;
    }

    public String getName() {
        return this.name;
    }

    public Long getRid() {
        return this.rid;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public void setAuditDenyReason(String auditDenyReason) {
        this.auditDenyReason = auditDenyReason;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setHid(Long hid) {
        this.hid = hid;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

}
