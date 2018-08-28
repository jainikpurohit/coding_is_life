/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3,5,6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below N .
*/


mport java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            long sum = findSum(n);
            System.out.println(sum);
        }
    }
    
    public static long findSum(int n){
        // if we take an approach of n%3 || n%5 then it will fail for very large numbers
		// if we use int instead of long then we will have a problem with interger overflow
        
        long a = (n - 1)/3;
        long b = (n - 1)/5;
        long c = (n - 1)/15;
        long sum3 = 3 * a * (a + 1) / 2;
        long sum5 = 5 * b * (b + 1) / 2;
        long sum15 = 15 * c * (c + 1) / 2;
        
        return sum3 + sum5 - sum15;
    }
}
