class Animal{
    void m1(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{
    void m2(){
        System.out.println("Barking...");
    }
}
class Cat extends Animal{
    void m3(){
        System.out.println("Meow...");
    }
}
public class Hierarchy{
    public static void main(String[] args){
        Dog d1 = new Dog();
        d1.m1();
        Cat c1  = new Cat();
        c1.m1();
    }
}