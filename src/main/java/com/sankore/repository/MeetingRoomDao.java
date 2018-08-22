package com.sankore.repository;

import com.sankore.model.MeetingRoom;
import org.springframework.data.repository.CrudRepository;

public interface MeetingRoomDao extends CrudRepository<MeetingRoom, Long> {
}
