package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.baike.druginfo.query response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class BaikeDruginfoQueryResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1857532393571456874L;

    /**
     * 查询所得数据
     */
    @ApiField("data")
    private String data;

    /**
     * 执行消息，正确或错误的提示消息
     */
    @ApiField("message")
    private String message;

    /**
     * 执行是否成功
     */
    @ApiField("suc")
    private Boolean suc;

    /**
     * 查询结果的数据类型
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
