package com.springframework.sdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Primary;
@Service
@Primary
@Profile("en")
public class MyServiceSecond implements com.springframework.sdi.service.Service {
    public String serviceMethod(){
        System.out.println("In MyServiceSecond serviceMethod");
        return "Kalyankar Rajesh Kumar";
    }

    public String serviceMethod2(){
        System.out.println("In MyServiceSecond  serviceMethod2");
        return "Kalyankar Rajesh Kumar";
    }
}
