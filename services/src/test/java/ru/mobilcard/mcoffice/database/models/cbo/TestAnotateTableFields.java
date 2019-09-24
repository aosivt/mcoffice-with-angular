package ru.mobilcard.mcoffice.database.models.cbo;

import com.google.gson.Gson;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import ru.mobilcard.mcoffice.database.config.interfaces.annotations.gui.fields.TableFields;
import ru.mobilcard.mcoffice.database.mappers.cbo.ArticleMapper;
import ru.mobilcard.mcoffice.services.controlls.config.BaseModelJsonRpcService;

import java.util.Arrays;
import java.util.stream.Collectors;


public class TestAnotateTableFields {

    @Test
    public void testAnotete(){
        var t = ArticleModel.class.getDeclaredFields();
        Assert.assertTrue(t.length > 0);

                Arrays.stream(ArticleModel.class.getDeclaredFields())
                        .map(field -> field.getDeclaredAnnotation(TableFields.class))
                        .forEach(f-> {
//                            f.annotationType().getEnumConstants()
                            System.out.println(f.annotationType().getDeclaredMethods());
                        });
//        Assert.assertTrue(temp.size() == 14);
    }
}
