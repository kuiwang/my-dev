package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * rds创建、查询、删除返回结果数据结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class RdsDbInfo extends TaobaoObject {

    private static final long serialVersionUID = 3687668138589585367L;

    /**
     * 数据库编码
     */
    @ApiField("charset")
    private String charset;

    /**
     * 备注
     */
    @ApiField("comment")
    private String comment;

    /**
     * 数据库id
     */
    @ApiField("db_id")
    private String dbId;

    /**
     * 数据库名称
     */
    @ApiField("db_name")
    private String dbName;

    /**
     * 数据库状态 0：创建中 ；1：激活；3：正在删除
     */
    @ApiField("db_status")
    private String dbStatus;

    /**
     * 数据库类型，mysql或者mssql
     */
    @ApiField("db_type")
    private String dbType;

    /**
     * rds实例id
     */
    @ApiField("instance_id")
    private String instanceId;

    /**
     * rds实例名
     */
    @ApiField("instance_name")
    private String instanceName;

    /**
     * rds实例类型,s:共享型，x:专享型
     */
    @ApiField("instance_type")
    private String instanceType;

    /**
     * 最大帐号数，1个数据库最多可以创建的账户数目
     */
    @ApiField("max_account")
    private String maxAccount;

    /**
     * 数据库登录密码
     */
    @ApiField("password")
    private String password;

    /**
     * 用户id
     */
    @ApiField("uid")
    private String uid;

    /**
     * 登录数据库的帐号
     */
    @ApiField("user_name")
    private String userName;

    public String getCharset() {
        return this.charset;
    }

    public String getComment() {
        return this.comment;
    }

    public String getDbId() {
        return this.dbId;
    }

    public String getDbName() {
        return this.dbName;
    }

    public String getDbStatus() {
        return this.dbStatus;
    }

    public String getDbType() {
        return this.dbType;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public String getInstanceType() {
        return this.instanceType;
    }

    public String getMaxAccount() {
        return this.maxAccount;
    }

    public String getPassword() {
        return this.password;
    }

    public String getUid() {
        return this.uid;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setDbId(String dbId) {
        this.dbId = dbId;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public void setDbStatus(String dbStatus) {
        this.dbStatus = dbStatus;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public void setMaxAccount(String maxAccount) {
        this.maxAccount = maxAccount;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
