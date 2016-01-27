package com.taobao.api.request;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemUpdateResponse;

/**
 * TOP API: taobao.item.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class ItemUpdateRequest implements TaobaoUploadRequest<ItemUpdateResponse> {

    /**
     * 售后服务说明模板id
     */
    private Long afterSaleId;

    /**
     * 商品上传后的状态。可选值:onsale（出售中）,instock（库中），如果同时更新商品状态为出售中及list_time为将来的时间，
     * 则商品还是处于定时上架的状态, 此时item.is_timing为true
     */
    private String approveStatus;

    /**
     * 商品的积分返点比例。如：5 表示返点比例0.5%.
     * 注意：返点比例必须是>0的整数，而且最大是90,即为9%.B商家在发布非虚拟商品时，返点必须是
     * 5的倍数，即0.5%的倍数。其它是1的倍数
     * ，即0.1%的倍数。无名良品商家发布商品时，复用该字段记录积分宝返点比例，返点必须是对应类目的返点步长的整数倍
     * ，默认是5，即0.5%。注意此时该字段值依旧必须是>0的整数，注意此时该字段值依旧必须是>0的整数，最高值不超过500，即50%
     */
    private Long auctionPoint;

    /**
     * 代充商品类型。只有少数类目下的商品可以标记上此字段，具体哪些类目可以上传可以通过taobao.itemcat.features.
     * get获得。在代充商品的类目下，不传表示不标记商品类型（交易搜索中就不能通过标记搜到相关的交易了）。可选类型：
     * no_mark(不做类型标记) time_card(点卡软件代充) fee_card(话费软件代充)
     */
    private String autoFill;

    /**
     * 商品条形码
     */
    private String barcode;

    /**
     * 商品基础色，数据格式为：pid:vid:rvid1,rvid2,rvid3;pid:vid:rvid1
     */
    private String changeProp;

    /**
     * 天猫超市扩展字段，天猫超市专用
     */
    private String chaoshiExtendsInfo;

    /**
     * 叶子类目id<br />
     * 支持最小值为：0
     */
    private Long cid;

    /**
     * 货到付款运费模板ID 该字段已经废弃，货到付款模板已经集成到运费模板中。
     */
    private Long codPostageId;

    /**
     * 商品描述. 字数要大于5个字符，小于25000个字符 ，受违禁词控制<br />
     * 支持最大长度为：200000<br />
     * 支持的最大列表长度为：200000
     */
    private String desc;

    /**
     * 商品描述模块化，模块列表；数据结构可参考Item_Desc_Module
     * 。详细使用说明：http://open.taobao.com/support
     * /question_detail.htm?spm=0.0.0.0.cRcj3S&id=147498 ；
     */
    private String descModules;

    /**
     * 支持宝贝信息的删除,如需删除对应的食品安全信息中的储藏方法、保质期，
     * 则应该设置此参数的值为：food_security.plan_storage,food_security.period;
     * 各个参数的名称之间用【,】分割, 如果对应的参数有设置过值，即使在这个列表中，也不会被删除;
     * 目前支持此功能的宝贝信息如下：食品安全信息所有字段
     * 、电子交易凭证字段（locality_life，locality_life.verification
     * ，locality_life.refund_ratio，locality_life.network_id
     * ，locality_life.onsale_auto_refund_ratio
     * ）。支持对全球购宝贝信息的清除（字符串中包含global_stock）
     */
    private String emptyFields;

    /**
     * ems费用。取值范围:0.01-999.00;精确到2位小数;单位:元。如:25.07，表示:25元7分
     */
    private String emsFee;

    /**
     * 快递费用。取值范围:0.01-999.00;精确到2位小数;单位:元。如:15.07，表示:15元7分
     */
    private String expressFee;

    /**
     * 厂家联系方式
     */
    private String foodSecurityContact;

    /**
     * 产品标准号
     */
    private String foodSecurityDesignCode;

    /**
     * 厂名
     */
    private String foodSecurityFactory;

    /**
     * 厂址
     */
    private String foodSecurityFactorySite;

    /**
     * 食品添加剂
     */
    private String foodSecurityFoodAdditive;

    /**
     * 健字号，保健品/膳食营养补充剂
     * 这个类目下特有的信息，此类目下无需填写生产许可证编号（QS），如果填写了生产许可证编号（QS）将被忽略不保存
     * ；保存宝贝时，标题前会自动加上健字号产品名称一起作为宝贝标题；
     */
    private String foodSecurityHealthProductNo;

    /**
     * 配料表
     */
    private String foodSecurityMix;

    /**
     * 保质期
     */
    private String foodSecurityPeriod;

    /**
     * 储藏方法
     */
    private String foodSecurityPlanStorage;

    /**
     * 生产许可证号
     */
    private String foodSecurityPrdLicenseNo;

    /**
     * 生产结束日期,格式必须为yyyy-MM-dd
     */
    private String foodSecurityProductDateEnd;

    /**
     * 生产开始日期，格式必须为yyyy-MM-dd
     */
    private String foodSecurityProductDateStart;

    /**
     * 进货结束日期，要在生产日期之后，格式必须为yyyy-MM-dd
     */
    private String foodSecurityStockDateEnd;

    /**
     * 进货开始日期，要在生产日期之后，格式必须为yyyy-MM-dd
     */
    private String foodSecurityStockDateStart;

    /**
     * 供货商
     */
    private String foodSecuritySupplier;

    /**
     * 运费承担方式。运费承担方式。可选值:seller（卖家承担）,buyer(买家承担);
     */
    private String freightPayer;

    /**
     * 全球购商品采购地（地区/国家）,默认值只在全球购商品采购地（库存类型选择情况生效），地区国家值为（美国, 香港, 日本, 英国,
     * 新西兰, 德国, 韩国, 荷兰, 澳洲, 法国, 意大利, 台湾, 澳门, 加拿大, 瑞士, 西班牙, 泰国, 新加坡, 马来西亚,
     * 菲律宾, 其他）<br />
     * 支持最大长度为：30<br />
     * 支持的最大列表长度为：30
     */
    private String globalStockCountry;

    /**
     * 全球购商品采购地（库存类型） 全球购商品有两种库存类型：现货和代购 参数值为1时代表现货，值为2时代表代购。注意：使用时请与
     * 全球购商品采购地（地区/国家）配合使用
     */
    private String globalStockType;

    /**
     * 支持会员打折。可选值:true,false;
     */
    private Boolean hasDiscount;

    /**
     * 是否有发票。可选值:true,false (商城卖家此字段必须为true)
     */
    private Boolean hasInvoice;

    /**
     * 橱窗推荐。可选值:true,false;
     */
    private Boolean hasShowcase;

    /**
     * 是否有保修。可选值:true,false;
     */
    private Boolean hasWarranty;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 忽略警告提示.
     */
    private String ignorewarning;

    /**
     * 商品图片。类型:JPG,GIF;最大长度:500k<br />
     * 支持的文件类型为：gif,jpg,jpeg,png<br />
     * 支持的最大列表长度为：524288
     */
    private FileItem image;

    /**
     * 加价(降价)幅度。如果为0，代表系统代理幅度。对于增价拍和荷兰拍来说是加价幅度，对于降价拍来说是降价幅度。
     */
    private String increment;

    /**
     * 用户自行输入的类目属性ID串，结构："pid1,pid2,pid3"，如："20000"（表示品牌）
     * 注：通常一个类目下用户可输入的关键属性不超过1个。
     */
    private String inputPids;

    /**
     * 用户自行输入的子属性名和属性值，结构:"父属性值;一级子属性名;一级子属性值;二级子属性名;自定义输入值,....",如：“耐克;
     * 耐克系列;科比系列;科比系列;2K5,Nike乔丹鞋;乔丹系列;乔丹鞋系列;乔丹鞋系列;json5”，多个自定义属性用','分割，
     * input_str需要与input_pids一一对应
     * ，注：通常一个类目下用户可输入的关键属性不超过1个。所有属性别名加起来不能超过3999字节
     * 。此处不可以使用“其他”、“其它”和“其她”这三个词。
     */
    private String inputStr;

    /**
     * 是否是3D
     */
    private Boolean is3D;

    /**
     * 是否在外店显示
     */
    private Boolean isEx;

    /**
     * 实物闪电发货。注意：在售的闪电发货产品不允许取消闪电发货，需要先下架商品才能取消闪电发货标记
     */
    private Boolean isLightningConsignment;

    /**
     * 是否是线下商品。 1：线上商品（默认值）； 2：线上或线下商品； 3：线下商品。
     */
    private String isOffline;

    /**
     * 是否替换sku
     */
    private Boolean isReplaceSku;

    /**
     * 是否在淘宝上显示（如果传FALSE，则在淘宝主站无法显示该商品）
     */
    private Boolean isTaobao;

    /**
     * 商品是否为新品。只有在当前类目开通新品,并且当前用户拥有该类目下发布新品权限时才能设置is_xinpin为true，
     * 否则设置true后会返回错误码
     * :isv.invalid-permission:xinpin。同时只有一口价全新的宝贝才能设置为新品，否则会返回错误码
     * ：isv.invalid-parameter:xinpin。不设置参数就保持原有值。
     */
    private Boolean isXinpin;

    /**
     * 表示商品的体积，如果需要使用按体积计费的运费模板，一定要设置这个值。该值的单位为立方米（m3），如果是其他单位，请转换成成立方米。
     * 该值支持两种格式的设置
     * ：格式1：bulk:3,单位为立方米(m3),表示直接设置为商品的体积。格式2：length:10;breadth:
     * 10;height:10，单位为米（m）。体积和长宽高都支持小数类型。
     * 在传入体积或长宽高时候，不能带单位。体积的单位默认为立方米（m3），长宽高的单位默认为米(m)
     * 在编辑的时候，如果需要删除体积属性，请设置该值为0，如bulk:0
     */
    private String itemSize;

    /**
     * 商品的重量，用于按重量计费的运费模板。注意：单位为kg。 只能传入数值类型（包含小数），不能带单位，单位默认为kg。
     * 在编辑时候，如果需要在商品里删除重量的信息，就需要将值设置为0
     */
    private String itemWeight;

    /**
     * 商品文字的版本，繁体传入”zh_HK”，简体传入”zh_CN”
     */
    private String lang;

    /**
     * 上架时间。大于当前时间则宝贝会下架进入定时上架的宝贝中。
     */
    private Date listTime;

    /**
     * 编辑电子凭证宝贝时候表示是否使用邮寄 0: 代表不使用邮寄； 1：代表使用邮寄； 如果不设置这个值，代表不使用邮寄
     */
    private String localityLifeChooseLogis;

    /**
     * 本地生活电子交易凭证业务，目前此字段只涉及到的信息为有效期; 如果有效期为起止日期类型，此值为2012-08-06,2012-08-16
     * 如果有效期为【购买成功日 至】类型则格式为2012-08-16 如果有效期为天数类型则格式为15
     */
    private String localityLifeExpirydate;

    /**
     * 码商信息，格式为 码商id:nick
     */
    private String localityLifeMerchant;

    /**
     * 网点ID,在参数empty_fields里设置locality_life.network_id可删除网点ID
     */
    private String localityLifeNetworkId;

    /**
     * 电子凭证售中自动退款比例，百分比%前的数字，介于1-100之间的整数
     */
    private Long localityLifeOnsaleAutoRefundRatio;

    /**
     * 退款码费承担方。发布电子凭证宝贝的时候会增加“退款码费承担方”配置项，可选填：(1)s（卖家承担） (2)b(买家承担)
     */
    private String localityLifeRefundmafee;

    /**
     * 退款比例，百分比%前的数字,1-100的正整数值;
     * 在参数empty_fields里设置locality_life.refund_ratio可删除退款比例
     */
    private Long localityLifeRefundRatio;

    /**
     * 核销打款,1代表核销打款 0代表非核销打款;
     * 在参数empty_fields里设置locality_life.verification可删除核销打款
     */
    private String localityLifeVerification;

    /**
     * 所在地城市。如杭州
     */
    private String locationCity;

    /**
     * 所在地省份。如浙江
     */
    private String locationState;

    /**
     * 该宝贝是否支持【7天无理由退货】，卖家选择的值只是一个因素，最终以类目和选择的属性条件来确定是否支持7天。填入字符0，表示不支持；
     * 未填写或填人字符1，表示支持7天无理由退货；<br>
     * 注意：使用该API修改商品其它属性如标题title时，如需保持商品不支持7天无理由退货状态，该字段需传入0 。
     */
    private String newprepay;

    /**
     * 商品数量，取值范围:0-900000000的整数。且需要等于Sku所有数量的和
     * 拍卖商品中增加拍只能为1，荷兰拍要在[2,500)范围内。<br />
     * 支持最大值为：900000000<br />
     * 支持最小值为：0
     */
    private Long num;

    /**
     * 商品数字ID，该参数必须<br />
     * 支持最小值为：1
     */
    private Long numIid;

    /**
     * 汽车O2O绑定线下服务标记，如不为空，表示关联服务，否则，不关联服务。
     */
    private Boolean o2oBindService;

    /**
     * 商家编码
     */
    private String outerId;

    /**
     * 拍卖宝贝的保证金。对于增价拍和荷兰拍来说保证金有两种模式：淘宝默认模式（首次出价金额的10%），自定义固定保证金（
     * 固定冻结金额只能输入不超过30万的正整数），并且保证金只冻结1次。对于降价拍来说保证金只有淘宝默认的（竞拍价格的10% *
     * 竞拍数量），并且每次出价都需要冻结保证金。
     * 对于拍卖宝贝来说，保证金是必须的，但是默认使用淘宝默认保证金模式，只有用户需要使用自定义固定保证金的时候才需要使用到这个参数
     * 。如果该参数不传或传入0则代表使用默认。
     */
    private Long paimaiInfoDeposit;

    /**
     * 降价拍宝贝的降价周期(分钟)。降价拍宝贝的价格每隔paimai_info.interval时间会下降一次increment。<br />
     * 支持最大值为：60<br />
     * 支持最小值为：1
     */
    private Long paimaiInfoInterval;

    /**
     * 拍卖商品选择的拍卖类型，拍卖类型包括三种：增价拍(1)，荷兰拍(2)和降价拍(3)。<br />
     * 支持最大值为：3<br />
     * 支持最小值为：1
     */
    private Long paimaiInfoMode;

    /**
     * 降价拍宝贝的保留价。对于降价拍来说，paimai_info.reserve必须大于0，且小于price-increment，而且（
     * price-paimai_info.reserve）/increment的计算结果必须为整数
     */
    private String paimaiInfoReserve;

    /**
     * 自定义销售周期的小时数。拍卖宝贝可以自定义销售周期，这里指定销售周期的小时数。自定义销售周期的小时数。拍卖宝贝可以自定义销售周期，
     * 这里指定销售周期的小时数。注意，该参数只作为输入参数，不能通过taobao.item.get接口获取。<br />
     * 支持最大值为：48<br />
     * 支持最小值为：1
     */
    private Long paimaiInfoValidHour;

    /**
     * 自定义销售周期的分钟数。拍卖宝贝可以自定义销售周期，这里是指定销售周期的分钟数。自定义销售周期的小时数。拍卖宝贝可以自定义销售周期，
     * 这里指定销售周期的小时数。注意，该参数只作为输入参数，不能通过taobao.item.get接口获取。<br />
     * 支持最大值为：59<br />
     * 支持最小值为：0
     */
    private Long paimaiInfoValidMinute;

    /**
     * 商品主图需要关联的图片空间的相对url。这个url所对应的图片必须要属于当前用户。pic_path和image只需要传入一个,
     * 如果两个都传，默认选择pic_path
     */
    private String picPath;

    /**
     * 宝贝所属的运费模板ID。取值范围：整数且必须是该卖家的运费模板的ID（可通过taobao.delivery.templates.
     * get获得当前会话用户的所有邮费模板）
     */
    private Long postageId;

    /**
     * 平邮费用。取值范围:0.01-999.00;精确到2位小数;单位:元。如:5.07，表示:5元7分,
     * 注:post_fee,express_fee,ems_fee需一起填写
     */
    private String postFee;

    /**
     * 商品价格。取值范围:0-100000000;精确到2位小数;单位:元。如:200.07，表示:200元7分。需要在正确的价格区间内。
     * 拍卖商品对应的起拍价。
     */
    private String price;

    /**
     * 商品所属的产品ID(B商家发布商品需要用)
     */
    private Long productId;

    /**
     * 属性值别名。如pid:vid:别名;pid1:vid1:别名1， pid:属性id vid:值id。总长度不超过800字节<br />
     * 支持最大长度为：800<br />
     * 支持的最大列表长度为：800
     */
    private String propertyAlias;

    /**
     * 商品属性列表。格式:pid:vid;pid:vid。属性的pid调用taobao.itemprops.get取得，
     * 属性值的vid用taobao.itempropvalues.get取得vid。
     * 如果该类目下面没有属性，可以不用填写。如果有属性，必选属性必填
     * ，其他非必选属性可以选择不填写.属性不能超过35对。所有属性加起来包括分割符不能超过549字节，单个属性没有限制。
     * 如果有属性是可输入的话，则用字段input_str填入属性的值。
     */
    private String props;

    /**
     * 商品资质信息
     */
    private String qualification;

    /**
     * 景区门票在选择订金支付时候，需要交的预订费。传入的值是1到20之间的数值，小数点后最多可以保留两位（多余的部分将做四舍五入的处理）。
     * 这个数值表示的是预订费的比例，最终的预订费为 scenic_ticket_book_cost乘一口价除以100
     */
    private String scenicTicketBookCost;

    /**
     * 景区门票类宝贝编辑时候，当卖家签订了支付宝代扣协议时候，需要选择支付方式：全额支付和订金支付。
     * 当scenic_ticket_pay_way为1时表示全额支付，为2时表示订金支付
     */
    private Long scenicTicketPayWay;

    /**
     * 重新关联商品与店铺类目，结构:",cid1,cid2,...,"，如果店铺类目存在二级类目，必须传入子类目cids。
     */
    private String sellerCids;

    /**
     * 商品卖点信息，最长150个字符。天猫和集市都可用<br />
     * 支持最大长度为：150<br />
     * 支持的最大列表长度为：150
     */
    private String sellPoint;

    /**
     * 是否承诺退换货服务!虚拟商品无须设置此项!
     */
    private Boolean sellPromise;

    /**
     * sku层面的条形码，多个SKU情况，与SKU价格库存格式类似，用逗号分隔
     */
    private String skuBarcode;

    /**
     * 家装建材类目，商品SKU的高度，单位为cm，部分类目必选。天猫商家专用。 可选值为："0-15", "15-25", "25-50",
     * "50-60", "60-80", "80-120", "120-160", "160-200"。
     * 数据和SKU一一对应，用,分隔，如：15-25,25-50,25-50
     */
    private String skuHdHeight;

    /**
     * 家装建材类目，商品SKU的灯头数量，正整数，大于等于3，部分类目必选。天猫商家专用。 数据和SKU一一对应，用,分隔，如：3,5,7
     */
    private String skuHdLampQuantity;

    /**
     * 家装建材类目，商品SKU的长度，正整数，单位为cm，部分类目必选。天猫商家专用。 数据和SKU一一对应，用,分隔，如：20,30,30
     */
    private String skuHdLength;

    /**
     * Sku的外部id串，结构如：1234,1342,… sku_properties, sku_quantities,
     * sku_prices,
     * sku_outer_ids在输入数据时要一一对应，如果没有sku_outer_ids也要写上这个参数，入参是","
     * (这个是两个sku的示列，逗号数应该是sku个数减1)；该参数最大长度是512个字节
     */
    private String skuOuterIds;

    /**
     * 更新的Sku的价格串，结构如：10.00,5.00,… 精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
    private String skuPrices;

    /**
     * 更新的Sku的属性串，调用taobao.itemprops.get获取类目属性，如果属性是销售属性，再用taobao.
     * itempropvalues
     * .get取得vid。格式:pid:vid;pid:vid,多个sku之间用逗号分隔。该字段内的销售属性(自定义的除外
     * )也需要在props字段填写 .
     * 规则：如果该SKU存在旧商品，则修改；否则新增Sku。如果更新时有对Sku进行操作，则Sku的properties一定要传入
     * 。如果存在自定义销售属性
     * ，则格式为pid:vid;pid2:vid2;$pText:vText，其中$pText:vText为自定义属性。
     * 限制：其中$pText的’$’前缀不能少，且pText和vText文本中不可以存在 冒号:和分号;以及逗号
     */
    private String skuProperties;

    /**
     * 更新的Sku的数量串，结构如：num1,num2,num3 如:2,3,4
     */
    private String skuQuantities;

    /**
     * 暂时不可用
     */
    private String skuSpecIds;

    /**
     * 商品新旧程度。可选值:new（全新）,unused（闲置）,second（二手）。
     */
    private String stuffStatus;

    /**
     * 商品是否支持拍下减库存:1支持;2取消支持(付款减库存);0(默认)不更改 集市卖家默认拍下减库存; 商城卖家默认付款减库存
     */
    private Long subStock;

    private Long timestamp;

    /**
     * 宝贝标题. 不能超过30字符,受违禁词控制<br />
     * 支持最大长度为：120<br />
     * 支持的最大列表长度为：120
     */
    private String title;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    /**
     * 有效期。可选值:7,14;单位:天;
     */
    private Long validThru;

    /**
     * 商品的重量(商超卖家专用字段)
     */
    private Long weight;

    @Override
    public void check() throws ApiRuleException {

        RequestCheckUtils.checkMinValue(cid, 0L, "cid");
        RequestCheckUtils.checkMaxLength(desc, 200000, "desc");
        RequestCheckUtils.checkMaxLength(globalStockCountry, 30, "globalStockCountry");
        RequestCheckUtils.checkMaxLength(image, 524288, "image");
        RequestCheckUtils.checkMaxValue(num, 900000000L, "num");
        RequestCheckUtils.checkMinValue(num, 0L, "num");
        RequestCheckUtils.checkNotEmpty(numIid, "numIid");
        RequestCheckUtils.checkMinValue(numIid, 1L, "numIid");
        RequestCheckUtils.checkMaxValue(paimaiInfoInterval, 60L, "paimaiInfoInterval");
        RequestCheckUtils.checkMinValue(paimaiInfoInterval, 1L, "paimaiInfoInterval");
        RequestCheckUtils.checkMaxValue(paimaiInfoMode, 3L, "paimaiInfoMode");
        RequestCheckUtils.checkMinValue(paimaiInfoMode, 1L, "paimaiInfoMode");
        RequestCheckUtils.checkMaxValue(paimaiInfoValidHour, 48L, "paimaiInfoValidHour");
        RequestCheckUtils.checkMinValue(paimaiInfoValidHour, 1L, "paimaiInfoValidHour");
        RequestCheckUtils.checkMaxValue(paimaiInfoValidMinute, 59L, "paimaiInfoValidMinute");
        RequestCheckUtils.checkMinValue(paimaiInfoValidMinute, 0L, "paimaiInfoValidMinute");
        RequestCheckUtils.checkMaxLength(propertyAlias, 800, "propertyAlias");
        RequestCheckUtils.checkMaxLength(sellPoint, 150, "sellPoint");
        RequestCheckUtils.checkMaxListSize(sellerCids, 10, "sellerCids");
        RequestCheckUtils.checkMaxLength(title, 120, "title");
    }

    public Long getAfterSaleId() {
        return this.afterSaleId;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.item.update";
    }

    public String getApproveStatus() {
        return this.approveStatus;
    }

    public Long getAuctionPoint() {
        return this.auctionPoint;
    }

    public String getAutoFill() {
        return this.autoFill;
    }

    public String getBarcode() {
        return this.barcode;
    }

    public String getChangeProp() {
        return this.changeProp;
    }

    public String getChaoshiExtendsInfo() {
        return this.chaoshiExtendsInfo;
    }

    public Long getCid() {
        return this.cid;
    }

    public Long getCodPostageId() {
        return this.codPostageId;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getDescModules() {
        return this.descModules;
    }

    public String getEmptyFields() {
        return this.emptyFields;
    }

    public String getEmsFee() {
        return this.emsFee;
    }

    public String getExpressFee() {
        return this.expressFee;
    }

    @Override
    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap<String, FileItem>();
        params.put("image", this.image);
        return params;
    }

    public String getFoodSecurityContact() {
        return this.foodSecurityContact;
    }

    public String getFoodSecurityDesignCode() {
        return this.foodSecurityDesignCode;
    }

    public String getFoodSecurityFactory() {
        return this.foodSecurityFactory;
    }

    public String getFoodSecurityFactorySite() {
        return this.foodSecurityFactorySite;
    }

    public String getFoodSecurityFoodAdditive() {
        return this.foodSecurityFoodAdditive;
    }

    public String getFoodSecurityHealthProductNo() {
        return this.foodSecurityHealthProductNo;
    }

    public String getFoodSecurityMix() {
        return this.foodSecurityMix;
    }

    public String getFoodSecurityPeriod() {
        return this.foodSecurityPeriod;
    }

    public String getFoodSecurityPlanStorage() {
        return this.foodSecurityPlanStorage;
    }

    public String getFoodSecurityPrdLicenseNo() {
        return this.foodSecurityPrdLicenseNo;
    }

    public String getFoodSecurityProductDateEnd() {
        return this.foodSecurityProductDateEnd;
    }

    public String getFoodSecurityProductDateStart() {
        return this.foodSecurityProductDateStart;
    }

    public String getFoodSecurityStockDateEnd() {
        return this.foodSecurityStockDateEnd;
    }

    public String getFoodSecurityStockDateStart() {
        return this.foodSecurityStockDateStart;
    }

    public String getFoodSecuritySupplier() {
        return this.foodSecuritySupplier;
    }

    public String getFreightPayer() {
        return this.freightPayer;
    }

    public String getGlobalStockCountry() {
        return this.globalStockCountry;
    }

    public String getGlobalStockType() {
        return this.globalStockType;
    }

    public Boolean getHasDiscount() {
        return this.hasDiscount;
    }

    public Boolean getHasInvoice() {
        return this.hasInvoice;
    }

    public Boolean getHasShowcase() {
        return this.hasShowcase;
    }

    public Boolean getHasWarranty() {
        return this.hasWarranty;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getIgnorewarning() {
        return this.ignorewarning;
    }

    public FileItem getImage() {
        return this.image;
    }

    public String getIncrement() {
        return this.increment;
    }

    public String getInputPids() {
        return this.inputPids;
    }

    public String getInputStr() {
        return this.inputStr;
    }

    public Boolean getIs3D() {
        return this.is3D;
    }

    public Boolean getIsEx() {
        return this.isEx;
    }

    public Boolean getIsLightningConsignment() {
        return this.isLightningConsignment;
    }

    public String getIsOffline() {
        return this.isOffline;
    }

    public Boolean getIsReplaceSku() {
        return this.isReplaceSku;
    }

    public Boolean getIsTaobao() {
        return this.isTaobao;
    }

    public Boolean getIsXinpin() {
        return this.isXinpin;
    }

    public String getItemSize() {
        return this.itemSize;
    }

    public String getItemWeight() {
        return this.itemWeight;
    }

    public String getLang() {
        return this.lang;
    }

    public Date getListTime() {
        return this.listTime;
    }

    public String getLocalityLifeChooseLogis() {
        return this.localityLifeChooseLogis;
    }

    public String getLocalityLifeExpirydate() {
        return this.localityLifeExpirydate;
    }

    public String getLocalityLifeMerchant() {
        return this.localityLifeMerchant;
    }

    public String getLocalityLifeNetworkId() {
        return this.localityLifeNetworkId;
    }

    public Long getLocalityLifeOnsaleAutoRefundRatio() {
        return this.localityLifeOnsaleAutoRefundRatio;
    }

    public String getLocalityLifeRefundmafee() {
        return this.localityLifeRefundmafee;
    }

    public Long getLocalityLifeRefundRatio() {
        return this.localityLifeRefundRatio;
    }

    public String getLocalityLifeVerification() {
        return this.localityLifeVerification;
    }

    public String getLocationCity() {
        return this.locationCity;
    }

    public String getLocationState() {
        return this.locationState;
    }

    public String getNewprepay() {
        return this.newprepay;
    }

    public Long getNum() {
        return this.num;
    }

    public Long getNumIid() {
        return this.numIid;
    }

    public Boolean getO2oBindService() {
        return this.o2oBindService;
    }

    public String getOuterId() {
        return this.outerId;
    }

    public Long getPaimaiInfoDeposit() {
        return this.paimaiInfoDeposit;
    }

    public Long getPaimaiInfoInterval() {
        return this.paimaiInfoInterval;
    }

    public Long getPaimaiInfoMode() {
        return this.paimaiInfoMode;
    }

    public String getPaimaiInfoReserve() {
        return this.paimaiInfoReserve;
    }

    public Long getPaimaiInfoValidHour() {
        return this.paimaiInfoValidHour;
    }

    public Long getPaimaiInfoValidMinute() {
        return this.paimaiInfoValidMinute;
    }

    public String getPicPath() {
        return this.picPath;
    }

    public Long getPostageId() {
        return this.postageId;
    }

    public String getPostFee() {
        return this.postFee;
    }

    public String getPrice() {
        return this.price;
    }

    public Long getProductId() {
        return this.productId;
    }

    public String getPropertyAlias() {
        return this.propertyAlias;
    }

    public String getProps() {
        return this.props;
    }

    public String getQualification() {
        return this.qualification;
    }

    @Override
    public Class<ItemUpdateResponse> getResponseClass() {
        return ItemUpdateResponse.class;
    }

    public String getScenicTicketBookCost() {
        return this.scenicTicketBookCost;
    }

    public Long getScenicTicketPayWay() {
        return this.scenicTicketPayWay;
    }

    public String getSellerCids() {
        return this.sellerCids;
    }

    public String getSellPoint() {
        return this.sellPoint;
    }

    public Boolean getSellPromise() {
        return this.sellPromise;
    }

    public String getSkuBarcode() {
        return this.skuBarcode;
    }

    public String getSkuHdHeight() {
        return this.skuHdHeight;
    }

    public String getSkuHdLampQuantity() {
        return this.skuHdLampQuantity;
    }

    public String getSkuHdLength() {
        return this.skuHdLength;
    }

    public String getSkuOuterIds() {
        return this.skuOuterIds;
    }

    public String getSkuPrices() {
        return this.skuPrices;
    }

    public String getSkuProperties() {
        return this.skuProperties;
    }

    public String getSkuQuantities() {
        return this.skuQuantities;
    }

    public String getSkuSpecIds() {
        return this.skuSpecIds;
    }

    public String getStuffStatus() {
        return this.stuffStatus;
    }

    public Long getSubStock() {
        return this.subStock;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("after_sale_id", this.afterSaleId);
        txtParams.put("approve_status", this.approveStatus);
        txtParams.put("auction_point", this.auctionPoint);
        txtParams.put("auto_fill", this.autoFill);
        txtParams.put("barcode", this.barcode);
        txtParams.put("change_prop", this.changeProp);
        txtParams.put("chaoshi_extends_info", this.chaoshiExtendsInfo);
        txtParams.put("cid", this.cid);
        txtParams.put("cod_postage_id", this.codPostageId);
        txtParams.put("desc", this.desc);
        txtParams.put("desc_modules", this.descModules);
        txtParams.put("empty_fields", this.emptyFields);
        txtParams.put("ems_fee", this.emsFee);
        txtParams.put("express_fee", this.expressFee);
        txtParams.put("food_security.contact", this.foodSecurityContact);
        txtParams.put("food_security.design_code", this.foodSecurityDesignCode);
        txtParams.put("food_security.factory", this.foodSecurityFactory);
        txtParams.put("food_security.factory_site", this.foodSecurityFactorySite);
        txtParams.put("food_security.food_additive", this.foodSecurityFoodAdditive);
        txtParams.put("food_security.health_product_no", this.foodSecurityHealthProductNo);
        txtParams.put("food_security.mix", this.foodSecurityMix);
        txtParams.put("food_security.period", this.foodSecurityPeriod);
        txtParams.put("food_security.plan_storage", this.foodSecurityPlanStorage);
        txtParams.put("food_security.prd_license_no", this.foodSecurityPrdLicenseNo);
        txtParams.put("food_security.product_date_end", this.foodSecurityProductDateEnd);
        txtParams.put("food_security.product_date_start", this.foodSecurityProductDateStart);
        txtParams.put("food_security.stock_date_end", this.foodSecurityStockDateEnd);
        txtParams.put("food_security.stock_date_start", this.foodSecurityStockDateStart);
        txtParams.put("food_security.supplier", this.foodSecuritySupplier);
        txtParams.put("freight_payer", this.freightPayer);
        txtParams.put("global_stock_country", this.globalStockCountry);
        txtParams.put("global_stock_type", this.globalStockType);
        txtParams.put("has_discount", this.hasDiscount);
        txtParams.put("has_invoice", this.hasInvoice);
        txtParams.put("has_showcase", this.hasShowcase);
        txtParams.put("has_warranty", this.hasWarranty);
        txtParams.put("ignorewarning", this.ignorewarning);
        txtParams.put("increment", this.increment);
        txtParams.put("input_pids", this.inputPids);
        txtParams.put("input_str", this.inputStr);
        txtParams.put("is_3D", this.is3D);
        txtParams.put("is_ex", this.isEx);
        txtParams.put("is_lightning_consignment", this.isLightningConsignment);
        txtParams.put("is_offline", this.isOffline);
        txtParams.put("is_replace_sku", this.isReplaceSku);
        txtParams.put("is_taobao", this.isTaobao);
        txtParams.put("is_xinpin", this.isXinpin);
        txtParams.put("item_size", this.itemSize);
        txtParams.put("item_weight", this.itemWeight);
        txtParams.put("lang", this.lang);
        txtParams.put("list_time", this.listTime);
        txtParams.put("locality_life.choose_logis", this.localityLifeChooseLogis);
        txtParams.put("locality_life.expirydate", this.localityLifeExpirydate);
        txtParams.put("locality_life.merchant", this.localityLifeMerchant);
        txtParams.put("locality_life.network_id", this.localityLifeNetworkId);
        txtParams.put("locality_life.onsale_auto_refund_ratio",
                this.localityLifeOnsaleAutoRefundRatio);
        txtParams.put("locality_life.refund_ratio", this.localityLifeRefundRatio);
        txtParams.put("locality_life.refundmafee", this.localityLifeRefundmafee);
        txtParams.put("locality_life.verification", this.localityLifeVerification);
        txtParams.put("location.city", this.locationCity);
        txtParams.put("location.state", this.locationState);
        txtParams.put("newprepay", this.newprepay);
        txtParams.put("num", this.num);
        txtParams.put("num_iid", this.numIid);
        txtParams.put("o2o_bind_service", this.o2oBindService);
        txtParams.put("outer_id", this.outerId);
        txtParams.put("paimai_info.deposit", this.paimaiInfoDeposit);
        txtParams.put("paimai_info.interval", this.paimaiInfoInterval);
        txtParams.put("paimai_info.mode", this.paimaiInfoMode);
        txtParams.put("paimai_info.reserve", this.paimaiInfoReserve);
        txtParams.put("paimai_info.valid_hour", this.paimaiInfoValidHour);
        txtParams.put("paimai_info.valid_minute", this.paimaiInfoValidMinute);
        txtParams.put("pic_path", this.picPath);
        txtParams.put("post_fee", this.postFee);
        txtParams.put("postage_id", this.postageId);
        txtParams.put("price", this.price);
        txtParams.put("product_id", this.productId);
        txtParams.put("property_alias", this.propertyAlias);
        txtParams.put("props", this.props);
        txtParams.put("qualification", this.qualification);
        txtParams.put("scenic_ticket_book_cost", this.scenicTicketBookCost);
        txtParams.put("scenic_ticket_pay_way", this.scenicTicketPayWay);
        txtParams.put("sell_point", this.sellPoint);
        txtParams.put("sell_promise", this.sellPromise);
        txtParams.put("seller_cids", this.sellerCids);
        txtParams.put("sku_barcode", this.skuBarcode);
        txtParams.put("sku_hd_height", this.skuHdHeight);
        txtParams.put("sku_hd_lamp_quantity", this.skuHdLampQuantity);
        txtParams.put("sku_hd_length", this.skuHdLength);
        txtParams.put("sku_outer_ids", this.skuOuterIds);
        txtParams.put("sku_prices", this.skuPrices);
        txtParams.put("sku_properties", this.skuProperties);
        txtParams.put("sku_quantities", this.skuQuantities);
        txtParams.put("sku_spec_ids", this.skuSpecIds);
        txtParams.put("stuff_status", this.stuffStatus);
        txtParams.put("sub_stock", this.subStock);
        txtParams.put("title", this.title);
        txtParams.put("valid_thru", this.validThru);
        txtParams.put("weight", this.weight);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getTitle() {
        return this.title;
    }

    public Long getValidThru() {
        return this.validThru;
    }

    public Long getWeight() {
        return this.weight;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setAfterSaleId(Long afterSaleId) {
        this.afterSaleId = afterSaleId;
    }

    public void setApproveStatus(String approveStatus) {
        this.approveStatus = approveStatus;
    }

    public void setAuctionPoint(Long auctionPoint) {
        this.auctionPoint = auctionPoint;
    }

    public void setAutoFill(String autoFill) {
        this.autoFill = autoFill;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setChangeProp(String changeProp) {
        this.changeProp = changeProp;
    }

    public void setChaoshiExtendsInfo(String chaoshiExtendsInfo) {
        this.chaoshiExtendsInfo = chaoshiExtendsInfo;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public void setCodPostageId(Long codPostageId) {
        this.codPostageId = codPostageId;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setDescModules(String descModules) {
        this.descModules = descModules;
    }

    public void setEmptyFields(String emptyFields) {
        this.emptyFields = emptyFields;
    }

    public void setEmsFee(String emsFee) {
        this.emsFee = emsFee;
    }

    public void setExpressFee(String expressFee) {
        this.expressFee = expressFee;
    }

    public void setFoodSecurityContact(String foodSecurityContact) {
        this.foodSecurityContact = foodSecurityContact;
    }

    public void setFoodSecurityDesignCode(String foodSecurityDesignCode) {
        this.foodSecurityDesignCode = foodSecurityDesignCode;
    }

    public void setFoodSecurityFactory(String foodSecurityFactory) {
        this.foodSecurityFactory = foodSecurityFactory;
    }

    public void setFoodSecurityFactorySite(String foodSecurityFactorySite) {
        this.foodSecurityFactorySite = foodSecurityFactorySite;
    }

    public void setFoodSecurityFoodAdditive(String foodSecurityFoodAdditive) {
        this.foodSecurityFoodAdditive = foodSecurityFoodAdditive;
    }

    public void setFoodSecurityHealthProductNo(String foodSecurityHealthProductNo) {
        this.foodSecurityHealthProductNo = foodSecurityHealthProductNo;
    }

    public void setFoodSecurityMix(String foodSecurityMix) {
        this.foodSecurityMix = foodSecurityMix;
    }

    public void setFoodSecurityPeriod(String foodSecurityPeriod) {
        this.foodSecurityPeriod = foodSecurityPeriod;
    }

    public void setFoodSecurityPlanStorage(String foodSecurityPlanStorage) {
        this.foodSecurityPlanStorage = foodSecurityPlanStorage;
    }

    public void setFoodSecurityPrdLicenseNo(String foodSecurityPrdLicenseNo) {
        this.foodSecurityPrdLicenseNo = foodSecurityPrdLicenseNo;
    }

    public void setFoodSecurityProductDateEnd(String foodSecurityProductDateEnd) {
        this.foodSecurityProductDateEnd = foodSecurityProductDateEnd;
    }

    public void setFoodSecurityProductDateStart(String foodSecurityProductDateStart) {
        this.foodSecurityProductDateStart = foodSecurityProductDateStart;
    }

    public void setFoodSecurityStockDateEnd(String foodSecurityStockDateEnd) {
        this.foodSecurityStockDateEnd = foodSecurityStockDateEnd;
    }

    public void setFoodSecurityStockDateStart(String foodSecurityStockDateStart) {
        this.foodSecurityStockDateStart = foodSecurityStockDateStart;
    }

    public void setFoodSecuritySupplier(String foodSecuritySupplier) {
        this.foodSecuritySupplier = foodSecuritySupplier;
    }

    public void setFreightPayer(String freightPayer) {
        this.freightPayer = freightPayer;
    }

    public void setGlobalStockCountry(String globalStockCountry) {
        this.globalStockCountry = globalStockCountry;
    }

    public void setGlobalStockType(String globalStockType) {
        this.globalStockType = globalStockType;
    }

    public void setHasDiscount(Boolean hasDiscount) {
        this.hasDiscount = hasDiscount;
    }

    public void setHasInvoice(Boolean hasInvoice) {
        this.hasInvoice = hasInvoice;
    }

    public void setHasShowcase(Boolean hasShowcase) {
        this.hasShowcase = hasShowcase;
    }

    public void setHasWarranty(Boolean hasWarranty) {
        this.hasWarranty = hasWarranty;
    }

    public void setIgnorewarning(String ignorewarning) {
        this.ignorewarning = ignorewarning;
    }

    public void setImage(FileItem image) {
        this.image = image;
    }

    public void setIncrement(String increment) {
        this.increment = increment;
    }

    public void setInputPids(String inputPids) {
        this.inputPids = inputPids;
    }

    public void setInputStr(String inputStr) {
        this.inputStr = inputStr;
    }

    public void setIs3D(Boolean is3D) {
        this.is3D = is3D;
    }

    public void setIsEx(Boolean isEx) {
        this.isEx = isEx;
    }

    public void setIsLightningConsignment(Boolean isLightningConsignment) {
        this.isLightningConsignment = isLightningConsignment;
    }

    public void setIsOffline(String isOffline) {
        this.isOffline = isOffline;
    }

    public void setIsReplaceSku(Boolean isReplaceSku) {
        this.isReplaceSku = isReplaceSku;
    }

    public void setIsTaobao(Boolean isTaobao) {
        this.isTaobao = isTaobao;
    }

    public void setIsXinpin(Boolean isXinpin) {
        this.isXinpin = isXinpin;
    }

    public void setItemSize(String itemSize) {
        this.itemSize = itemSize;
    }

    public void setItemWeight(String itemWeight) {
        this.itemWeight = itemWeight;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public void setListTime(Date listTime) {
        this.listTime = listTime;
    }

    public void setLocalityLifeChooseLogis(String localityLifeChooseLogis) {
        this.localityLifeChooseLogis = localityLifeChooseLogis;
    }

    public void setLocalityLifeExpirydate(String localityLifeExpirydate) {
        this.localityLifeExpirydate = localityLifeExpirydate;
    }

    public void setLocalityLifeMerchant(String localityLifeMerchant) {
        this.localityLifeMerchant = localityLifeMerchant;
    }

    public void setLocalityLifeNetworkId(String localityLifeNetworkId) {
        this.localityLifeNetworkId = localityLifeNetworkId;
    }

    public void setLocalityLifeOnsaleAutoRefundRatio(Long localityLifeOnsaleAutoRefundRatio) {
        this.localityLifeOnsaleAutoRefundRatio = localityLifeOnsaleAutoRefundRatio;
    }

    public void setLocalityLifeRefundmafee(String localityLifeRefundmafee) {
        this.localityLifeRefundmafee = localityLifeRefundmafee;
    }

    public void setLocalityLifeRefundRatio(Long localityLifeRefundRatio) {
        this.localityLifeRefundRatio = localityLifeRefundRatio;
    }

    public void setLocalityLifeVerification(String localityLifeVerification) {
        this.localityLifeVerification = localityLifeVerification;
    }

    public void setLocationCity(String locationCity) {
        this.locationCity = locationCity;
    }

    public void setLocationState(String locationState) {
        this.locationState = locationState;
    }

    public void setNewprepay(String newprepay) {
        this.newprepay = newprepay;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public void setO2oBindService(Boolean o2oBindService) {
        this.o2oBindService = o2oBindService;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public void setPaimaiInfoDeposit(Long paimaiInfoDeposit) {
        this.paimaiInfoDeposit = paimaiInfoDeposit;
    }

    public void setPaimaiInfoInterval(Long paimaiInfoInterval) {
        this.paimaiInfoInterval = paimaiInfoInterval;
    }

    public void setPaimaiInfoMode(Long paimaiInfoMode) {
        this.paimaiInfoMode = paimaiInfoMode;
    }

    public void setPaimaiInfoReserve(String paimaiInfoReserve) {
        this.paimaiInfoReserve = paimaiInfoReserve;
    }

    public void setPaimaiInfoValidHour(Long paimaiInfoValidHour) {
        this.paimaiInfoValidHour = paimaiInfoValidHour;
    }

    public void setPaimaiInfoValidMinute(Long paimaiInfoValidMinute) {
        this.paimaiInfoValidMinute = paimaiInfoValidMinute;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public void setPostageId(Long postageId) {
        this.postageId = postageId;
    }

    public void setPostFee(String postFee) {
        this.postFee = postFee;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setPropertyAlias(String propertyAlias) {
        this.propertyAlias = propertyAlias;
    }

    public void setProps(String props) {
        this.props = props;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setScenicTicketBookCost(String scenicTicketBookCost) {
        this.scenicTicketBookCost = scenicTicketBookCost;
    }

    public void setScenicTicketPayWay(Long scenicTicketPayWay) {
        this.scenicTicketPayWay = scenicTicketPayWay;
    }

    public void setSellerCids(String sellerCids) {
        this.sellerCids = sellerCids;
    }

    public void setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint;
    }

    public void setSellPromise(Boolean sellPromise) {
        this.sellPromise = sellPromise;
    }

    public void setSkuBarcode(String skuBarcode) {
        this.skuBarcode = skuBarcode;
    }

    public void setSkuHdHeight(String skuHdHeight) {
        this.skuHdHeight = skuHdHeight;
    }

    public void setSkuHdLampQuantity(String skuHdLampQuantity) {
        this.skuHdLampQuantity = skuHdLampQuantity;
    }

    public void setSkuHdLength(String skuHdLength) {
        this.skuHdLength = skuHdLength;
    }

    public void setSkuOuterIds(String skuOuterIds) {
        this.skuOuterIds = skuOuterIds;
    }

    public void setSkuPrices(String skuPrices) {
        this.skuPrices = skuPrices;
    }

    public void setSkuProperties(String skuProperties) {
        this.skuProperties = skuProperties;
    }

    public void setSkuQuantities(String skuQuantities) {
        this.skuQuantities = skuQuantities;
    }

    public void setSkuSpecIds(String skuSpecIds) {
        this.skuSpecIds = skuSpecIds;
    }

    public void setStuffStatus(String stuffStatus) {
        this.stuffStatus = stuffStatus;
    }

    public void setSubStock(Long subStock) {
        this.subStock = subStock;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setValidThru(Long validThru) {
        this.validThru = validThru;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }
}
