public class EmployeeTest {
    private String name;
    private int employeeId;
    private static int employeeCount = 0; // Static variable to count employees

    public EmployeeTest(String name) {
        this.name = name;
        employeeCount++;
        this.employeeId = employeeCount; // Assign a unique employee ID
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public static void main(String[] args) {
        EmployeeTest employee1 = new EmployeeTest("Will Smith");
        EmployeeTest employee2 = new EmployeeTest("sharukh khan");

        System.out.println("Employee 1 - Name: " + employee1.getName() + ", Employee ID: " + employee1.getEmployeeId());
        System.out.println("Employee 2 - Name: " + employee2.getName() + ", Employee ID: " + employee2.getEmployeeId());

        System.out.println("Total number of employees: " + EmployeeTest.getEmployeeCount());
    }

}
