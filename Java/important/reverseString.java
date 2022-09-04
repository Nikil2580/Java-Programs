package important;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        String rev = "";
        for(int index = 0; index < str.length(); index++){
            char ch = str.charAt(index);
            rev = ch + rev;
        }
        System.out.println("Reversed String: " + rev);
    }
}
