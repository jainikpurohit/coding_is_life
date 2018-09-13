/* Problem Statement:
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

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
            int n = in.nextInt();
            lcm(n);
        }
    }
    
    // math logic to solve this problem:
    // if you want to find lowest common multiple of two numbers then we can take advantage of GCD.
    // We can solve this problem with storing of prime factorization as well.
    public static void lcm(int n){
        long sm = 1;
        
        for(long i = 2; i <= n; i++){
            sm *= i/gcd(i, sm);
        }
        
        // This approach is not efficient for large numbers.
        /*
        boolean found = false;
        while(!found){
            for(int i = 1; i <= n; i++){
                if(j%i != 0){
                    break;
                } else if(j % i == 0 && i == n){
                    found = true;
                }
            }
            j += n;
        }
        j -= n;
        System.out.println(j); */
        
        System.out.println(sm);
    }
    
    public static long gcd(long a, long b){
        while( b != 0){
            long temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
}
