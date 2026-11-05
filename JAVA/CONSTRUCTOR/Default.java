import java.util.*;
class Student{
        Scanner sc = new Scanner(System.in);
        Student(){
            System.out.println("Enter your name here: ");
            String name = sc.nextLine();
            
            System.out.println("Student created!");
            System.out.println("Hello "+name);
        }
        // sc.close();
}
public class Default {
    public static void main(String[] args){
        Student s1 = new Student();
    }
}
