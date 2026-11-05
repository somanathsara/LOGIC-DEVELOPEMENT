import java.util.*;
class Adder_func{
    Scanner sc = new Scanner(System.in);

    int Add1(int a, int b){
        return a+b;
    }
    void Add2(int a, int b){
        System.out.println("Result 2: "+(a+b));
    }
    int Add3(){
        System.out.println("ENter the 1st number here: ");
        int a = sc.nextInt();
        System.out.println("ENter the 2nd number here: ");
        int b = sc.nextInt();
        return a+b;
    }
    void Add4(){
        System.out.println("ENter the 1st number here: ");
        int a = sc.nextInt();
        System.out.println("ENter the 2nd number here: ");
        int b = sc.nextInt();
        System.out.println("Result 4:"+(a+b));
    }
}


public class Adder{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Adder_func ad = new Adder_func();
        System.out.println("Enter the 1st number here: ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd numbere here: ");
        int b = sc.nextInt();
        int res1 = ad.Add1(a, b);
        System.out.println("Result 1: "+res1);
        ad.Add2(a, b);  
        int res3 =  ad.Add3();
        System.out.println("Result 3:"+res3);
        ad.Add4();
        sc.close();
    }
}
