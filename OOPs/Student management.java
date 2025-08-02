class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student extends Person {
    int studentId;
    String course;

    Student(String name, int age, int studentId, String course) {
        super(name, age); 
        this.studentId = studentId;
        this.course = course;
    }

    
    void showDetails() {
        super.showDetails();
        System.out.println("Student ID: " + studentId + ", Course: " + course);
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Student s1 = new Student("Milan", 20, 101, "Java DSA");
        s1.showDetails();
    }
}