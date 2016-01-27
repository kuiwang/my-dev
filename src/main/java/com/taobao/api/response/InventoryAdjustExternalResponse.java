package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TipInfo;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.inventory.adjust.external response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class InventoryAdjustExternalResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3855166272717522158L;

    /**
     * 操作返回码
     */
    @ApiField("operate_code")
    private String operateCode;

    /**
     * 提示信息
     */
    @ApiListField("tip_infos")
    @ApiField("tip_info")
    private List<TipInfo> tipInfos;

    public String getOperateCode() {
        return this.operateCode;
    }

    public List<TipInfo> getTipInfos() {
        return this.tipInfos;
    }

    public void setOperateCode(String operateCode) {
        this.operateCode = operateCode;
    }

    public void setTipInfos(List<TipInfo> tipInfos) {
        this.tipInfos = tipInfos;
    }

}
