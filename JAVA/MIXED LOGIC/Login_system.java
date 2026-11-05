import java.util.*;
class Login_system{
    static void main(Object value){
        System.out.println(value);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int PASSWORD = 89765534;
        while(true){
        System.out.println("Enter your password here: ");
        int password = sc.nextInt();
        if(password == PASSWORD){
            System.out.println("Access granted!");
            break;
        }
        else{
            System.out.println("Your password is incorrect!");
        }
        }
        sc.close();
    }
}