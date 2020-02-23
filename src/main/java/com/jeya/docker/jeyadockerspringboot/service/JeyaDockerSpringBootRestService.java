package com.jeya.docker.jeyadockerspringboot.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class JeyaDockerSpringBootRestService {

    @GetMapping
    public String hello(){
        return "Hello Jeyachandiran, welcome to my first spring boot application with docker installation";
    }
}
