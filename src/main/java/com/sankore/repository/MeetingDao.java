package com.sankore.repository;

import com.sankore.model.Meeting;
import org.springframework.data.repository.CrudRepository;

public interface MeetingDao extends CrudRepository<Meeting, Long> {
}
