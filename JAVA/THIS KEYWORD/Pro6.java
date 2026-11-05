//this acnbe used to invke current class Constructor.
class Test {
    Test(int x) {
        System.out.println("The Passedd value is"+x);
        this();
    }
    Test() {
        System.out.println("I am from a Constructor.");
    }

}

class Pro6 {
    public static void main(String[] args) {
        Test t1 = new Test(20);
    }
}