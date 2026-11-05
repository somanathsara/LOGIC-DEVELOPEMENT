import java.util.*;

class info {
    Scanner sc = new Scanner(System.in);

    void add() {
        System.out.println("Enter the 1st number here: ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number here: ");
        int b = sc.nextInt();
        System.out.println("The addition of the two number is: " + (a + b));
    }

    void add(int a, int b) {
        System.out.println("The addition of the two number is: " + (a + b));
    }

    void add(float a, float b) {
        System.out.println("The Addition of the two number is: " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("The addition of the three number is: " + (a + b + c));
    }

    void add(float a, float b, float c) {
        System.out.println("The addition of the three number is: " + (a + b + c));
    }
}

class Programm1 {
    public static void main(String[] args) {

        info ob1 = new info();
        ob1.add();
        ob1.add(4, 5);
        ob1.add(4f, 5f);
        ob1.add(20, 63, 45);
        ob1.add(4f, 5f, 62f);
    }

}
