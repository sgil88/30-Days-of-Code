import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int largest;
        
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        largest = getHourGlassSum(arr, 0, 0);
        for (int i=0; i < 4; i++) {
            for (int j=0; j < 4; j++) {
                int sum = getHourGlassSum(arr, i, j);
                if (sum > largest) {
                    largest = sum;
                }
            }
        }
        System.out.println(largest);
        
    }
    
    private static int getHourGlassSum(int arr[][], int i, int j) {
        int sum = 0;
        
        sum += arr[i][j] + arr[i][j+1] + arr[i][j+2];
        sum += arr[i+1][j+1];
        sum += arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
        
        return sum;
    }
}
