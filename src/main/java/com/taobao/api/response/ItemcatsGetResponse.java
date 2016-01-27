package com.taobao.api.response;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ItemCat;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.itemcats.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ItemcatsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6751464191899563655L;

    /**
     * 增量类目信息,根据fields传入的参数返回相应的结果；增量类目信息,根据fields传入的参数返回相应的结果。 features字段：
     * 1、如果存在attr_key=freeze表示该类目被冻结了，attr_value=0,5，value可能存在2个值（也可能只有1个），
     * 用逗号分割，0表示禁编辑，5表示禁止发布
     */
    @ApiListField("item_cats")
    @ApiField("item_cat")
    private List<ItemCat> itemCats;

    /**
     * 最近修改时间(如果取增量，会返回该字段)。格式:yyyy-MM-dd HH:mm:ss
     */
    @ApiField("last_modified")
    private Date lastModified;

    public List<ItemCat> getItemCats() {
        return this.itemCats;
    }

    public Date getLastModified() {
        return this.lastModified;
    }

    public void setItemCats(List<ItemCat> itemCats) {
        this.itemCats = itemCats;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

}
