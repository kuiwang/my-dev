package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.MaQrcodeCommonCreateResponse;

/**
 * TOP API: taobao.ma.qrcode.common.create request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:50
 */
public class MaQrcodeCommonCreateRequest implements TaobaoRequest<MaQrcodeCommonCreateResponse> {

    /**
     * 二维码需要布点的位置，方便用户在码平台上可以区分看到不同布点的扫码数据情况；列表值，用半角','号分割，单个渠道名不能超过16字符。<br />
     * 支持最大长度为：160<br />
     * 支持的最大列表长度为：160
     */
    private String channelName;

    /**
     * 二维码的内容之一，由type决定：type=page时，content传入无线页面的URL连接内容；type=item时，
     * content传入宝贝数字ID
     * ；type=url时，content传入普通的URL连接内容；type=shop时，content传入店铺ID；<br />
     * 支持最大长度为：256<br />
     * 支持的最大列表长度为：256
     */
    private String content;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 二维码的logo地址，只允许淘宝官方图片空间的图片地址，其他非图片空间图片不支持。官方淘logo图片地址：http://img01.
     * taobaocdn.com/imgextra/T1Od8YFT8eXXXXXXXX。<br />
     * 支持最大长度为：256<br />
     * 支持的最大列表长度为：256
     */
    private String logo;

    /**
     * 二维码名字，即创建的二维码，在码平台上显示记录的名字。<br />
     * 支持最大长度为：32<br />
     * 支持的最大列表长度为：32
     */
    private String name;

    /**
     * 是否需要矢量图，如果需要矢量图，设置为true；只支持普通二维码，官方模板不支持矢量图
     */
    private Boolean needEps;

    /**
     * 二维码尺寸，只支持普通二维码，不支持官方模板，单位为像素，最小为60×60，最大为300×300，建议175×175。
     * 官方模板大小尺寸见style说明。<br />
     * 支持最大值为：300<br />
     * 支持最小值为：60
     */
    private Long size;

    /**
     * 二维码的样式名，支持普通码的颜色或官方模板的模板名；普通码的颜色可选输入：“000000”(黑色)、“EF4F2B”(橙色);
     * 官方模板的可选输入（实际尺寸比样例大）：“ww_color.png“
     * 尺寸290x320，样例：http://gtms03.alicdn.
     * com/tps/i3/T1YLPRFRXXXXbsbYwb-100-102.png；“tb_scan.png“
     * 尺寸290x320，样例：
     * http://gtms01.alicdn.com/tps/i1/T14vsEFThdXXbsbYwb-100-102.
     * png；“ww_hide_color.png“
     * 尺寸200x263，样例：http://gtms04.alicdn.com/tps/i4/
     * TB1URvlFVXXXXbRXFXXwxcf6pXX-76-100.png；“tmall_hide_color.png“
     * 尺寸200x263
     * ，样例：http://gtms01.alicdn.com/tps/i1/TB1S5PiFVXXXXacXVXXwxcf6pXX
     * -76-100.png。<br />
     * 支持最大长度为：50<br />
     * 支持的最大列表长度为：50
     */
    private String style;

    private Long timestamp;

    /**
     * 要制作的二维码业务类型：page:无线页面类型item:宝贝ID类型url:普通的URL连接类型shop:店铺ID类型<br />
     * 支持最大长度为：10<br />
     * 支持的最大列表长度为：10
     */
    private String type;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxLength(channelName, 160, "channelName");
        RequestCheckUtils.checkNotEmpty(content, "content");
        RequestCheckUtils.checkMaxLength(content, 256, "content");
        RequestCheckUtils.checkMaxLength(logo, 256, "logo");
        RequestCheckUtils.checkNotEmpty(name, "name");
        RequestCheckUtils.checkMaxLength(name, 32, "name");
        RequestCheckUtils.checkNotEmpty(size, "size");
        RequestCheckUtils.checkMaxValue(size, 300L, "size");
        RequestCheckUtils.checkMinValue(size, 60L, "size");
        RequestCheckUtils.checkNotEmpty(style, "style");
        RequestCheckUtils.checkMaxLength(style, 50, "style");
        RequestCheckUtils.checkNotEmpty(type, "type");
        RequestCheckUtils.checkMaxLength(type, 10, "type");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.ma.qrcode.common.create";
    }

    public String getChannelName() {
        return this.channelName;
    }

    public String getContent() {
        return this.content;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getLogo() {
        return this.logo;
    }

    public String getName() {
        return this.name;
    }

    public Boolean getNeedEps() {
        return this.needEps;
    }

    @Override
    public Class<MaQrcodeCommonCreateResponse> getResponseClass() {
        return MaQrcodeCommonCreateResponse.class;
    }

    public Long getSize() {
        return this.size;
    }

    public String getStyle() {
        return this.style;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("channel_name", this.channelName);
        txtParams.put("content", this.content);
        txtParams.put("logo", this.logo);
        txtParams.put("name", this.name);
        txtParams.put("need_eps", this.needEps);
        txtParams.put("size", this.size);
        txtParams.put("style", this.style);
        txtParams.put("type", this.type);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNeedEps(Boolean needEps) {
        this.needEps = needEps;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setType(String type) {
        this.type = type;
    }
}
