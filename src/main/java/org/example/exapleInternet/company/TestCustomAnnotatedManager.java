package org.example.exapleInternet.company;

import java.lang.annotation.Annotation;

public class TestCustomAnnotatedManager {

    public static void main(String[] args) {

        CustomAnnotatedManager manager = new CustomAnnotatedManager(2, "Bob Doe");

        manager.getEmployeeDetails(); // метод гетер поверне інфо про емлоера

        Annotation companyAnnotation = manager
                .getClass()
                .getAnnotation(Company.class);
        Company company = (Company)companyAnnotation;

        System.out.println("Company Name: " + company.name());
        System.out.println("Company City: " + company.city());
    }
}
