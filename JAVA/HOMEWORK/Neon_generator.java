import java.io.*;

public class Neon_generator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter upto which wants to know: ");
        int n = Integer.parseInt(br.readLine());
        int i;
        for (i = 1; i <= n; i++) {
            int k = i;
            int sq = k * k;
            int sum = 0;
            while (sq > 0) {
                sum += (sq % 10);
                sq /= 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            } else {
                continue;
            }

        }
    }
}