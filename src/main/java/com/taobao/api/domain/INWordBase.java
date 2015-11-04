package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 词基础数据对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class INWordBase extends TaobaoObject {

    private static final long serialVersionUID = 8838311753173948185L;

    /**
     * 词数据信息列表
     */
    @ApiListField("in_record_base_list")
    @ApiField("i_n_record_base")
    private List<INRecordBase> inRecordBaseList;

    /**
     * 词名称
     */
    @ApiField("word")
    private String word;

    public List<INRecordBase> getInRecordBaseList() {
        return this.inRecordBaseList;
    }

    public void setInRecordBaseList(List<INRecordBase> inRecordBaseList) {
        this.inRecordBaseList = inRecordBaseList;
    }

    public String getWord() {
        return this.word;
    }

    public void setWord(String word) {
        this.word = word;
    }

}
