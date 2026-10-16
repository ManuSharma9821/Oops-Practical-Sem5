
class Student {
    int rollNo;
    String name;
    int marks1, marks2, marks3;

    Student(int rollNo, String name, int marks1, int marks2, int marks3) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    int calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    double calculatePercentage() {
        return calculateTotal() / 3.0;
    }

    void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks1 + ", " + marks2 + ", " + marks3);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("-------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Manu", 85, 90, 88);
        Student s2 = new Student(102, "Riya", 80, 85, 87);
        Student s3 = new Student(103, "Pragya", 88, 80, 90);

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
