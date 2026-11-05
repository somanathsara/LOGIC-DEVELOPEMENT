class A{
    A m1(){
        return this;
    }
    void m2(){
        System.out.println("Hello");
    }
}
public class Pro10 {
    public static void main(String[] args){
        A ob1 = new A();
        A ob2;
        ob2 = ob1.m1();
        ob2.m2();
    }
}
