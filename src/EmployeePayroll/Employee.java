package EmployeePayroll;

import java.util.Scanner;

public abstract class Employee {
    private int employeeID;
    private String employeeName;
    private String employeeRole;
    private double basicSalary;
    private double allowance;

    public Employee(int employeeID, String employeeName, String employeeRole, double basicSalary, double allowance) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeRole = employeeRole;
        this.basicSalary = basicSalary;
        this.allowance = allowance;
    }

    // Getters
    public double getBasicSalary() {
        return basicSalary;
    }
    public double getAllowance() {
        return allowance;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public String getEmployeeRole() {
        return employeeRole;
    }

    // Abstract method for calculating total salary
    public abstract double calculateSalary();

    // Main method inside the abstract Employee class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Developer
        System.out.println("Enter this month's allowance for Developer:");
        double Allowance = sc.nextDouble();
        Developer developer = new Developer(101, "Prakriti", "Developer", 60000.0, Allowance);

        System.out.println("---------------------- EmployeePayroll Details --------------------------");
        System.out.println("Employee Name: " + developer.getEmployeeName());
        System.out.println("Role: " + developer.getEmployeeRole());
        System.out.println("Total Salary: " + developer.calculateSalary());

        //  Senior Developer
        System.out.println("Enter this month's Allowance for Senior Developer:");
        double SDAllowance = sc.nextDouble();
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper(102, "Sasha", "SeniorDeveloper", 70000.0, SDAllowance);

        System.out.println("---------------------- EmployeePayroll Details --------------------------");
        System.out.println("Employee Name: " + seniorDeveloper.getEmployeeName());
        System.out.println("Role: " + seniorDeveloper.getEmployeeRole());
        System.out.println("Total Salary: " + seniorDeveloper.calculateSalary());

        //  Team Lead
        System.out.println("Enter this month's Allowance for Team Lead:");
        double leadAllowance = sc.nextDouble();
        TeamLead teamLead = new TeamLead(103, "Alex", "TeamLead", 85000.0, leadAllowance);

        System.out.println("---------------------- EmployeePayroll Details --------------------------");
        System.out.println("Employee Name: " + teamLead.getEmployeeName());
        System.out.println("Role: " + teamLead.getEmployeeRole());
        System.out.println("Total Salary: " + teamLead.calculateSalary());

        sc.close();
    }
}