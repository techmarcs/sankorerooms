package com.sankore.repository;

import com.sankore.model.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentDao extends CrudRepository<Department, Long> {
    Department findByName(String name);
}
