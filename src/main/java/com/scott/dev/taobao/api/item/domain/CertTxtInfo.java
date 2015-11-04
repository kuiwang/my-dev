package com.scott.dev.taobao.api.item.domain;

/*
 * 产品资质认证文本信息，包括认证类型以及文本信息
 */
public class CertTxtInfo {

    /*
     * 认证类型的数值id
     */
    private Number certType;

    /*
     * 认证文本信息
     */
    private String text;

    public Number getCertType() {
        return certType;
    }

    public void setCertType(Number certType) {
        this.certType = certType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
