import java.util.*;

class Swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number here: ");
        int a  = sc.nextInt();
        System.out.println("Enter the 2nd number here: ");
        int b = sc.nextInt();
        int v1 = a,v2 =b;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("You entered value "+v1+" & "+v2);
        System.out.println("After swapping the values are "+a+" & "+b);
        sc.close();

    }
}