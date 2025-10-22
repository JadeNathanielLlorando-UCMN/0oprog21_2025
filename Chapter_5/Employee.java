public class Employee {
    private int employeeNumber;
    private double payRate;
    private static final int MAX_EMPLOYEE_NUMBER = 9999;
    private static final double MAX_RATE = 60.00;

    public Employee(int employeeNumber, double payRate) {
        if (employeeNumber > MAX_EMPLOYEE_NUMBER) {
            this.employeeNumber = MAX_EMPLOYEE_NUMBER;
        } else {
            this.employeeNumber = employeeNumber;
        }

        if (payRate > MAX_RATE) {
            this.payRate = MAX_RATE;
        } else {
            this.payRate = payRate;
        }
    }

    public double getPayRate() {
        return payRate;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }
}
