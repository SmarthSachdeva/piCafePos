package com.PiCafe.PiCafePos.service;

import com.PiCafe.PiCafePos.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findByEmployeeIdAndPassword(Long employeeId, String password);
}
