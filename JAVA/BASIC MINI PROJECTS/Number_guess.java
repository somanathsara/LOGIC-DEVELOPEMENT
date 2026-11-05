import java.util.*;

class Number_guess {
    static void println(Object value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int secret = 67;
        for (i = 1; i <= 3; i++) {
            println("Guess the number here: ");
            int guess = sc.nextInt();
            if (guess == secret)
                println("Correct!");
            else
                println("Wrong attaempt!");
        }
    sc.close();
    }
}