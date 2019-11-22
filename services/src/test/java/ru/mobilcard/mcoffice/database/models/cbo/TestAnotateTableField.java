package ru.mobilcard.mcoffice.database.models.cbo;

import org.junit.Assert;
import org.junit.Test;
import ru.mobilcard.mcoffice.database.config.interfaces.annotations.gui.fields.table.TableField;

import java.util.Arrays;


public class TestAnotateTableField {

    @Test
    public void testAnotete(){
        var t = ArticleModel.class.getDeclaredFields();
        Assert.assertTrue(t.length > 0);

                Arrays.stream(ArticleModel.class.getDeclaredFields())
                        .map(field -> field.getDeclaredAnnotation(TableField.class))
                        .forEach(f-> {
//                            f.annotationType().getEnumConstants()
                            System.out.println(f.annotationType().getDeclaredMethods());
                        });
//        Assert.assertTrue(temp.size() == 14);
    }
}
