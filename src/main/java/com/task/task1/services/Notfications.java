package com.task.task1.services;
import org.springframework.stereotype.Component;

import com.task.task1.Messageservice;

@Component
public class Notfications implements Messageservice {

    @Override
    public String getmessage() {
        return "you got a Notfication";
    }
}
