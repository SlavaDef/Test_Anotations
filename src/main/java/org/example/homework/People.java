package org.example.homework;

public class People {

    @Concatination(name = "Bob number is: ", number = 95012312, text = ", age is ", age = 25)
    public static String res(String name, long number, String text, int age) {
        return name + number + text + age;
    }
}
