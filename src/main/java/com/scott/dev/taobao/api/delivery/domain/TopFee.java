package com.scott.dev.taobao.api.delivery.domain;

/*
 * 运费模板中运费信息对象
 */
public class TopFee {

    /*
     * 增费：输入0.00-999.99（最多包含两位小数） 不能为空不输入运费时必须输入0
     */
    private String addFee;

    /*
     * 增费标准：当valuation(记价方式)为0时输入1-9999范围内的整数
     */
    private String addStandard;

    /*
     * 邮费子项涉及的地区,多个地区用逗号连接数量串;
     * 可以用taobao.areas.get接口获取.
     * 或者参考:http://www.stats.gov.cn/tjbz/xzqhdm/t20080215_402462675.htm 
     * 例 (110000,310000,320000,330000).就代表邮费子项涉 及(北京,上海,江苏,浙江)四个地区.
     * 填写时要注意对照地区代码值,如果填入错误地区代码,将会出现错误信息.
     */
    private String destination;

    /*
     * 可选值：post:平邮; cod:货到付款; ems:EMS; express:快递公司
     */
    private String serviceType;

    /*
     * 首费：输入0.01-999.99（最多包含两位小数） 不能为空也不能为0
     */
    private String startFee;

    /*
     * 首费标准：当valuation(记价方式)为0时输入1-9999范围内的整数
     */
    private String startStandard;

    public String getAddFee() {
        return addFee;
    }

    public String getAddStandard() {
        return addStandard;
    }

    public String getDestination() {
        return destination;
    }

    public String getServiceType() {
        return serviceType;
    }

    public String getStartFee() {
        return startFee;
    }

    public String getStartStandard() {
        return startStandard;
    }

    public void setAddFee(String addFee) {
        this.addFee = addFee;
    }

    public void setAddStandard(String addStandard) {
        this.addStandard = addStandard;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void setStartFee(String startFee) {
        this.startFee = startFee;
    }

    public void setStartStandard(String startStandard) {
        this.startStandard = startStandard;
    }
}
