package com.taobao.api.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AlipayEbppOweBillUploadResponse;

/**
 * TOP API: alipay.ebpp.owe.bill.upload request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:30
 */
public class AlipayEbppOweBillUploadRequest implements
        TaobaoUploadRequest<AlipayEbppOweBillUploadResponse> {

    /**
     * 支付宝给每个出账机构指定了一个对应的英文短名称来唯一表示该收费单位。<br />
     * 支持最大长度为：80<br />
     * 支持的最大列表长度为：80
     */
    private String chargeInst;

    /**
     * 销账机构<br />
     * 支持最大长度为：30<br />
     * 支持的最大列表长度为：30
     */
    private String chargeoffInst;

    /**
     * 文件摘要，算法SHA
     */
    private String digestOweBill;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 支付宝订单类型。公共事业缴纳JF,信用卡还款HK<br />
     * 支持最大长度为：10<br />
     * 支持的最大列表长度为：10
     */
    private String orderType;

    /**
     * 文件内容<br />
     * 支持的文件类型为：zip,rar,csv,doc,docx,xls,xlsx<br />
     * 支持的最大列表长度为：52428800
     */
    private FileItem oweBill;

    /**
     * 子业务类型是业务类型的下一级概念，例如：WATER表示JF下面的水费，ELECTRIC表示JF下面的电费，GAS表示JF下面的燃气费。<br />
     * 支持最大长度为：10<br />
     * 支持的最大列表长度为：10
     */
    private String subOrderType;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {

        RequestCheckUtils.checkNotEmpty(chargeInst, "chargeInst");
        RequestCheckUtils.checkMaxLength(chargeInst, 80, "chargeInst");
        RequestCheckUtils.checkMaxLength(chargeoffInst, 30, "chargeoffInst");
        RequestCheckUtils.checkNotEmpty(orderType, "orderType");
        RequestCheckUtils.checkMaxLength(orderType, 10, "orderType");
        RequestCheckUtils.checkNotEmpty(oweBill, "oweBill");
        RequestCheckUtils.checkMaxLength(oweBill, 52428800, "oweBill");
        RequestCheckUtils.checkNotEmpty(subOrderType, "subOrderType");
        RequestCheckUtils.checkMaxLength(subOrderType, 10, "subOrderType");
    }

    @Override
    public String getApiMethodName() {
        return "alipay.ebpp.owe.bill.upload";
    }

    public String getChargeInst() {
        return this.chargeInst;
    }

    public String getChargeoffInst() {
        return this.chargeoffInst;
    }

    public String getDigestOweBill() {
        return this.digestOweBill;
    }

    @Override
    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap<String, FileItem>();
        params.put("owe_bill", this.oweBill);
        return params;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getOrderType() {
        return this.orderType;
    }

    public FileItem getOweBill() {
        return this.oweBill;
    }

    @Override
    public Class<AlipayEbppOweBillUploadResponse> getResponseClass() {
        return AlipayEbppOweBillUploadResponse.class;
    }

    public String getSubOrderType() {
        return this.subOrderType;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("charge_inst", this.chargeInst);
        txtParams.put("chargeoff_inst", this.chargeoffInst);
        txtParams.put("digest_owe_bill", this.digestOweBill);
        txtParams.put("order_type", this.orderType);
        txtParams.put("sub_order_type", this.subOrderType);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setChargeInst(String chargeInst) {
        this.chargeInst = chargeInst;
    }

    public void setChargeoffInst(String chargeoffInst) {
        this.chargeoffInst = chargeoffInst;
    }

    public void setDigestOweBill(String digestOweBill) {
        this.digestOweBill = digestOweBill;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public void setOweBill(FileItem oweBill) {
        this.oweBill = oweBill;
    }

    public void setSubOrderType(String subOrderType) {
        this.subOrderType = subOrderType;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
