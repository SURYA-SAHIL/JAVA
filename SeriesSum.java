import java.util.Scanner;

class SeriesSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int sum = 1;   // first term

        for (int i = 5; i <= n; i = i + 5) {
            sum = sum + i;
        }

        System.out.println("Sum of the series is: " + sum);

        sc.close();
    }
}

