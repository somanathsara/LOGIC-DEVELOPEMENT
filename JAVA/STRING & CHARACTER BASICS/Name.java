import java.util.*;
class Name{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name please:");
        String ch = sc.nextLine();
        System.out.println("Hello "+ch);
        sc.close();
    }
}