package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.MsgList;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.wangwang.abstract.logquery response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WangwangAbstractLogqueryResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4526169443889922731L;

    /**
     * 例如单词长度太长等。 当ret_code不为0时这个值存在。
     */
    @ApiField("error_msg")
    private String errorMsg;

    /**
     * 卖家id
     */
    @ApiField("from_id")
    private String fromId;

    /**
     * 0或1 其他返回时，是由于用户名等参数设置有误等引起的远端服务错误
     */
    @ApiField("is_sliced")
    private Long isSliced;

    /**
     * 消息列表
     */
    @ApiListField("msg_lists")
    @ApiField("msg_list")
    private List<MsgList> msgLists;

    /**
     * 当is_sliced为1时有效
     */
    @ApiField("next_key")
    private String nextKey;

    /**
     * 0或-1，表示错误或正确，错误时有错误信息. 为-1时就只有error_msg字段是有效的。
     */
    @ApiField("ret_code")
    private Long retCode;

    /**
     * 买家id
     */
    @ApiField("to_id")
    private String toId;

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    public String getFromId() {
        return this.fromId;
    }

    public void setIsSliced(Long isSliced) {
        this.isSliced = isSliced;
    }

    public Long getIsSliced() {
        return this.isSliced;
    }

    public void setMsgLists(List<MsgList> msgLists) {
        this.msgLists = msgLists;
    }

    public List<MsgList> getMsgLists() {
        return this.msgLists;
    }

    public void setNextKey(String nextKey) {
        this.nextKey = nextKey;
    }

    public String getNextKey() {
        return this.nextKey;
    }

    public void setRetCode(Long retCode) {
        this.retCode = retCode;
    }

    public Long getRetCode() {
        return this.retCode;
    }

    public void setToId(String toId) {
        this.toId = toId;
    }

    public String getToId() {
        return this.toId;
    }

}
