package com.PiCafe.PiCafePos.service;

import com.PiCafe.PiCafePos.entities.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthService {

    private static final List<Employee> hardcodedEmployees = new ArrayList<>();

    static {
        // Initialize hardcoded employees
        hardcodedEmployees.add(new Employee(1001L, "John Doe", "password123", "Manager"));
        hardcodedEmployees.add(new Employee(1002L, "Jane Smith", "abc123", "Clerk"));
        hardcodedEmployees.add(new Employee(1003L, "Alice Johnson", "qwerty", "Sales Associate"));
        hardcodedEmployees.add(new Employee(1004L, "Bob Anderson", "letmein", "Assistant Manager"));
        hardcodedEmployees.add(new Employee(1005L, "Eva Brown", "password", "Cashier"));
        hardcodedEmployees.add(new Employee(1006L, "Michael Clark", "admin123", "Supervisor"));
        hardcodedEmployees.add(new Employee(1007L, "Samantha White", "securepwd", "Storekeeper"));
        hardcodedEmployees.add(new Employee(1008L, "David Lee", "pass123", "Shift Lead"));
        hardcodedEmployees.add(new Employee(1009L, "Emily Taylor", "hello123", "Customer Service Representative"));
        hardcodedEmployees.add(new Employee(1010L, "Ryan Martinez", "123456", "Inventory Manager"));
    }

    public Employee authenticate(Long employeeId, String password) {
        // Loop through the hardcoded employees to find a match
        for (Employee employee : hardcodedEmployees) {
            if (employee.getId().equals(employeeId) && employee.getPassword().equals(password)) {
                return employee; // Return the employee if credentials match
            }
        }
        return null; // Return null if no match is found
    }
}
