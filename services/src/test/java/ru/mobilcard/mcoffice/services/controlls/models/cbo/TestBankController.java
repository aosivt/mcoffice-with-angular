package ru.mobilcard.mcoffice.services.controlls.models.cbo;

import com.google.gson.JsonSyntaxException;
import org.junit.Assert;
import ru.mobilcard.mcoffice.database.models.cbo.BankModel;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;


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
