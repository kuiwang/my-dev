package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CrmMembersIncrementGetResponse;

/**
 * TOP API: taobao.crm.members.increment.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:27
 */
public class CrmMembersIncrementGetRequest implements TaobaoRequest<CrmMembersIncrementGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 显示第几页的会员，如果输入的页码大于总共的页码数，例如总共10页，但是current_page的值为11，则返回空白页，最小页数为1<br />
     * 支持最小值为：1
     */
    private Long currentPage;

    /**
     * 卖家修改会员信息的时间终点.如果不填写此字段,默认为当前时间.
     */
    private Date endModify;

    /**
     * 会员等级，0：店铺客户，1：普通会员，2：高级会员，3：VIP会员， 4：至尊VIP会员<br />
     * 支持最大值为：4<br />
     * 支持最小值为：-1<br />
     * 支持的最大列表长度为：32
     */
    private Long grade;

    /**
     * 每页显示的会员数，page_size的值不能超过100，最小值要大于1<br />
     * 支持最大值为：100<br />
     * 支持最小值为：1
     */
    private Long pageSize;

    /**
     * 卖家修改会员信息的时间起点.
     */
    private Date startModify;

    public void setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
    }

    public Long getCurrentPage() {
        return this.currentPage;
    }

    public void setEndModify(Date endModify) {
        this.endModify = endModify;
    }

    public Date getEndModify() {
        return this.endModify;
    }

    public void setGrade(Long grade) {
        this.grade = grade;
    }

    public Long getGrade() {
        return this.grade;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setStartModify(Date startModify) {
        this.startModify = startModify;
    }

    public Date getStartModify() {
        return this.startModify;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.crm.members.increment.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("current_page", this.currentPage);
        txtParams.put("end_modify", this.endModify);
        txtParams.put("grade", this.grade);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("start_modify", this.startModify);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public Class<CrmMembersIncrementGetResponse> getResponseClass() {
        return CrmMembersIncrementGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(currentPage, "currentPage");
        RequestCheckUtils.checkMinValue(currentPage, 1L, "currentPage");
        RequestCheckUtils.checkMaxValue(grade, 4L, "grade");
        RequestCheckUtils.checkMinValue(grade, -1L, "grade");
        RequestCheckUtils.checkMaxValue(pageSize, 100L, "pageSize");
        RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
