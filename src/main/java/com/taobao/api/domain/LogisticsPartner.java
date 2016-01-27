package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 查询揽送范围之内的物流公司信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class LogisticsPartner extends TaobaoObject {

    private static final long serialVersionUID = 1738355724427194473L;

    /**
     * 物流公司揽收和资费详细信息
     */
    @ApiField("carriage")
    private CarriageDetail carriage;

    /**
     * 揽收说明信息
     */
    @ApiField("cover_remark")
    private String coverRemark;

    /**
     * 物流公司详细信息
     */
    @ApiField("partner")
    private PartnerDetail partner;

    /**
     * 不可送达的说明信息
     */
    @ApiField("uncover_remark")
    private String uncoverRemark;

    public CarriageDetail getCarriage() {
        return this.carriage;
    }

    public String getCoverRemark() {
        return this.coverRemark;
    }

    public PartnerDetail getPartner() {
        return this.partner;
    }

    public String getUncoverRemark() {
        return this.uncoverRemark;
    }

    public void setCarriage(CarriageDetail carriage) {
        this.carriage = carriage;
    }

    public void setCoverRemark(String coverRemark) {
        this.coverRemark = coverRemark;
    }

    public void setPartner(PartnerDetail partner) {
        this.partner = partner;
    }

    public void setUncoverRemark(String uncoverRemark) {
        this.uncoverRemark = uncoverRemark;
    }

}
