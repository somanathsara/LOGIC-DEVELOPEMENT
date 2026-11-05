class Animal{
    void m1(){
        System.out.println("Hey i am from Animal class");
    }
}
class Dog extends Animal{
    void m2(){
    System.out.println("Hey i am from Dog class");
    }
}

public class Single_level{
    public static void main(String[] args){
        Dog a1 = new Dog();
        a1.m1();
        a1.m2();
    }
}