import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class dataTypes {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank";

        Scanner scan = new Scanner(System.in);
        int inputInt = scan.nextInt();
        double inputDouble = scan.nextDouble();
        scan.nextLine();
        String inputStr = scan.nextLine(); 

        scan.close();

        System.out.println("-----------------");

        // Print sum of i + input integer
        System.out.println(i + inputInt);
        // Print sum of d plus input double 
        System.out.format("%.1f", d + inputDouble);
        // Print concatenation of s and input string
        System.out.println("\n" + s + " " + inputStr.trim());

        
    }

}
