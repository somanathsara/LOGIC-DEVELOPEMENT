import java.util.*;

class Count_positive_negeative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you wants to count: ");
        int n = sc.nextInt(), pos = 0, neg = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the number here: ");
            int a = sc.nextInt();
            if (a > 0)
                pos++;
            else if (a < 0)
                neg++;
        }
        System.out.println("There are " + pos + " number of positive number.");
        System.out.println("There are " + neg + " number of negeative number.");
        sc.close();
    }
}