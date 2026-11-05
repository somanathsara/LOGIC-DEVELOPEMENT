import java.util.Scanner;

class Menu_based_calculator {
    static void println(Object value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        println("Enter the 1st number: ");
        double x = sc.nextDouble();
        println("Enter 2nd number here: ");
        double y = sc.nextDouble();
        println("Enter 1.For Addition:");
        println("Enter 2.For Subtraction: ");
        println("Enter 3.For Multiplication:");
        println("Enter 4.For Division:");
        println("Enter 5.For Remainder:");
        println("Enter your option: ");
        char op = sc.next().charAt(0);
        switch (op) {
            case '1':
                println("The additon of the two number is:" + (x + y));
                break;
            case '2':
                println("The subtraction of the two number is:" + (x - y));
                break;
            case '3':
                println("The multiplication of the two number is: " + (x * y));
                break;
            case '4':
                if (y == 0)
                    println("Divison by 0 is not possible.");
                else
                    println("The division of two integer:" + (x / y));
                break;
            case '5':
                println("The remainder of the two number is:" + (x % y));
                break;
            default:
                println("Please input a valid chouce!");
        }
        sc.close();
    }
}