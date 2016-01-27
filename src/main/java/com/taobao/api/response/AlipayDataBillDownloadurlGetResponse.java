package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: alipay.data.bill.downloadurl.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AlipayDataBillDownloadurlGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2512224889669413471L;

    /**
     * 账单下载地址链接，获取连接后30秒后未下载，链接地址失效。
     */
    @ApiField("bill_download_url")
    private String billDownloadUrl;

    public String getBillDownloadUrl() {
        return this.billDownloadUrl;
    }

    public void setBillDownloadUrl(String billDownloadUrl) {
        this.billDownloadUrl = billDownloadUrl;
    }

}
