package ru.mobilcard.restservice.controlls.models.cbo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.GsonBuilder;
import net.bytebuddy.description.method.MethodDescription;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.AutoConfigureMybatis;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.boot.autoconfigure.gson.GsonBuilderCustomizer;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;






import org.junit.Test;
import org.junit.runner.RunWith;

import org.mybatis.spring.boot.test.autoconfigure.AutoConfigureMybatis;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.http.converter.json.GsonFactoryBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.web.method.HandlerMethod;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;

import ru.mobilcard.restservice.SpringApplicationInit;
import ru.mobilcard.restservice.WebSocketConfig;
import ru.mobilcard.restservice.models.cbo.BankModel;
import ru.mobilcard.restservice.models.interfaces.Model;


import java.lang.reflect.Type;
import java.util.List;
import java.util.Set;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest
//@TestPropertySource(properties=
//        {"spring.autoconfigure.exclude=comma.seperated.ClassNames,ru.mobilcard.restservice.WebSocketConfig.java"})
//@SpringBootTest(classes = SpringApplicationInit.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
//@EnableAutoConfiguration(exclude = WebSocketConfig.class)
//@SpringBootTest(classes={SpringApplicationInit.class})

public abstract class BaseTestController {

    @Autowired
    protected MockMvc mvc;

    @Autowired
    protected GsonBuilder gsonBuilder;

    protected abstract String getRootPathUrl();

    @Test
    public void selectCollection() throws Exception {
        MvcResult result = this.mvc.perform(post(getRootPathUrl().concat("/collection")))
                .andExpect(status().isOk())
                .andExpect(mvcResult -> mvcResult.getResponse().getContentType()
                                            .equals(MediaType.APPLICATION_JSON))
                                            .andReturn();
        assertTypeModel(result.getResponse().getContentAsString());
    }

    protected abstract void assertTypeModel(String responseContent);

}

