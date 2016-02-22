package com.taobao.api.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WeitaoCloudtagsGroupCustomAddResponse;

/**
 * TOP API: taobao.weitao.cloudtags.group.custom.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:48
 */
public class WeitaoCloudtagsGroupCustomAddRequest
        implements TaobaoUploadRequest<WeitaoCloudtagsGroupCustomAddResponse> {

    /**
     * 所要创建自定义分组的描述<br />
     * 支持最大长度为：256<br />
     * 支持的最大列表长度为：256
     */
    private String groupDesc;

    /**
     * 想要创建的自定义分组名称<br />
     * 支持最大长度为：32<br />
     * 支持的最大列表长度为：32
     */
    private String groupName;

    private Map<String, String> headerMap = new TaobaoHashMap();

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    /**
     * 上传的文件内容转换成的字节数组。文件需要使用UTF-8编码方式编写。其中内容为用户id或手机号用英文逗号连接起来的单行文本。<br />
     * 支持的最大列表长度为：2097152
     */
    private FileItem userListFileContent;

    @Override
    public void check() throws ApiRuleException {

        RequestCheckUtils.checkNotEmpty(groupDesc, "groupDesc");
        RequestCheckUtils.checkMaxLength(groupDesc, 256, "groupDesc");
        RequestCheckUtils.checkNotEmpty(groupName, "groupName");
        RequestCheckUtils.checkMaxLength(groupName, 32, "groupName");
        RequestCheckUtils.checkNotEmpty(userListFileContent, "userListFileContent");
        RequestCheckUtils.checkMaxLength(userListFileContent, 2097152, "userListFileContent");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.weitao.cloudtags.group.custom.add";
    }

    @Override
    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap<String, FileItem>();
        params.put("user_list_file_content", this.userListFileContent);
        return params;
    }

    public String getGroupDesc() {
        return this.groupDesc;
    }

    public String getGroupName() {
        return this.groupName;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<WeitaoCloudtagsGroupCustomAddResponse> getResponseClass() {
        return WeitaoCloudtagsGroupCustomAddResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("group_desc", this.groupDesc);
        txtParams.put("group_name", this.groupName);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public FileItem getUserListFileContent() {
        return this.userListFileContent;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setUserListFileContent(FileItem userListFileContent) {
        this.userListFileContent = userListFileContent;
    }
}
