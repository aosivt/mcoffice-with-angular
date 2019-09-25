package ru.mobilcard.mcoffice.database.config.interfaces.annotations.gui.fields;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.String.format;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TableField {
    public String key();
    public String value();
    public boolean view() default false;
    public String typeDB() default "{}";
    public String defaultField() default "";
    public String typeView() default "TEXT";

}
