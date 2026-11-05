import java.util.*;
class Bank{
    Scanner sc = new Scanner(System.in);
    String  Acc_no = "" ; 
    int balance = 0;
    void deposit(){
        System.out.println("Enter the amount here: ");
        int amount = sc.nextInt();
        balance += amount;
    }
    void withdraw(){
        System.out.println("Enter the amount here: ");
        int amount = sc.nextInt();
        balance -= amount;
    }
    void displayBalance(){
        System.out.println("----------------------------------");
        System.out.println("Your Account Number is: "+Acc_no);
        System.out.println("The current Amount is: "+balance);
        System.out.println("----------------------------------");

    }
}
public class Bank_Acc{
    static void print(Object value){
        System.out.println(value);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Bank c1 = new Bank();
        c1.Acc_no = "XXXXXXX0698";
        c1.balance = 200000;
        while(true){
            print("-----BANK-----");
            print("1.For Deposit.");
            print("2.Withdraw.");
            print("3.Display Balanace.");
            print("4.Exit.");
            print("Enter your choice:");
            int choice = sc.nextInt();
            if(choice == 4){
                System.exit(0);
            }
            switch(choice){
                case 1:
                    c1.deposit();
                    break;
                case 2:
                    c1.withdraw();
                    break;
                case 3:
                    c1.displayBalance();
                    break;
                case 4:
                    System.exit(0);
                default:
                    print("Please Input a Valid choice!");
            }
        }        
        // sc.close();
    }
}