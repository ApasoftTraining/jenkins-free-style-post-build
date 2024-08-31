package com.apasoft;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagementApp {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Modify Employee");
            System.out.println("4. List Employees");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    AddEmployee.addEmployee(employees, scanner);
                    break;
                case 2:
                    RemoveEmployee.removeEmployee(employees, scanner);
                    break;
                case 3:
                    ModifyEmployee.modifyEmployee(employees, scanner);
                    break;
                case 4:
                    ListEmployees.listEmployees(employees);
                    break;
                case 5:
                    System.out.println("Exiting the application. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
