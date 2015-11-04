package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.LogisticsCompany;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.logistics.companies.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class LogisticsCompaniesGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4463457926193219761L;

    /**
     * 物流公司信息。返回的LogisticCompany包含的具体信息为入参fields请求的字段信息。
     */
    @ApiListField("logistics_companies")
    @ApiField("logistics_company")
    private List<LogisticsCompany> logisticsCompanies;

    public void setLogisticsCompanies(List<LogisticsCompany> logisticsCompanies) {
        this.logisticsCompanies = logisticsCompanies;
    }

    public List<LogisticsCompany> getLogisticsCompanies() {
        return this.logisticsCompanies;
    }

}
