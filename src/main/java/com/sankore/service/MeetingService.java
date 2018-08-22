package com.sankore.service;

import com.sankore.model.Meeting;
import com.sankore.model.MeetingStatus;
import com.sankore.service.contract.MeetingServiceContract;

import java.util.Date;
import java.util.List;

public class MeetingService implements MeetingServiceContract {

    public List<Meeting> getMeeting(Date from, Date to) {
        return null;
    }

    public List<Meeting> getMeetingByStatus(MeetingStatus status) {
        //TODO: Get the status of the meeting from Meeting status and return that
        return null;
    }

    public Meeting createMeeting(Meeting meeting) {
        return null;
    }
}
