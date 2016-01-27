package com.scott.dev.taobao.api.item.domain;

/*
 * 商品详情模块
 */
public class ItemDescModule {

    /*
     * 描述具体内容
     */
    private String content;

    /*
     * 一个List的Json串，里面是模块引导提示，不超过3条（isv提交时可忽略不传）
     */
    private String intros;

    /*
     * 模块id ,(注意:用户自定义模块不用填此项。)
     */
    private Number moduleId;

    /*
     * 模块名称
     */
    private String moduleName;

    /*
     * 是否必填 （isv提交时可忽略不传）
     */
    private Boolean required;

    /*
     * 淘宝图片空间的地址链接，示例模板，最多不超过三个（isv提交时可忽略不传）
     */
    private String tplUrls;

    /*
     * cat_mod:表示是运营设置的类目维度模块，usr_mod表示的是商家自定义模块。
     */
    private String type;

    public String getContent() {
        return content;
    }

    public String getIntros() {
        return intros;
    }

    public Number getModuleId() {
        return moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public Boolean getRequired() {
        return required;
    }

    public String getTplUrls() {
        return tplUrls;
    }

    public String getType() {
        return type;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setIntros(String intros) {
        this.intros = intros;
    }

    public void setModuleId(Number moduleId) {
        this.moduleId = moduleId;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public void setTplUrls(String tplUrls) {
        this.tplUrls = tplUrls;
    }

    public void setType(String type) {
        this.type = type;
    }
}
