/* Problem Statement:
The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
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
            findAbsDiff(n);
        }
    }
    
    public static void findAbsDiff(int n){
        long sqSum = 0;
        long numSum = 0;
        for(int i = 1; i <= n; i++){
            sqSum += i * i;
            numSum += i;
        }
        numSum *= numSum;
        
        System.out.println(numSum - sqSum);
    }
}
