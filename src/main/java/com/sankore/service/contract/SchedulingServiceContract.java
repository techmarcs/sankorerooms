package com.sankore.service.contract;

import com.sankore.model.MeetingSchedule;

/**
 * Created by josephmarcus on 22/08/2018.
 */
public interface SchedulingServiceContract {

    MeetingSchedule schedule(MeetingSchedule meeting);

    MeetingSchedule cancel(MeetingSchedule meeting);

    MeetingSchedule reschedule(MeetingSchedule meeting);

}
