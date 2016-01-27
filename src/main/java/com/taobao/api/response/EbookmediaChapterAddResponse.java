package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.EbookMediaChapter;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.ebookmedia.chapter.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class EbookmediaChapterAddResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7423742717223358929L;

    /**
     * 电子书章节信息
     */
    @ApiField("ebook_chapter")
    private EbookMediaChapter ebookChapter;

    public EbookMediaChapter getEbookChapter() {
        return this.ebookChapter;
    }

    public void setEbookChapter(EbookMediaChapter ebookChapter) {
        this.ebookChapter = ebookChapter;
    }

}
