import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int secret = rand.nextInt(50) + 1;
        int attempts = 0;

        System.out.println("Guess the number between 1 and 50");

        while (attempts < 7) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            attempts++;

            if (guess == secret) {
                System.out.println("Correct! You won.");
                break;
            } else if (guess < secret) {
                System.out.println("Too low");
            } else {
                System.out.println("Too high");
            }
        }

        System.out.println("Secret number was: " + secret);
        sc.close();
    }
}
