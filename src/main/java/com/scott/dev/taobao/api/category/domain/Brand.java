package com.scott.dev.taobao.api.category.domain;

/*
 * 品牌
 */
public class Brand {

    /*
     * 对应属性的 pid:vid 串中的vid
     */
    private Number vid;

    /*
     * vid的值
     */
    private String name;

    /*
     * 品牌的属性id
     */
    private Number pid;

    /*
     * 品牌的属性名
     */
    private String propName;

    public Number getVid() {
        return vid;
    }

    public void setVid(Number vid) {
        this.vid = vid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Number getPid() {
        return pid;
    }

    public void setPid(Number pid) {
        this.pid = pid;
    }

    public String getPropName() {
        return propName;
    }

    public void setPropName(String propName) {
        this.propName = propName;
    }
}
