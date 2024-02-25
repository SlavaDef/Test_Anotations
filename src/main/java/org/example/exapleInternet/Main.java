package org.example.exapleInternet;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

      /*  Main method = new Main();
        method.doWork();
        method.finish();
        method.start(); */

        Main dummyObj = new Main();
        Method[] methods = Main.class.getDeclaredMethods(); // отримуємо масив всіх методів класу
        List<Method> sortedMethods = Arrays.stream(methods)
                // фідфільтрували тільки по тим методам у яких є анотація CallSequence
                .filter(method -> method.isAnnotationPresent(CallSequence.class))
                // сортіровка аби всі методи сортирувалися від меншого до більшого
                .sorted(Comparator.comparing(method -> method.getAnnotation(CallSequence.class).position()))
                .toList();

        for (Method method : sortedMethods) {
            if (Modifier.isStatic(method.getModifiers())) { // якщо метод статичний виконаємо без обьекта
                method.invoke(null);

            } else { // якщо метод не статичний передаємо потрібний обьект
                method.invoke(dummyObj);
            }
        }


    }

    @CallSequence(position = Integer.MIN_VALUE) // метод завжди виконається першим
    public void start() {
        System.out.println("Starting doing something");
    }


    @CallSequence(position = Integer.MAX_VALUE) // метод завжди виконається останнім
    public void finish() {
        System.out.println("Stop working");
    }

    @CallSequence(position = 1)
    public void doWork() {
        System.out.println("Doing something");
    }


}
