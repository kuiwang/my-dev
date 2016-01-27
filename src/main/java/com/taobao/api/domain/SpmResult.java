package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * Appkey的站点导购数据
 *
 * @author auto create
 * @since 1.0, null
 */
public class SpmResult extends TaobaoObject {

    private static final long serialVersionUID = 1765433916721933688L;

    /**
     * appkey
     */
    @ApiField("app_key")
    private String appKey;

    /**
     * 日期
     */
    @ApiField("date")
    private Date date;

    /**
     * 该APP所使用的SPM第四位的报表数据
     */
    @ApiListField("spm_modules")
    @ApiField("top_spm")
    private List<TopSpm> spmModules;

    /**
     * 该APP所使用的SPM第三位的报表数据
     */
    @ApiListField("spm_pages")
    @ApiField("top_spm")
    private List<TopSpm> spmPages;

    /**
     * 该APP的整体报表数据
     */
    @ApiField("spm_site")
    private TopSpm spmSite;

    public String getAppKey() {
        return this.appKey;
    }

    public Date getDate() {
        return this.date;
    }

    public List<TopSpm> getSpmModules() {
        return this.spmModules;
    }

    public List<TopSpm> getSpmPages() {
        return this.spmPages;
    }

    public TopSpm getSpmSite() {
        return this.spmSite;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setSpmModules(List<TopSpm> spmModules) {
        this.spmModules = spmModules;
    }

    public void setSpmPages(List<TopSpm> spmPages) {
        this.spmPages = spmPages;
    }

    public void setSpmSite(TopSpm spmSite) {
        this.spmSite = spmSite;
    }

}
