import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner scan = new Scanner(System.in);
        int totalNums = scan.nextInt();
        int[] nums = new int[totalNums];
        int numSwaps = 0;
        
        for (int i=0; i < totalNums; i++) {
            nums[i] = scan.nextInt();
        }
        scan.close();
        
        numSwaps = s.bubbleSort(nums);
        s.printOutput(nums, numSwaps);
    }
    
    public static int swap(int[] nums, int i) {
        int numSwaps = 0;
        while(i >= 0 && (nums[i+1] < nums[i])) {
            int bigger = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = bigger;
            i--;
            numSwaps++;
        }    
        return numSwaps;
    }
    
    public int bubbleSort(int[] nums){
        int numSwaps = 0;
        
        for (int i=0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i+1]) {
                numSwaps += swap(nums, i);
            }
        }
        
        return numSwaps;
    }
    
    public void printOutput(int[] nums, int numSwaps) {
        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + nums[0]);
        System.out.println("Last Element: " + nums[nums.length-1]);
    }
}
