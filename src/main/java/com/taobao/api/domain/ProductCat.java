package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 产品线
 *
 * @author auto create
 * @since 1.0, null
 */
public class ProductCat extends TaobaoObject {

    private static final long serialVersionUID = 2729174123554633317L;

    /**
     * 代销采购价百分比
     */
    @ApiField("cost_percent_agent")
    private String costPercentAgent;

    /**
     * 经销采购价百分比
     */
    @ApiField("cost_percent_dealer")
    private String costPercentDealer;

    /**
     * 产品线ID
     */
    @ApiField("id")
    private Long id;

    /**
     * 产品线名称
     */
    @ApiField("name")
    private String name;

    /**
     * 产品数量
     */
    @ApiField("product_num")
    private Long productNum;

    /**
     * 最高零食价百分比
     */
    @ApiField("retail_high_percent")
    private String retailHighPercent;

    /**
     * 最低零售价百分比
     */
    @ApiField("retail_low_percent")
    private String retailLowPercent;

    public String getCostPercentAgent() {
        return this.costPercentAgent;
    }

    public void setCostPercentAgent(String costPercentAgent) {
        this.costPercentAgent = costPercentAgent;
    }

    public String getCostPercentDealer() {
        return this.costPercentDealer;
    }

    public void setCostPercentDealer(String costPercentDealer) {
        this.costPercentDealer = costPercentDealer;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getProductNum() {
        return this.productNum;
    }

    public void setProductNum(Long productNum) {
        this.productNum = productNum;
    }

    public String getRetailHighPercent() {
        return this.retailHighPercent;
    }

    public void setRetailHighPercent(String retailHighPercent) {
        this.retailHighPercent = retailHighPercent;
    }

    public String getRetailLowPercent() {
        return this.retailLowPercent;
    }

    public void setRetailLowPercent(String retailLowPercent) {
        this.retailLowPercent = retailLowPercent;
    }

}
