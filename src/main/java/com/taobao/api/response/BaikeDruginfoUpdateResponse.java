package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.baike.druginfo.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class BaikeDruginfoUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4378874137596489934L;

    /**
     * 查询返回数据
     */
    @ApiField("data")
    private String data;

    /**
     * 执行返回消息
     */
    @ApiField("message")
    private String message;

    /**
     * 执行是否成功
     */
    @ApiField("suc")
    private Boolean suc;

    /**
     * 查询数据类型
     */
    @ApiField("type_info")
    private String typeInfo;

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return this.data;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setSuc(Boolean suc) {
        this.suc = suc;
    }

    public Boolean getSuc() {
        return this.suc;
    }

    public void setTypeInfo(String typeInfo) {
        this.typeInfo = typeInfo;
    }

    public String getTypeInfo() {
        return this.typeInfo;
    }

}
