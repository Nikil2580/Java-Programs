
package important;

import java.util.*;

public class even_bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 11;
        sc.close();
        if((num^1) ==(num+1)){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
