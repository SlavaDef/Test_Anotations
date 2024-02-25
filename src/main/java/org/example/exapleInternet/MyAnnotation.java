package org.example.exapleInternet;

import java.lang.annotation.*;

@Inherited
@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String firstParam() default "first";

    String secondParam() default "second";
}
