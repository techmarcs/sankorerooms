package com.sankore.service.contract;

import com.sankore.model.Meeting;
import com.sankore.model.MeetingStatus;

import java.util.Date;
import java.util.List;

public interface MeetingServiceContract {
    List<Meeting> getMeeting(Date from, Date to);
    List<Meeting> getMeetingByStatus(MeetingStatus status);
    Meeting createMeeting (Meeting meeting);


}
