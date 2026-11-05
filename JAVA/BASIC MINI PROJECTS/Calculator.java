import java.util.*;

class Calculator {
    static void println(Object value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            println("Enter 1. for Add:");
            println("ENter 2. for Subtraction:");
            println("Enter 3. for Multiplication:");
            println("Enter 4. for division:");
            println("Enter 5. for exit:");
            println("Enter your choice: ");
            int choice = sc.nextInt();
            if (choice == 5)
                break;
            println("Enter the two number for operation: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            switch (choice) {
                case 1:
                    println("The addition of " + a + " & " + b + " is " + (a + b));
                    break;
                case 2:
                    println("The subtraction of " + a + " & " + b + " is " + (a - b));
                    break;
                case 3:
                    println("The multiplication of " + a + " & " + b + " is " + (a * b));
                    break;
                case 4:
                    if (b == 0)
                        println("Division by 0 is not possible!");
                    else
                        println("The division of " + a + " & " + b + " is " + (a / b));
                    break;
                default:
                    println("Please enter a valid input!");
            }
        }
        sc.close();
    }
}