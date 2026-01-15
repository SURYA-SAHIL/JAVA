import java.util.Scanner;

public class MarksAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks: ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double average = (double) total / n;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        if (average >= 40)
            System.out.println("Status: Passed");
        else
            System.out.println("Status: Failed");

        sc.close();
    }
}
