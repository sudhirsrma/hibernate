package com.management.services;

import com.management.entity.Student;
import com.management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public Student getStudent(long id) {
        return studentRepository.getById(id);
    }

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public void updateStudent(Student student, long id) {
        studentRepository.save(student);
    }

    public void deleteStudent(long id) {
        studentRepository.deleteById(id);
    }


}


