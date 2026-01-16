import java.util.Scanner;

class UpperToLower {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an uppercase letter: ");
        char ch = sc.next().charAt(0);

        char lower = (char)(ch + 32);

        System.out.println("Lowercase letter: " + lower);

        sc.close();
    }
}
