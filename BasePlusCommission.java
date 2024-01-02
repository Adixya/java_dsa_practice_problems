public class BasePlusCommission {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Naukar", 50000);
        Employee employee2 = new CommissionEmployee("Chaakar", 60000, 5000);

        System.out.println("Employee 1 Details:");
        employee1.displayDetails();

        System.out.println("\nEmployee 2 Details:");
        employee2.displayDetails();
    }
}

class Employee {
    private String name;
    private double basicSalary;

    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return basicSalary;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: $" + basicSalary);
    }
}

class CommissionEmployee extends Employee {
    private double commission;

    public CommissionEmployee(String name, double basicSalary, double commission) {
        super(name, basicSalary);
        this.commission = commission;
    }

    @Override
    public double calculateSalary() {
        // Override the calculateSalary method to include commission
        return super.calculateSalary() + commission;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Commission: $" + commission);
        System.out.println("Total Salary: $" + calculateSalary());
    }

}
