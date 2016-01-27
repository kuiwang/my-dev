package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.PropertyInputDO;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: tmall.brandcat.propinput.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TmallBrandcatPropinputGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5574566145771311223L;

    /**
     * 属性输入特征
     */
    @ApiField("property_input")
    private PropertyInputDO propertyInput;

    public PropertyInputDO getPropertyInput() {
        return this.propertyInput;
    }

    public void setPropertyInput(PropertyInputDO propertyInput) {
        this.propertyInput = propertyInput;
    }

}
