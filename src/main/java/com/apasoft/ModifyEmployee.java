package com.apasoft;

import java.util.List;
import java.util.Scanner;

public class ModifyEmployee {
    public static void modifyEmployee(List<Employee> employees, Scanner scanner) {
        System.out.println("Enter employee code to modify:");
        String code = scanner.nextLine();

        for (Employee emp : employees) {
            if (emp.getCode().equals(code)) {
                System.out.println("Enter new name (or press enter to keep current):");
                String name = scanner.nextLine();
                if (!name.isEmpty()) {
                    emp.setName(name);
                }

                System.out.println("Enter new age (or press enter to keep current):");
                String ageStr = scanner.nextLine();
                if (!ageStr.isEmpty()) {
                    emp.setAge(Integer.parseInt(ageStr));
                }

                System.out.println("Employee modified successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
}