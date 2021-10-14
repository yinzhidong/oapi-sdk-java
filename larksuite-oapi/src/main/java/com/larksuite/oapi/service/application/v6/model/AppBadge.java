// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.application.v6.model;
import com.google.gson.annotations.SerializedName;

public class AppBadge {
    @SerializedName("user_id")
    private Long userId;
    @SerializedName("version")
    private Long version;
    @SerializedName("pc")
    private ClientBadgeNum pc;
    @SerializedName("mobile")
    private ClientBadgeNum mobile;

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getVersion() {
        return this.version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public ClientBadgeNum getPc() {
        return this.pc;
    }

    public void setPc(ClientBadgeNum pc) {
        this.pc = pc;
    }

    public ClientBadgeNum getMobile() {
        return this.mobile;
    }

    public void setMobile(ClientBadgeNum mobile) {
        this.mobile = mobile;
    }

}