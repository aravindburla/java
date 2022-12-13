package com.example.controller;

import com.example.entity.Student;
import com.example.sevice.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class StudentController {
    @Autowired
    private StudentService service;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student Student) {
        return service.saveStudent(Student);
    }

    @PostMapping("/addStudents")
    public List<Student> addStudents(@RequestBody List<Student> Students) {
        return service.saveStudents(Students);
    }

    @GetMapping("/Students")
    public List<Student> findAllStudents() {
        return service.getStudents();
    }

    @GetMapping("/StudentById/{id}")
    public Student findStudentById(@PathVariable int id) {
        return service.getStudentById(id);
    }

    @GetMapping("/Student/{name}")
    public Student findStudentByName(@PathVariable String name) {
        return service.getStudentByName(name);
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student Student) {
        return service.updateStudent(Student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        return service.deleteStudent(id);
    }
}
