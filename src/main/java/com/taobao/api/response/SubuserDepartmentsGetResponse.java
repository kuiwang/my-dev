package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Department;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.subuser.departments.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SubuserDepartmentsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2565472824554413519L;

    /**
     * 部门信息
     */
    @ApiListField("departments")
    @ApiField("department")
    private List<Department> departments;

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public List<Department> getDepartments() {
        return this.departments;
    }

}
