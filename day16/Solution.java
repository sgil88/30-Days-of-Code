import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        
        try {
            int stringInt = Integer.parseInt(S);
            System.out.println(stringInt);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        } finally {
            in.close();
        }
    }
}
