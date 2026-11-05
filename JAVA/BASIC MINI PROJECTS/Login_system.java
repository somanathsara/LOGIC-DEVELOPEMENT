import java.util.*;

class Login_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = sc.nextLine();
        System.out.println("Enter your password here: ");
        String password = sc.nextLine();
        if (username.equals("admin") && password.equals("1234"))
            System.out.println("Login Susccesfull!");
        else
            System.out.println("Invalid login!");
        sc.close();
    }

}
