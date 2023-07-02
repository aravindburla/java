package com.example.controller;

import com.example.entity.Student;
import com.example.entity.Tweets;
import com.example.entity.User;
import com.example.sevice.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class StudentController {
    @Autowired
    private StudentService service;

    @PostMapping("/adduser")
    public Student addStudent(@RequestBody User user) {
        return service.saveUser(user);
    }

    @GetMapping("/StudentById/{id}")
    public Student findTwettsById(@PathVariable int id) {
        return service.getTweetsById(id);
    }

    

    @PutMapping("/update")
    public Student updateTweets(@RequestBody Tweets tweets) {
        return service.updateTweet(tweets);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTweet(@PathVariable int id) {
        return service.deleteStudent(id);
    }
}
