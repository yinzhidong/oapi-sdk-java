// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.docx.v1.model;
import com.google.gson.annotations.SerializedName;

public class UpdateTablePropertyRequest {
    @SerializedName("column_width")
    private Integer columnWidth;
    @SerializedName("column_index")
    private Integer columnIndex;

    public Integer getColumnWidth() {
        return this.columnWidth;
    }

    public void setColumnWidth(Integer columnWidth) {
        this.columnWidth = columnWidth;
    }

    public Integer getColumnIndex() {
        return this.columnIndex;
    }

    public void setColumnIndex(Integer columnIndex) {
        this.columnIndex = columnIndex;
    }

}