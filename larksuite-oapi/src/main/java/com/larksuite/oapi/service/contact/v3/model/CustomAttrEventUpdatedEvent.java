// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.event.model.BaseEventV2;

public class CustomAttrEventUpdatedEvent extends BaseEventV2{
    @SerializedName("event")
    private CustomAttrEventUpdatedEventData event;

    public CustomAttrEventUpdatedEventData getEvent() {
        return this.event;
    }

    public void setEvent(CustomAttrEventUpdatedEventData event) {
        this.event = event;
    }

}