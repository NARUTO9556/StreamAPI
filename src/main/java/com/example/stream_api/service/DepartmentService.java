package com.example.stream_api.service;

import com.example.stream_api.model.Employee;

import java.util.List;
import java.util.Map;

public interface DepartmentService {
    Employee getEmployeeWithMaxSalary(Integer department);
    Employee getEmployeeWithMinSalary(Integer department);
    Map<Integer, List<Employee>> getEmployeeByDepartment(Integer department);
}
