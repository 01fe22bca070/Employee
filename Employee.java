public class Employee {
    private int employeeId;
    private String name;
    public double salary;

    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
class DevOpsEngineer extends Employee {
    private double bonus;

    public DevOpsEngineer(int employeeId, String name, double salary, double bonus) {
        super(employeeId, name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getTotalSalary() {
        return getSalary() + bonus;
    }

    public void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + getTotalSalary());
    }

    public static void main(String[] args) {
        DevOpsEngineer devOpsEngineer = new DevOpsEngineer(1, "John Doe", 50000, 10000);
        devOpsEngineer.displayEmployeeDetails();
    
    }
    
}