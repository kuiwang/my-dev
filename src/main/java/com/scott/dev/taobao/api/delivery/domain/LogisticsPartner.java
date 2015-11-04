package com.scott.dev.taobao.api.delivery.domain;

/*
 * 查询揽送范围之内的物流公司信息
 */
public class LogisticsPartner {

    /*
     * 揽收说明信息
     */
    private String coverRemark;

    /*
     * 不可送达的说明信息
     */
    private String uncoverRemark;

    /*
     * 物流公司揽收和资费详细信息
     */
    private CarriageDetail carriage;

    /*
     * 物流公司详细信息
     */
    private PartnerDetail partner;

    public String getCoverRemark() {
        return coverRemark;
    }

    public void setCoverRemark(String coverRemark) {
        this.coverRemark = coverRemark;
    }

    public String getUncoverRemark() {
        return uncoverRemark;
    }

    public void setUncoverRemark(String uncoverRemark) {
        this.uncoverRemark = uncoverRemark;
    }

    public CarriageDetail getCarriage() {
        return carriage;
    }

    public void setCarriage(CarriageDetail carriage) {
        this.carriage = carriage;
    }

    public PartnerDetail getPartner() {
        return partner;
    }

    public void setPartner(PartnerDetail partner) {
        this.partner = partner;
    }

}
