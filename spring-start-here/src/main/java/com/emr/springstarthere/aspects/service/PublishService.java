package com.emr.springstarthere.aspects.service;

import com.emr.springstarthere.aspects.model.Comment;
import org.springframework.stereotype.Service;

@Service
public class PublishService {

    public void publish(Comment comment){
        System.err.println(comment);
    }
}
