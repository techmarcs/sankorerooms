package com.sankore.service;

import com.sankore.model.Meeting;
import com.sankore.service.contract.SchedulingServiceContract;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by josephmarcus on 22/08/2018.
 */
@Service
public class SchedulingService implements SchedulingServiceContract{
    public Meeting schedule(Meeting meeting) {
        //TODO: confirm time is available
        //TODO: if time is not available, throw MeetingTimeUnavailableException
        //TODO: if time is available, my guy should save
        return null;
    }

    public Meeting cancel(Meeting meeting) {
        //TODO: change status to CANCELLED, shikenah
        return null;
    }

    public Meeting reschedule(Meeting meeting) {
        //TODO: call schedule, yowa
        return null;
    }

}
