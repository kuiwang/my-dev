package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.QrcodeDO;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.ma.qrcode.common.create response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class MaQrcodeCommonCreateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6426577521883888766L;

    /**
     * 二维码对像
     */
    @ApiListField("modules")
    @ApiField("qrcode_d_o")
    private List<QrcodeDO> modules;

    /**
     * 执行是否成功
     */
    @ApiField("suc")
    private Boolean suc;

    public List<QrcodeDO> getModules() {
        return this.modules;
    }

    public Boolean getSuc() {
        return this.suc;
    }

    public void setModules(List<QrcodeDO> modules) {
        this.modules = modules;
    }

    public void setSuc(Boolean suc) {
        this.suc = suc;
    }

}
