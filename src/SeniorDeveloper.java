package EmployeePayroll;

public class SeniorDeveloper extends Employee {
    public SeniorDeveloper(int employeeID, String employeeName, String employeeRole, double basicSalary, double allowance) {
        super(employeeID, employeeName, employeeRole, basicSalary, allowance);
    }

    @Override
    public double calculateSalary() {
        return getBasicSalary() + getAllowance();
    }
}