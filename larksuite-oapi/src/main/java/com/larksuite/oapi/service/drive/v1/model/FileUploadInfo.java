// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.drive.v1.model;
import com.google.gson.annotations.SerializedName;

public class FileUploadInfo {
    @SerializedName("file_name")
    private String fileName;
    @SerializedName("parent_type")
    private String parentType;
    @SerializedName("parent_node")
    private String parentNode;
    @SerializedName("size")
    private Integer size;

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getParentType() {
        return this.parentType;
    }

    public void setParentType(String parentType) {
        this.parentType = parentType;
    }

    public String getParentNode() {
        return this.parentNode;
    }

    public void setParentNode(String parentNode) {
        this.parentNode = parentNode;
    }

    public Integer getSize() {
        return this.size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

}
