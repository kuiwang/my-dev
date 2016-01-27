package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 名值对
 *
 * @author auto create
 * @since 1.0, null
 */
public class NameValuePair extends TaobaoObject {

    private static final long serialVersionUID = 3371169386639262344L;

    /**
     * 名值对的编码
     */
    @ApiField("code")
    private String code;

    /**
     * 名值对的文本描述
     */
    @ApiField("name")
    private String name;

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

}
