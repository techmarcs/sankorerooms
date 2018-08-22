package com.sankore.service.contract;

import com.sankore.model.Meeting;

/**
 * Created by josephmarcus on 22/08/2018.
 */
public interface SchedulingServiceContract {

    Meeting schedule(Meeting meeting);

    Meeting cancel(Meeting meeting);

    Meeting reschedule(Meeting meeting);

}
