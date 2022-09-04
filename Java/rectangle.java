import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        int width = s.nextInt();
        s.close();

        System.out.println("Area of Rectangle:" + length * width);
    }
}
