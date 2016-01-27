package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.CheckYaoPiats;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: tmall.yao.piats.check response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TmallYaoPiatsCheckResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1739272918254987558L;

    /**
     * 校验药监码返回列表
     */
    @ApiListField("check_yao_piats_list")
    @ApiField("check_yao_piats")
    private List<CheckYaoPiats> checkYaoPiatsList;

    public List<CheckYaoPiats> getCheckYaoPiatsList() {
        return this.checkYaoPiatsList;
    }

    public void setCheckYaoPiatsList(List<CheckYaoPiats> checkYaoPiatsList) {
        this.checkYaoPiatsList = checkYaoPiatsList;
    }

}
