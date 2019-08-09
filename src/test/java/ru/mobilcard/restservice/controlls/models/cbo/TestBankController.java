package ru.mobilcard.restservice.controlls.models.cbo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.AutoConfigureMybatis;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJson;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import ru.mobilcard.restservice.TestConfig;
import ru.mobilcard.restservice.models.cbo.BankModel;
import ru.mobilcard.restservice.models.interfaces.Model;


import java.lang.reflect.Type;
import java.util.List;
import java.util.Objects;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


//@WebMvcTest
//@AutoConfigureMybatis
//@ActiveProfiles("test")
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = TestConfig.class)
//@WebAppConfiguration
//@RunWith(SpringJUnit4ClassRunner.class)
//@WebMvcTest
//@AutoConfigureMybatis
public class TestBankController extends BaseTestController {

    private static final String ROOT_PATH = "/bank";

    @Override
    protected String getRootPathUrl() {
        return ROOT_PATH;
    }

    @Override
    protected void assertTypeModel(String responseContent) {
        try {
            BankModel[] b = gsonBuilder.create().fromJson(responseContent, BankModel[].class);
        } catch (JsonSyntaxException e){
            Assert.fail();
        }
    }
}
