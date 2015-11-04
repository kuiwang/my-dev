package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 电子书卷信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class EbookMediaVolume extends TaobaoObject {

    private static final long serialVersionUID = 8588494281192542123L;

    /**
     * 卷的添加时间
     */
    @ApiField("created")
    private Date created;

    /**
     * 电子书卷ID
     */
    @ApiField("volume_id")
    private Long volumeId;

    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Long getVolumeId() {
        return this.volumeId;
    }

    public void setVolumeId(Long volumeId) {
        this.volumeId = volumeId;
    }

}
