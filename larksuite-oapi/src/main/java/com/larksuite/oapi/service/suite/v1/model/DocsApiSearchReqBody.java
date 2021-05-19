// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.suite.v1.model;
import com.google.gson.annotations.SerializedName;

public class DocsApiSearchReqBody {
    @SerializedName("search_key")
    private String searchKey;
    @SerializedName("count")
    private Integer count;
    @SerializedName("offset")
    private Integer offset;
    @SerializedName("owner_ids")
    private String[] ownerIds;
    @SerializedName("chat_ids")
    private String[] chatIds;
    @SerializedName("docs_types")
    private String docsTypes;

    public String getSearchKey() {
        return this.searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    public Integer getCount() {
        return this.count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getOffset() {
        return this.offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public String[] getOwnerIds() {
        return this.ownerIds;
    }

    public void setOwnerIds(String[] ownerIds) {
        this.ownerIds = ownerIds;
    }

    public String[] getChatIds() {
        return this.chatIds;
    }

    public void setChatIds(String[] chatIds) {
        this.chatIds = chatIds;
    }

    public String getDocsTypes() {
        return this.docsTypes;
    }

    public void setDocsTypes(String docsTypes) {
        this.docsTypes = docsTypes;
    }

}