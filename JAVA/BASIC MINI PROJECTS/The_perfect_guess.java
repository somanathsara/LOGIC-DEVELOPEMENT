import java.util.*;

class The_perfect_guess {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int secret = rand.nextInt(100) + 1;
        int guess = 0;
        System.out.println("Guess the number here: ");
        while (true) {
            int n = sc.nextInt();
            guess++;
            if (n > secret) {
                System.out.println("Lower Number Please!");
            } else if (n < secret) {
                System.out.println("Higher Number Please!");
            } else if (n == secret) {
                System.out.println("You guesses " + secret + " in " + guess + " attempts");
                break;
            }

        }
    }
}