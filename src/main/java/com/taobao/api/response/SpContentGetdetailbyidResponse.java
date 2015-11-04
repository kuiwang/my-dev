package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.sp.content.getdetailbyid response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SpContentGetdetailbyidResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5611579294974913862L;

    /**
     * Json格式value (Map<String,Object>)：返回查询结果，具体包含的属性信息如下：
     * id(Long)：内容的主键ID； type(Integer) ：内容类型； className(String)：内容的自定义分类名称；
     * picUrl(String)：内容关联的图片地址，以“,”分割； title(String)：内容标题；
     * comments(String)：内容推荐理由； featureMap(Map<String,String>)：内容的扩展属性；
     * likeNum(Long)：内容喜欢数； viewNum(Long)：内容浏览数； commentNum(Long)：内容评论数；
     * shareNum(Long)：内容分享数； gmtModified(Date)：修改时间； gmtCreate(Date) :
     * 发布时间； content(String)：内容的心得（只有type = 3的时候才有此值）；
     * tags(String)：内容的自定义标签，多个标签以“,”分割。；
     * items(String)：内容关联的商品列表，数值为商品的detail链接地址，多个宝贝以“,”分割。
     */
    @ApiField("value")
    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
