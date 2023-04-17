package by.it.academy.hw17.Task2;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@java.lang.annotation.Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Retention {
    String year() default "";
}