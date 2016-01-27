package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.fenxiao.grade.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoGradeAddResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2271937198132822217L;

    /**
     * 等级ID
     */
    @ApiField("grade_id")
    private Long gradeId;

    /**
     * 操作是否成功
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    public Long getGradeId() {
        return this.gradeId;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setGradeId(Long gradeId) {
        this.gradeId = gradeId;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

}
