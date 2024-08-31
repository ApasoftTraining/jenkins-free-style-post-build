package com.apasoft;

import java.util.List;
import java.util.Scanner;

public class RemoveEmployee {
    public static void removeEmployee(List<Employee> employees, Scanner scanner) {
        System.out.println("Enter employee code to remove:");
        String code = scanner.nextLine();

        boolean removed = employees.removeIf(emp -> emp.getCode().equals(code));
        if (removed) {
            System.out.println("Employee removed successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }
}