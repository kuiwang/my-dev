package com.aliyun.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * Database数据结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class Database extends TaobaoObject {

    private static final long serialVersionUID = 6362452165987255147L;

    /**
     * 由Acounts组成的list
     */
    @ApiListField("Accounts")
    @ApiField("AccountPrivilegeInfo")
    private List<AccountPrivilegeInfo> accounts;

    /**
     * 字符集
     */
    @ApiField("CharacterSetName")
    private String characterSetName;

    /**
     * 数据库描述
     */
    @ApiField("DBDescription")
    private String dBDescription;

    /**
     * 数据库所属实例名称
     */
    @ApiField("DBInstanceId")
    private String dBInstanceId;

    /**
     * 数据库名称
     */
    @ApiField("DBName")
    private String dBName;

    /**
     * 数据库状态 Creating：创建中 Running：使用中 Deleting：删除中
     */
    @ApiField("DBStatus")
    private String dBStatus;

    /**
     * 数据库实例类型
     */
    @ApiField("Engine")
    private String engine;

    public List<AccountPrivilegeInfo> getAccounts() {
        return this.accounts;
    }

    public String getCharacterSetName() {
        return this.characterSetName;
    }

    public String getdBDescription() {
        return this.dBDescription;
    }

    public String getdBInstanceId() {
        return this.dBInstanceId;
    }

    public String getdBName() {
        return this.dBName;
    }

    public String getdBStatus() {
        return this.dBStatus;
    }

    public String getEngine() {
        return this.engine;
    }

    public void setAccounts(List<AccountPrivilegeInfo> accounts) {
        this.accounts = accounts;
    }

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    public void setdBDescription(String dBDescription) {
        this.dBDescription = dBDescription;
    }

    public void setdBInstanceId(String dBInstanceId) {
        this.dBInstanceId = dBInstanceId;
    }

    public void setdBName(String dBName) {
        this.dBName = dBName;
    }

    public void setdBStatus(String dBStatus) {
        this.dBStatus = dBStatus;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

}
