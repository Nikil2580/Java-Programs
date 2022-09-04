package AJP_assignment_1;

import java.util.*;

class Employee {
    private int empid, age;
    private String name, emptype;

    public Employee(String name, int age, int empid, String emptype) {
        this.name = name;
        this.age = age;
        this.empid = empid;
        this.emptype = emptype;
    }

    void display1() {
        System.out.println("\nDetails:");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Name          : " + name);
        System.out.println("Age           : " + age);
        System.out.println("Employee ID   : " + empid);
        System.out.println("Employee Type : " + emptype);
    }
}

class FullTimeEmployee extends Employee {
    double salary;

    public FullTimeEmployee(String name, int age, int empid, String emptype, double salary) {
        super(name, age, empid, emptype);
        this.salary = salary;
    }

    void display2() {
        System.out.println("Salary        : " + salary);
    }
}

class PartTimeEmployee extends FullTimeEmployee {
    double hourlywages;

    public PartTimeEmployee(String name, int age, int empid, String emptype, double salary, double hourlywages) {
        super(name, age, empid, emptype, salary);
        this.hourlywages = hourlywages;
    }

    public void display3() {
        System.out.println("Hourly Wages  : " + hourlywages);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }
}

public class company {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, emptype;
        int empid, age;
        double salary, hourlywages;
        System.out.println("\nEnter the name :");
        name = sc.nextLine();
        System.out.println("\nEnter the employee Type :");
        emptype = sc.nextLine();
        System.out.println("\nEnter the age:");
        age = sc.nextInt();
        System.out.println("\nEnter employee id:");
        empid = sc.nextInt();
        System.out.println("\nEnter the salary:");
        salary = sc.nextDouble();
        System.out.println("\nEnter the hourly wages:");
        hourlywages = sc.nextDouble();
        PartTimeEmployee obj = new PartTimeEmployee(name, age, empid, emptype, salary, hourlywages);
        obj.display1();
        obj.display2();
        obj.display3();
        sc.close();
    }
}