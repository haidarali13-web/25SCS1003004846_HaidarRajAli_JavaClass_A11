class Person {
    String name;
    int age;
    String email;

    Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }
}

class InheritanceStudent extends Person {
    int studentId;
    String course;

    InheritanceStudent(String name, int age, String email,
                       int studentId, String course) {

        super(name, age, email);

        this.studentId = studentId;
        this.course = course;
    }

    void displayStudentDetails() {
        displayPersonDetails();
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {

        InheritanceStudent s = new InheritanceStudent(
                "Haidar Raj Ali",
                19,
                "haidar@example.com",
                101,
                "BTech CSE AI & ML"
        );

        System.out.println("Student Details");
        System.out.println("----------------");
        s.displayStudentDetails();
    }
}