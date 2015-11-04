package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SuiteConfDO;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: tmall.brandcat.suiteconf.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TmallBrandcatSuiteconfGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8656993764814578811L;

    /**
     * 套装的配置信息
     */
    @ApiListField("suite_conf_list")
    @ApiField("suite_conf_d_o")
    private List<SuiteConfDO> suiteConfList;

    public void setSuiteConfList(List<SuiteConfDO> suiteConfList) {
        this.suiteConfList = suiteConfList;
    }

    public List<SuiteConfDO> getSuiteConfList() {
        return this.suiteConfList;
    }

}
