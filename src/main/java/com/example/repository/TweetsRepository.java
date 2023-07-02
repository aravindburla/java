package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Tweets;

public interface TweetRepository extends JpaRepository<TweetRepository,Integer> {
}
