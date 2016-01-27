package com.scott.dev.taobao.api.delivery.domain;

/*
 * 查询揽送范围之内的物流公司信息
 */
public class LogisticsPartner {

    /*
     * 物流公司揽收和资费详细信息
     */
    private CarriageDetail carriage;

    /*
     * 揽收说明信息
     */
    private String coverRemark;

    /*
     * 物流公司详细信息
     */
    private PartnerDetail partner;

    /*
     * 不可送达的说明信息
     */
    private String uncoverRemark;

    public CarriageDetail getCarriage() {
        return carriage;
    }

    public String getCoverRemark() {
        return coverRemark;
    }

    public PartnerDetail getPartner() {
        return partner;
    }

    public String getUncoverRemark() {
        return uncoverRemark;
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
