package com.management.controllers;

import com.management.entity.Student;
import com.management.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping("get/{id}")
    public Student getStudent(@PathVariable long id) {
        return studentService.getStudent(id);
    }

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return "successfully added"+student ;
    }

    @PutMapping("/updateStudent/{id}")
   public String updateStudent(@RequestBody Student student,@PathVariable long id){
        studentService.updateStudent(student,id);
         return "successfully updated at "+id ;
    }
   @DeleteMapping ("/deleteStudent/{id}")
   public String deleteStudent(@PathVariable long id ){
        studentService.deleteStudent(id);
        return "successfully deleted with an id "+id ;
   }
}