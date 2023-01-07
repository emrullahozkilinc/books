package com.emr.springstarthere.aspects;

import com.emr.springstarthere.aspects.config.AspectConfig;
import com.emr.springstarthere.aspects.model.Comment;
import com.emr.springstarthere.aspects.service.PublishService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AspectConfig.class);

        var obj = context.getBean(PublishService.class);

        Comment comment = new Comment();
        comment.setAuthor("asca");
        comment.setText("vvv");

        obj.publish(comment);
    }
}
