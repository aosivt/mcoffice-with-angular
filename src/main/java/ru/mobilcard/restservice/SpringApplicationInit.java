package ru.mobilcard.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class SpringApplicationInit {
    public static void main(String[] args) {
        SpringApplication.run(SpringApplicationInit.class, args);
    }
}