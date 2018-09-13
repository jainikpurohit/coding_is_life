/* Probelm Statement:

By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?

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
            findNPrime(n);
        }
    }
    
    public static void findNPrime(int n){
        List<Integer> prims = new ArrayList<>();
        prims.add(2);
        prims.add(3);
        
        int cn = 3;
        while(prims.size() < n){
            cn += 2;
            boolean isPrime = false;
            for(int p : prims){
                if(cn % p == 0){
                    isPrime = false;
                    break;
                }
                isPrime = true;
            }
            if(isPrime){
                prims.add(cn);
            }
        }
        System.out.println(prims.get(n-1));
    }
}
