package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CaipiaoGoodsInfoInputResponse;

/**
 * TOP API: taobao.caipiao.goods.info.input request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:33
 */
public class CaipiaoGoodsInfoInputRequest implements TaobaoRequest<CaipiaoGoodsInfoInputResponse> {

    /**
     * 活动结束时间，格式需严格遵守yyyy-MM-dd HH:mm:ss，不可为空
     */
    private String actEndDate;

    /**
     * 活动开始时间，格式需严格遵守yyyy-MM-dd HH:mm:ss，不可为空
     */
    private String actStartDate;

    /**
     * 店铺相关商品参加的送彩票活动描述
     */
    private String goodsDesc;

    /**
     * 商品在淘宝的唯一id，不可为空
     */
    private Long goodsId;

    /**
     * 商品主图地址
     */
    private String goodsImage;

    /**
     * 商品价格,保留两位小数，不可为空
     */
    private String goodsPrice;

    /**
     * 商品标题
     */
    private String goodsTitle;

    /**
     * 商品类目编号，不可为空
     */
    private Long goodsType;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 彩种id,不可为空
     */
    private Long lotteryTypeId;

    /**
     * 赠送类型：0-满就送；1-好评送；2-分享送；3-游戏送；4-收藏送，不可为空
     */
    private Long presentType;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(actEndDate, "actEndDate");
        RequestCheckUtils.checkNotEmpty(actStartDate, "actStartDate");
        RequestCheckUtils.checkNotEmpty(goodsId, "goodsId");
        RequestCheckUtils.checkNotEmpty(goodsPrice, "goodsPrice");
        RequestCheckUtils.checkNotEmpty(goodsType, "goodsType");
        RequestCheckUtils.checkNotEmpty(lotteryTypeId, "lotteryTypeId");
        RequestCheckUtils.checkNotEmpty(presentType, "presentType");
    }

    public String getActEndDate() {
        return this.actEndDate;
    }

    public String getActStartDate() {
        return this.actStartDate;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.caipiao.goods.info.input";
    }

    public String getGoodsDesc() {
        return this.goodsDesc;
    }

    public Long getGoodsId() {
        return this.goodsId;
    }

    public String getGoodsImage() {
        return this.goodsImage;
    }

    public String getGoodsPrice() {
        return this.goodsPrice;
    }

    public String getGoodsTitle() {
        return this.goodsTitle;
    }

    public Long getGoodsType() {
        return this.goodsType;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getLotteryTypeId() {
        return this.lotteryTypeId;
    }

    public Long getPresentType() {
        return this.presentType;
    }

    @Override
    public Class<CaipiaoGoodsInfoInputResponse> getResponseClass() {
        return CaipiaoGoodsInfoInputResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("act_end_date", this.actEndDate);
        txtParams.put("act_start_date", this.actStartDate);
        txtParams.put("goods_desc", this.goodsDesc);
        txtParams.put("goods_id", this.goodsId);
        txtParams.put("goods_image", this.goodsImage);
        txtParams.put("goods_price", this.goodsPrice);
        txtParams.put("goods_title", this.goodsTitle);
        txtParams.put("goods_type", this.goodsType);
        txtParams.put("lottery_type_id", this.lotteryTypeId);
        txtParams.put("present_type", this.presentType);
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

    public void setActEndDate(String actEndDate) {
        this.actEndDate = actEndDate;
    }

    public void setActStartDate(String actStartDate) {
        this.actStartDate = actStartDate;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle;
    }

    public void setGoodsType(Long goodsType) {
        this.goodsType = goodsType;
    }

    public void setLotteryTypeId(Long lotteryTypeId) {
        this.lotteryTypeId = lotteryTypeId;
    }

    public void setPresentType(Long presentType) {
        this.presentType = presentType;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
