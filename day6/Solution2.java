import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {

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
            char[] word = words[i].toCharArray();

            for (int j=0; j < words[i].length(); j+=2) {
                System.out.print(word[j]);
            }
            System.out.print(" ");
            for (int j=1; j < words[i].length(); j+=2) {
                System.out.print(word[j]);
            }
            System.out.println();
        }
    }
}
