package com.springframework.sdi;

import com.springframework.sdi.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SdiApplication {

    public static void main(String[] args) {


        ApplicationContext applicationContext=SpringApplication.run(SdiApplication.class, args);

        MyController myController=(MyController)applicationContext.getBean("myController");
        myController.m1();
        myController.m2();
    }

}

