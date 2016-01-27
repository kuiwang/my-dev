package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.traderate.impr.imprwords.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TraderateImprImprwordsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7432827861432372727L;

    /**
     * 返回类目下所有大家印象的标签
     */
    @ApiListField("impr_words")
    @ApiField("string")
    private List<String> imprWords;

    public List<String> getImprWords() {
        return this.imprWords;
    }

    public void setImprWords(List<String> imprWords) {
        this.imprWords = imprWords;
    }

}
