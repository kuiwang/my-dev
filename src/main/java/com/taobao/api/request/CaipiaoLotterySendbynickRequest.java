package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CaipiaoLotterySendbynickResponse;

/**
 * TOP API: taobao.caipiao.lottery.sendbynick request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:33
 */
public class CaipiaoLotterySendbynickRequest implements
        TaobaoRequest<CaipiaoLotterySendbynickResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 彩票接收方nick， 不可为空、""。
     */
    private String buyerNick;

    /**
     * 彩种ID，此彩种ID为彩票系统中的序号。
     */
    private Long lotteryTypeId;

    /**
     * 彩票注数，不可为空、0和负数，最大值为100。
     */
    private Long stakeCount;

    /**
     * 送彩票给接收方的赠言。 不能超过20个字符，1个中文字符、1个英文字母及1个数字等均当作一个字符，如果超过，则会截取。
     */
    private String sweetyWords;

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public String getBuyerNick() {
        return this.buyerNick;
    }

    public void setLotteryTypeId(Long lotteryTypeId) {
        this.lotteryTypeId = lotteryTypeId;
    }

    public Long getLotteryTypeId() {
        return this.lotteryTypeId;
    }

    public void setStakeCount(Long stakeCount) {
        this.stakeCount = stakeCount;
    }

    public Long getStakeCount() {
        return this.stakeCount;
    }

    public void setSweetyWords(String sweetyWords) {
        this.sweetyWords = sweetyWords;
    }

    public String getSweetyWords() {
        return this.sweetyWords;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.caipiao.lottery.sendbynick";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("buyer_nick", this.buyerNick);
        txtParams.put("lottery_type_id", this.lotteryTypeId);
        txtParams.put("stake_count", this.stakeCount);
        txtParams.put("sweety_words", this.sweetyWords);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public Class<CaipiaoLotterySendbynickResponse> getResponseClass() {
        return CaipiaoLotterySendbynickResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(buyerNick, "buyerNick");
        RequestCheckUtils.checkNotEmpty(stakeCount, "stakeCount");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
