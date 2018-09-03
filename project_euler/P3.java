import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            findLargestPrime(n);
        }
    }
    
    // this solution is currently timing out on test case #5 on Hackerrank
    // TODO: optimize the solution for test case #5.
    
    public static void findLargestPrime(long n){
        long max = n,i; 
        
        // divide the number by 2 and get smaller number as much as possible
        while(n % 2 == 0){
            n /= 2;
            max = 2;
        }
        
        // starting with 3 and incrementing by 2 as now we can have only odd prime numbers
        for (i = 3; i <= n; i+=2) {  
            while (n % i == 0 && i <= n) {
                n /= i;
            }
            max = i;
        } 
        System.out.println(max);
    }
}
