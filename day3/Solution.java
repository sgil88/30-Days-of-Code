import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
   
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt(); 
      scan.close();
      String ans="";
          
      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
      if(n%2==0 & ((n >= 2 & n <= 5) || (n > 20))){
         ans = "Not Weird";
      } else {
          ans = "Weird";
      }
      System.out.println(ans);
   }
}
