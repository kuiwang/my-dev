package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.DemographicSetting;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.simba.nonsearch.demographics.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaNonsearchDemographicsUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1514841385229186489L;

    /**
     * 人群维度设置列表
     */
    @ApiListField("demographic_setting_list")
    @ApiField("demographic_setting")
    private List<DemographicSetting> demographicSettingList;

    public void setDemographicSettingList(List<DemographicSetting> demographicSettingList) {
        this.demographicSettingList = demographicSettingList;
    }

    public List<DemographicSetting> getDemographicSettingList() {
        return this.demographicSettingList;
    }

}
