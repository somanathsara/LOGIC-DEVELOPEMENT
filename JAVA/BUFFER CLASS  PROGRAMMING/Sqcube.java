import java.io.*;

public class Sqcube {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("ENter the number here: ");
        int n = Integer.parseInt(br.readLine());
        int sq = n * n, cube = n * n * n;
        System.out.println("The Square of " + n + " is " + sq + " & the cube of " + n + " is " + cube);
    }
}