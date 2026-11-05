import java.util.*;
class Subtract{
    static int  Sub(int a, int b){
        return (a-b);
    }
    public static void main(String[] args){
        System.out.println("Enter the 1s number here: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number here: ");
        int b = sc.nextInt();
        int res = Sub(a,b);
        System.out.println("The Subtraction of "+a+" & "+b+" is "+res);
        sc.close();
    }
}