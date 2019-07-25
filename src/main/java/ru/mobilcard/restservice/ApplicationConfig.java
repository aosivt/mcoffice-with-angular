package ru.mobilcard.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import ru.mobilcard.restservice.utils.MyBatisUtils;


@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationConfig {

    @Autowired
    private Environment env;

    @Bean
    public MyBatisUtils getMyBatisUtils(){
        return new MyBatisUtils();
    }


    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}