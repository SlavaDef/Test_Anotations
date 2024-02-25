package org.example.exapleInternet.company;

import java.lang.annotation.*;

@Documented // анотація буде відображатися в JavaDoc-документації
@Inherited // анатація дозволить наслідування іншим класам
@Target(ElementType.TYPE) // відповідає за клас
@Retention(RetentionPolicy.RUNTIME)
public @interface Company {
    String name() default "AMD";
    String city() default "New York";
}
