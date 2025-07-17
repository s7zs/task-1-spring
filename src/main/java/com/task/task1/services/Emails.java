package com.task.task1.services;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.task.task1.Messageservice;

@Component
@Primary
public class Emails implements Messageservice{

    @Override
    public String getmessage() {
        return "you got an email";
    }
}
