import java.util.*;
class Find_max{
    static void println(Object value){
        System.out.println(value);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        println("Enter the total number wants to check:");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            println("Enter the number: ");
            int a = sc.nextInt();
            if(a>max)
                max = a;
            if(a<min)
                min = a;
        }
        println("The maximum from the numbers is: "+max);
        println("The minimum from the number is: "+min);
        sc.close();
    }
}