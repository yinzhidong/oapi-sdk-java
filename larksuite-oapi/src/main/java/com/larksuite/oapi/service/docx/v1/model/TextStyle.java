// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.docx.v1.model;
import com.google.gson.annotations.SerializedName;

public class TextStyle {
    @SerializedName("align")
    private Integer align;
    @SerializedName("done")
    private Boolean done;
    @SerializedName("folded")
    private Boolean folded;
    @SerializedName("language")
    private Integer language;
    @SerializedName("wrap")
    private Boolean wrap;

    public Integer getAlign() {
        return this.align;
    }

    public void setAlign(Integer align) {
        this.align = align;
    }

    public Boolean getDone() {
        return this.done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public Boolean getFolded() {
        return this.folded;
    }

    public void setFolded(Boolean folded) {
        this.folded = folded;
    }

    public Integer getLanguage() {
        return this.language;
    }

    public void setLanguage(Integer language) {
        this.language = language;
    }

    public Boolean getWrap() {
        return this.wrap;
    }

    public void setWrap(Boolean wrap) {
        this.wrap = wrap;
    }

}