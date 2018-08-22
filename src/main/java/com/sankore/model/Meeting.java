package com.sankore.model;

import java.util.Date;
import java.util.List;

/**
 * Created by josephmarcus on 22/08/2018.
 */
public class Meeting {
    private long id;
    private long meetingRoomId;
    private Date date;
    private Date startTime;
    private Date endTime;
    private int duration;
    private MeetingStatus status;
    private String name;
    private List<User> attendees;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMeetingRoomId() {
        return meetingRoomId;
    }

    public void setMeetingRoomId(long meetingRoomId) {
        this.meetingRoomId = meetingRoomId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public MeetingStatus getStatus() {
        return status;
    }

    public void setStatus(MeetingStatus status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<User> attendees) {
        this.attendees = attendees;
    }
}
