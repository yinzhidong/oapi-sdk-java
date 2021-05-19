// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.sheets.v2.model;
import com.google.gson.annotations.SerializedName;

public class Merge {
    @SerializedName("startRowIndex")
    private Integer startRowIndex;
    @SerializedName("startColumnIndex")
    private Integer startColumnIndex;
    @SerializedName("rowCount")
    private Integer rowCount;
    @SerializedName("columnCount")
    private Integer columnCount;

    public Integer getStartRowIndex() {
        return this.startRowIndex;
    }

    public void setStartRowIndex(Integer startRowIndex) {
        this.startRowIndex = startRowIndex;
    }

    public Integer getStartColumnIndex() {
        return this.startColumnIndex;
    }

    public void setStartColumnIndex(Integer startColumnIndex) {
        this.startColumnIndex = startColumnIndex;
    }

    public Integer getRowCount() {
        return this.rowCount;
    }

    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    public Integer getColumnCount() {
        return this.columnCount;
    }

    public void setColumnCount(Integer columnCount) {
        this.columnCount = columnCount;
    }

}