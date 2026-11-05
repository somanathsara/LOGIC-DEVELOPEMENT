import java.util.*;

class Operation {
    Operation() {
        System.out.println("No args is passed");
    }

    Operation(int a) {
        System.out.println("! args is passed i.e. " + a);
    }

    Operation(int a, int b) {
        System.out.println(" args is passed i.e. " + a + " & " + b);
    }
}

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operation c1 = new Operation();
        Operation c2 = new Operation(23);
        Operation c3 = new Operation(23, 67);
    }
}