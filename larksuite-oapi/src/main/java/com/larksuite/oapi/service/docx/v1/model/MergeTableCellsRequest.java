// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.docx.v1.model;
import com.google.gson.annotations.SerializedName;

public class MergeTableCellsRequest {
    @SerializedName("row_start_index")
    private Integer rowStartIndex;
    @SerializedName("row_end_index")
    private Integer rowEndIndex;
    @SerializedName("column_start_index")
    private Integer columnStartIndex;
    @SerializedName("column_end_index")
    private Integer columnEndIndex;

    public Integer getRowStartIndex() {
        return this.rowStartIndex;
    }

    public void setRowStartIndex(Integer rowStartIndex) {
        this.rowStartIndex = rowStartIndex;
    }

    public Integer getRowEndIndex() {
        return this.rowEndIndex;
    }

    public void setRowEndIndex(Integer rowEndIndex) {
        this.rowEndIndex = rowEndIndex;
    }

    public Integer getColumnStartIndex() {
        return this.columnStartIndex;
    }

    public void setColumnStartIndex(Integer columnStartIndex) {
        this.columnStartIndex = columnStartIndex;
    }

    public Integer getColumnEndIndex() {
        return this.columnEndIndex;
    }

    public void setColumnEndIndex(Integer columnEndIndex) {
        this.columnEndIndex = columnEndIndex;
    }

}
