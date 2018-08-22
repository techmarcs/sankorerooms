package com.sankore.service.contract;

import com.sankore.model.Department;

public interface DepartmentServiceContract {
    Department createDepartment(Department department);
    Department updateDepartment(Department department);
    Department deleteDepartment(Department department);
}
