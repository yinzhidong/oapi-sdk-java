// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.docx.v1.model;
import com.google.gson.annotations.SerializedName;

public class Text {
    @SerializedName("style")
    private TextStyle style;
    @SerializedName("elements")
    private TextElement[] elements;

    public TextStyle getStyle() {
        return this.style;
    }

    public void setStyle(TextStyle style) {
        this.style = style;
    }

    public TextElement[] getElements() {
        return this.elements;
    }

    public void setElements(TextElement[] elements) {
        this.elements = elements;
    }

}
