import java.util.*;

class Mini_ATM {
    static void println(Object value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 100000;
        while (true) {
            println("1.Check balance.");
            println("2.Deposit.");
            println("3.Withdraw.");
            println("4.Exit!");
            println("Enter your choice here: ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    println("Balance : " + balance);
                    break;
                case 2:
                    println("Enter amonut want to deposit: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    println("Deposit succesfull.");
                    break;
                case 3:
                    println("Enter your amount want to withdraw: ");
                    double withdraw = sc.nextDouble();
                    if (balance < withdraw)
                        println("Insufficient balance");
                    else {
                        balance -= withdraw;
                        println("Withdraw succesfull");
                    }
                    break;
                case 4:
                    println("Thank you");
                    return;
                default:
                    println("Please eneter a valid input!");

            }
        }
        // sc.close();
    }
}
