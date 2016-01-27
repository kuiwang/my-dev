package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Duty;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.subuser.dutys.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SubuserDutysGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1673875161583592724L;

    /**
     * 职务信息
     */
    @ApiListField("dutys")
    @ApiField("duty")
    private List<Duty> dutys;

    public List<Duty> getDutys() {
        return this.dutys;
    }

    public void setDutys(List<Duty> dutys) {
        this.dutys = dutys;
    }

}
