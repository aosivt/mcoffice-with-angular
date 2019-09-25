package ru.mobilcard.mcoffice.database.config.interfaces.annotations.gui.fields;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TableFields {
    public TableField[] fields();
}
