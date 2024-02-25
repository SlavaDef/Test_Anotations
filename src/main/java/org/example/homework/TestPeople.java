package org.example.homework;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class TestPeople {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

      //  PeopleNameAndNumber people = new PeopleNameAndNumber();
        Class<People> cls = People.class; // also we can Class<?>
       // Method[] methods = cls.getDeclaredMethods(); // отримуємо масив всіх методів класу

        for (Method method : cls.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Concatination.class)) {
                Concatination con = method.getAnnotation(Concatination.class);
                String res = (String) method.invoke(new People(), con.name(), con.number(), con.text(), con.age());
                System.out.println(res);

            }
        }
    }
}
