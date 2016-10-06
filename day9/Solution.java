import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        
		while (scan.hasNext()) {
			int num = scan.nextInt();
			if (num == -1) {
				break;
			}	
			System.out.println(factorial(num));
		}
		scan.close();
    }
    
    private static int factorial(int num) {
        if (num == 1) {
            return 1;
        }
        return num * (factorial(num-1));
    }
}
