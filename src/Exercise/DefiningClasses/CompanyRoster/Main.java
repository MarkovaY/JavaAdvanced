package Exercise.DefiningClasses.CompanyRoster;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the amount of employees we will be given
        int countEmployees = Integer.parseInt(scanner.nextLine());

        // Creating list with departments
        List<Department> departments = new ArrayList<>();

        for (int i = 0; i < countEmployees; i++) {

            // Reading the overall info about each employee
            String[] info = scanner.nextLine().split("\\s+");

            // Reading name, salary, position, department
            String name = info[0];
            double salary = Double.parseDouble(info[1]);
            String position = info[2];
            String employeeDepartment = info[3];

            // Creating a null employee object
            Employee employee = null;

            // Looking for additional data about each employee (age and mail, or only age/mail)
            switch (info.length) {
                case 4:
                    employee = new Employee(name, salary, position, employeeDepartment);
                    break;
                case 5:
                    // Has mail
                    if (info[4].contains("@")) {
                        String email = info[4];
                        employee = new Employee(name, salary, position, employeeDepartment, email);
                        // Has age
                    } else {
                        int age = Integer.parseInt(info[4]);
                        employee = new Employee(name, salary, position, employeeDepartment, age);
                    }
                    break;
                case 6:
                    // Has age and mail
                    String email = info[4];
                    int age = Integer.parseInt(info[5]);
                    employee = new Employee(name, salary, position, employeeDepartment, email, age);
                    break;
            }
            boolean departmentExists = departments.stream().anyMatch(department -> department.getName().equals(employeeDepartment));
            // Checking whether the department exists
            if (!departmentExists) {
                Department department = new Department(employeeDepartment);
                departments.add(department);
            }

            // Adding the employees in the departments
            Department currentDepartment = departments.stream().filter(dep -> dep.getName().equals(employeeDepartment)).findFirst().get();
            currentDepartment.getEmployees().add(employee);

        }

        // Finding the highest paid department
        Department highestPaidDepartment = departments.stream().max(Comparator.comparingDouble(Department::calculateAverageSalary)).get();

        // Printing end results
        System.out.printf("Highest Average Salary: %s%n", highestPaidDepartment.getName());
        highestPaidDepartment.getEmployees().stream().sorted((first, second) -> Double.compare(second.getSalary(), first.getSalary())).forEach(System.out::println);
    }
}