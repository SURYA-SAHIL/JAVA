// Print_Users_Name.
// " JAVA! , PLEASE BRING THE SCANNER TOOL TO TAKE INPUT FROM USER "
import java.util.Scanner;
// EVERY JAVA PROGRAM MUST HAVE/BE IN A CLASS AND [FILE NAME = CLASS NAME]
 public class Print_Users_Name
 { // { STARTS THE CLASS BODY  , EVERYTHING RELATED MUST STAY INSIDE {}
    // JVM (JAVA VIRTUAL MACHINE) LOOKS FOR THE MAIN METHOD TO START EXECUTING THE PROGRAM
    // YOU ARE TELLING JAVA THIS IS WHERE MY PROGRAM STARTS.
    public static void main(String[] args) 
    { // { STARTS THE MAIN METHOD BODY , EVERYTHING RELATED MUST STAY INSIDE {}
        // CREATES A SCANNER OBJECT , CONNECTS THE SCANNER TO SYSTEM.IN (KEYBOARD INPUT)
    
         Scanner scanner = new Scanner(System.in);
        // ASKS THE USER TO ENTER THEIR NAME
        System.out.println("Enter Your Name:");
        // READS A LINE OF TEXT FROM THE USER AND STORES IT IN A VARIABLE CALLED NAME
        String name = scanner.nextLine();
        // FINAL REQUIRED OUTPUT
        System.out.println("HI "  +  name);
        // CLOSES THE SCANNER TO PREVENT RESOURCE LEAKS
        scanner.close();

    }
 }