package com.task.task1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.task.task1.services.Messageservice;

import com.task.task1.Messageservice;

@RestController
public class HomeController {

    private final Messageservice messageservice;

    // Constructor injection
    @Autowired
    public HomeController(@Qualifier("notfications") Messageservice messageservice) {
        this.messageservice = messageservice;
    }

    @GetMapping("/message")
    public String showMessage() {
        return messageservice.getmessage();
    }
}
