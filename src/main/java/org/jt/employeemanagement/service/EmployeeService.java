package org.jt.employeemanagement.service;

import java.util.List;
import java.util.Optional;

import org.jt.employeemanagement.model.Employee;

public interface EmployeeService {
    /**
     * <h1>save Employee in to DB</h1>
     * <p>
     * This method take employee object as 
     * parameter and save it in to DB
     * </p>
     * 
     * @param org.jt.employeemanagement.model.Employee
     */
    void saveEmployee(Employee employee);

    List<Employee> getEmployees();

    void removeEmployeeById(String id);

    Optional<Employee> employeeById(String id);
}
