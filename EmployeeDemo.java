class Employee {
    int employeeId;
    String name;
    String designation;
    double salary;

    // Default Constructor
    Employee() {
        employeeId = 0;
        name = "Unknown";
        designation = "Not Assigned";
        salary = 0.0;
    }

    // Parameterized Constructor
    Employee(int employeeId, String name, String designation, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    // Copy Constructor
    Employee(Employee e) {
        this.employeeId = e.employeeId;
        this.name = e.name;
        this.designation = e.designation;
        this.salary = e.salary;
    }

    // Display employee details
    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        // Object using default constructor
        Employee e1 = new Employee();

        // Object using parameterized constructor
        Employee e2 = new Employee(
                101,
                "Haidar Raj Ali",
                "Software Developer",
                50000
        );

        // Object using copy constructor
        Employee e3 = new Employee(e2);

        System.out.println("Employee 1 - Default Constructor");
        e1.displayDetails();

        System.out.println("Employee 2 - Parameterized Constructor");
        e2.displayDetails();

        System.out.println("Employee 3 - Copy Constructor");
        e3.displayDetails();
    }
}