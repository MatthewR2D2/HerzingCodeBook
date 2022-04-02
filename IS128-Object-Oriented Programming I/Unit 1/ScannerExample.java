import java.util.Scanner;

class ScannerExample {

    public static void main (String[] args) {
        //Create a new Scanner object
        Scanner sc = new Scanner(System.in);
        // Ask user for a integer
        System.out.println("Enter a number");
        // Capture and store the interger in a variable
        int myInt = sc.nextInt();
        System.out.println("Number you entered is: " + myInt);
        // Ask user for a String
        System.out.println("Enter a string");
        // Capture String and store it in a variable
        String myString  = sc.next();
        System.out.println("String you entered is: " + myString);
    }
}