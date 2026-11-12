import java.util.*;

public class RemoveSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String here: ");
        String str = sc.nextLine();
        int i, j;
        String line = "";
        char temp;
        for (i = 0; i < str.length(); i++) {
            temp = str.charAt(i);
            if(temp == ' '){
                continue;
            }
            else{
                line += temp;
            }
        }
        System.out.println(line);
    }
}
