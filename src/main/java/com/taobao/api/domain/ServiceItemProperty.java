package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 服务项属性
 *
 * @author auto create
 * @since 1.0, null
 */
public class ServiceItemProperty extends TaobaoObject {

    private static final long serialVersionUID = 6838277436212731366L;

    /**
     * 基础价格
     */
    @ApiField("basic_price")
    private String basicPrice;

    /**
     * 质检服务简介
     */
    @ApiField("description")
    private String description;

    /**
     * 属性列表
     */
    @ApiListField("item_property_values")
    @ApiField("item_property_values")
    private List<ItemPropertyValues> itemPropertyValues;

    /**
     * 服务商的nick
     */
    @ApiField("nick")
    private String nick;

    /**
     * 服务收费项代码
     */
    @ApiField("service_item_code")
    private String serviceItemCode;

    /**
     * 服务收费项名称
     */
    @ApiField("service_item_name")
    private String serviceItemName;

    /**
     * 服务名称
     */
    @ApiField("service_name")
    private String serviceName;

    public String getBasicPrice() {
        return this.basicPrice;
    }

    public String getDescription() {
        return this.description;
    }

    public List<ItemPropertyValues> getItemPropertyValues() {
        return this.itemPropertyValues;
    }

    public String getNick() {
        return this.nick;
    }

    public String getServiceItemCode() {
        return this.serviceItemCode;
    }

    public String getServiceItemName() {
        return this.serviceItemName;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public void setBasicPrice(String basicPrice) {
        this.basicPrice = basicPrice;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setItemPropertyValues(List<ItemPropertyValues> itemPropertyValues) {
        this.itemPropertyValues = itemPropertyValues;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setServiceItemCode(String serviceItemCode) {
        this.serviceItemCode = serviceItemCode;
    }

    public void setServiceItemName(String serviceItemName) {
        this.serviceItemName = serviceItemName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

}
