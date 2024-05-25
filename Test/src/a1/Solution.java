package a1;
import java.io.*;
import java.util.*;

public class Solution {
    
    
 public static long calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
     

        // Prompt the user to enter a number
        
        int n = 12;

        // Calculate and output the Fibonacci number
        long result = calculateFibonacci(n);
        System.out.println("The Fibonacci number at position " + n + " is: " + result);
   
    }
}