import java.util.Scanner;

class Grade_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your grade: ");
        int marks = sc.nextInt();
        if (marks >= 90)
            System.out.println("Outstanding!");
        else if (marks >= 80)
            System.out.println("Excellent!");
        else if (marks >= 70)
            System.out.println("Better!");
        else if (marks >= 60)
            System.out.println("Good!");
        else if (marks >= 50)
            System.out.println("Average!");
        else
            System.out.println("You are very bad Please improve!");
        sc.close();
    }
}