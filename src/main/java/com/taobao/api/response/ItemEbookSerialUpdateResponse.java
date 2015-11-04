package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Item;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.item.ebook.serial.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ItemEbookSerialUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7121725287844213541L;

    /**
     * 商品结构里的num_iid，modified
     */
    @ApiField("item")
    private Item item;

    public void setItem(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return this.item;
    }

}
