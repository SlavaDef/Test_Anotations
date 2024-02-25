package org.example.exapleInternet.company;

import java.lang.annotation.Annotation;

public class TestCustomAnnotatedEmployee {

    public static void main(String[] args) {

        CustomAnnotatedEmployee employee = new CustomAnnotatedEmployee(1, "John Doe");

        employee.getEmployeeDetails(); // метод гетер поверне інфо про емлоера

        Annotation companyAnnotation = employee
                .getClass()
                .getAnnotation(Company.class);
        Company company = (Company)companyAnnotation;

        System.out.println("Company Name: " + company.name());
        System.out.println("Company City: " + company.city());
    }
}

