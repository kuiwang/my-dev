package com.scott.dev.taobao.api.tae.domain;

import java.util.List;

/**
 * 无线描述信息
 */
public class MobileDescInfo {

    /**
     * 无线描述信息
     */
    private List<DescFragment> descList;

    public List<DescFragment> getDescList() {
        return this.descList;
    }

    public void setDescList(List<DescFragment> descList) {
        this.descList = descList;
    }

}
