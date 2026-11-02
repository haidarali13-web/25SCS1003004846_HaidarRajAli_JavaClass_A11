class MultiEmployee {
    int employeeId;
    String employeeName;
    double basicSalary;

    // Employee constructor
    MultiEmployee(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }
}

class Manager extends MultiEmployee {
    String department;
    int teamSize;

    // Manager constructor
    Manager(int employeeId, String employeeName, double basicSalary,
            String department, int teamSize) {

        super(employeeId, employeeName, basicSalary);
        this.department = department;
        this.teamSize = teamSize;
    }
}

class ProjectManager extends Manager {
    String projectName;
    int projectDuration;

    // ProjectManager constructor
    ProjectManager(int employeeId, String employeeName, double basicSalary,
                   String department, int teamSize,
                   String projectName, int projectDuration) {

        super(employeeId, employeeName, basicSalary, department, teamSize);
        this.projectName = projectName;
        this.projectDuration = projectDuration;
    }

    void displayDetails() {
        System.out.println("Project Manager Details");
        System.out.println("-----------------------");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project Name: " + projectName);
        System.out.println("Project Duration: " + projectDuration + " months");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {

        ProjectManager pm = new ProjectManager(
                201,
                "Haidar Raj Ali",
                75000,
                "Artificial Intelligence",
                8,
                "Smart Education System",
                12
        );

        pm.displayDetails();
    }
}