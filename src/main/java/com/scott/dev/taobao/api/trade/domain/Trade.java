package com.scott.dev.taobao.api.trade.domain;

import java.util.Date;

/*
 * 交易结构
 */
public class Trade {

    private String adjust_fee;

    private Number alipay_id;

    private String alipay_no;

    private Number alipay_point;

    private String alipay_url;

    private String alipay_warn_msg;

    private String area_id;

    private String arrive_cut_time;

    private Number arrive_interval;

    private Date async_modified;

    private String available_confirm_fee;

    private String buyer_alipay_no;

    private String buyer_area;

    private String buyer_cod_fee;

    private String buyer_email;

    private Number buyer_flag;

    private String buyer_memo;

    private String buyer_message;

    private String buyer_nick;

    private Number buyer_obtain_point_fee;

    private Boolean buyer_rate;

    private Boolean can_rate;

    private String cod_fee;

    private String cod_status;

    private String commission_fee;

    private Number consign_interval;

    private Date consign_time;

    private Date created;

    private String credit_card_fee;

    private String discount_fee;

    private Date end_time;

    private String eticket_ext;

    private String express_agency_fee;

    private Boolean has_buyer_message;

    private Boolean has_post_fee;

    private Boolean has_yfx;

    private String iid;

    private String invoice_name;

    private String invoice_type;

    private Boolean is_3D;

    private Boolean is_brand_sale;

    private Boolean is_daixiao;

    private Boolean is_force_wlb;

    private Boolean is_lgtype;

    private Boolean is_part_consign;

    private Boolean is_wt;

    private String lg_aging;

    private String lg_aging_type;

    private String mark_desc;

    private Date modified;

    private Number num;

    private Number num_iid;

    private String nut_feature;

    private String o2o;

    private String o2o_delivery;

    private String o2o_guide_id;

    private String o2o_guide_name;

    private String o2o_out_trade_id;

    private String o2o_shop_id;

    private String o2o_shop_name;

    private Order[] orders;

    private Date pay_time;

    private String payment;

    private Number pcc_af;

    private String pic_path;

    private Number point_fee;

    private String post_fee;

    private String price;

    private String promotion;

    private PromotionDetail[] promotion_details;

    private Number real_point_fee;

    private String received_payment;

    private String receiver_address;

    private String receiver_city;

    private String receiver_district;

    private String receiver_mobile;

    private String receiver_name;

    private String receiver_phone;

    private String receiver_state;

    private String receiver_zip;

    private String seller_alipay_no;

    private Boolean seller_can_rate;

    private String seller_cod_fee;

    private String seller_email;

    private Number seller_flag;

    private String seller_memo;

    private String seller_mobile;

    private String seller_name;

    private String seller_phone;

    private Boolean seller_rate;

    private String sellerNick;

    private String send_time;

    private ServiceOrder[] service_orders;

    private LogisticsTag[] service_tags;

    private String shipping_type;

    private String snapshot;

    private String snapshot_url;

    private String status;

    private String step_paid_fee;

    private String step_trade_status;

    private Number tid;

    private Date timeout_action_time;

    private String title;

    private String total_fee;

    private String trade_from;

    private String trade_memo;

    private String trade_source;

    private String type;

    private String yfx_fee;

    private String yfx_id;

    private String yfx_type;

    private Boolean zero_purchase;

}
