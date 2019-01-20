package com.springframework.sdi.controller;

import com.springframework.sdi.service.MyService;
import com.springframework.sdi.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private Service service;
    @Autowired
//    @Qualifier("myService")
    public void setMyService(Service service){
        this.service=service;
    }

//    MyController(@Qualifier("myService") Service service){
//        this.service=service;
//    }

    public String m1(){

        return service.serviceMethod();
    }
    public String m2(){

        return service.serviceMethod2();
    }
}
