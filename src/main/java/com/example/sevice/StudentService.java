package com.example.sevice;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    public List<Student> saveStudents(List<Student> Students) {
        return repository.saveAll(Students);
    }

    public List<Student> getStudents() {
        return repository.findAll();
    }

    public Student getStudentById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Student getStudentByName(String name) {
        return repository.findByName(name);
    }

    public String deleteStudent(int id) {
        repository.deleteById(id);
        return "Student removed !! " + id;
    }

    public Student updateStudent(Student Student) {
        Student existingStudent = repository.findById(Student.getId()).orElse(null);
        existingStudent.setName(Student.getName());
        existingStudent.setAge(Student.getAge());
        existingStudent.setCourse(Student.getCourse());
        existingStudent.setFees(Student.getFees());
        return repository.save(existingStudent);
    }
}
