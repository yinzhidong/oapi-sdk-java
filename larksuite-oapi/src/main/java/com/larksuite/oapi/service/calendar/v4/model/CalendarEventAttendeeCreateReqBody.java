// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.calendar.v4.model;
import com.google.gson.annotations.SerializedName;

public class CalendarEventAttendeeCreateReqBody {
    @SerializedName("attendees")
    private CalendarEventAttendee[] attendees;

    public CalendarEventAttendee[] getAttendees() {
        return this.attendees;
    }

    public void setAttendees(CalendarEventAttendee[] attendees) {
        this.attendees = attendees;
    }

}