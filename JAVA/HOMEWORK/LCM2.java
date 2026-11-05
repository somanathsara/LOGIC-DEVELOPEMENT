import java.io.*;

class LCM2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the 1st number here: ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("Enter the 2nd number here: ");
        int b = Integer.parseInt(br.readLine());
        int i;
        if (a > b) {
            i = a;
        } else {
            i = b;
        }
        while (true) {
            if (i % a == 0 && i % b == 0) {
                break;
            }
            i++;
        }
        System.out.println("The LCM of " + a + " & " + b + " is " + i);
    }
}