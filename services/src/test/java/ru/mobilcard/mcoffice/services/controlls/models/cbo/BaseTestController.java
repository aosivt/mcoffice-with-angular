package ru.mobilcard.mcoffice.services.controlls.models.cbo;

import com.google.gson.GsonBuilder;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;






import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest
//@TestPropertySource(properties=
//        {"spring.autoconfigure.exclude=comma.seperated.ClassNames,WebSocketConfig.java"})
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

