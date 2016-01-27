package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 提供查询APPKey为淘宝带来成交以及流量
 *
 * @author auto create
 * @since 1.0, null
 */
public class TopSpm extends TaobaoObject {

    private static final long serialVersionUID = 4337418448558961533L;

    /**
     * 为淘宝带来的支付宝成交金额
     */
    @ApiField("alipay_deal_amount")
    private String alipayDealAmount;

    /**
     * 为淘宝带来的支付宝成交笔数
     */
    @ApiField("alipay_deal_count")
    private Long alipayDealCount;

    /**
     * 为淘宝带来的支付宝成交人数
     */
    @ApiField("alipay_uv")
    private Long alipayUv;

    /**
     * SPM第四位编码（默认为TOP系统自动生成的0-9数字，ISV可以自行更改编码，但建议使用数字）
     */
    @ApiField("module")
    private String module;

    /**
     * SPM第三位编码（默认为TOP系统自动生成的0-9数字，ISV可以自行更改编码，但建议使用数字）
     */
    @ApiField("page")
    private String page;

    /**
     * 为淘宝带来的PV
     */
    @ApiField("pv")
    private Long pv;

    /**
     * 为淘宝带来的UV
     */
    @ApiField("uv")
    private Long uv;

    public String getAlipayDealAmount() {
        return this.alipayDealAmount;
    }

    public Long getAlipayDealCount() {
        return this.alipayDealCount;
    }

    public Long getAlipayUv() {
        return this.alipayUv;
    }

    public String getModule() {
        return this.module;
    }

    public String getPage() {
        return this.page;
    }

    public Long getPv() {
        return this.pv;
    }

    public Long getUv() {
        return this.uv;
    }

    public void setAlipayDealAmount(String alipayDealAmount) {
        this.alipayDealAmount = alipayDealAmount;
    }

    public void setAlipayDealCount(Long alipayDealCount) {
        this.alipayDealCount = alipayDealCount;
    }

    public void setAlipayUv(Long alipayUv) {
        this.alipayUv = alipayUv;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public void setPv(Long pv) {
        this.pv = pv;
    }

    public void setUv(Long uv) {
        this.uv = uv;
    }

}
