import java.io.*;
import java.util.*;
import java.lang.Math;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int longest = findLongest(num);
        System.out.println(longest);
    }
    
    private static int findLongest(int num) {
        int longest = 0;
        int count = 0;
        
        while(num > 0){
            if (num%2 == 1 || num == 1) {
                count++;
            } 
            if (num%2 == 0 || num == 1) {
                if (count > longest) {
                    longest = count;
                }
                count = 0;
            }
            num /= 2;
        }
        return longest;
    }
}
