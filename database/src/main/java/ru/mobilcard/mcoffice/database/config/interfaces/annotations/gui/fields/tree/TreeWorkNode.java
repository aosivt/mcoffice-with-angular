package ru.mobilcard.mcoffice.database.config.interfaces.annotations.gui.fields.tree;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TreeWorkNode {
    public RootTreeWorkNode root();
    public String name();
    public String action() default "";
    public String icon() default "";
}
