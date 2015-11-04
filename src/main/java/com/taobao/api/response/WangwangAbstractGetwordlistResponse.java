package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WordList;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.wangwang.abstract.getwordlist response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WangwangAbstractGetwordlistResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5386226383952425836L;

    /**
     * 例如单词长度太长等，ret_code=-1才有
     */
    @ApiField("error_msg")
    private String errorMsg;

    /**
     * 0或-1，表示错误或正确，错误时有错误信息
     */
    @ApiField("ret_code")
    private Long retCode;

    /**
     * 关键词列表，ret_code=0才有
     */
    @ApiListField("word_lists")
    @ApiField("word_list")
    private List<WordList> wordLists;

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setRetCode(Long retCode) {
        this.retCode = retCode;
    }

    public Long getRetCode() {
        return this.retCode;
    }

    public void setWordLists(List<WordList> wordLists) {
        this.wordLists = wordLists;
    }

    public List<WordList> getWordLists() {
        return this.wordLists;
    }

}
