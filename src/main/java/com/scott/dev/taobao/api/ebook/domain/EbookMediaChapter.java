package com.scott.dev.taobao.api.ebook.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 电子书章节信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class EbookMediaChapter extends TaobaoObject {

    private static final long serialVersionUID = 3663729353717689745L;

    /**
     * 章节创建时间
     */
    @ApiField("created")
    private Date created;

    /**
     * 章节淘宝ID
     */
    @ApiField("tbid")
    private Long tbid;

    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Long getTbid() {
        return this.tbid;
    }

    public void setTbid(Long tbid) {
        this.tbid = tbid;
    }

}
