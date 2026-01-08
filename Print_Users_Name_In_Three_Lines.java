import java.util.Scanner;
public class Print_Users_Name_In_Three_Lines 
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name = scanner.nextLine();
        System.out.print("\n");
        System.out.print(name);
        System.out.print("\n");   // (\) means escape character
        System.out.print(name);     
        System.out.print("\n");   // (\n) Means " Go To The Next Line"
        System.out.print(name);
        System.out.print("\n");
        scanner.close();
    }
}
    