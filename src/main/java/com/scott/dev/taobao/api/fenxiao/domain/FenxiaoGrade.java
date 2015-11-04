package com.scott.dev.taobao.api.fenxiao.domain;

import java.util.Date;

/*
 * 分销商等级
 */
public class FenxiaoGrade {

    /*
     * 主键
     */
    private Number gradeId;

    /*
     * 分销商等级名称
     */
    private String name;

    /*
     * 记录创建时间
     */
    private Date created;

    /*
     * 记录最后修改时间
     */
    private Date modified;

    public Number getGradeId() {
        return gradeId;
    }

    public void setGradeId(Number gradeId) {
        this.gradeId = gradeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

}
