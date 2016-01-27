package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 微淘粉丝分组云标签
 *
 * @author auto create
 * @since 1.0, null
 */
public class CloudsTag extends TaobaoObject {

    private static final long serialVersionUID = 7379864457571756713L;

    /**
     * 1:bool,2:short,3:int,4:long,5:float,6:double,7:string
     */
    @ApiField("data_type")
    private String dataType;

    /**
     * 标签id
     */
    @ApiField("id")
    private String id;

    /**
     * 1：数值；2：radio；3：checkbox；4：精确文本匹配 ; 5 模糊文本匹配
     */
    @ApiField("input_type")
    private String inputType;

    /**
     * 标签中文名字
     */
    @ApiField("name_ch")
    private String nameCh;

    /**
     * 入参校验
     */
    @ApiField("validator")
    private String validator;

    /**
     * validator中的valueSet
     */
    @ApiField("values")
    private String values;

    public String getDataType() {
        return this.dataType;
    }

    public String getId() {
        return this.id;
    }

    public String getInputType() {
        return this.inputType;
    }

    public String getNameCh() {
        return this.nameCh;
    }

    public String getValidator() {
        return this.validator;
    }

    public String getValues() {
        return this.values;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    public void setNameCh(String nameCh) {
        this.nameCh = nameCh;
    }

    public void setValidator(String validator) {
        this.validator = validator;
    }

    public void setValues(String values) {
        this.values = values;
    }

}
