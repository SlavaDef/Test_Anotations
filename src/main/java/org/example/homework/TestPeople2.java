package org.example.homework;


import org.example.exapleInternet.test_method.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;




// TO DO
public class TestPeople2 {

    public static void main(String[] args) {

       // People people = new People();

        Class<People>  people = People.class;

    /*    Annotation peopleAnnotation = people
                .getClass()  // ???? get metod
                .getAnnotation(Concatination.class);

       // Annotation annotation = method.getAnnotation(Concatination.class);

        Concatination con = (Concatination) peopleAnnotation; // == null */

       // System.out.println(con.name() + " " + con.number() + " " + con.text() + " " + con.age());
       // System.out.println(con.number());

        for (Method method : people.getDeclaredMethods()) {

            Annotation annotation = method.getAnnotation(Concatination.class);
            Concatination test = (Concatination) annotation;

            // If the annotation is not null
            if (test != null) {

                try {
                    method.invoke(people
                            .getDeclaredConstructor()
                            .newInstance());
                } catch (Throwable ex) {
                    System.out.println(ex.getCause());
                }

            }
        }

    }
}
