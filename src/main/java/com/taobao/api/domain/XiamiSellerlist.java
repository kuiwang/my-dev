package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 满就送卖家数据详情
 *
 * @author auto create
 * @since 1.0, null
 */
public class XiamiSellerlist extends TaobaoObject {

    private static final long serialVersionUID = 8865298278633522775L;

    /**
     * 总条数
     */
    @ApiField("count")
    private Long count;

    /**
     * 卖家销售详情list
     */
    @ApiListField("info")
    @ApiField("xiami_sellerlist_info")
    private List<XiamiSellerlistInfo> info;

    public Long getCount() {
        return this.count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<XiamiSellerlistInfo> getInfo() {
        return this.info;
    }

    public void setInfo(List<XiamiSellerlistInfo> info) {
        this.info = info;
    }

}
