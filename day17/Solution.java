import java.util.*;
import java.io.*;

class Calculator {
    
    int power(int n, int p) throws Exception{
        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }
        int result = 1;
        for (int i=1; i <= p; i++) {
            result *= n;
        }
        return result;
    }
}


class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while (T-- > 0) {

			int n = scan.nextInt();
			int p = scan.nextInt();
			Calculator calc = new Calculator();
			
			try {
				System.out.println(calc.power(n,p)); 
			} catch (Exception e) {
				System.err.println(e.getMessage());
            }
		}
        scan.close();
    }
}
