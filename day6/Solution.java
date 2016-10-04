import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
	    int numWords = scan.nextInt();
		scan.nextLine();
		String[] words = new String[numWords];

	        
		for (int i = 0; i < numWords; i++) {
			words[i] = scan.nextLine();
		}	
		scan.close();

        for (int i = 0; i < numWords; i++) {
            String even = "";
            String odd = "";

            for (int j=0; j < words[i].length(); j++) {
                if (j % 2 == 0) {
                    even += words[i].charAt(j);
                } else {
                    odd += words[i].charAt(j);
                }
            }
            System.out.println(even + " " + odd);
        }
    }
}
