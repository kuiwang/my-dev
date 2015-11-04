package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 国内机票搜索商品定义
 *
 * @author auto create
 * @since 1.0, null
 */
public class AtNSearchItemVO extends TaobaoObject {

    private static final long serialVersionUID = 5317695281548924325L;

    /**
     * 活动优惠金额
     */
    @ApiField("activity_bonus")
    private String activityBonus;

    /**
     * 代理人编号
     */
    @ApiField("agent_id")
    private Long agentId;

    /**
     * JSON串，保存商品扩展信息，相关Key:site(描述是否是极速出票)，I_A_K_P_T_L_U（PC淘客搜索URL），
     * I_A_K_H_T_L_U
     * （H5淘客搜索URL），I_A_K_P_T_D_U（PC淘客下单页URL），I_A_K_H_T_D_U（H5淘客下单页URL
     * ）,I_A_K_T_G_Q_01（去程退改签），I_A_K_T_G_Q_10（回程退改签）
     */
    @ApiField("attributes")
    private String attributes;

    /**
     * 基准舱位价格，单位分，往返是来回程各段的基准价格之和。
     */
    @ApiField("basic_cabin_price")
    private String basicCabinPrice;

    /**
     * 是否强制保险
     */
    @ApiField("force_insure")
    private Boolean forceInsure;

    /**
     * 获取保险分润后的价格，不包含活动。不支持分润时返回0
     */
    @ApiField("insure_price")
    private String insurePrice;

    /**
     * 是否是旗舰店商品。
     */
    @ApiField("is_qijian")
    private Boolean isQijian;

    /**
     * 商品结果类型，0普通单程，1组合往返；2打包往返；3往返直减
     */
    @ApiField("item_type")
    private Long itemType;

    /**
     * 销售价格，单位分
     */
    @ApiField("price")
    private String price;

    /**
     * 商品航段数据信息
     */
    @ApiListField("segments")
    @ApiField("at_n_search_segment_v_o")
    private List<AtNSearchSegmentVO> segments;

    /**
     * 是否支持保险分润
     */
    @ApiField("support_insure_promotion")
    private Boolean supportInsurePromotion;

    /**
     * 产品票面价，单位分。往返是来回程各段票面价之和
     */
    @ApiField("ticket_price")
    private String ticketPrice;

    /**
     * 航程类型，0单程，1往返
     */
    @ApiField("trip_type")
    private Long tripType;

    public String getActivityBonus() {
        return this.activityBonus;
    }

    public void setActivityBonus(String activityBonus) {
        this.activityBonus = activityBonus;
    }

    public Long getAgentId() {
        return this.agentId;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    public String getAttributes() {
        return this.attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public String getBasicCabinPrice() {
        return this.basicCabinPrice;
    }

    public void setBasicCabinPrice(String basicCabinPrice) {
        this.basicCabinPrice = basicCabinPrice;
    }

    public Boolean getForceInsure() {
        return this.forceInsure;
    }

    public void setForceInsure(Boolean forceInsure) {
        this.forceInsure = forceInsure;
    }

    public String getInsurePrice() {
        return this.insurePrice;
    }

    public void setInsurePrice(String insurePrice) {
        this.insurePrice = insurePrice;
    }

    public Boolean getIsQijian() {
        return this.isQijian;
    }

    public void setIsQijian(Boolean isQijian) {
        this.isQijian = isQijian;
    }

    public Long getItemType() {
        return this.itemType;
    }

    public void setItemType(Long itemType) {
        this.itemType = itemType;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public List<AtNSearchSegmentVO> getSegments() {
        return this.segments;
    }

    public void setSegments(List<AtNSearchSegmentVO> segments) {
        this.segments = segments;
    }

    public Boolean getSupportInsurePromotion() {
        return this.supportInsurePromotion;
    }

    public void setSupportInsurePromotion(Boolean supportInsurePromotion) {
        this.supportInsurePromotion = supportInsurePromotion;
    }

    public String getTicketPrice() {
        return this.ticketPrice;
    }

    public void setTicketPrice(String ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Long getTripType() {
        return this.tripType;
    }

    public void setTripType(Long tripType) {
        this.tripType = tripType;
    }

}
