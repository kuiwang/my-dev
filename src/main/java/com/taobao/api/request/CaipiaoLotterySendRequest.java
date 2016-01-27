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

    /**
     * 彩票接收方淘宝数字ID，不可为空、0和负数。
     */
    private Long buyerNumId;

    private Map<String, String> headerMap = new TaobaoHashMap();

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

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(buyerNumId, "buyerNumId");
        RequestCheckUtils.checkNotEmpty(sellerNumId, "sellerNumId");
        RequestCheckUtils.checkNotEmpty(stakeCount, "stakeCount");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.caipiao.lottery.send";
    }

    public Long getBuyerNumId() {
        return this.buyerNumId;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getLotteryTypeId() {
        return this.lotteryTypeId;
    }

    @Override
    public Class<CaipiaoLotterySendResponse> getResponseClass() {
        return CaipiaoLotterySendResponse.class;
    }

    public Long getSellerNumId() {
        return this.sellerNumId;
    }

    public Long getStakeCount() {
        return this.stakeCount;
    }

    public String getSweetyWords() {
        return this.sweetyWords;
    }

    @Override
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

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setBuyerNumId(Long buyerNumId) {
        this.buyerNumId = buyerNumId;
    }

    public void setLotteryTypeId(Long lotteryTypeId) {
        this.lotteryTypeId = lotteryTypeId;
    }

    public void setSellerNumId(Long sellerNumId) {
        this.sellerNumId = sellerNumId;
    }

    public void setStakeCount(Long stakeCount) {
        this.stakeCount = stakeCount;
    }

    public void setSweetyWords(String sweetyWords) {
        this.sweetyWords = sweetyWords;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
