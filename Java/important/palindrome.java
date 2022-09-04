package important;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String str1 = sc.nextLine();
        sc.close();
        String str2 = "";
        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            str2 = ch + str2;
        }
        if(str1.equals(str2))
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}