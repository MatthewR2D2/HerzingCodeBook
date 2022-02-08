import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BufferedReaderExample {
    public static void main (String[] args) throws NumberFormatException, IOException {
        System.out.println("Enter a number");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int myInt = Integer.parseInt(br.readLine());
        System.out.println("Your number is: " + myInt);
        System.out.println("Enter a string");
        String myString  = br.readLine();
        System.out.println("Your String is: " + myString);
        }
    
}
