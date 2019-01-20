package com.springframework.sdi.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"es","default"})
@Primary
public class MyService implements com.springframework.sdi.service.Service {

    public String serviceMethod(){
        System.out.println("MyService serviceMethod");
        return "Kalyankar Rajesh Kumar";
    }

    public String serviceMethod2(){
        System.out.println("MyService serviceMethod2");
        return "Kalyankar Rajesh Kumar";
    }



}
