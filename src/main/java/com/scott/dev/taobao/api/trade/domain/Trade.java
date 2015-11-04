package com.scott.dev.taobao.api.trade.domain;

import java.util.Date;

/*
 * 交易结构
 */
public class Trade {

    private String sellerNick;

    private String iid;

    private String pic_path;

    private String payment;

    private String snapshot_url;

    private String snapshot;

    private Boolean seller_rate;

    private String post_fee;

    private String buyer_alipay_no;

    private String receiver_name;

    private String receiver_state;

    private String receiver_address;

    private String receiver_zip;

    private String receiver_mobile;

    private String receiver_phone;

    private Date consign_time;

    private String seller_alipay_no;

    private String seller_mobile;

    private String seller_phone;

    private String seller_name;

    private String seller_email;

    private String available_confirm_fee;

    private String received_payment;

    private Date timeout_action_time;

    private Boolean is_3D;

    private Order[] orders;

    private String promotion;

    private PromotionDetail[] promotion_details;

    private Number tid;

    private Number num;

    private Number num_iid;

    private String status;

    private String title;

    private String type;

    private String price;

    private String seller_cod_fee;

    private String discount_fee;

    private Number point_fee;

    private Boolean has_post_fee;

    private String total_fee;

    private Boolean is_lgtype;

    private Boolean is_brand_sale;

    private Boolean is_force_wlb;

    private String lg_aging;

    private String lg_aging_type;

    private Date created;

    private Date pay_time;

    private Date modified;

    private Date end_time;

    private String buyer_message;

    private Number alipay_id;

    private String alipay_no;

    private String alipay_url;

    private String buyer_memo;

    private Number buyer_flag;

    private String seller_memo;

    private Number seller_flag;

    private String invoice_name;

    private String invoice_type;

    private String buyer_nick;

    private String buyer_area;

    private String buyer_email;

    private Boolean has_yfx;

    private String yfx_fee;

    private String yfx_id;

    private String yfx_type;

    private Boolean has_buyer_message;

    private String area_id;

    private String credit_card_fee;

    private String nut_feature;

    private String step_trade_status;

    private String step_paid_fee;

    private String mark_desc;

    private String eticket_ext;

    private String send_time;

    private String shipping_type;

    private String buyer_cod_fee;

    private String express_agency_fee;

    private String adjust_fee;

    private Number buyer_obtain_point_fee;

    private String cod_fee;

    private String trade_from;

    private String alipay_warn_msg;

    private String cod_status;

    private Boolean can_rate;

    private ServiceOrder[] service_orders;

    private String commission_fee;

    private String trade_memo;

    private Boolean buyer_rate;

    private String trade_source;

    private Boolean seller_can_rate;

    private Boolean is_part_consign;

    private Boolean is_daixiao;

    private Number real_point_fee;

    private String receiver_city;

    private String receiver_district;

    private Number arrive_interval;

    private String arrive_cut_time;

    private Number consign_interval;

    private Date async_modified;

    private LogisticsTag[] service_tags;

    private String o2o;

    private String o2o_guide_id;

    private String o2o_shop_id;

    private String o2o_guide_name;

    private String o2o_shop_name;

    private String o2o_delivery;

    private Boolean zero_purchase;

    private Number alipay_point;

    private Number pcc_af;

    private String o2o_out_trade_id;

    private Boolean is_wt;

}
