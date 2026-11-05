import java.util.*;

class Mul_Const {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Student s1 = new Student();
        // Student s2 = new Student("Gudu");
        Student s3 = new Student("Gudu", 56);
        // s1.close();
    }
}

class Student {
    Student() {
        System.out.println("I am a no parameter costructor.");
    }

    Student(String name) {
        System.out.println("I am one parameter const.");
        System.out.println("Name: " + name);
    }

    Student(String name, int age) {
        System.out.println("I am from 2 parametrized const.");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}