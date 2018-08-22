package com.sankore.service;

import com.sankore.model.Meeting;
import com.sankore.model.MeetingSchedule;
import com.sankore.service.contract.SchedulingServiceContract;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by josephmarcus on 22/08/2018.
 */
@Service
public class SchedulingService implements SchedulingServiceContract{
    public MeetingSchedule schedule(MeetingSchedule meeting) {
        //TODO: confirm time is available
        //TODO: if time is not available, throw MeetingTimeUnavailableException
        //TODO: if time is available, my guy should save
        return null;
    }

    public MeetingSchedule cancel(MeetingSchedule meeting) {
        //TODO: change status to CANCELLED, shikenah
        return null;
    }

    public MeetingSchedule reschedule(MeetingSchedule meeting) {
        //TODO: call schedule, yowa
        return null;
    }

}
