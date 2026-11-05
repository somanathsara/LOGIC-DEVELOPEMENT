import java.util.Scanner;

class Power_of_number {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the base here: ");
        int base  = sc.nextInt();
        System.out.println("Enter the exponents here: ");
        int exp = sc.nextInt();
        int res = 1, i;
        for(i=1;i<=exp;i++){
            res  *= base;
        }
        System.out.println("The "+exp+"th power of "+base+ " is "+res);
        sc.close();
    }
}