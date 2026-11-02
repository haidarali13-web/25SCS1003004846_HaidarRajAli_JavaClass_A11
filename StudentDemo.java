class Student {
    int studentId;
    String studentName;
    String course;
    int age;

    // Default Constructor
    Student() {
        studentId = 0;
        studentName = "Unknown";
        course = "Not Assigned";
        age = 0;
    }

    // Parameterized Constructor
    Student(int studentId, String studentName, String course, int age) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
        this.age = age;
    }

    // Display student details
    void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Course: " + course);
        System.out.println("Age: " + age);
        System.out.println();
    }
}

public class StudentDemo {
    public static void main(String[] args) {

        // Object using default constructor
        Student s1 = new Student();

        // Object using parameterized constructor
        Student s2 = new Student(101, "Haidar Raj Ali", "BTech CSE AI & ML", 19);

        System.out.println("Student 1 - Default Constructor");
        s1.displayDetails();

        System.out.println("Student 2 - Parameterized Constructor");
        s2.displayDetails();
    }
}