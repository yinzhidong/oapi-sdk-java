// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.docx.v1.model;
import com.google.gson.annotations.SerializedName;

public class TableMergeInfo {
    @SerializedName("row_span")
    private Integer rowSpan;
    @SerializedName("col_span")
    private Integer colSpan;

    public Integer getRowSpan() {
        return this.rowSpan;
    }

    public void setRowSpan(Integer rowSpan) {
        this.rowSpan = rowSpan;
    }

    public Integer getColSpan() {
        return this.colSpan;
    }

    public void setColSpan(Integer colSpan) {
        this.colSpan = colSpan;
    }

}
