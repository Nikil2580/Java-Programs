package important;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int firstTerm = 0, secondTerm = 1;
        for(int i=1; i<=N; i++){
            System.out.print(firstTerm+" ");
            int nextTerm = firstTerm + secondTerm; 
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
