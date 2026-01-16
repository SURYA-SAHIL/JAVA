import java.util.Scanner;

class ReverseBits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (integer/decimal): ");
        float f = sc.nextFloat();

        int bits = Float.floatToIntBits(f);

        String binary = String.format("%32s",
                Integer.toBinaryString(bits)).replace(' ', '0');

        String reversed = "";
        for (int i = binary.length() - 1; i >= 0; i--) {
            reversed += binary.charAt(i);
        }

        System.out.println("IEEE 754 (32-bit) Binary : " + binary);
        System.out.println("Reversed Bit Pattern    : " + reversed);

        sc.close();
    }
}

