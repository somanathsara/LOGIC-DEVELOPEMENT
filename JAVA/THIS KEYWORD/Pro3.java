//Without use of this key word.
class Test{
    void m1(){
        System.out.println("I am from method 1");
        m2();
    }
    void m2(){
        System.out.println("I am from method 2");
    }
}
class Pro3{
    public  static void main(String[] args){
        Test t1 = new Test();
        t1.m1();
    }
}