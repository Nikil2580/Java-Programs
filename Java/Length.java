public class Length {
    public static void main(String[] args) {

        System.out.println("int :" + Integer.SIZE / 8); // divided by 8 to get length in Bytes
        System.out.println("byte:" + Byte.SIZE / 8);
        System.out.println("short:" + Short.SIZE / 8);
        System.out.println("long:" + Long.SIZE / 8);
        System.out.println("char:" + Character.SIZE / 8);
        // System.out.println(Boolean.SIZE); Size cannot be find for Boolean
        System.out.println("float:" + Float.SIZE / 8);
        System.out.println("double:" + Double.SIZE / 8);
    }
}
