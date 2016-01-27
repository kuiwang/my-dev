package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.DeliveryTemplateUpdateResponse;

/**
 * TOP API: taobao.delivery.template.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class DeliveryTemplateUpdateRequest implements TaobaoRequest<DeliveryTemplateUpdateResponse> {

    /**
     * 可选值：0,1 <br>
     * 说明<br>
     * 0:表示买家承担服务费;<br>
     * 1:表示卖家承担服务费
     */
    private Long assumer;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 模板名称，长度不能大于50个字节
     */
    private String name;

    /**
     * 增费：输入0.00-999.99（最多包含两位小数）<br/>
     * <font color=blue>增费可以为0</font><br/>
     * <font color=red>输入的格式分号个数和template_types数量一致，
     * 逗号个数必须与template_dests以分号隔开之后一一对应的数量一致</font>
     */
    private String templateAddFees;

    /**
     * 增费标准：当valuation(记价方式)为0时输入1-9999范围内的整数<br>
     * <font color=blue>增费标准目前只能为1</font> <br>
     * <font color=red>输入的格式分号个数和template_types数量一致，
     * 逗号个数必须与template_dests以分号隔开之后一一对应的数量一致</font>
     */
    private String templateAddStandards;

    /**
     * 邮费子项涉及的地区.结构: value1;value2;value3,value4 <br>
     * 如:1,110000;1,110000;1,310000;1,320000,330000。
     * aredId解释(1=全国,110000=北京,310000=上海,320000=江苏,330000=浙江)
     * 如果template_types设置为post
     * ;ems;exmpress;cod则表示为平邮(post)指定默认地区(全国)和北京地区的运费;其他的类似以分号区分一一对应 <br/>
     * 可以用taobao.areas.get接口获取.或者参考：http://www.stats.gov.cn/tjbz/xzqhdm/
     * t20080215_402462675.htm <br/>
     * <font
     * color=red>每个运费方式设置的设涉及地区中必须包含全国地区（areaId=1）表示默认运费,可以只设置默认运费</font> <br>
     * <font
     * color=blue>注意:为多个地区指定指定不同（首费标准、首费、增费标准、增费一项不一样就算不同）的运费以逗号","区分，
     * template_start_standards(首费标准)、template_start_fees(首费)、
     * template_add_standards(增费标准)、
     * template_add_fees(增费)必须与template_types分号数量相同
     * 。如果为需要为多个地区指定相同运费则地区之间用“|”隔开即可。</font>
     */
    private String templateDests;

    /**
     * 需要修改的模板对应的模板ID
     */
    private Long templateId;

    /**
     * 首费：输入0.01-999.99（最多包含两位小数） <br/>
     * <font color=blue> 首费不能为0</font><br>
     * <font color=red>输入的格式分号个数和template_types数量一致，
     * 逗号个数必须与template_dests以分号隔开之后一一对应的数量一致</font>
     */
    private String templateStartFees;

    /**
     * 首费标准：当valuation(记价方式)为0时输入1-9999范围内的整数<br>
     * <font color=blue>首费标准目前只能为1</br> <br>
     * <font color=red>输入的格式分号个数和template_types数量一致，
     * 逗号个数必须与template_dests以分号隔开之后一一对应的数量一致</font>
     */
    private String templateStartStandards;

    /**
     * 运费方式:平邮 (post),快递公司(express),EMS
     * (ems),货到付款(cod)结构:value1;value2;value3;value4 如:
     * post;express;ems;cod <br/>
     * <font color=red> 注意:在添加多个运费方式时,字符串中使用 ";" 分号区分。template_dests(指定地区)
     * template_start_standards
     * (首费标准)、template_start_fees(首费)、template_add_standards
     * (增费标准)、template_add_fees(增费)必须与template_types的分号数量相同. </font> <br/>
     * <font color=blue> 普通用户：post,ems,express三种运费方式必须填写一个，不能填写cod。
     * 货到付款用户：如果填写了cod运费方式
     * ，则post,ems,express三种运费方式也必须填写一个，如果没有填写cod则填写的运费方式中必须存在express</font>
     */
    private String templateTypes;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(templateAddFees, "templateAddFees");
        RequestCheckUtils.checkNotEmpty(templateAddStandards, "templateAddStandards");
        RequestCheckUtils.checkNotEmpty(templateDests, "templateDests");
        RequestCheckUtils.checkNotEmpty(templateId, "templateId");
        RequestCheckUtils.checkNotEmpty(templateStartFees, "templateStartFees");
        RequestCheckUtils.checkNotEmpty(templateStartStandards, "templateStartStandards");
        RequestCheckUtils.checkNotEmpty(templateTypes, "templateTypes");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.delivery.template.update";
    }

    public Long getAssumer() {
        return this.assumer;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public Class<DeliveryTemplateUpdateResponse> getResponseClass() {
        return DeliveryTemplateUpdateResponse.class;
    }

    public String getTemplateAddFees() {
        return this.templateAddFees;
    }

    public String getTemplateAddStandards() {
        return this.templateAddStandards;
    }

    public String getTemplateDests() {
        return this.templateDests;
    }

    public Long getTemplateId() {
        return this.templateId;
    }

    public String getTemplateStartFees() {
        return this.templateStartFees;
    }

    public String getTemplateStartStandards() {
        return this.templateStartStandards;
    }

    public String getTemplateTypes() {
        return this.templateTypes;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("assumer", this.assumer);
        txtParams.put("name", this.name);
        txtParams.put("template_add_fees", this.templateAddFees);
        txtParams.put("template_add_standards", this.templateAddStandards);
        txtParams.put("template_dests", this.templateDests);
        txtParams.put("template_id", this.templateId);
        txtParams.put("template_start_fees", this.templateStartFees);
        txtParams.put("template_start_standards", this.templateStartStandards);
        txtParams.put("template_types", this.templateTypes);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setAssumer(Long assumer) {
        this.assumer = assumer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTemplateAddFees(String templateAddFees) {
        this.templateAddFees = templateAddFees;
    }

    public void setTemplateAddStandards(String templateAddStandards) {
        this.templateAddStandards = templateAddStandards;
    }

    public void setTemplateDests(String templateDests) {
        this.templateDests = templateDests;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public void setTemplateStartFees(String templateStartFees) {
        this.templateStartFees = templateStartFees;
    }

    public void setTemplateStartStandards(String templateStartStandards) {
        this.templateStartStandards = templateStartStandards;
    }

    public void setTemplateTypes(String templateTypes) {
        this.templateTypes = templateTypes;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
