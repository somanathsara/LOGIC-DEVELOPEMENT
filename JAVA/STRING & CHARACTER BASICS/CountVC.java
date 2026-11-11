import java.util.*;
public class CountVC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String here: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int vowels = 0, consonant = 0;
        for(int  i = 0 ; i<str.length()-1;i++){
            char ch = str.charAt(i);
            if(ch == 'a'|| ch == 'e' || ch =='i' || ch == 'o' || ch == 'u'){
                vowels++;
            }
            else{
                consonant++;
            }
        } 
        System.out.println("Vowels : "+vowels+"\n"+"Consonant : "+consonant);
    }
}
