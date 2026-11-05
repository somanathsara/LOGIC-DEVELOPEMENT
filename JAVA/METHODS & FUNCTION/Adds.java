import java.util.*;
public class Adds{
    static int Adding(int a, int b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st value: ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd value");
        int b = sc.nextInt();
        int res;
        res = Adding(a,b);
        System.out.println("The sum of "+a+" & "+b+" is "+res);
        sc.close();


    }
}
