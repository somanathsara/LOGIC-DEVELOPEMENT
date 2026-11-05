import java.io.*;

class DisplayPrime {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value of n: ");
        int n = Integer.parseInt(br.readLine());
        int i, j;
        for (i = 2; i < n; i++) {
            boolean is_prime = true;
            for (j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    is_prime = false;
                }
            }
            if (is_prime) {
                System.out.print(i + " ");
            }
        }
    }
}