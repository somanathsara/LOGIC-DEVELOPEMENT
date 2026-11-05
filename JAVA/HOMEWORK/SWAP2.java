import java.io.*;

class SWAP2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value of a: ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("Enter the value of b: ");
        int b = Integer.parseInt(br.readLine());
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("The value of a is " + a + " & the va;ue of b is " + b);
    }
}