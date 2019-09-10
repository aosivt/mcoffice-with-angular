package ru.mobilcard.mcoffice.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class SpringApplicationInit {
    public static void main(String[] args) {
        SpringApplication.run(SpringApplicationInit.class, args);
    }
}