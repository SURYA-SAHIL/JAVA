import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        int upper = 0, lower = 0, digit = 0, special = 0;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch))
                upper++;
            else if (Character.isLowerCase(ch))
                lower++;
            else if (Character.isDigit(ch))
                digit++;
            else
                special++;
        }

        if (password.length() >= 8 && upper > 0 && lower > 0 && digit > 0 && special > 0)
            System.out.println("Strong Password");
        else if (password.length() >= 6)
            System.out.println("Moderate Password");
        else
            System.out.println("Weak Password");

        sc.close();
    }
}
