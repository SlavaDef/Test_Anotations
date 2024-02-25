package org.example.exapleInternet;

public class Main2 {
    public static void main(String[] args) {


        Giraffe giraffe = new Giraffe();
        System.out.println(giraffe.getClass());

        final Class<?> cls = Giraffe.class; // обьект класу

        if (cls.isAnnotationPresent(Mammal.class)) { // якщо клас анатован такою анотацією
            System.out.println("Class is anotated");
        }

        Mammal mammal = cls.getAnnotation(Mammal.class); // обьект фнотації
        System.out.println(mammal.color() + " " + mammal.sound());

    }
}