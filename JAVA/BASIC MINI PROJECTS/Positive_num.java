import java.util.*;

class Positive_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the number here: ");
            int n = sc.nextInt();
            if (n < 0)
                break;
            System.out.println("You entered " + n);
        }
        sc.close();
    }
}