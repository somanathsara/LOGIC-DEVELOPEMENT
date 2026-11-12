import java.util.*;
abstract class Animal{
    abstract void sound();
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks!");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat Meoww!");
    }
}
class Cow extends Animal{
    void sound(){
        System.out.println("Bow Bow!");
    }
}
public class Basic {
    public static void main(String[] args){
        Animal ob;
        ob = new Cat();
        ob.sound();
        ob = new Cow();
        ob.sound();
        ob = new Dog();
        ob.sound();
        
    }
}
