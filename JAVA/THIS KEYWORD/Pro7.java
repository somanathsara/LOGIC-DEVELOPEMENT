//Constructor Chaining.
class Test {
    Test() {
        System.out.println("I am from a Constructor.");
        this(20);
    }
    Test(int x) {
        System.out.println("The Passedd value is"+x);
        this(10,20);
    }
    Test(int a, int b){
        System.out.println("This is from 2 parametrized Constructor, The Parameters are"+a+" & "+b);
        this(10,20,30);
    }
    Test(int a,int b, int c){
        System.out.println("This is from the 3 parametrized constructor"+a+" & "+b+" & "+c);
    }

}

class Pro7 {
    public static void main(String[] args) {
        Test t1 = new Test();
    }
}