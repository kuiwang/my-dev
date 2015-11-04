package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WeitaoFeedAddResponse;

/**
 * TOP API: taobao.weitao.feed.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:48
 */
public class WeitaoFeedAddRequest implements TaobaoRequest<WeitaoFeedAddResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 封面图片地址，必须为自己在图片空间上传的图片<br />
     * 支持最大长度为：1000<br />
     * 支持的最大列表长度为：1000
     */
    private String coverPic;

    /**
     * feed的区域内容，有两种类型type=text或者type=pic。当type=text时，为文本内容，
     * 请输入description对应的文本值
     * ；当type=pic时，为图片内容，请输入pic对应的图片URL，图片的URL必须为当前操作用户(
     * 卖家)的图片空间图片地址,并且图片宽度要大于480，高宽比大于1/3小于2/3。支持type=text和type=pic的混排json<br />
     * 支持最大长度为：3000<br />
     * 支持的最大列表长度为：3000
     */
    private String jsonTiles;

    /**
     * feed详情里允许放的一个超连接,不允许微信地址，最大长度256字符；输入link_desc后必须输入此参数<br />
     * 支持最大长度为：256<br />
     * 支持的最大列表长度为：256
     */
    private String link;

    /**
     * link超连接的描述，最大长度15字符，utf-8,byte[]长度22，允许为空<br />
     * 支持最大长度为：22<br />
     * 支持的最大列表长度为：22
     */
    private String linkDesc;

    /**
     * 手机等客户端是否能够查看feed详情，如果为false，在feeds流时点击就进入到插件详情地址，否则进入查看feed详情
     */
    private Boolean showDetail;

    /**
     * 发送的微淘内容的标题<br />
     * 支持最大长度为：64<br />
     * 支持的最大列表长度为：64
     */
    private String title;

    /**
     * 业务参数，用key=value格式，有多个时用'&'连接
     */
    private String urlParam;

    public void setCoverPic(String coverPic) {
        this.coverPic = coverPic;
    }

    public String getCoverPic() {
        return this.coverPic;
    }

    public void setJsonTiles(String jsonTiles) {
        this.jsonTiles = jsonTiles;
    }

    public String getJsonTiles() {
        return this.jsonTiles;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLink() {
        return this.link;
    }

    public void setLinkDesc(String linkDesc) {
        this.linkDesc = linkDesc;
    }

    public String getLinkDesc() {
        return this.linkDesc;
    }

    public void setShowDetail(Boolean showDetail) {
        this.showDetail = showDetail;
    }

    public Boolean getShowDetail() {
        return this.showDetail;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setUrlParam(String urlParam) {
        this.urlParam = urlParam;
    }

    public String getUrlParam() {
        return this.urlParam;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.weitao.feed.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("cover_pic", this.coverPic);
        txtParams.put("json_tiles", this.jsonTiles);
        txtParams.put("link", this.link);
        txtParams.put("link_desc", this.linkDesc);
        txtParams.put("show_detail", this.showDetail);
        txtParams.put("title", this.title);
        txtParams.put("url_param", this.urlParam);
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

    public Class<WeitaoFeedAddResponse> getResponseClass() {
        return WeitaoFeedAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(coverPic, "coverPic");
        RequestCheckUtils.checkMaxLength(coverPic, 1000, "coverPic");
        RequestCheckUtils.checkMaxLength(jsonTiles, 3000, "jsonTiles");
        RequestCheckUtils.checkMaxLength(link, 256, "link");
        RequestCheckUtils.checkMaxLength(linkDesc, 22, "linkDesc");
        RequestCheckUtils.checkNotEmpty(title, "title");
        RequestCheckUtils.checkMaxLength(title, 64, "title");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
