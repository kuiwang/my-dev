package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.EbookMediaVolume;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.ebookmedia.volume.add.or.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class EbookmediaVolumeAddOrUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5216596448194227375L;

    /**
     * 电子书卷信息
     */
    @ApiField("ebook_volume")
    private EbookMediaVolume ebookVolume;

    public EbookMediaVolume getEbookVolume() {
        return this.ebookVolume;
    }

    public void setEbookVolume(EbookMediaVolume ebookVolume) {
        this.ebookVolume = ebookVolume;
    }

}
