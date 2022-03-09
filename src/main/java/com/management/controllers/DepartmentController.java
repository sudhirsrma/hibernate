package com.management.controllers;

import com.management.entity.Department;
import com.management.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentRepository departmentRepository;

    @PostMapping("/save")
    public void save(@RequestBody Department department) {
        departmentRepository.save(department);
    }

}
