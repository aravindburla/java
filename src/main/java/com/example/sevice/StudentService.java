package com.example.sevice;

import com.example.entity.Student;
import com.example.entity.Tweets;
import com.example.entity.User;
import com.example.repository.StudentRepository;
import com.example.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TweetRepository tweetRepository;

    public User saveUser(User user) {
        return repository.save(student);
    }

    public List<Student> saveTwweets(Tweets tweets) {
        User user = userRepository.findById(tweets.getId()).orElse(null);
        if (null == user) {
            user = new User();
        }
        tweets.setDeptName(employee.getDepartment().getDeptName());
        tweets.setUser(user);
        return tweetRepository.save(tweets);
    }

    public List<Student> getTweets() {
        return tweetRepository.findAll();
    }

    public Student getTweetsById(int id) {
        return Tweets dept = tweetRepository.findById(id).orElse(null);

    }


    public String deleteTweets(int id) {
        tweetRepository.deleteById(id);
        return "tweet removed !! " + id;
    }

    public Tweets updateTweet(Tweets tweets) {
        Tweets existingTweet = tweetRepository.findById(tweets.getId()).orElse(null);
        existingTweet.setDescription(tweets.getDescription());
        
        return tweetRepository.save(existingTweet);
    }
}
