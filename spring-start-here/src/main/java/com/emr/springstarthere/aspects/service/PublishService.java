package com.emr.springstarthere.aspects.service;

import com.emr.springstarthere.aspects.annotation.ToLog;
import com.emr.springstarthere.aspects.model.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class PublishService {

    private Logger logger = Logger.getLogger(PublishService.class.getName());

    public void publish(Comment comment){
        System.err.println(comment);
    }

    @ToLog
    public void deleteComment(){
        logger.info("Delete comment worked!");
    }
}
