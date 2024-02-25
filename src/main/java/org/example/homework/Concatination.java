package org.example.homework;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


// Написати анотацію, яка приймає параметри для методу. Написати код який викличе метод з цією анотацією і
// передасть параметри в викликаний метод

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Concatination {

    String name();
    long number ();

    String text ();

    int age();

}
