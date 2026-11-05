//With the help  of this keyword.
//this can be used to invoke current class method(implicitly).
class Test{
    void m1(){
        System.out.println("I am from method 1");
        this.m2();
    }
    void m2(){
        System.out.println("I am from method 2");
    }
}
class Pro4{
    public static void main(String[] args){
        Test t1 = new Test();
        t1.m1();
    }
}