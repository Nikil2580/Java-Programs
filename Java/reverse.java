import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        s.close();
        StringBuilder str2 = new StringBuilder(str);
        str2.reverse();
        System.out.println(str2);
    }
}
