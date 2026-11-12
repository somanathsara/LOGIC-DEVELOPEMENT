import java.util.*;

public class Charfreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String here: ");
        String str = sc.nextLine();
        int i, j;
        char temp;
        for (i = 0; i < str.length(); i++) {
            temp = str.charAt(i);
            if (str.indexOf(temp) == i) {
                int count = 0;
                for (j = 0; j < str.length(); j++) {
                    if (temp == str.charAt(j)) {
                        count++;
                    }
                }
                System.out.println(temp + " arises " + count + " times");
            }
        }
        sc.close();
    }
}