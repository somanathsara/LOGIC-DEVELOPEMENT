import java.io.*;

public class Grade {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your mark in MATH: ");
        int m = Integer.parseInt(br.readLine());
        System.out.print("Enter your mark in ENGLISH: ");
        int e = Integer.parseInt(br.readLine());
        System.out.print("Enter your mark in ODIA: ");
        int o = Integer.parseInt(br.readLine());
        System.out.print("Enter your mark in SCIENCE: ");
        int s = Integer.parseInt(br.readLine());
        System.out.print("Enter your mark in SANSKRIT: ");
        int sr = Integer.parseInt(br.readLine());
        System.out.print("Enter your mark in HISTORY&GEOGRAPHY: ");
        int g = Integer.parseInt(br.readLine());

        float total = m + sr + s + e + o + g;
        double percentage = (total / 600) * 100;
        System.out.println("The total mark you secured : " + total);
        System.out.println("You secured " + percentage + "%");

    }
}