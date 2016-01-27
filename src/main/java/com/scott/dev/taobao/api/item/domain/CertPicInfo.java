package com.scott.dev.taobao.api.item.domain;

/*
 * 产品资质认证图片信息，包括认证类型以及图片url
 */
public class CertPicInfo {

    /*
     * 认证类型的数值id
     */
    private Number certType;

    /*
     * 认证图片的url地址
     */
    private String picUrl;

    public Number getCertType() {
        return certType;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setCertType(Number certType) {
        this.certType = certType;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }
}
