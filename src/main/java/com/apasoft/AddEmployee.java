package com.apasoft;

import java.util.List;
import java.util.Scanner;

public class AddEmployee {
    public static void addEmployee(List<Employee> employees, Scanner scanner) {
        System.out.println("Enter employee code:");
        String code = scanner.nextLine();
        System.out.println("Enter employee name:");
        String name = scanner.nextLine();
        System.out.println("Enter employee age:");
        int age = Integer.parseInt(scanner.nextLine());

        Employee newEmployee = new Employee(code, name, age);
        employees.add(newEmployee);
        System.out.println("Employee added successfully.");
    }
}