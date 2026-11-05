import java.util.Scanner;

class Character_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows wants to print: ");
        int n = sc.nextInt();
        for (char i = 'A'; i <= (65+n); i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
        
    }
}