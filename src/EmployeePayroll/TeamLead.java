package EmployeePayroll;

public class TeamLead extends Employee {

    public TeamLead(int employeeID, String employeeName, String employeeRole, double basicSalary, double allowance) {
        super(employeeID, employeeName, employeeRole, basicSalary, allowance);
    }

    @Override
    public double calculateSalary() {
        return getBasicSalary() + getAllowance();
    }

}