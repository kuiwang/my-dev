package com.taobao.api.response;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.PropValue;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.itempropvalues.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ItempropvaluesGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4635554895944448679L;

    /**
     * 最近修改时间。格式:yyyy-MM-dd HH:mm:ss
     */
    @ApiField("last_modified")
    private Date lastModified;

    /**
     * 属性值,根据fields传入的参数返回相应的结果
     */
    @ApiListField("prop_values")
    @ApiField("prop_value")
    private List<PropValue> propValues;

    public Date getLastModified() {
        return this.lastModified;
    }

    public List<PropValue> getPropValues() {
        return this.propValues;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public void setPropValues(List<PropValue> propValues) {
        this.propValues = propValues;
    }

}
