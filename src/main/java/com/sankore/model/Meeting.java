package com.sankore.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by josephmarcus on 22/08/2018.
 */
@Entity
@Table(name= "meeting")
public class Meeting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "meeting_room_id")
    private MeetingRoom meetingRoom;
    @OneToOne
    @JoinColumn(name = "schedule_id")
    private MeetingSchedule meetingSchedule;
    @Column(nullable = false)
    private String name;
    @Transient
    private List<User> attendees;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public MeetingRoom getMeetingRoom() {
        return meetingRoom;
    }

    public void setMeetingRoom(MeetingRoom meetingRoom) {
        this.meetingRoom = meetingRoom;
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
