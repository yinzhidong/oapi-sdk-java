// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.docx.v1.model;
import com.google.gson.annotations.SerializedName;

public class DocumentBlockBatchUpdateReqBody {
    @SerializedName("requests")
    private UpdateBlockRequest[] requests;

    public UpdateBlockRequest[] getRequests() {
        return this.requests;
    }

    public void setRequests(UpdateBlockRequest[] requests) {
        this.requests = requests;
    }

}
