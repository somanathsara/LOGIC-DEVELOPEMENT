import java.util.*;

class Student{
    Scanner sc = new Scanner(System.in);
    String name;
    int age;
    Student(){
    System.out.println("Enter your name here: ");
     name = sc.nextLine();
    System.out.println("Enter your age here: ");
     age = sc.nextInt();
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
    // sc.close();
}

class Student2 {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.display();
    }
}