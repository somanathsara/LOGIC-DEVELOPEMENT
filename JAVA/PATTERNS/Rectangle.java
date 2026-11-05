import java.util.*;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangel: ");
        int l = sc.nextInt();
        System.out.println("Enter the breadth here: ");
        int b = sc.nextInt();
        int i, j;
        for (i = 0; i < l; i++) {
            if (i == 0 || i == (l - 1)) {
                for (j = 0; j < b; j++) {
                    System.out.print("* ");
                }
            } else {
                for (j = 0; j < b; j++) {
                    if (j == 0 || j == (b - 1)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
