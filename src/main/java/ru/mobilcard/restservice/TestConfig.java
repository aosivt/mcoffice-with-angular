package ru.mobilcard.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import ru.mobilcard.restservice.fasades.BaseFacade;


@Profile("test")
@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(
        basePackages="ru.mobilcard.restservice",
        excludeFilters = {
                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,
                        value = {
                                WebSocketConfig.class,
                        })
        })
public class TestConfig {

    @Autowired
    private Environment env;
//
//    @Bean
//    public BaseFacade getBaseFacadeForTest(){
//        return new BaseFacade();
//    }
//
//
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }
}