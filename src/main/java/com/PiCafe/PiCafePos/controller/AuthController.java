package com.PiCafe.PiCafePos.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import lombok.extern.slf4j.Slf4j;


import com.PiCafe.PiCafePos.entities.Employee;
import com.PiCafe.PiCafePos.entities.LoginRequest;
import com.PiCafe.PiCafePos.service.AuthService;

@RestController
@RequestMapping("/api")
public class AuthController {
    private static final Logger log = LoggerFactory.getLogger(AuthController.class);
    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@org.jetbrains.annotations.NotNull @RequestBody LoginRequest request) {
        Employee employee = authService.authenticate(request.getEmployeeId(), request.getPassword());
        if (employee != null) {
            log.info(employee.getId() + " " + employee.getPassword());
            return ResponseEntity.ok(employee);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }
}
