import java.util.*;
public class CountWords {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence here: ");
        String line = sc.nextLine();
        int words = 0,i = 0;
        while(i < line.length()){
            char ch = line.charAt(i);
            if(ch == ' '){
                words++;
            }
            i++;
        }
        System.out.println("Number of Words :"+words+"\nNumber of characters : "+i);
    }
}
