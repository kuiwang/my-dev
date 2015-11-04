package com.scott.dev.taobao.api.item.domain;

/*
 * 商品详情模块
 */
public class ItemDescModule {

    /*
     * 模块id ,(注意:用户自定义模块不用填此项。)
     */
    private Number moduleId;

    /*
     * 模块名称
     */
    private String moduleName;

    /*
     * cat_mod:表示是运营设置的类目维度模块，usr_mod表示的是商家自定义模块。
     */
    private String type;

    /*
     * 描述具体内容
     */
    private String content;

    /*
     * 一个List的Json串，里面是模块引导提示，不超过3条（isv提交时可忽略不传）
     */
    private String intros;

    /*
     * 淘宝图片空间的地址链接，示例模板，最多不超过三个（isv提交时可忽略不传）
     */
    private String tplUrls;

    /*
     * 是否必填 （isv提交时可忽略不传）
     */
    private Boolean required;

    public Number getModuleId() {
        return moduleId;
    }

    public void setModuleId(Number moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIntros() {
        return intros;
    }

    public void setIntros(String intros) {
        this.intros = intros;
    }

    public String getTplUrls() {
        return tplUrls;
    }

    public void setTplUrls(String tplUrls) {
        this.tplUrls = tplUrls;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }
}
