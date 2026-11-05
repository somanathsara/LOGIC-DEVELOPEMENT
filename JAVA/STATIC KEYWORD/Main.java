import java.util.*;


class Main{
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
    }
}
class Student{
    static int count = 0;
    Student(){
        System.out.println("Roll no:"+count);
        count++;
    }
}