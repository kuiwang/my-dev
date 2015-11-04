package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CaipiaoLotterySendResponse;

/**
 * TOP API: taobao.caipiao.lottery.send request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:33
 */
public class CaipiaoLotterySendRequest implements TaobaoRequest<CaipiaoLotterySendResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 彩票接收方淘宝数字ID，不可为空、0和负数。
     */
    private Long buyerNumId;

    /**
     * 彩种ID，此彩种ID为彩票系统中的序号。
     */
    private Long lotteryTypeId;

    /**
     * 送彩方淘宝数字ID， 不可为空、0和负数。
     */
    private Long sellerNumId;

    /**
     * 彩票注数，不可为空、0和负数，最大值为100。
     */
    private Long stakeCount;

    /**
     * 送彩票给接收方的赠言。 不能超过50个字符，1个中文字符、1个英文字母及1个数字等均当作一个字符，如果超过，则会截取。
     */
    private String sweetyWords;

    public void setBuyerNumId(Long buyerNumId) {
        this.buyerNumId = buyerNumId;
    }

    public Long getBuyerNumId() {
        return this.buyerNumId;
    }

    public void setLotteryTypeId(Long lotteryTypeId) {
        this.lotteryTypeId = lotteryTypeId;
    }

    public Long getLotteryTypeId() {
        return this.lotteryTypeId;
    }

    public void setSellerNumId(Long sellerNumId) {
        this.sellerNumId = sellerNumId;
    }

    public Long getSellerNumId() {
        return this.sellerNumId;
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
        return "taobao.caipiao.lottery.send";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("buyer_num_id", this.buyerNumId);
        txtParams.put("lottery_type_id", this.lotteryTypeId);
        txtParams.put("seller_num_id", this.sellerNumId);
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

    public Class<CaipiaoLotterySendResponse> getResponseClass() {
        return CaipiaoLotterySendResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(buyerNumId, "buyerNumId");
        RequestCheckUtils.checkNotEmpty(sellerNumId, "sellerNumId");
        RequestCheckUtils.checkNotEmpty(stakeCount, "stakeCount");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
