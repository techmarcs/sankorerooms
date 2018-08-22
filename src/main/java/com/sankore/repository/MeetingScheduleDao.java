package com.sankore.repository;

import com.sankore.model.MeetingSchedule;
import org.springframework.data.repository.CrudRepository;

public interface MeetingScheduleDao extends CrudRepository<MeetingSchedule, Long> {
}
