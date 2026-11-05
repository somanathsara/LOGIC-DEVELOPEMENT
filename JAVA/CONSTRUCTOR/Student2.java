import java.util.*;
class Student_data {
    Scanner sc = new Scanner(System.in);
    String name;
    int age;
    Student_data(){
        System.out.println("ENter your name here: ");
        name = sc.nextLine();
        System.out.println("Enter your Age here: ");
        age = sc.nextInt();
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        // sc.close();
    }
}
public class Student2 {
    public static void main(String[] args){
        Student_data s1 = new Student_data();
        // Student_data s2 = new Student_data();
    }
}
