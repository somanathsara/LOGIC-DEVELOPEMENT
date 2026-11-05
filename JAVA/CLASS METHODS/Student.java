import java.util.*;
class Data{
    String name;
    int age;
}
public class Student{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Data s1 = new  Data();
        System.out.println("Enter your name here: ");
        s1.name = sc.nextLine();
        System.out.println("Enter your age here: ");
        s1.age = sc.nextInt();
        System.out.println("Name : "+s1.name);
        System.out.println("Age: "+s1.age);
        sc.close();
    }
}

