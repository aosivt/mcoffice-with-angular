package ru.mobilcard.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class SpringApplicationInit {


    public static void main(String[] args) {
        SpringApplication.run(SpringApplicationInit.class, args);
    }
}