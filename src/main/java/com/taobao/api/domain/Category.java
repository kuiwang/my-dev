package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 类目列表，多级结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class Category extends TaobaoObject {

    private static final long serialVersionUID = 4617348764981799434L;

    /**
     * 类目id
     */
    @ApiField("cateid")
    private Long cateid;

    /**
     * 类目名称
     */
    @ApiField("catename")
    private String catename;

    public Long getCateid() {
        return this.cateid;
    }

    public void setCateid(Long cateid) {
        this.cateid = cateid;
    }

    public String getCatename() {
        return this.catename;
    }

    public void setCatename(String catename) {
        this.catename = catename;
    }

}
