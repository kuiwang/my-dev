package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CrmGradeSetResponse;

/**
 * TOP API: taobao.crm.grade.set request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:26
 */
public class CrmGradeSetRequest implements TaobaoRequest<CrmGradeSetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 只对设置的层级等级有效，必须要在amount和count参数中选择一个<br>
     * amount参数的填写规范：升级到下一个级别的需要的交易额，单位为分,必须全部填写.例如10000,20000,30000，
     * 其中10000表示非会员升级到普通的所需的交易额
     * ，20000表示普通升级到高级所需的交易额，层级等级中最高等级的下一个等级默认为0。会员等级越高，所需交易额必须越高。<br />
     * 支持最小值为：0
     */
    private String amount;

    /**
     * 只对设置的层级等级有效，必须要在amount和count参数中选择一个<br>
     * count参数的填写规范： 升级到下一个级别的需要的交易量,必须全部填写.
     * 以逗号分隔,例如100,200,300，其中100表示非会员升级到普通会员交易量
     * 。层级等级中最高等级的下一个等级的交易量默认为0。会员等级越高，交易量必须越高。<br />
     * 支持最小值为：0
     */
    private String count;

    /**
     * 会员级别折扣率。会员等级越高，折扣必须越低。 950即9.5折，888折即8.88折。出于安全原因，折扣现最低只能设置到700即7折。<br />
     * 支持最大值为：1000<br />
     * 支持最小值为：700
     */
    private String discount;

    /**
     * 会员等级，用逗号分隔。买家会员级别0：店铺客户 1：普通会员 2 ：高级会员 3：VIP会员 4：至尊VIP<br />
     * 支持最大值为：4<br />
     * 支持最小值为：1
     */
    private String grade;

    /**
     * 是否设置达到某一会员等级的交易量和交易额，必填。4个级别都需要设置，如入参为true,true,true,false时，
     * 表示设置达到高级会员、VIP会员的交易量或者交易额，不设置达到至尊会员的交易量和交易额
     */
    private String hierarchy;

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return this.amount;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getCount() {
        return this.count;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getDiscount() {
        return this.discount;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return this.grade;
    }

    public void setHierarchy(String hierarchy) {
        this.hierarchy = hierarchy;
    }

    public String getHierarchy() {
        return this.hierarchy;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.crm.grade.set";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("amount", this.amount);
        txtParams.put("count", this.count);
        txtParams.put("discount", this.discount);
        txtParams.put("grade", this.grade);
        txtParams.put("hierarchy", this.hierarchy);
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

    public Class<CrmGradeSetResponse> getResponseClass() {
        return CrmGradeSetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxListSize(amount, 4, "amount");
        RequestCheckUtils.checkMaxListSize(count, 4, "count");
        RequestCheckUtils.checkNotEmpty(discount, "discount");
        RequestCheckUtils.checkMaxListSize(discount, 4, "discount");
        RequestCheckUtils.checkNotEmpty(grade, "grade");
        RequestCheckUtils.checkMaxListSize(grade, 4, "grade");
        RequestCheckUtils.checkNotEmpty(hierarchy, "hierarchy");
        RequestCheckUtils.checkMaxListSize(hierarchy, 4, "hierarchy");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
