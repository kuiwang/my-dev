package com.scott.dev.taobao.api.fenxiao.domain;

import java.util.Date;

/*
 * 分销商等级
 */
public class FenxiaoGrade {

    /*
     * 记录创建时间
     */
    private Date created;

    /*
     * 主键
     */
    private Number gradeId;

    /*
     * 记录最后修改时间
     */
    private Date modified;

    /*
     * 分销商等级名称
     */
    private String name;

    public Date getCreated() {
        return created;
    }

    public Number getGradeId() {
        return gradeId;
    }

    public Date getModified() {
        return modified;
    }

    public String getName() {
        return name;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setGradeId(Number gradeId) {
        this.gradeId = gradeId;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public void setName(String name) {
        this.name = name;
    }

}
