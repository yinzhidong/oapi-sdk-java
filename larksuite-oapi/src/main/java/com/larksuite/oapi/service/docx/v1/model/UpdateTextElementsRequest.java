// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.docx.v1.model;
import com.google.gson.annotations.SerializedName;

public class UpdateTextElementsRequest {
    @SerializedName("elements")
    private TextElement[] elements;

    public TextElement[] getElements() {
        return this.elements;
    }

    public void setElements(TextElement[] elements) {
        this.elements = elements;
    }

}
