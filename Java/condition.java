public class condition {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20;
        boolean cond1 = num1 > num2 && num2 < num1;
        boolean cond2 = num1 == num2 || num2 != num1;
        if (cond1) {
            System.out.println("Yes");
        } else if (cond2) {
            System.out.println("No");
        }
    }
}
